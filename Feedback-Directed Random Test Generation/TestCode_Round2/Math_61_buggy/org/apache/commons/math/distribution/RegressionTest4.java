package org.apache.commons.math.distribution;

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
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7455062667769425E-9d, 1.7582714501302516E-14d);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 99);
        int int2 = poissonDistributionImpl1.sample();
        double double4 = poissonDistributionImpl1.probability(0.0d);
// flaky "1) test2002(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 106 + "'", int2 == 106);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0112214926104486E-43d + "'", double4 == 1.0112214926104486E-43d);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.043845779425746E-168d, (double) 37);
        int[] intArray4 = poissonDistributionImpl2.sample(0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d, 3);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(9);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double13 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double15 = poissonDistributionImpl3.cumulativeProbability(10000000);
        double double17 = poissonDistributionImpl3.cumulativeProbability(0.8160602794142788d);
        double double19 = poissonDistributionImpl3.normalApproximateProbability(12);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.691462461274013d + "'", double13 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 16, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (32) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(52.0d, (double) (byte) -1, 15);
        double double5 = poissonDistributionImpl3.normalApproximateProbability((int) (short) 1);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        poissonDistributionImpl3.reseedRandomGenerator((long) 11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.2518874825673265E-12d + "'", double5 == 1.2518874825673265E-12d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) (short) 0);
        double double13 = poissonDistributionImpl3.probability((double) (-1L));
        double double16 = poissonDistributionImpl3.cumulativeProbability(29, 107);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(97.0d, 4.5399929762484845E-4d, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability(2.813234320208393E-13d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 97");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(32.0d, (int) 'a');
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 36, 0.06131324019524039d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(98);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.999778782798785E-13d, (double) 100L);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 41);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06727319239963177d, 0.36787943195528694d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029285828261849244d, (int) '4');
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (-1L));
        int[] intArray6 = poissonDistributionImpl2.sample(15);
        double double8 = poissonDistributionImpl2.probability(103);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "1) test2014(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.14E-322d + "'", double8 == 1.14E-322d);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 32);
        double double4 = poissonDistributionImpl2.probability(11);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.8761758109940728E-7d + "'", double4 == 1.8761758109940728E-7d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        poissonDistributionImpl3.reseedRandomGenerator((long) 99);
        double double16 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 3);
        int int18 = poissonDistributionImpl3.inverseCumulativeProbability(0.9386867598047597d);
        double double20 = poissonDistributionImpl3.normalApproximateProbability(38);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3525511311226325d + "'", double16 == 0.3525511311226325d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787943195528694d, 106);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(0.4421702547125802d, 2.7596379528070493E-10d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6922006339347839d + "'", double4 == 0.6922006339347839d);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999998405164d, 1.4230202807276707E-23d, 9);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        double double14 = poissonDistributionImpl3.cumulativeProbability(32);
        double double16 = poissonDistributionImpl3.cumulativeProbability(1);
        double double18 = poissonDistributionImpl3.probability(5.907792072437627E-11d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "2) test2019(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 3 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.8160602794142788d + "'", double16 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability((int) ' ');
        int int16 = poissonDistributionImpl3.getDomainUpperBound((double) 1.0f);
        int int18 = poissonDistributionImpl3.getDomainLowerBound((double) 105);
        double double20 = poissonDistributionImpl3.normalApproximateProbability(2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.9331927987311419d + "'", double20 == 0.9331927987311419d);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((double) 2, 0.20223062088848806d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.probability((double) 10000000);
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(0.0030656620097619935d);
        int int19 = poissonDistributionImpl3.getDomainLowerBound(3.9606298142722176E-69d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = poissonDistributionImpl3.cumulativeProbability(93, 3);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "3) test2022(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.021990921302225148d, (double) 38, 29);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, 106);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(1.17246204865673E-37d);
        double double7 = poissonDistributionImpl2.cumulativeProbability(0, 99);
        double double9 = poissonDistributionImpl2.probability((int) '#');
        double double11 = poissonDistributionImpl2.cumulativeProbability(1.0398180320558363E-12d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.5601874895062087E-41d + "'", double9 == 3.5601874895062087E-41d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.36787944117146065d + "'", double11 == 0.36787944117146065d);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        int int16 = poissonDistributionImpl3.getDomainUpperBound((double) (byte) 1);
        int int17 = poissonDistributionImpl3.sample();
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 1);
        int int21 = poissonDistributionImpl3.getDomainUpperBound(0.9386867598047597d);
        int int23 = poissonDistributionImpl3.inverseCumulativeProbability(1.1102230246251565E-16d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
// flaky "4) test2026(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (int) (byte) -1);
        int int3 = poissonDistributionImpl2.sample();
        double double4 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 51);
        int int8 = poissonDistributionImpl2.getDomainUpperBound(0.4919298095548862d);
// flaky "5) test2027(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 30);
        int int3 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability(9.88940969307282E-43d, 2.755731922395672E-127d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky "6) test2028(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 34 + "'", int3 == 34);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        double double12 = poissonDistributionImpl2.probability(13);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.1975603087038227E-5d + "'", double12 == 1.1975603087038227E-5d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1);
        double double23 = poissonDistributionImpl3.probability((int) (short) -1);
        double double25 = poissonDistributionImpl3.probability(3);
        double double27 = poissonDistributionImpl3.probability((double) 1);
        int int29 = poissonDistributionImpl3.inverseCumulativeProbability(0.3525511311226325d);
        int int30 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "7) test2030(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.06131324019524039d + "'", double25 == 0.06131324019524039d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.36787944117144233d + "'", double27 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
// flaky "1) test2030(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.9418660600503296E-157d, (int) (byte) -1);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.9418660600503296E-157d + "'", double3 == 3.9418660600503296E-157d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999545754442823d, 91);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = poissonDistributionImpl3.cumulativeProbability(93, (int) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "8) test2033(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', (int) (byte) 1);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 24, (double) 23, 83);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, 0.6321205588285574d, 112);
        poissonDistributionImpl3.reseedRandomGenerator((long) 5);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.8565280035520715E-7d, 0.9999999998405164d);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1);
        double double3 = poissonDistributionImpl1.cumulativeProbability(0.19699216367798777d);
        int int5 = poissonDistributionImpl1.inverseCumulativeProbability(0.999999992542288d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.36787944117146065d + "'", double3 == 0.36787944117146065d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double14 = poissonDistributionImpl3.cumulativeProbability((double) (short) 0, (double) 'a');
        double double16 = poissonDistributionImpl3.normalApproximateProbability((int) 'a');
        poissonDistributionImpl3.reseedRandomGenerator((long) '#');
        poissonDistributionImpl3.reseedRandomGenerator((long) 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) 2);
        poissonDistributionImpl2.reseedRandomGenerator((long) ' ');
        int int6 = poissonDistributionImpl2.getDomainUpperBound(0.0030656620097619935d);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = poissonDistributionImpl2.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06680720126885803d, 4.560969057281241E-69d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.6321205588285574d);
        double double7 = poissonDistributionImpl2.cumulativeProbability(44, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9353755231673158d + "'", double4 == 0.9353755231673158d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, (double) (short) -1, (int) (short) 100);
        int int5 = poissonDistributionImpl3.getDomainLowerBound(1.0137771196302933E-7d);
        int[] intArray7 = poissonDistributionImpl3.sample(30);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.533676680517062d);
        double double2 = poissonDistributionImpl1.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.533676680517062d + "'", double2 == 0.533676680517062d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.539992976248491E-5d, 2147483647);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.560969057281241E-69d, (double) '4', (int) 'a');
        int int5 = poissonDistributionImpl3.getDomainUpperBound(0.8160602794142788d);
        int[] intArray7 = poissonDistributionImpl3.sample(29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 41);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d);
        double double3 = poissonDistributionImpl1.probability(0.18393972058572117d);
        double double5 = poissonDistributionImpl1.probability(3.902447399449791E-155d);
        double double7 = poissonDistributionImpl1.normalApproximateProbability((int) (byte) -1);
        int int9 = poissonDistributionImpl1.getDomainUpperBound((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.533676680517062d, 110);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.533676680517062d + "'", double3 == 0.533676680517062d);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double14 = poissonDistributionImpl3.cumulativeProbability((double) (short) 0, (double) 'a');
        double double16 = poissonDistributionImpl3.probability((double) (-1L));
        double double18 = poissonDistributionImpl3.cumulativeProbability(50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (short) 1);
        int int7 = poissonDistributionImpl2.sample();
        int int9 = poissonDistributionImpl2.getDomainLowerBound(0.01891663740103536d);
        int int10 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "9) test2050(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 42 });
// flaky "2) test2050(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 37 + "'", int7 == 37);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "1) test2050(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 26 + "'", int10 == 26);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability(104);
        double double16 = poissonDistributionImpl3.normalApproximateProbability(35);
        int[] intArray18 = poissonDistributionImpl3.sample(39);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 104, 32);
        int int3 = poissonDistributionImpl2.sample();
// flaky "10) test2052(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 109 + "'", int3 == 109);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (int) '4');
        double double4 = poissonDistributionImpl2.probability((int) (short) 1);
        double double6 = poissonDistributionImpl2.probability(52.0d);
        double double8 = poissonDistributionImpl2.cumulativeProbability(3.139132792048018E-17d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.36083758160943114d + "'", double4 == 0.36083758160943114d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.4076594357809174E-73d + "'", double6 == 1.4076594357809174E-73d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4421702547125971d + "'", double8 == 0.4421702547125971d);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 30, (double) 35);
        double double4 = poissonDistributionImpl2.probability(0.9999999998405164d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(37, 13);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int[] intArray17 = poissonDistributionImpl3.sample((int) 'a');
        double double19 = poissonDistributionImpl3.normalApproximateProbability(30);
        double double21 = poissonDistributionImpl3.probability((double) 110);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.3162630182404337E-179d + "'", double21 == 2.3162630182404337E-179d);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        double double14 = poissonDistributionImpl3.cumulativeProbability((int) 'a', 2147483647);
        int int16 = poissonDistributionImpl3.getDomainLowerBound((double) (-1));
        int int18 = poissonDistributionImpl3.getDomainUpperBound((double) 24);
        double double20 = poissonDistributionImpl3.normalApproximateProbability((int) '4');
        double double23 = poissonDistributionImpl3.cumulativeProbability(0.06727319239963177d, (double) 12);
        int int25 = poissonDistributionImpl3.getDomainUpperBound((double) 39);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = poissonDistributionImpl3.cumulativeProbability(24, 4);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.3678794411123646d + "'", double23 == 0.3678794411123646d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        double double4 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = poissonDistributionImpl3.inverseCumulativeProbability((double) 82);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-12d + "'", double4 == 1.0E-12d);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.8243984514608465E-153d, 3.57198604755006E-167d);
        double double5 = poissonDistributionImpl2.cumulativeProbability((int) (short) -1, 0);
        double double7 = poissonDistributionImpl2.cumulativeProbability((double) (short) 100);
        int[] intArray9 = poissonDistributionImpl2.sample(3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0, 0, 0 });
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        poissonDistributionImpl3.reseedRandomGenerator((long) 99);
        double double15 = poissonDistributionImpl3.probability(3.139132792048018E-17d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.2913989097407664E-60d, (double) 0, 98);
        double double5 = poissonDistributionImpl3.probability(43);
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 29, 1.5377671420713246E-9d, 50);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1);
        int int22 = poissonDistributionImpl3.sample();
        double double24 = poissonDistributionImpl3.probability(0.3678794445618948d);
        int int26 = poissonDistributionImpl3.getDomainUpperBound(1.7401052582713831E-47d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "11) test2062(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
// flaky "3) test2062(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((int) (byte) -1);
        double double11 = poissonDistributionImpl3.normalApproximateProbability(10);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl3.cumulativeProbability(0.9999966023268753d, 3.57198604755006E-167d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "12) test2063(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        int[] intArray8 = poissonDistributionImpl2.sample(106);
        int int10 = poissonDistributionImpl2.getDomainLowerBound((double) 34);
        int int11 = poissonDistributionImpl2.sample();
        int int13 = poissonDistributionImpl2.getDomainUpperBound(9.216155633002718E-9d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = poissonDistributionImpl2.cumulativeProbability(23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "13) test2064(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 45 + "'", int11 == 45);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d);
        poissonDistributionImpl1.reseedRandomGenerator((long) 73);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        int int15 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 35);
        double double19 = poissonDistributionImpl3.getMean();
        int int20 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int17 = poissonDistributionImpl3.getDomainLowerBound((double) 3);
        int int19 = poissonDistributionImpl3.getDomainLowerBound(10.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) 23);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "14) test2067(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1, 0, 1, 0, 0, 0, 0, 2, 0, 0 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1);
        double double23 = poissonDistributionImpl3.probability((int) (short) -1);
        double double25 = poissonDistributionImpl3.probability(3);
        double double27 = poissonDistributionImpl3.probability((double) 1);
        int int29 = poissonDistributionImpl3.inverseCumulativeProbability(0.3525511311226325d);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = poissonDistributionImpl3.inverseCumulativeProbability((double) 91);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "4) test2068(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.06131324019524039d + "'", double25 == 0.06131324019524039d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.36787944117144233d + "'", double27 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 21, 0.999999999231987d);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double16 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) 'a');
        double double19 = poissonDistributionImpl3.cumulativeProbability(15, 109);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.8133051444001467E-13d + "'", double19 == 2.8133051444001467E-13d);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((double) 0.0f);
        int int10 = poissonDistributionImpl3.sample();
        int int11 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "15) test2071(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
// flaky "2) test2071(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "5) test2071(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        double double14 = poissonDistributionImpl3.probability((int) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        int int18 = poissonDistributionImpl3.inverseCumulativeProbability(0.8862636038898793d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "6) test2072(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 28, 95);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) '4');
        double double4 = poissonDistributionImpl2.cumulativeProbability(3.720075976020836E-44d);
        double double6 = poissonDistributionImpl2.probability((double) (-1));
        double double9 = poissonDistributionImpl2.cumulativeProbability(0.44217025471258026d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.999999999999d + "'", double4 == 0.999999999999d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.999778782798785E-13d + "'", double9 == 9.999778782798785E-13d);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double16 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) 'a');
        double double19 = poissonDistributionImpl3.cumulativeProbability(1, 99);
        double double21 = poissonDistributionImpl3.probability(80);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.36787944117144256d + "'", double19 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5.1401737047361744E-120d + "'", double21 == 5.1401737047361744E-120d);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double10 = poissonDistributionImpl3.getMean();
        double double12 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        poissonDistributionImpl3.reseedRandomGenerator((long) 10000000);
        double double16 = poissonDistributionImpl3.normalApproximateProbability(52);
        double double17 = poissonDistributionImpl3.getMean();
        int int19 = poissonDistributionImpl3.inverseCumulativeProbability(0.9999999999999993d);
        double double21 = poissonDistributionImpl3.probability((double) 10000000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 105, 0.6922006339347749d, 35);
        int[] intArray5 = poissonDistributionImpl3.sample(34);
        int int7 = poissonDistributionImpl3.getDomainLowerBound((double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            int int9 = poissonDistributionImpl3.inverseCumulativeProbability(32.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.560969057281241E-69d, 106);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 3, 0.0027693957155115767d, 86);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, 4.018416977195786E-54d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(1.8761758109940728E-7d, 0.028861154135454092d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double17 = poissonDistributionImpl3.cumulativeProbability(32);
        double double20 = poissonDistributionImpl3.cumulativeProbability(2.0876756987846234E-153d, 38.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.36787944117144256d + "'", double20 == 0.36787944117144256d);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9386867598047597d, (int) (short) 0);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9846716899511899d + "'", double7 == 0.9846716899511899d);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 30, (double) 10000000);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.0d);
        int int5 = poissonDistributionImpl2.sample();
        double double7 = poissonDistributionImpl2.cumulativeProbability(110);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "16) test2084(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) '#');
        int int16 = poissonDistributionImpl3.getDomainLowerBound(3.57198604755006E-167d);
        double double18 = poissonDistributionImpl3.cumulativeProbability((int) '4');
        int int20 = poissonDistributionImpl3.inverseCumulativeProbability(4.719682636442159E-60d);
        double double22 = poissonDistributionImpl3.cumulativeProbability(13);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9999999999957802d + "'", double22 == 0.9999999999957802d);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, (double) (short) -1, (int) (short) 100);
        int[] intArray5 = poissonDistributionImpl3.sample((int) (short) 10);
        int int7 = poissonDistributionImpl3.getDomainUpperBound(0.999999992542288d);
        double double8 = poissonDistributionImpl3.getMean();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.05956661497600297d);
        double double12 = poissonDistributionImpl3.normalApproximateProbability(39);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "17) test2086(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 43, 42, 39, 33, 35, 29, 36, 34, 32 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.7765635896445847d + "'", double12 == 0.7765635896445847d);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.03796348149127876d, 94);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double9 = poissonDistributionImpl3.getMean();
        int int11 = poissonDistributionImpl3.getDomainLowerBound(10.0d);
        double double12 = poissonDistributionImpl3.getMean();
        double double15 = poissonDistributionImpl3.cumulativeProbability(2.8133051444001467E-13d, (double) 80);
        double double17 = poissonDistributionImpl3.cumulativeProbability(9);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.36787944117144256d + "'", double15 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.999999898622288d + "'", double17 == 0.999999898622288d);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.018416977195786E-54d, 6.305116760146996E-16d, 0);
        double double5 = poissonDistributionImpl3.probability(50);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability(52.0d, 0.8160602794142788d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.952232587603118E-18d, 23);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) '4');
        double double4 = poissonDistributionImpl2.cumulativeProbability(3.720075976020836E-44d);
        poissonDistributionImpl2.reseedRandomGenerator(10L);
        double double8 = poissonDistributionImpl2.probability(10);
        int int10 = poissonDistributionImpl2.getDomainLowerBound(0.9331927987311419d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.999999999999d + "'", double4 == 0.999999999999d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.755731922395672E-127d + "'", double8 == 2.755731922395672E-127d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.5065674758999414E-46d, 0.0d, 16);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        int int8 = poissonDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = poissonDistributionImpl2.probability(73);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.350918877009172E-9d + "'", double10 == 7.350918877009172E-9d);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int4 = poissonDistributionImpl3.sample();
        double double5 = poissonDistributionImpl3.getMean();
        double double8 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 32);
        int int10 = poissonDistributionImpl3.inverseCumulativeProbability(0.1251100357211333d);
        int int12 = poissonDistributionImpl3.getDomainUpperBound(0.0030656620097620196d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-12d + "'", double5 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1);
        double double3 = poissonDistributionImpl1.probability((int) (byte) 10);
        poissonDistributionImpl1.reseedRandomGenerator((long) 104);
        double double7 = poissonDistributionImpl1.cumulativeProbability(107);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0137771196302933E-7d + "'", double3 == 1.0137771196302933E-7d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        int int14 = poissonDistributionImpl3.inverseCumulativeProbability(4.560969057281241E-69d);
        int int16 = poissonDistributionImpl3.getDomainLowerBound(1.5377671420713246E-9d);
        double double18 = poissonDistributionImpl3.normalApproximateProbability((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "18) test2096(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 3 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.06680720126885803d + "'", double18 == 0.06680720126885803d);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, 1);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(8.545951360777861E-7d);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        double double9 = poissonDistributionImpl3.normalApproximateProbability((int) '4');
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 100.0f);
        double double13 = poissonDistributionImpl3.probability((double) 100.0f);
        double double14 = poissonDistributionImpl3.getMean();
        double double16 = poissonDistributionImpl3.probability(2.6728134305602215E-44d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.941866060050443E-159d + "'", double13 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 0.9601390031908519d, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, 0.5429999234951242d, 36);
        double double4 = poissonDistributionImpl3.getMean();
        int int6 = poissonDistributionImpl3.inverseCumulativeProbability(0.9999546000702375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8160602794142788d + "'", double4 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4', 0.36787944117227944d);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (double) ' ', (int) (short) 100);
        double double5 = poissonDistributionImpl3.probability(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double8 = poissonDistributionImpl3.cumulativeProbability(80);
        double double11 = poissonDistributionImpl3.cumulativeProbability(15, 10000000);
        double double13 = poissonDistributionImpl3.cumulativeProbability(98);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.720075976020836E-44d + "'", double5 == 3.720075976020836E-44d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.021990921302225148d + "'", double8 == 0.021990921302225148d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14891466732474742d + "'", double13 == 0.14891466732474742d);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double14 = poissonDistributionImpl3.getMean();
        int int16 = poissonDistributionImpl3.getDomainUpperBound(4.670902356181524E-139d);
        double double18 = poissonDistributionImpl3.normalApproximateProbability(39);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "3) test2104(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.025956482467509034d, (double) 35, 34);
        int int5 = poissonDistributionImpl3.getDomainUpperBound(1.2460656213271568E-39d);
        int[] intArray7 = poissonDistributionImpl3.sample(14);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "7) test2105(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.probability(1.0d);
        int int13 = poissonDistributionImpl3.getDomainUpperBound(0.9999270080473867d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.36787944117144233d + "'", double11 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 1L);
        double double14 = poissonDistributionImpl3.probability(3);
        poissonDistributionImpl3.reseedRandomGenerator((long) 5);
        int[] intArray18 = poissonDistributionImpl3.sample(23);
        poissonDistributionImpl3.reseedRandomGenerator((long) 2146192320);
        double double22 = poissonDistributionImpl3.probability((double) 31);
        int int24 = poissonDistributionImpl3.getDomainLowerBound(0.9995720010776109d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "19) test2107(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06131324019524039d + "'", double14 == 0.06131324019524039d);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 1, 1, 0, 1, 2, 2, 2, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2 });
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.4738740068130806E-35d + "'", double22 == 4.4738740068130806E-35d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.4076594357809174E-73d, 0.5259020955950889d, 31);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, 0.6321205588285574d);
        double double4 = poissonDistributionImpl2.probability((int) '4');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4076594357809174E-73d + "'", double4 == 1.4076594357809174E-73d);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.999778782798785E-13d, (double) 100L);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 'a');
        int int7 = poissonDistributionImpl2.sample();
        double double9 = poissonDistributionImpl2.normalApproximateProbability(51);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 99, (int) (byte) 10);
        poissonDistributionImpl2.reseedRandomGenerator(0L);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = poissonDistributionImpl2.inverseCumulativeProbability(0.9999999999994409d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (10) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double11 = poissonDistributionImpl3.getMean();
        double double13 = poissonDistributionImpl3.probability(0.8430188007045427d);
        int int15 = poissonDistributionImpl3.getDomainUpperBound(3.2418737649498176E-173d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6321205588285574d + "'", double10 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.4076594357809174E-73d);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 1L);
        double double14 = poissonDistributionImpl3.probability(3);
        poissonDistributionImpl3.reseedRandomGenerator((long) 5);
        int int18 = poissonDistributionImpl3.getDomainUpperBound(1.0d);
        double double21 = poissonDistributionImpl3.cumulativeProbability(15, 24);
        double double23 = poissonDistributionImpl3.cumulativeProbability(5.609088260248484E-6d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "20) test2114(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06131324019524039d + "'", double14 == 0.06131324019524039d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.8133051444001467E-13d + "'", double21 == 2.8133051444001467E-13d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6321205588285574d + "'", double23 == 0.6321205588285574d);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) 2);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.9386867598047597d);
        int int6 = poissonDistributionImpl2.getDomainLowerBound(0.0d);
        int[] intArray8 = poissonDistributionImpl2.sample(24);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray8);
// flaky "21) test2115(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray8, new int[] { 9, 14, 12, 18, 10, 9, 11, 6, 22, 7, 13, 9, 5, 11, 18, 11, 9, 14, 13, 12, 8, 16, 15, 7 });
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.950212931632136d, 83);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2, 2.7476693956635508E-33d, 0);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, 0.8160602794142788d, 2);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        int int7 = poissonDistributionImpl3.getDomainLowerBound((double) (byte) 1);
        int int9 = poissonDistributionImpl3.getDomainUpperBound((double) 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, 0.25464638004358264d);
        double double4 = poissonDistributionImpl2.probability((double) (-1L));
        double double5 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9736445389005101d, 0.19699216367798777d);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.07257897695541599d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int[] intArray14 = poissonDistributionImpl3.sample((int) 'a');
        int[] intArray16 = poissonDistributionImpl3.sample(95);
        double double19 = poissonDistributionImpl3.cumulativeProbability(0.0d, 104.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.18393972058572117d, 6);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) 100);
        double double4 = poissonDistributionImpl2.cumulativeProbability(2147483647);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(1.0E-12d);
        double double7 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.1251100357211333d + "'", double7 == 0.1251100357211333d);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        double double10 = poissonDistributionImpl3.cumulativeProbability(0.05698471084507295d, (double) 100);
        int int12 = poissonDistributionImpl3.getDomainUpperBound(0.9386867598047597d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.36787944117144256d + "'", double10 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.17246204865673E-37d, 80);
        double double5 = poissonDistributionImpl2.cumulativeProbability(0.36787944117146065d, (double) 110);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 32, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.probability(4.018416977195786E-54d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10, 15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 32");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        int[] intArray12 = poissonDistributionImpl3.sample(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "1) test2127(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] {});
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) ' ');
        int int4 = poissonDistributionImpl2.getDomainUpperBound(0.0d);
        double double6 = poissonDistributionImpl2.probability(1.6889118802245312E-48d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 30, (double) 10000000);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.0030656620097620196d);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(1.8761758109940728E-7d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        int[] intArray13 = poissonDistributionImpl3.sample((int) 'a');
        double double14 = poissonDistributionImpl3.getMean();
        double double16 = poissonDistributionImpl3.probability(3.5601874895062087E-41d);
        double double18 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6321205588285574d + "'", double18 == 0.6321205588285574d);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.cumulativeProbability(9.216155638647194E-8d);
        double double14 = poissonDistributionImpl3.cumulativeProbability(2);
        int int16 = poissonDistributionImpl3.getDomainLowerBound(1.17246204865673E-37d);
        double double18 = poissonDistributionImpl3.normalApproximateProbability((int) '#');
        double double19 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6321205588285574d + "'", double12 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9386867598047597d + "'", double14 == 0.9386867598047597d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        double double16 = poissonDistributionImpl3.cumulativeProbability((int) '4');
        double double19 = poissonDistributionImpl3.cumulativeProbability(0.8862636038898793d, (double) 78);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.36787944117144256d + "'", double19 == 0.36787944117144256d);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((int) (byte) -1);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 0);
        int[] intArray13 = poissonDistributionImpl3.sample(95);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "22) test2133(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.probability(12);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = poissonDistributionImpl3.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "8) test2134(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.680129694168893E-10d + "'", double12 == 7.680129694168893E-10d);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', 0.18393972058572114d);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.018416977195786E-54d, 6.305116760146996E-16d, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(0.9353755231673158d, 0.8862636038898793d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        int int14 = poissonDistributionImpl3.inverseCumulativeProbability(4.560969057281241E-69d);
        double double16 = poissonDistributionImpl3.probability(0.8862636038898793d);
        poissonDistributionImpl3.reseedRandomGenerator((long) 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "23) test2137(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainUpperBound(4.560969057281241E-69d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(1, (int) (short) 10);
        double double19 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 0);
        double double21 = poissonDistributionImpl3.probability(38);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "24) test2138(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.36787943195528694d + "'", double17 == 0.36787943195528694d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.308537538725987d + "'", double19 == 0.308537538725987d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 7.033719554105805E-46d + "'", double21 == 7.033719554105805E-46d);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) 2);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.9386867598047597d);
        int int5 = poissonDistributionImpl2.sample();
        int int6 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "25) test2139(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
// flaky "9) test2139(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 98);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int int14 = poissonDistributionImpl3.getDomainLowerBound(0.999999999954943d);
        double double15 = poissonDistributionImpl3.getMean();
        int int17 = poissonDistributionImpl3.getDomainLowerBound(5.559174711623875E-287d);
        int int19 = poissonDistributionImpl3.getDomainUpperBound((double) 52);
        double double21 = poissonDistributionImpl3.probability(52);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.560969057281241E-69d + "'", double21 == 4.560969057281241E-69d);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 100, (int) (byte) 10);
        double double4 = poissonDistributionImpl2.cumulativeProbability(8.958833674910238E-12d);
        int int6 = poissonDistributionImpl2.getDomainLowerBound(0.0013335812360537602d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.7200759760208177E-44d + "'", double4 == 3.7200759760208177E-44d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a');
        double double4 = poissonDistributionImpl1.cumulativeProbability((int) (byte) -1, 3);
        int int6 = poissonDistributionImpl1.getDomainUpperBound(0.3678794411711612d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.17246204865673E-37d + "'", double4 == 1.17246204865673E-37d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 46);
        double double12 = poissonDistributionImpl3.cumulativeProbability(11);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.999999999231987d + "'", double12 == 0.999999999231987d);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 30, (double) 10000000);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.0d);
        int int5 = poissonDistributionImpl2.sample();
        int int7 = poissonDistributionImpl2.getDomainLowerBound(4.864649182067619E-63d);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = poissonDistributionImpl2.inverseCumulativeProbability(38.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "26) test2145(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability(3.8243984514608465E-153d);
        double double11 = poissonDistributionImpl3.cumulativeProbability(1.7401052582713831E-47d);
        double double13 = poissonDistributionImpl3.probability(0.18393972058572117d);
        poissonDistributionImpl3.reseedRandomGenerator(10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6321205588285574d + "'", double11 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06131324019524039d, (int) '4');
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6102790696677136E-23d, 0.007566654960414148d, (int) ' ');
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(38);
        double double20 = poissonDistributionImpl3.cumulativeProbability((-1), (-1));
        double double22 = poissonDistributionImpl3.probability(37);
        int int23 = poissonDistributionImpl3.sample();
        int int24 = poissonDistributionImpl3.sample();
        double double26 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double28 = poissonDistributionImpl3.cumulativeProbability(73);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.6728134305602215E-44d + "'", double22 == 2.6728134305602215E-44d);
// flaky "10) test2149(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
// flaky "27) test2149(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.2518874825673265E-12d);
        double double2 = poissonDistributionImpl1.getMean();
        int[] intArray4 = poissonDistributionImpl1.sample(40);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2518874825673265E-12d + "'", double2 == 1.2518874825673265E-12d);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double17 = poissonDistributionImpl3.cumulativeProbability(32);
        double double19 = poissonDistributionImpl3.probability((double) 106);
        double double21 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        poissonDistributionImpl3.reseedRandomGenerator((long) 41);
        int int24 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.2093315791106567E-171d + "'", double19 == 3.2093315791106567E-171d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) 100);
        double double4 = poissonDistributionImpl2.cumulativeProbability(2147483647);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(1.0E-12d);
        int int7 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 42, (double) (short) 0, 41);
        double double5 = poissonDistributionImpl3.probability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.74952226429356E-19d + "'", double5 == 5.74952226429356E-19d);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int int17 = poissonDistributionImpl3.getDomainLowerBound(0.36787944117144256d);
        int int19 = poissonDistributionImpl3.getDomainUpperBound(4.719682636442159E-60d);
        double double21 = poissonDistributionImpl3.probability(0.29140699867905834d);
        double double23 = poissonDistributionImpl3.cumulativeProbability((double) 'a');
        double double25 = poissonDistributionImpl3.cumulativeProbability((double) 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9999270080473867d + "'", double25 == 0.9999270080473867d);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int4 = poissonDistributionImpl3.sample();
        double double5 = poissonDistributionImpl3.getMean();
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10L);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability(0.8345580221844533d);
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (short) 1);
        double double14 = poissonDistributionImpl3.cumulativeProbability(2.5065674758999414E-46d, (double) 42);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-12d + "'", double5 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.999778782798785E-13d + "'", double14 == 9.999778782798785E-13d);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, (int) 'a');
        double double4 = poissonDistributionImpl2.probability(5.347030737638007E-35d);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(7.307197512236221E-190d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.025956482467509034d, 1.7582714501302516E-14d, 91);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.5184628423074624E-131d, 0.9999999999957802d);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2147483647, (double) 1, 44);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(3.57198604755006E-167d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2146207884 + "'", int5 == 2146207884);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8345580221844533d, 41);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(0.533676680517062d);
        double double6 = poissonDistributionImpl2.cumulativeProbability(186);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(44.0d, 10.0d, 93);
        double double5 = poissonDistributionImpl3.cumulativeProbability(51);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9722071181415645d + "'", double5 == 0.9722071181415645d);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        int int11 = poissonDistributionImpl3.getDomainUpperBound(0.8160602794142788d);
        double double13 = poissonDistributionImpl3.probability(0.9997803485788277d);
        double double15 = poissonDistributionImpl3.probability(0.9999999999999825d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7476693956635508E-33d, (double) 10, 24);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(10);
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9784874006708175d, 0.36787943195528694d, (int) ' ');
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double12 = poissonDistributionImpl3.getMean();
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.normalApproximateProbability(104);
        double double17 = poissonDistributionImpl3.cumulativeProbability(4.670902356181524E-139d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
// flaky "11) test2165(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.2460656213271568E-39d, (double) 12, 15);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        int[] intArray5 = poissonDistributionImpl1.sample((int) 'a');
        double double7 = poissonDistributionImpl1.normalApproximateProbability(80);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1);
        java.lang.Class<?> wildcardClass2 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.57198604755006E-167d, (int) '4');
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) 24);
        double double6 = poissonDistributionImpl2.probability(105);
        poissonDistributionImpl2.reseedRandomGenerator(0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (double) (-1), (-1));
        double double5 = poissonDistributionImpl3.probability((int) (byte) -1);
        double double6 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) 105);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        double double11 = poissonDistributionImpl3.cumulativeProbability(0.6321205588285574d, (double) 100L);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int15 = poissonDistributionImpl3.getDomainUpperBound((double) (byte) 1);
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(1.962564426565066E-37d);
        int int19 = poissonDistributionImpl3.getDomainLowerBound(1.0457262607030534E-29d);
        poissonDistributionImpl3.reseedRandomGenerator((long) 38);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "4) test2171(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.36787944117144256d + "'", double11 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.003594758625082517d);
        double double5 = poissonDistributionImpl1.cumulativeProbability(78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 73 + "'", int3 == 73);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.013293039215491338d + "'", double5 == 0.013293039215491338d);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.18393972058572117d, (double) 1L);
        int[] intArray4 = poissonDistributionImpl2.sample(37);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(110, (int) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        double double8 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 50, 3.941866060050443E-159d, 102);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (int) '4');
        double double4 = poissonDistributionImpl2.probability(0.308537538725987d);
        int int6 = poissonDistributionImpl2.getDomainLowerBound(0.533676680517062d);
        double double8 = poissonDistributionImpl2.cumulativeProbability(3.139132792048018E-17d);
        int int10 = poissonDistributionImpl2.getDomainUpperBound(0.028444728018643173d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = poissonDistributionImpl2.cumulativeProbability((double) 3, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4421702547125971d + "'", double8 == 0.4421702547125971d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 28, 0.9999966023268753d, (int) (byte) 1);
        double double5 = poissonDistributionImpl3.probability(115);
        double double7 = poissonDistributionImpl3.cumulativeProbability((-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.26308534261165E-35d + "'", double5 == 6.26308534261165E-35d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, 43);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9960697873735121d, 0.25464638004358264d, 95);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.039860996809147134d, 10000000);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double10 = poissonDistributionImpl3.getMean();
        double double12 = poissonDistributionImpl3.probability(0);
        double double13 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = poissonDistributionImpl3.cumulativeProbability(0.3525511311226325d, 0.9999704482777508d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.36787944117144233d + "'", double12 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.14723260883568248d, 52.0d, 38);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((double) 104);
        int int7 = poissonDistributionImpl3.getDomainUpperBound(0.3525511311226325d);
        int int9 = poissonDistributionImpl3.getDomainLowerBound(0.999999999940922d);
        int int10 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        double double11 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 'a');
        int int14 = poissonDistributionImpl2.sample();
        int int15 = poissonDistributionImpl2.sample();
        double double17 = poissonDistributionImpl2.probability(0.008575364588394788d);
        int int18 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 43 + "'", int14 == 43);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 43 + "'", int15 == 43);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double9 = poissonDistributionImpl3.getMean();
        double double11 = poissonDistributionImpl3.cumulativeProbability(10000000);
        int int13 = poissonDistributionImpl3.getDomainLowerBound(0.999999999954943d);
        double double15 = poissonDistributionImpl3.normalApproximateProbability(39);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.2913989097407664E-60d, (double) 0, 98);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 35);
        double double3 = poissonDistributionImpl1.cumulativeProbability(186);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d);
        double double4 = poissonDistributionImpl1.cumulativeProbability(1.0137743067240024E-7d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3077993724446445d + "'", double4 == 0.3077993724446445d);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainUpperBound(4.560969057281241E-69d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(1, (int) (short) 10);
        java.lang.Class<?> wildcardClass18 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "28) test2188(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.36787943195528694d + "'", double17 == 0.36787943195528694d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6426402136161335d);
        java.lang.Class<?> wildcardClass2 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainUpperBound(4.560969057281241E-69d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(0, (int) (short) 10);
        int int19 = poissonDistributionImpl3.getDomainLowerBound(0.06131324019524039d);
        double double21 = poissonDistributionImpl3.cumulativeProbability(5.907796474247107E-11d);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = poissonDistributionImpl3.cumulativeProbability(3.2418737649498176E-173d, 0.039860996809147134d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "29) test2190(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9999999907838444d + "'", double17 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.6321205588285574d + "'", double21 == 0.6321205588285574d);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', (double) 45);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) (byte) 0);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.cumulativeProbability(32);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 45);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8160602794142788d + "'", double3 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029285828261849244d, 59);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 30);
        double double4 = poissonDistributionImpl2.probability((double) 100L);
        int int6 = poissonDistributionImpl2.getDomainUpperBound(1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.2001158042335694E-17d + "'", double4 == 3.2001158042335694E-17d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 38);
        double double21 = poissonDistributionImpl3.cumulativeProbability(38, (int) (short) 100);
        double double22 = poissonDistributionImpl3.getMean();
        double double24 = poissonDistributionImpl3.normalApproximateProbability(37);
        int[] intArray26 = poissonDistributionImpl3.sample(23);
        int int28 = poissonDistributionImpl3.getDomainUpperBound(5.1401737047361744E-120d);
        double double29 = poissonDistributionImpl3.getMean();
        double double30 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(intArray26);
// flaky "30) test2195(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 1, 2, 2, 0, 1, 0, 1, 3, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 3 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.05698471084507295d, 35);
        double double4 = poissonDistributionImpl2.cumulativeProbability(105);
        double double6 = poissonDistributionImpl2.cumulativeProbability((double) (byte) 10);
        int[] intArray8 = poissonDistributionImpl2.sample(40);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(8.545951360777861E-7d, 1.7582714501302516E-14d);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 73);
        double double2 = poissonDistributionImpl1.getMean();
        poissonDistributionImpl1.reseedRandomGenerator(1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 73.0d + "'", double2 == 73.0d);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        int int15 = poissonDistributionImpl3.getDomainLowerBound((double) 2147483647);
        double double18 = poissonDistributionImpl3.cumulativeProbability(97, 112);
        java.lang.Class<?> wildcardClass19 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "31) test2199(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.57198604755006E-167d, (int) '4');
        double double4 = poissonDistributionImpl2.probability(15);
        double double6 = poissonDistributionImpl2.cumulativeProbability(4);
        int int8 = poissonDistributionImpl2.getDomainLowerBound(9.88940969307282E-43d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability(0.0d, 0.1251100357211333d);
        double double14 = poissonDistributionImpl3.normalApproximateProbability(104);
        int[] intArray16 = poissonDistributionImpl3.sample(9);
        double double18 = poissonDistributionImpl3.probability(80);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6321205588285574d + "'", double12 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(intArray16);
// flaky "32) test2201(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray16, new int[] { 3, 2, 1, 0, 1, 1, 1, 0, 2 });
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.1401737047361744E-120d + "'", double18 == 5.1401737047361744E-120d);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        poissonDistributionImpl3.reseedRandomGenerator((long) 12);
        java.lang.Class<?> wildcardClass14 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 32);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.216155638647194E-8d, (int) (short) 1);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability(0.5578297452874029d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.139132792048018E-17d, 1.4230202807276707E-23d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((int) 'a', 86);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0, (double) 13);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 12, 0.03796348149127876d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((double) 104, 0.5319622942224367d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.999999999999d, 0.0d, 10);
        int int5 = poissonDistributionImpl3.getDomainLowerBound((double) 36);
        poissonDistributionImpl3.reseedRandomGenerator((long) 99);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1L);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.028861154135454092d, 2.755731922395672E-127d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 38);
        double double6 = poissonDistributionImpl2.probability(51);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability(0.9999999999999993d, 4.4738740068130806E-35d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.874213734312014E-145d + "'", double6 == 1.874213734312014E-145d);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.533676680517062d, 110);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(34);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.probability(0.36787944117144233d);
        double double17 = poissonDistributionImpl3.normalApproximateProbability(50);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1);
        double double3 = poissonDistributionImpl1.cumulativeProbability(0.9997490375305196d);
        double double5 = poissonDistributionImpl1.cumulativeProbability((double) 16);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.36787944117146065d + "'", double3 == 0.36787944117146065d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999999999999989d + "'", double5 == 0.9999999999999989d);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029285828261849244d, (int) '4');
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.4421702547125802d);
        double double6 = poissonDistributionImpl2.probability((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0233060119162832E-94d + "'", double6 == 2.0233060119162832E-94d);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 106);
        double double15 = poissonDistributionImpl3.cumulativeProbability(0.999999999954943d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(1.2460656213271568E-39d);
        double double19 = poissonDistributionImpl3.probability((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double22 = poissonDistributionImpl3.cumulativeProbability((double) (byte) 10, 0.011604342211143792d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "12) test2215(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6321205588285574d + "'", double15 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.5601874895062087E-41d + "'", double19 == 3.5601874895062087E-41d);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4', (-1.0d), 100);
        double double4 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(1.0040290630831367E-103d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 52");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double14 = poissonDistributionImpl3.cumulativeProbability((double) (short) 0, (double) 'a');
        double double16 = poissonDistributionImpl3.probability(34);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.2460656213271568E-39d + "'", double16 == 1.2460656213271568E-39d);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', (int) (byte) 1);
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 10);
        int int6 = poissonDistributionImpl2.getDomainLowerBound((double) 88);
        double double8 = poissonDistributionImpl2.probability(82);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.214425871271413E-5d + "'", double4 == 7.214425871271413E-5d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.04446811210475E-14d + "'", double8 == 7.04446811210475E-14d);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(38);
        double double19 = poissonDistributionImpl3.normalApproximateProbability(99);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability(0.9999999999999825d);
        java.lang.Class<?> wildcardClass22 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.2051256383269262E-30d);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.3162630182404337E-179d, 5.74952226429356E-19d);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.2518874825673265E-12d, (int) (short) 10);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double18 = poissonDistributionImpl3.getMean();
        double double20 = poissonDistributionImpl3.cumulativeProbability((double) 0L);
        int int22 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        double double24 = poissonDistributionImpl3.probability(2147483647);
        double double25 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "33) test2223(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6321205588285574d + "'", double20 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.631895849694923E-44d, 1.3980856271290628E-36d);
        double double4 = poissonDistributionImpl2.probability(32);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(91, (int) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9936865915923108d, 1.3571450159050078E-13d);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(2.6183476108973206E-52d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9722071181415645d, (double) 46, 16);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1.0f);
        double double3 = poissonDistributionImpl1.probability(9);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.013777119630297E-6d + "'", double3 == 1.013777119630297E-6d);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.27705656503472276d, (int) (short) 100);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        double double9 = poissonDistributionImpl3.cumulativeProbability(100);
        double double11 = poissonDistributionImpl3.probability(2147483647);
        int int13 = poissonDistributionImpl3.inverseCumulativeProbability(0.8160602794142788d);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double17 = poissonDistributionImpl3.cumulativeProbability(7.471972337343043E-43d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) 105);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f);
        poissonDistributionImpl3.reseedRandomGenerator(100L);
        double double15 = poissonDistributionImpl3.cumulativeProbability(0, 0);
        double double16 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999907838444d + "'", double10 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6321205588285574d + "'", double15 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.813234320208393E-13d, 53);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 106);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability(2.5065674758999414E-46d);
        int int17 = poissonDistributionImpl3.getDomainUpperBound(8.781633496103664E-142d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "13) test2233(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, 0.8160602794142788d, 2);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        int int7 = poissonDistributionImpl3.getDomainLowerBound((double) (byte) 1);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 106);
        poissonDistributionImpl3.reseedRandomGenerator((long) 93);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.2051256383269262E-30d, 1.3571450159050078E-13d);
        double double4 = poissonDistributionImpl2.probability(12);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d);
        poissonDistributionImpl1.reseedRandomGenerator((long) 41);
        int int5 = poissonDistributionImpl1.getDomainLowerBound((double) (byte) 1);
        int[] intArray7 = poissonDistributionImpl1.sample((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.19699216367798777d, 0.9999545999035672d, 79);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d);
        poissonDistributionImpl1.reseedRandomGenerator((long) 41);
        int int5 = poissonDistributionImpl1.getDomainLowerBound((double) (byte) 1);
        int[] intArray7 = poissonDistributionImpl1.sample(0);
        double double9 = poissonDistributionImpl1.normalApproximateProbability(50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] {});
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', 9.216155638647194E-8d, 0);
        int int4 = poissonDistributionImpl3.sample();
        int int5 = poissonDistributionImpl3.sample();
        int int6 = poissonDistributionImpl3.sample();
// flaky "34) test2239(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 33 + "'", int4 == 33);
// flaky "14) test2239(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 18 + "'", int5 == 18);
// flaky "5) test2239(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 38 + "'", int6 == 38);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, (double) 37, 24);
        int int5 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.609088260248484E-6d, 105);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.609088260248484E-6d + "'", double3 == 5.609088260248484E-6d);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.8243984514608465E-153d, 3.57198604755006E-167d);
        double double4 = poissonDistributionImpl2.probability((double) ' ');
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 38);
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06131324019524039d, 10);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d, (double) 52, 29);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        poissonDistributionImpl3.reseedRandomGenerator((long) 0);
        double double9 = poissonDistributionImpl3.normalApproximateProbability(37);
        double double11 = poissonDistributionImpl3.cumulativeProbability(23);
        double double13 = poissonDistributionImpl3.cumulativeProbability(3.57198604755006E-167d);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability(3.4018914738572114E-169d);
        int int17 = poissonDistributionImpl3.getDomainUpperBound(9.216155616442734E-9d);
        double double20 = poissonDistributionImpl3.cumulativeProbability(0, 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6321205588285574d + "'", double13 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6150373563537195d, 97);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 10);
        int int10 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.normalApproximateProbability(10);
        double double12 = poissonDistributionImpl3.probability((double) 94);
        poissonDistributionImpl3.reseedRandomGenerator((long) 106);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.383215846100408E-147d + "'", double12 == 3.383215846100408E-147d);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(6.305116760146989E-16d, 3.826311454135856E-163d, (int) '4');
        double double5 = poissonDistributionImpl3.normalApproximateProbability(12);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) ' ');
        double double4 = poissonDistributionImpl2.probability((double) 10.0f);
        double double6 = poissonDistributionImpl2.cumulativeProbability(9.216155638647194E-8d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.539992976248491E-5d + "'", double6 == 4.539992976248491E-5d);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double9 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 10);
        double double13 = poissonDistributionImpl3.cumulativeProbability((double) 93);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.29140699867905834d, 3.1627334188024467E-75d, 12);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (short) 1);
        int int7 = poissonDistributionImpl2.sample();
        int int9 = poissonDistributionImpl2.getDomainLowerBound(0.01891663740103536d);
        double double11 = poissonDistributionImpl2.probability(0.9224963690453434d);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "35) test2253(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 24 });
// flaky "15) test2253(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) (short) -1);
        int int11 = poissonDistributionImpl3.sample();
        int int13 = poissonDistributionImpl3.getDomainLowerBound((double) 99);
        int[] intArray15 = poissonDistributionImpl3.sample((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
// flaky "36) test2254(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "16) test2254(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 3, 1, 0, 1, 0, 0, 2, 1, 0, 2 });
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 30);
        double double4 = poissonDistributionImpl2.probability((double) 100L);
        double double6 = poissonDistributionImpl2.cumulativeProbability((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability(102, 16);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.2001158042335694E-17d + "'", double4 == 3.2001158042335694E-17d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, (double) (short) -1, (int) (short) 100);
        int int5 = poissonDistributionImpl3.getDomainLowerBound(1.0137771196302933E-7d);
        double double7 = poissonDistributionImpl3.normalApproximateProbability(2146192320);
        double double8 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) (byte) 0);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(1.7401052582713831E-47d);
        double double6 = poissonDistributionImpl2.cumulativeProbability(0.04425363959909373d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4421702547125802d + "'", double6 == 0.4421702547125802d);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int5 = poissonDistributionImpl2.sample();
        double double7 = poissonDistributionImpl2.cumulativeProbability((-1));
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky "37) test2258(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 40 + "'", int5 == 40);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        double double11 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = poissonDistributionImpl2.inverseCumulativeProbability(0.9784874006708175d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double17 = poissonDistributionImpl3.cumulativeProbability(32);
        double double19 = poissonDistributionImpl3.cumulativeProbability(0.0030656620097619935d);
        int[] intArray21 = poissonDistributionImpl3.sample(23);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6321205588285574d + "'", double19 == 0.6321205588285574d);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 0, 0, 1, 2, 0, 2, 2, 0, 1, 0, 2, 0, 1, 0, 1, 1, 1, 1, 1, 2, 1, 1, 2 });
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 1);
        double double10 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06161675254888723d, 0.9999998986222932d);
        int[] intArray4 = poissonDistributionImpl2.sample(4);
        double double7 = poissonDistributionImpl2.cumulativeProbability(37, 53);
        org.junit.Assert.assertNotNull(intArray4);
// flaky "1) test2262(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 38, 3.57198604755006E-167d);
        double double5 = poissonDistributionImpl2.cumulativeProbability(1.17246204865673E-37d, (double) 34);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl2.cumulativeProbability(104, 98);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.29140699867905834d + "'", double5 == 0.29140699867905834d);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int int17 = poissonDistributionImpl3.getDomainLowerBound(0.36787944117144256d);
        int int19 = poissonDistributionImpl3.getDomainUpperBound(4.719682636442159E-60d);
        int int21 = poissonDistributionImpl3.getDomainUpperBound((double) (short) 10);
        poissonDistributionImpl3.reseedRandomGenerator((long) 29);
        double double25 = poissonDistributionImpl3.probability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0137771196302933E-7d + "'", double25 == 1.0137771196302933E-7d);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3525511311226325d, 0);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability(100);
        int int16 = poissonDistributionImpl3.getDomainLowerBound((double) ' ');
        int[] intArray18 = poissonDistributionImpl3.sample(15);
        double double20 = poissonDistributionImpl3.cumulativeProbability(100);
        int int22 = poissonDistributionImpl3.getDomainLowerBound((double) 80);
        java.lang.Class<?> wildcardClass23 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray18);
// flaky "38) test2267(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 1, 1, 1, 2, 1, 1, 0, 3, 1, 0, 2, 1, 2, 3 });
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) 94);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) (byte) 0);
        double double4 = poissonDistributionImpl2.cumulativeProbability((int) (short) 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 99);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.74952226429356E-19d, (double) 38, 44);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 106, 21);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f);
        int[] intArray12 = poissonDistributionImpl3.sample(23);
        double double13 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999907838444d + "'", double10 == 0.9999999907838444d);
        org.junit.Assert.assertNotNull(intArray12);
// flaky "39) test2272(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1, 2, 0, 1, 1, 0, 1, 2, 3, 2, 1, 0, 0, 1, 2, 3, 3, 2, 1, 2, 2, 1, 0 });
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 38);
        int int19 = poissonDistributionImpl3.sample();
        double double22 = poissonDistributionImpl3.cumulativeProbability(0.021990921302225148d, (double) 53);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
// flaky "40) test2273(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.36787944117144256d + "'", double22 == 0.36787944117144256d);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7582714501302516E-14d, 32);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d);
        int int3 = poissonDistributionImpl1.getDomainLowerBound((double) 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 37, (double) 106);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.7472115020283746d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int int14 = poissonDistributionImpl3.getDomainLowerBound(0.999999999954943d);
        double double16 = poissonDistributionImpl3.normalApproximateProbability(44);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) 73);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.902447399449791E-155d);
        double double4 = poissonDistributionImpl1.cumulativeProbability((double) 39, (double) 2146207884);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        double double11 = poissonDistributionImpl3.cumulativeProbability(93);
        int[] intArray13 = poissonDistributionImpl3.sample(46);
        double double15 = poissonDistributionImpl3.cumulativeProbability(4.0528363998149075E-10d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6321205588285574d + "'", double15 == 0.6321205588285574d);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        int int15 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 35);
        poissonDistributionImpl3.reseedRandomGenerator((long) 2146192320);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.5601874895062087E-41d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(10);
        int int4 = poissonDistributionImpl1.sample();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) (byte) 0);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.cumulativeProbability(32);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        int int9 = poissonDistributionImpl2.getDomainLowerBound(0.691462461274013d);
        int int10 = poissonDistributionImpl2.sample();
        int int12 = poissonDistributionImpl2.inverseCumulativeProbability(0.40894881836993996d);
        int int14 = poissonDistributionImpl2.getDomainUpperBound(0.3678794411672227d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8160602794142788d + "'", double3 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "41) test2282(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 38, 10.0d, 2147483647);
        int int5 = poissonDistributionImpl3.getDomainUpperBound(0.14723260883568248d);
        int int7 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        double double9 = poissonDistributionImpl3.probability(0.004818036512275375d);
        double double11 = poissonDistributionImpl3.probability((double) 39);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.06291944438598666d + "'", double11 == 0.06291944438598666d);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) (short) 0);
        double double13 = poissonDistributionImpl3.probability((double) (-1L));
        int int14 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
// flaky "6) test2284(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 40);
        double double2 = poissonDistributionImpl1.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 40.0d + "'", double2 == 40.0d);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f);
        poissonDistributionImpl3.reseedRandomGenerator(100L);
        int int13 = poissonDistributionImpl3.sample();
        double double16 = poissonDistributionImpl3.cumulativeProbability(14, 44);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999907838444d + "'", double10 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.2198466942977575E-12d + "'", double16 == 4.2198466942977575E-12d);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9995720010776109d, 0.3678794411711612d);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 104);
        double double2 = poissonDistributionImpl1.getMean();
        int int3 = poissonDistributionImpl1.sample();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104.0d + "'", double2 == 104.0d);
// flaky "42) test2288(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, (double) 28);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(3.902447399449791E-155d);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) 16);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (int) (byte) -1);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(4.160702826336122E-32d);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(10);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl2.cumulativeProbability(86);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 115, 2.5065674758999414E-46d, 4);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(3);
        double double10 = poissonDistributionImpl2.probability(3.139132792048018E-17d);
        int int11 = poissonDistributionImpl2.sample();
        int int13 = poissonDistributionImpl2.getDomainLowerBound(0.9601390031908519d);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.062340213690675E-8d + "'", double8 == 5.062340213690675E-8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
// flaky "43) test2292(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int[] intArray17 = poissonDistributionImpl3.sample((int) 'a');
        int int18 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (double) 83);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) 2);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.9386867598047597d);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (short) 1, 14);
        double double9 = poissonDistributionImpl2.probability((int) (short) 1);
        double double12 = poissonDistributionImpl2.cumulativeProbability(0.0d, 1.5080394273921536E-28d);
        double double13 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9652365304395534d + "'", double7 == 0.9652365304395534d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484845E-4d + "'", double9 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.539992976248491E-5d + "'", double12 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.170057723151973E-33d, (int) (byte) 10);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 94);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4');
        int int3 = poissonDistributionImpl1.getDomainUpperBound((double) 0);
        int int5 = poissonDistributionImpl1.getDomainLowerBound((double) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(0.1251100357211333d);
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability(0.06680720126885803d);
        double double23 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        int int25 = poissonDistributionImpl3.inverseCumulativeProbability(0.36083758160943114d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6321205588285574d + "'", double19 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int int17 = poissonDistributionImpl3.getDomainLowerBound(0.36787944117144256d);
        int int19 = poissonDistributionImpl3.getDomainUpperBound(7.680129694168893E-10d);
        int int21 = poissonDistributionImpl3.getDomainLowerBound(0.028444728018643173d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787943195528694d, (double) (-1L), 10);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 24);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double15 = poissonDistributionImpl3.probability((int) 'a');
        double double17 = poissonDistributionImpl3.normalApproximateProbability(105);
        double double19 = poissonDistributionImpl3.probability(103);
        double double21 = poissonDistributionImpl3.cumulativeProbability(3.1802228953341904E-145d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "44) test2303(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 4 });
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.8243984514608465E-153d + "'", double15 == 3.8243984514608465E-153d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.714865489451933E-165d + "'", double19 == 3.714865489451933E-165d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.6321205588285574d + "'", double21 == 0.6321205588285574d);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.6889118802245312E-48d, (double) (byte) 100, (int) '4');
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        double double8 = poissonDistributionImpl3.getMean();
        int[] intArray10 = poissonDistributionImpl3.sample(36);
        double double12 = poissonDistributionImpl3.cumulativeProbability(80);
        double double14 = poissonDistributionImpl3.probability(12);
        double double16 = poissonDistributionImpl3.cumulativeProbability(0.017644508717319204d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.680129694168893E-10d + "'", double14 == 7.680129694168893E-10d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6321205588285574d + "'", double16 == 0.6321205588285574d);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.normalApproximateProbability(100);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl2.cumulativeProbability(101, 41);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 38 + "'", int9 == 38);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double15 = poissonDistributionImpl3.normalApproximateProbability(106);
        double double17 = poissonDistributionImpl3.cumulativeProbability(0.9386867598047597d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.457712003500205E-9d, 41);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(2.813234320208393E-13d);
        double double5 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.457712003500205E-9d + "'", double5 == 7.457712003500205E-9d);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6922006339347749d, 3.941866060050443E-159d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(43);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.216155638647194E-8d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(38);
        double double5 = poissonDistributionImpl1.cumulativeProbability(3.2001158042335694E-17d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999999078384478d + "'", double5 == 0.9999999078384478d);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int5 = poissonDistributionImpl2.sample();
        double double7 = poissonDistributionImpl2.cumulativeProbability((-1));
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl2.cumulativeProbability(39, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky "45) test2311(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.18393972058572114d, (int) (byte) 1);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((int) (short) -1);
// flaky "46) test2312(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 104, 4.560969057281241E-69d, (int) '4');
        int[] intArray5 = poissonDistributionImpl3.sample(26);
        int int7 = poissonDistributionImpl3.getDomainUpperBound(0.9937903346742238d);
        double double9 = poissonDistributionImpl3.normalApproximateProbability(0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06680720126885803d, 4.560969057281241E-69d);
        double double5 = poissonDistributionImpl2.cumulativeProbability(3.720075976020836E-44d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.06462447683268424d + "'", double5 == 0.06462447683268424d);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 24, 102);
        double double4 = poissonDistributionImpl2.probability(86);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.776745245668696E-23d + "'", double4 == 7.776745245668696E-23d);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, 3.720075976020836E-44d);
        int int3 = poissonDistributionImpl2.sample();
// flaky "47) test2316(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 92 + "'", int3 == 92);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (double) (byte) -1, 15);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 2.7591832341910907E-202d, 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 34);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(5.628682978044818E-21d);
        double double6 = poissonDistributionImpl2.probability(7.875285095517683E-30d);
        double double8 = poissonDistributionImpl2.probability((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.0528363998149075E-10d, 0.6150373563537195d, 18);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 38);
        poissonDistributionImpl3.reseedRandomGenerator((long) 50);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) (short) 0);
        int int12 = poissonDistributionImpl3.sample();
        java.lang.Class<?> wildcardClass13 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "48) test2322(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.186804141704334E-276d, (int) (short) 100);
        double double4 = poissonDistributionImpl2.probability(28);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f);
        double double13 = poissonDistributionImpl3.cumulativeProbability(0.0d, (double) 10.0f);
        double double16 = poissonDistributionImpl3.cumulativeProbability((int) (byte) -1, 21);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999907838444d + "'", double10 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999999907838444d + "'", double13 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int17 = poissonDistributionImpl3.getDomainLowerBound((double) 3);
        poissonDistributionImpl3.reseedRandomGenerator((long) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "49) test2325(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 3, 0, 1, 2, 1, 0, 2, 3, 0, 2 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        int int21 = poissonDistributionImpl3.getDomainUpperBound((double) (short) 1);
        double double23 = poissonDistributionImpl3.normalApproximateProbability(0);
        double double24 = poissonDistributionImpl3.getMean();
        double double26 = poissonDistributionImpl3.cumulativeProbability((int) '#');
        double double27 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "50) test2326(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.308537538725987d + "'", double23 == 0.308537538725987d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 3, (double) 38);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(7.680129694168893E-10d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.2001158042335694E-17d, 1.0137771196302933E-7d);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.6889118802245312E-48d, 100.0d);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3571450159050078E-13d, 0.6321205588285574d);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        double double9 = poissonDistributionImpl3.cumulativeProbability(100);
        double double11 = poissonDistributionImpl3.probability(2147483647);
        int int13 = poissonDistributionImpl3.inverseCumulativeProbability(0.8160602794142788d);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double18 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1, 106);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = poissonDistributionImpl3.cumulativeProbability(0.9736445389005101d, 0.5429999234951242d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06462447683268424d);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4');
        double double3 = poissonDistributionImpl1.probability((int) (short) 10);
        poissonDistributionImpl1.reseedRandomGenerator((long) 91);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0398180320558363E-12d + "'", double3 == 1.0398180320558363E-12d);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.907796474247107E-11d);
        int int3 = poissonDistributionImpl1.getDomainUpperBound(0.010318165855110209d);
        double double5 = poissonDistributionImpl1.cumulativeProbability(0.8430188007045427d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.999999999940922d + "'", double5 == 0.999999999940922d);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(100.0d, (double) ' ', (int) (byte) 10);
        int[] intArray5 = poissonDistributionImpl3.sample(6);
        int int7 = poissonDistributionImpl3.getDomainLowerBound((double) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "51) test2335(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 104, 101, 111, 94, 94, 93 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.04425363959909373d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl1.cumulativeProbability((double) 21, 2.6183476108973206E-52d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.999778782798785E-13d, 16);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.216155638647194E-8d, (int) (short) 1);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) (short) 0);
        int int6 = poissonDistributionImpl2.getDomainUpperBound(7.457712003500205E-9d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 29);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability((-1), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 21, (double) 45);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainUpperBound(4.560969057281241E-69d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(0, (int) (short) 10);
        int int19 = poissonDistributionImpl3.getDomainLowerBound(0.06131324019524039d);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = poissonDistributionImpl3.inverseCumulativeProbability((double) 10000000);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "7) test2340(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9999999907838444d + "'", double17 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, 38.0d, (int) 'a');
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        double double7 = poissonDistributionImpl3.normalApproximateProbability(91);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.539992976248491E-5d + "'", double5 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        int int21 = poissonDistributionImpl3.getDomainUpperBound((double) (short) 1);
        double double23 = poissonDistributionImpl3.normalApproximateProbability(0);
        double double24 = poissonDistributionImpl3.getMean();
        int int26 = poissonDistributionImpl3.getDomainLowerBound(0.6391624183905688d);
        int int28 = poissonDistributionImpl3.getDomainUpperBound((double) 2147483647);
        double double30 = poissonDistributionImpl3.probability(4.4738740068130806E-35d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "52) test2342(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 4 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.308537538725987d + "'", double23 == 0.308537538725987d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(0.1251100357211333d);
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability(0.06680720126885803d);
        double double23 = poissonDistributionImpl3.probability(104);
        int int25 = poissonDistributionImpl3.getDomainLowerBound((double) 6);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6321205588285574d + "'", double19 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 3.57198604755006E-167d + "'", double23 == 3.57198604755006E-167d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, 38.0d, (int) 'a');
        double double4 = poissonDistributionImpl3.getMean();
        double double6 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.539992976248491E-5d + "'", double6 == 4.539992976248491E-5d);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (double) ' ', (int) (short) 100);
        double double5 = poissonDistributionImpl3.probability(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double8 = poissonDistributionImpl3.cumulativeProbability(0.36083758160943114d);
        double double9 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.720075976020836E-44d + "'", double5 == 3.720075976020836E-44d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.7200759760208177E-44d + "'", double8 == 3.7200759760208177E-44d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        double double10 = poissonDistributionImpl3.cumulativeProbability(0.533676680517062d, (double) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.36787944117144256d + "'", double10 == 0.36787944117144256d);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 37, (double) 104, 52);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(44.0d, (double) 100L);
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 18, 104.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999969700848327d + "'", double5 == 0.9999969700848327d);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.40894881836993996d);
        double double3 = poissonDistributionImpl1.probability(1.5184628423074624E-131d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 11, 13);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double15 = poissonDistributionImpl3.probability((int) 'a');
        double double17 = poissonDistributionImpl3.normalApproximateProbability(105);
        double double19 = poissonDistributionImpl3.probability(103);
        double double21 = poissonDistributionImpl3.probability(0.011604342211143792d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "53) test2351(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 3 });
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.8243984514608465E-153d + "'", double15 == 3.8243984514608465E-153d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.714865489451933E-165d + "'", double19 == 3.714865489451933E-165d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        int int16 = poissonDistributionImpl3.getDomainUpperBound((double) (byte) 1);
        int int17 = poissonDistributionImpl3.sample();
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 1);
        int int21 = poissonDistributionImpl3.getDomainUpperBound(0.9386867598047597d);
        int int22 = poissonDistributionImpl3.sample();
        int int24 = poissonDistributionImpl3.getDomainUpperBound(0.6321205588285574d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
// flaky "54) test2352(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        double double11 = poissonDistributionImpl3.cumulativeProbability(0.6321205588285574d, (double) 100L);
        double double12 = poissonDistributionImpl3.getMean();
        int[] intArray14 = poissonDistributionImpl3.sample((int) '#');
        int int16 = poissonDistributionImpl3.getDomainLowerBound(1.4076594357809174E-73d);
        double double18 = poissonDistributionImpl3.cumulativeProbability(0.5578297452874029d);
        double double20 = poissonDistributionImpl3.probability(40);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "55) test2353(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.36787944117144256d + "'", double11 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6321205588285574d + "'", double18 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.508794585965293E-49d + "'", double20 == 4.508794585965293E-49d);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.7200759760208177E-44d, (double) 40, 103);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.8243984514608465E-153d, (int) (short) 10);
        double double4 = poissonDistributionImpl2.probability(0.9999999999991455d);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(40);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int int17 = poissonDistributionImpl3.getDomainLowerBound(0.36787944117144256d);
        int int18 = poissonDistributionImpl3.sample();
        double double20 = poissonDistributionImpl3.probability(112);
        int int21 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.8631459284432898E-183d + "'", double20 == 1.8631459284432898E-183d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9937903346742238d, 86);
        double double4 = poissonDistributionImpl2.cumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0457262607030534E-29d);
        poissonDistributionImpl1.reseedRandomGenerator((long) 88);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        double double8 = poissonDistributionImpl3.getMean();
        int[] intArray10 = poissonDistributionImpl3.sample(36);
        double double12 = poissonDistributionImpl3.cumulativeProbability(80);
        double double14 = poissonDistributionImpl3.probability(12);
        java.lang.Class<?> wildcardClass15 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.680129694168893E-10d + "'", double14 == 7.680129694168893E-10d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(38);
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (short) 10);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability((double) 0.0f);
        double double23 = poissonDistributionImpl3.normalApproximateProbability(83);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999907838444d + "'", double19 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ');
        double double2 = poissonDistributionImpl1.getMean();
        int int3 = poissonDistributionImpl1.sample();
        int[] intArray5 = poissonDistributionImpl1.sample((int) '#');
        double double6 = poissonDistributionImpl1.getMean();
        double double8 = poissonDistributionImpl1.cumulativeProbability(40);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
// flaky "56) test2361(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9293391471220107d + "'", double8 == 0.9293391471220107d);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        double double11 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 'a');
        int int14 = poissonDistributionImpl2.sample();
        int int15 = poissonDistributionImpl2.sample();
        double double17 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 43 + "'", int14 == 43);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 43 + "'", int15 == 43);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.925222664969737E-19d, 41);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int int17 = poissonDistributionImpl3.getDomainUpperBound((double) 35);
        int[] intArray19 = poissonDistributionImpl3.sample(29);
        double double21 = poissonDistributionImpl3.probability(0);
        int int23 = poissonDistributionImpl3.inverseCumulativeProbability(4.719682636442159E-60d);
        poissonDistributionImpl3.reseedRandomGenerator((long) 103);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.36787944117144233d + "'", double21 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 100);
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        double double14 = poissonDistributionImpl3.probability(32);
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(0.18393972058572117d);
        int int17 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.3980856271290693E-36d + "'", double14 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, 0.14723260883568248d);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(1.1102230246251565E-16d);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.49456394057024E-4d + "'", double6 == 4.49456394057024E-4d);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        int int14 = poissonDistributionImpl3.inverseCumulativeProbability(4.560969057281241E-69d);
        int int16 = poissonDistributionImpl3.getDomainLowerBound(1.5377671420713246E-9d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = poissonDistributionImpl3.cumulativeProbability(86, (int) (byte) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "57) test2367(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.025956482467509034d, 0.9353755231673158d);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.0030656618967475464d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a');
        double double4 = poissonDistributionImpl1.cumulativeProbability((int) (byte) -1, 3);
        int int6 = poissonDistributionImpl1.getDomainUpperBound(1.0457262607030534E-29d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.17246204865673E-37d + "'", double4 == 1.17246204865673E-37d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d, 1.17246204865673E-37d, (int) (byte) 0);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((double) 1.0f);
        double double7 = poissonDistributionImpl3.normalApproximateProbability(107);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.probability((int) '4');
        double double15 = poissonDistributionImpl3.probability(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) 9956796);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.560969057281241E-69d + "'", double13 == 4.560969057281241E-69d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.36787944117144233d + "'", double15 == 0.36787944117144233d);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.018416977195786E-54d);
        int int3 = poissonDistributionImpl1.getDomainUpperBound((double) 28);
        double double5 = poissonDistributionImpl1.probability(102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.14723260883568248d, 0.6321205588285574d, 1);
        int int5 = poissonDistributionImpl3.getDomainUpperBound(0.017644508717319204d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.999778782798785E-13d, 0.0d, (int) (byte) 10);
        int int5 = poissonDistributionImpl3.getDomainLowerBound((double) (byte) -1);
        int int7 = poissonDistributionImpl3.getDomainLowerBound(0.9736445389005101d);
        double double9 = poissonDistributionImpl3.probability(42);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9711388458645459d);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, 0.25464638004358264d);
        double double4 = poissonDistributionImpl2.probability((double) (-1L));
        double double6 = poissonDistributionImpl2.cumulativeProbability(0.04425363959909373d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.539992976248491E-5d + "'", double6 == 4.539992976248491E-5d);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        int int13 = poissonDistributionImpl3.inverseCumulativeProbability(9.216155638647194E-8d);
        double double15 = poissonDistributionImpl3.probability(2);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) -1);
        double double19 = poissonDistributionImpl3.probability((int) (byte) 100);
        double double21 = poissonDistributionImpl3.cumulativeProbability(93);
        double double23 = poissonDistributionImpl3.normalApproximateProbability(8);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.18393972058572114d + "'", double15 == 0.18393972058572114d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.941866060050443E-159d + "'", double19 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.999999999999968d + "'", double23 == 0.999999999999968d);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int4 = poissonDistributionImpl3.sample();
        double double5 = poissonDistributionImpl3.getMean();
        double double8 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 32);
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-12d + "'", double5 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787943195528694d, (double) (-1L), 10);
        int int4 = poissonDistributionImpl3.sample();
        double double6 = poissonDistributionImpl3.probability(0);
        double double8 = poissonDistributionImpl3.normalApproximateProbability(104);
// flaky "58) test2379(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6922006339347749d + "'", double6 == 0.6922006339347749d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double14 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, 2147483647);
        poissonDistributionImpl3.reseedRandomGenerator((long) 34);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double15 = poissonDistributionImpl3.probability((int) 'a');
        double double17 = poissonDistributionImpl3.normalApproximateProbability(105);
        int int19 = poissonDistributionImpl3.getDomainUpperBound((double) 44);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "17) test2381(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 3 });
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.8243984514608465E-153d + "'", double15 == 3.8243984514608465E-153d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.160702826336122E-32d);
        double double3 = poissonDistributionImpl1.probability(0.9999999999999463d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 34);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(5.907792072437627E-11d);
        double double6 = poissonDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9964116947845713d + "'", double6 == 0.9964116947845713d);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.2913989097407664E-60d, (double) 0, 98);
        int int5 = poissonDistributionImpl3.getDomainLowerBound(2.4205580623440414E-28d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999999999997d, (double) 24, 41);
        int int4 = poissonDistributionImpl3.sample();
// flaky "59) test2385(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.9606298142722176E-69d, 6);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double9 = poissonDistributionImpl3.getMean();
        int int11 = poissonDistributionImpl3.inverseCumulativeProbability(0.999999999940922d);
        double double14 = poissonDistributionImpl3.cumulativeProbability(18, 33);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.1102230246251565E-16d + "'", double14 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d);
        poissonDistributionImpl1.reseedRandomGenerator((long) 41);
        int int5 = poissonDistributionImpl1.getDomainLowerBound((double) (byte) 1);
        int[] intArray7 = poissonDistributionImpl1.sample(0);
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 79, 0.07034028736850317d);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 34);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(0.9995720010776109d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.probability(0.36787943195528694d);
        double double14 = poissonDistributionImpl3.cumulativeProbability(0, 3);
        double double16 = poissonDistributionImpl3.cumulativeProbability(30);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9846716899511899d + "'", double14 == 0.9846716899511899d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9736445389005101d, 0.19699216367798777d);
        double double4 = poissonDistributionImpl2.probability(30);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.390052739148267E-34d + "'", double4 == 6.390052739148267E-34d);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int17 = poissonDistributionImpl3.getDomainLowerBound((double) 3);
        int int19 = poissonDistributionImpl3.getDomainLowerBound(4.925222664969737E-19d);
        double double21 = poissonDistributionImpl3.probability(0.9846716899511899d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "60) test2393(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 2, 1, 2, 1, 1, 1, 0, 2, 0, 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        double double16 = poissonDistributionImpl3.normalApproximateProbability((int) '4');
        int int18 = poissonDistributionImpl3.getDomainUpperBound(0.011604342211143792d);
        int int20 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.03796348149127876d, 6.685526970917836E-59d);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(1.9701958953177723E-8d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3678794445618948d);
        double double2 = poissonDistributionImpl1.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3678794445618948d + "'", double2 == 0.3678794445618948d);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999998405164d, 0.0d, 30);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0027693957155115767d, (double) (short) 1);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(3.8785349352299523E-28d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.9606298142722176E-69d, 11);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1);
        int int22 = poissonDistributionImpl3.sample();
        double double24 = poissonDistributionImpl3.normalApproximateProbability(43);
        double double26 = poissonDistributionImpl3.cumulativeProbability(0.9386867598047597d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "8) test2400(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
// flaky "61) test2400(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.6321205588285574d + "'", double26 == 0.6321205588285574d);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.999778782798785E-13d, (double) 100L);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 4);
        double double8 = poissonDistributionImpl2.cumulativeProbability(51);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(10);
        double double7 = poissonDistributionImpl3.probability(2);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl3.cumulativeProbability(1.3980856271290693E-36d, 5.559174711623875E-287d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
// flaky "62) test2402(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 2, 2, 1, 0, 1, 1, 3, 1, 0, 2 });
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.18393972058572114d + "'", double7 == 0.18393972058572114d);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(97.0d, 4.5399929762484845E-4d, (int) (byte) -1);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((double) 16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.4018914738572114E-169d, 4.719682636442159E-60d);
        int[] intArray4 = poissonDistributionImpl2.sample(37);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000, (double) ' ');
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(7.471972337343043E-43d);
        double double7 = poissonDistributionImpl2.cumulativeProbability(0.6922006339347839d, (double) 107);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9956796 + "'", int4 == 9956796);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9236504896389613d, 0.0d, 5);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.probability(0.36787944117144233d);
        int int17 = poissonDistributionImpl3.getDomainLowerBound(0.1251100357211333d);
        double double19 = poissonDistributionImpl3.cumulativeProbability(0.586219203359673d);
        int int21 = poissonDistributionImpl3.getDomainLowerBound(3.826311454135856E-163d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "63) test2407(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6321205588285574d + "'", double19 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 4, 0.14891466732474742d, 16);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.probability(0.36787944117144233d);
        int int17 = poissonDistributionImpl3.getDomainLowerBound(0.1251100357211333d);
        int int18 = poissonDistributionImpl3.sample();
        poissonDistributionImpl3.reseedRandomGenerator((long) 112);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "1) test2409(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky "18) test2409(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        double double14 = poissonDistributionImpl3.probability((int) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) 46);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "64) test2410(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.609088260248484E-6d);
        poissonDistributionImpl1.reseedRandomGenerator((long) 0);
        int int5 = poissonDistributionImpl1.getDomainUpperBound((double) 78);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.1251100357211333d);
        poissonDistributionImpl1.reseedRandomGenerator((long) 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.720075976020836E-44d);
        double double3 = poissonDistributionImpl1.probability(110);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6426402136161335d);
        double double3 = poissonDistributionImpl1.probability(0);
        int int5 = poissonDistributionImpl1.getDomainUpperBound(0.9999999999999997d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5259020955950889d + "'", double3 == 0.5259020955950889d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d, 100);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.06131324019524039d);
        int int6 = poissonDistributionImpl2.getDomainLowerBound(3.1627334188024467E-75d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int int13 = poissonDistributionImpl3.getDomainUpperBound(0.9331927987311419d);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability(0.25464638004358264d);
        int[] intArray17 = poissonDistributionImpl3.sample(100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.139132792048018E-17d, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((int) ' ', 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.9606298142722176E-69d, 104);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((double) 0.0f);
        double double11 = poissonDistributionImpl3.cumulativeProbability(98);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl3.cumulativeProbability(0.36787944117144256d, 5.1401737047361744E-120d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "65) test2419(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, (int) 'a');
        int int4 = poissonDistributionImpl2.getDomainLowerBound((-1.0d));
        double double5 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999999907838444d + "'", double5 == 0.9999999907838444d);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, (int) 'a');
        int int3 = poissonDistributionImpl2.sample();
        int int5 = poissonDistributionImpl2.getDomainLowerBound(0.6922006339347749d);
        double double8 = poissonDistributionImpl2.cumulativeProbability(3.2418737649498176E-173d, (double) 41);
// flaky "19) test2421(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6321205554381052d + "'", double8 == 0.6321205554381052d);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.probability((double) 10000000);
        int int17 = poissonDistributionImpl3.getDomainLowerBound(0.29140699867905834d);
        int int18 = poissonDistributionImpl3.sample();
        double double20 = poissonDistributionImpl3.probability((double) 94);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "20) test2422(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky "66) test2422(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.383215846100408E-147d + "'", double20 == 3.383215846100408E-147d);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        int int13 = poissonDistributionImpl3.inverseCumulativeProbability(9.216155638647194E-8d);
        double double15 = poissonDistributionImpl3.probability(2);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) -1);
        double double19 = poissonDistributionImpl3.probability((int) (byte) 100);
        double double21 = poissonDistributionImpl3.cumulativeProbability(93);
        int int23 = poissonDistributionImpl3.getDomainLowerBound(0.025956482467509034d);
        int int25 = poissonDistributionImpl3.inverseCumulativeProbability(1.4230202807276707E-23d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.18393972058572114d + "'", double15 == 0.18393972058572114d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.941866060050443E-159d + "'", double19 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, (int) (byte) 100);
        double double5 = poissonDistributionImpl2.cumulativeProbability(4.925222664969737E-19d, (double) 18);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.067548071417517E-24d + "'", double5 == 7.067548071417517E-24d);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.normalApproximateProbability(10);
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        double double14 = poissonDistributionImpl3.probability(7.688982796070711E-9d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, (double) (byte) 0);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(53);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double16 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) 'a');
        int int18 = poissonDistributionImpl3.getDomainLowerBound(1.4230202807276707E-23d);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, (double) (short) 10);
        double double4 = poissonDistributionImpl2.cumulativeProbability(79);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787943195528694d, (double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) 0);
        int int5 = poissonDistributionImpl2.sample();
        double double6 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.36787943195528694d + "'", double6 == 0.36787943195528694d);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int5 = poissonDistributionImpl2.sample();
        int int7 = poissonDistributionImpl2.getDomainLowerBound((double) '4');
        int[] intArray9 = poissonDistributionImpl2.sample(30);
        org.junit.Assert.assertNotNull(intArray4);
// flaky "67) test2430(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 38, 3.57198604755006E-167d);
        double double5 = poissonDistributionImpl2.cumulativeProbability(0.029285828261849244d, (double) 100.0f);
        double double7 = poissonDistributionImpl2.cumulativeProbability(37);
        double double9 = poissonDistributionImpl2.probability(18);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.4784247042568768d + "'", double7 == 0.4784247042568768d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.3383614122459313E-4d + "'", double9 == 1.3383614122459313E-4d);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        int int10 = poissonDistributionImpl3.sample();
        double double13 = poissonDistributionImpl3.cumulativeProbability(0.9846716899511899d, (double) 78);
        int int15 = poissonDistributionImpl3.getDomainLowerBound(0.36787943195528694d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
// flaky "68) test2432(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.36787944117144256d + "'", double13 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, (double) 0, (int) (byte) -1);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(31);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.7751345442790964E-11d, 0.6922006339347839d, 59);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4', (double) (short) 100);
        int[] intArray4 = poissonDistributionImpl2.sample(82);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(0.025956482467509034d);
        double double8 = poissonDistributionImpl2.probability(4.864649182067619E-63d);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 38 + "'", int6 == 38);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a');
        double double4 = poissonDistributionImpl1.cumulativeProbability((int) (byte) -1, 3);
        int int6 = poissonDistributionImpl1.inverseCumulativeProbability(0.0d);
        double double7 = poissonDistributionImpl1.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl1.cumulativeProbability(0.06680720126885803d, 0.36083758160943114d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.17246204865673E-37d + "'", double4 == 1.17246204865673E-37d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.40894881836993996d, 1.0040290630831367E-103d, 82);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.160702826336122E-32d, 44);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability(0.6922006339347749d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6321205588285574d + "'", double11 == 0.6321205588285574d);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        double double12 = poissonDistributionImpl3.cumulativeProbability(0.36787944117144233d, (double) 100.0f);
        double double14 = poissonDistributionImpl3.cumulativeProbability(99);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = poissonDistributionImpl3.cumulativeProbability(0.9999999907838444d, 3.9606298142722176E-69d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.36787944117144256d + "'", double12 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.07257897695541599d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl1.cumulativeProbability(8.781633496103664E-142d, 5.74952226429356E-19d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.925222664969737E-19d, 3.139132792048018E-17d);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.4421702547125971d);
        double double6 = poissonDistributionImpl2.cumulativeProbability((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.216155638647194E-8d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.999999999954943d);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.7200759760208177E-44d);
        double double3 = poissonDistributionImpl1.probability(4.925222664969737E-19d);
        int int5 = poissonDistributionImpl1.getDomainLowerBound((double) 41);
        double double6 = poissonDistributionImpl1.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.7200759760208177E-44d + "'", double6 == 3.7200759760208177E-44d);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int5 = poissonDistributionImpl2.sample();
        int int7 = poissonDistributionImpl2.getDomainLowerBound((double) '4');
        int int9 = poissonDistributionImpl2.getDomainUpperBound(0.4919298095548862d);
        int int10 = poissonDistributionImpl2.sample();
        double double12 = poissonDistributionImpl2.probability(0.8430188007045427d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky "69) test2445(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 30 + "'", int5 == 30);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
// flaky "21) test2445(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 30, (double) 10000000);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(0.9405285822723919d, 1.4230202807276707E-23d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        int int8 = poissonDistributionImpl3.sample();
        double double10 = poissonDistributionImpl3.normalApproximateProbability(34);
        int int12 = poissonDistributionImpl3.getDomainLowerBound(0.6321205588285574d);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = poissonDistributionImpl3.cumulativeProbability(0.999999992542288d, 0.3363019087207584d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
// flaky "70) test2447(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) '4');
        double double4 = poissonDistributionImpl2.cumulativeProbability(3.720075976020836E-44d);
        double double6 = poissonDistributionImpl2.probability((double) (-1));
        int[] intArray8 = poissonDistributionImpl2.sample(50);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.999999999999d + "'", double4 == 0.999999999999d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4');
        double double3 = poissonDistributionImpl1.probability((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3573451162272032E-21d + "'", double3 == 1.3573451162272032E-21d);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, 36);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, (double) (byte) 0);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(18);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9964052413749175d + "'", double4 == 0.9964052413749175d);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.5377671420713246E-9d, 7.350918877009172E-9d, (int) 'a');
        double double5 = poissonDistributionImpl3.cumulativeProbability(12);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int[] intArray17 = poissonDistributionImpl3.sample((int) 'a');
        double double19 = poissonDistributionImpl3.cumulativeProbability(2.755731922395672E-127d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6321205588285574d + "'", double19 == 0.6321205588285574d);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, (double) (short) 10);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        double double6 = poissonDistributionImpl2.cumulativeProbability(1.0457262607030534E-29d);
        int int7 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6536858183744849d + "'", double6 == 0.6536858183744849d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        double double21 = poissonDistributionImpl3.probability(0.0d);
        double double23 = poissonDistributionImpl3.cumulativeProbability((double) 'a');
        double double25 = poissonDistributionImpl3.cumulativeProbability((double) (-1));
        double double26 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "9) test2455(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.36787944117144233d + "'", double21 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#');
        int int2 = poissonDistributionImpl1.sample();
        double double4 = poissonDistributionImpl1.cumulativeProbability(8.958833674910238E-12d);
// flaky "71) test2456(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.305116760146996E-16d + "'", double4 == 6.305116760146996E-16d);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) 2);
        double double4 = poissonDistributionImpl2.probability((double) 0L);
        double double6 = poissonDistributionImpl2.cumulativeProbability(3);
        poissonDistributionImpl2.reseedRandomGenerator((long) 28);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.010318165855110209d + "'", double6 == 0.010318165855110209d);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d);
        int int2 = poissonDistributionImpl1.sample();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.9552158909873505E-5d, (double) 1);
        double double4 = poissonDistributionImpl2.probability((double) 3);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(0.03781461598070298d);
        double double8 = poissonDistributionImpl2.cumulativeProbability(52);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.3013378484179026E-15d + "'", double4 == 4.3013378484179026E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        int int21 = poissonDistributionImpl3.getDomainUpperBound((double) (short) 1);
        double double23 = poissonDistributionImpl3.normalApproximateProbability(0);
        double double24 = poissonDistributionImpl3.getMean();
        int int26 = poissonDistributionImpl3.getDomainLowerBound(0.6391624183905688d);
        int[] intArray28 = poissonDistributionImpl3.sample(101);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "72) test2460(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.308537538725987d + "'", double23 == 0.308537538725987d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        double double12 = poissonDistributionImpl3.cumulativeProbability(0.36787944117144233d, (double) 100.0f);
        int int13 = poissonDistributionImpl3.sample();
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability(0.9711388458645459d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.36787944117144256d + "'", double12 == 0.36787944117144256d);
// flaky "73) test2461(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double16 = poissonDistributionImpl3.cumulativeProbability(37, 37);
        int int18 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double21 = poissonDistributionImpl3.cumulativeProbability(13, 99);
        double double23 = poissonDistributionImpl3.normalApproximateProbability(106);
        int[] intArray25 = poissonDistributionImpl3.sample(100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5.907796474247107E-11d + "'", double21 == 5.907796474247107E-11d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 32);
        poissonDistributionImpl2.reseedRandomGenerator((long) ' ');
        double double6 = poissonDistributionImpl2.cumulativeProbability(0.9999999907838444d);
        int[] intArray8 = poissonDistributionImpl2.sample(93);
        double double10 = poissonDistributionImpl2.normalApproximateProbability(26);
        int int12 = poissonDistributionImpl2.getDomainUpperBound(4.018416977195786E-54d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.139132792048018E-17d + "'", double6 == 3.139132792048018E-17d);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.03105243133179786d + "'", double10 == 0.03105243133179786d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        double double11 = poissonDistributionImpl2.getMean();
        double double12 = poissonDistributionImpl2.getMean();
        int int13 = poissonDistributionImpl2.sample();
        double double15 = poissonDistributionImpl2.probability(18);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 38 + "'", int13 == 38);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 6.117541320290971E-4d + "'", double15 == 6.117541320290971E-4d);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.291633944458635E-10d, (double) (short) 100);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.999999999940922d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2, 0.0d);
        double double4 = poissonDistributionImpl2.probability(34);
        double double5 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.875285095517683E-30d + "'", double4 == 7.875285095517683E-30d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int int17 = poissonDistributionImpl3.getDomainLowerBound(0.36787944117144256d);
        int int18 = poissonDistributionImpl3.sample();
        double double19 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = poissonDistributionImpl3.cumulativeProbability(104, 21);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.033719554105805E-46d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl1.cumulativeProbability(0.039860996809147134d, 1.3573451162272032E-21d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 46);
        double double12 = poissonDistributionImpl3.probability(7.952232587603118E-18d);
        java.lang.Class<?> wildcardClass13 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5429999234951242d);
        int int2 = poissonDistributionImpl1.sample();
        poissonDistributionImpl1.reseedRandomGenerator((long) '4');
// flaky "74) test2470(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.813234320208393E-13d, 0.06727319239963177d);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        int int15 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 35);
        double double19 = poissonDistributionImpl3.getMean();
        double double21 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        double double22 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.6321205588285574d + "'", double21 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.291633944458635E-10d, 0.999999992542288d);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d);
        poissonDistributionImpl1.reseedRandomGenerator((long) 41);
        double double5 = poissonDistributionImpl1.probability((double) 23);
        int int7 = poissonDistributionImpl1.getDomainLowerBound(100.0d);
        int int9 = poissonDistributionImpl1.getDomainUpperBound(0.0d);
        int int10 = poissonDistributionImpl1.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.7476693956635508E-33d + "'", double5 == 2.7476693956635508E-33d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3980856271290693E-36d, 9.999778782798785E-13d, 37);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.06131324019524039d);
        int int7 = poissonDistributionImpl3.getDomainLowerBound((double) 100L);
        double double8 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.3980856271290693E-36d + "'", double8 == 1.3980856271290693E-36d);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 1L);
        double double14 = poissonDistributionImpl3.probability(3);
        poissonDistributionImpl3.reseedRandomGenerator((long) 5);
        int[] intArray18 = poissonDistributionImpl3.sample(23);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = poissonDistributionImpl3.cumulativeProbability(5.929251169698556E-25d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "75) test2476(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06131324019524039d + "'", double14 == 0.06131324019524039d);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 1, 1, 0, 1, 2, 2, 2, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2 });
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (double) 4);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) '#');
        double double16 = poissonDistributionImpl3.probability(102);
        int int18 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.826311454135856E-163d + "'", double16 == 3.826311454135856E-163d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl2.cumulativeProbability(3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 100");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d, (double) (-1), 0);
        double double4 = poissonDistributionImpl3.getMean();
        int int6 = poissonDistributionImpl3.getDomainLowerBound((double) 39);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.36787944117144233d + "'", double4 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int int9 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = poissonDistributionImpl2.inverseCumulativeProbability(0.533676680517062d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.457712003500205E-9d + "'", double8 == 7.457712003500205E-9d);
// flaky "76) test2481(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d);
        int int3 = poissonDistributionImpl1.getDomainUpperBound((double) 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        poissonDistributionImpl3.reseedRandomGenerator((long) 0);
        double double8 = poissonDistributionImpl3.getMean();
        int int9 = poissonDistributionImpl3.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl3.cumulativeProbability(88, 78);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double12 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = poissonDistributionImpl3.cumulativeProbability(1.3980856271290693E-36d, 0.9652365304395534d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability(0.0d, 0.1251100357211333d);
        double double14 = poissonDistributionImpl3.normalApproximateProbability(104);
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(3.4018914738572114E-169d);
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 10, 106);
        int int20 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6321205588285574d + "'", double12 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0137771200291468E-7d + "'", double19 == 1.0137771200291468E-7d);
// flaky "77) test2485(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) (byte) 0);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.cumulativeProbability(32);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        int int9 = poissonDistributionImpl2.getDomainLowerBound(0.691462461274013d);
        int int10 = poissonDistributionImpl2.sample();
        int int12 = poissonDistributionImpl2.inverseCumulativeProbability(0.40894881836993996d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 42);
        double double16 = poissonDistributionImpl2.cumulativeProbability(105);
        java.lang.Class<?> wildcardClass17 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8160602794142788d + "'", double3 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "78) test2486(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        double double11 = poissonDistributionImpl3.cumulativeProbability(93);
        int[] intArray13 = poissonDistributionImpl3.sample(46);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f);
        poissonDistributionImpl3.reseedRandomGenerator(100L);
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, (int) (byte) 100);
        poissonDistributionImpl3.reseedRandomGenerator((long) 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999907838444d + "'", double10 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        double double14 = poissonDistributionImpl3.cumulativeProbability((int) 'a', 2147483647);
        double double16 = poissonDistributionImpl3.probability(4.0528363998149075E-10d);
        double double18 = poissonDistributionImpl3.probability(8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 9.123994076672692E-6d + "'", double18 == 9.123994076672692E-6d);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double10 = poissonDistributionImpl3.getMean();
        double double12 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        poissonDistributionImpl3.reseedRandomGenerator((long) 10000000);
        double double16 = poissonDistributionImpl3.normalApproximateProbability(52);
        double double17 = poissonDistributionImpl3.getMean();
        int[] intArray19 = poissonDistributionImpl3.sample(42);
        double double22 = poissonDistributionImpl3.cumulativeProbability(59, 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999999977743d, (double) 10000000, 23);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7476693956635508E-33d);
        int[] intArray3 = poissonDistributionImpl1.sample(107);
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.974267574860327E-43d, 29);
        int int3 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787943195528694d, 3.941866060050443E-159d, (int) (short) 1);
        int int4 = poissonDistributionImpl3.sample();
        int int6 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
// flaky "2) test2494(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 109, 0.03781461598070298d, 46);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 30, (double) 10000000);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(0.36787944117146065d);
        double double6 = poissonDistributionImpl2.probability(4.670902356181524E-139d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        double double10 = poissonDistributionImpl3.normalApproximateProbability(36);
        double double12 = poissonDistributionImpl3.probability(115);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.2576672056345042E-189d + "'", double12 == 1.2576672056345042E-189d);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double18 = poissonDistributionImpl3.cumulativeProbability((int) ' ', 100);
        double double19 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "79) test2498(org.apache.commons.math.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability(0.0d, 0.1251100357211333d);
        double double14 = poissonDistributionImpl3.normalApproximateProbability(104);
        double double16 = poissonDistributionImpl3.probability(1.7401052582713831E-47d);
        poissonDistributionImpl3.reseedRandomGenerator((long) 86);
        double double21 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, 27);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6321205588285574d + "'", double12 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(9.999778782798785E-13d);
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability(2.4106148140883866E-25d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6321205588285574d + "'", double19 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }
}
