package org.apache.commons.math.distribution;

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
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.probability(0.36787944117144233d);
        int int17 = poissonDistributionImpl3.getDomainLowerBound(0.1251100357211333d);
        double double20 = poissonDistributionImpl3.cumulativeProbability((double) (-1L), 3.7200759760208177E-44d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "1) test1001(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6321205588285574d + "'", double20 == 0.6321205588285574d);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9386867598047597d, 99);
        int int3 = poissonDistributionImpl2.sample();
// flaky "2) test1002(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability(3.8243984514608465E-153d);
        double double12 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, 43);
        double double13 = poissonDistributionImpl3.getMean();
        java.lang.Class<?> wildcardClass14 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.999778782798785E-13d);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) ' ');
        int int4 = poissonDistributionImpl2.getDomainUpperBound(0.0d);
        int int5 = poissonDistributionImpl2.sample();
        double double7 = poissonDistributionImpl2.cumulativeProbability(0.06131324019524039d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 10000000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
// flaky "1) test1005(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 38, 3.57198604755006E-167d);
        double double5 = poissonDistributionImpl2.cumulativeProbability(1.17246204865673E-37d, (double) 34);
        double double6 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 26);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.29140699867905834d + "'", double5 == 0.29140699867905834d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 38.0d + "'", double6 == 38.0d);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        double double25 = poissonDistributionImpl3.probability(34);
        double double27 = poissonDistributionImpl3.probability((double) 106);
        double double28 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "1) test1007(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.308537538725987d + "'", double23 == 0.308537538725987d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.2460656213271568E-39d + "'", double25 == 1.2460656213271568E-39d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 3.2093315791106567E-171d + "'", double27 == 3.2093315791106567E-171d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.05698471084507295d, 35);
        double double4 = poissonDistributionImpl2.cumulativeProbability(105);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 38);
        int int8 = poissonDistributionImpl2.getDomainUpperBound(35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 30);
        int int3 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability(99, 41);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky "2) test1009(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 28 + "'", int3 == 28);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 32, (int) (byte) -1);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) '#');
        int int16 = poissonDistributionImpl3.getDomainLowerBound(3.57198604755006E-167d);
        double double18 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 1);
        double double19 = poissonDistributionImpl3.getMean();
        int int21 = poissonDistributionImpl3.getDomainLowerBound(0.36083758160943114d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.8160602794142788d + "'", double18 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.14723260883568248d, 52.0d, 38);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((double) 104);
        int int7 = poissonDistributionImpl3.getDomainUpperBound(0.3525511311226325d);
        int int9 = poissonDistributionImpl3.getDomainUpperBound((double) 29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.8243984514608465E-153d, (int) (byte) 10);
        poissonDistributionImpl2.reseedRandomGenerator((long) 2147483647);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(1.7401052582713831E-47d);
        double double8 = poissonDistributionImpl2.probability(0.9652365304395534d);
        double double11 = poissonDistributionImpl2.cumulativeProbability(4.670902356181524E-139d, (double) 24);
        double double13 = poissonDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        double double23 = poissonDistributionImpl3.getMean();
        double double25 = poissonDistributionImpl3.normalApproximateProbability(43);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0030656618967475464d, (int) (short) 100);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(104.0d, 0.0d);
        int[] intArray4 = poissonDistributionImpl2.sample(42);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.025956482467509034d, 0.9353755231673158d);
        double double4 = poissonDistributionImpl2.probability(0.3678794411123646d);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36083758160943114d, 0.03796348149127876d, 5);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
            double double24 = poissonDistributionImpl3.cumulativeProbability(1.3980856271290693E-36d, 3.941866060050443E-159d);
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
// flaky "1) test1019(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (double) 37, 29);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 38, 3.57198604755006E-167d);
        double double5 = poissonDistributionImpl2.cumulativeProbability(1.17246204865673E-37d, (double) 34);
        poissonDistributionImpl2.reseedRandomGenerator((long) 99);
        double double9 = poissonDistributionImpl2.probability(0.999999999954943d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability(1.4230202807276707E-23d);
        double double14 = poissonDistributionImpl2.cumulativeProbability(24, 93);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.29140699867905834d + "'", double5 == 0.29140699867905834d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9938427862994814d + "'", double14 == 0.9938427862994814d);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9386867598047597d, 0.0d);
        double double3 = poissonDistributionImpl2.getMean();
        double double6 = poissonDistributionImpl2.cumulativeProbability(73, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9386867598047597d + "'", double3 == 0.9386867598047597d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double16 = poissonDistributionImpl3.cumulativeProbability((double) 2, (double) 'a');
        int int17 = poissonDistributionImpl3.sample();
        int int18 = poissonDistributionImpl3.sample();
        poissonDistributionImpl3.reseedRandomGenerator((long) 34);
        double double22 = poissonDistributionImpl3.probability(4.018416977195786E-54d);
        int int24 = poissonDistributionImpl3.getDomainUpperBound(0.6922006339347749d);
        double double26 = poissonDistributionImpl3.cumulativeProbability(4.160702826336122E-32d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.18393972058572117d + "'", double16 == 0.18393972058572117d);
// flaky "3) test1023(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
// flaky "3) test1023(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.6321205588285574d + "'", double26 == 0.6321205588285574d);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.29140699867905834d);
        double double3 = poissonDistributionImpl1.cumulativeProbability(1.0457262607030534E-29d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7472115020283746d + "'", double3 == 0.7472115020283746d);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3525511311226325d, 5);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 10);
        double double14 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        double double26 = poissonDistributionImpl3.cumulativeProbability(105);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "4) test1027(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6321205588285574d + "'", double20 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117146065d, (double) 104, 15);
        poissonDistributionImpl3.reseedRandomGenerator((long) 10);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 26, 0.999999999999d, 31);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2147483647, 6.305116760146996E-16d, 35);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9331927987311419d, 4.018416977195786E-54d);
        double double4 = poissonDistributionImpl2.probability(0.03796348149127876d);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.07034028736850317d);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.cumulativeProbability(9.216155638647194E-8d);
        double double14 = poissonDistributionImpl3.cumulativeProbability(2);
        int int16 = poissonDistributionImpl3.getDomainLowerBound(1.17246204865673E-37d);
        double double18 = poissonDistributionImpl3.normalApproximateProbability(104);
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
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        int int10 = poissonDistributionImpl3.getDomainUpperBound((double) 3);
        double double13 = poissonDistributionImpl3.cumulativeProbability(14, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.2198466942977575E-12d + "'", double13 == 4.2198466942977575E-12d);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        double double14 = poissonDistributionImpl3.probability(3.8243984514608465E-153d);
        double double16 = poissonDistributionImpl3.cumulativeProbability((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = poissonDistributionImpl3.inverseCumulativeProbability((double) 41);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.999999898622288d, 4.793034378392443E-7d, 98);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        double double25 = poissonDistributionImpl3.probability(0.3525511311226325d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "5) test1037(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.308537538725987d + "'", double23 == 0.308537538725987d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        double double25 = poissonDistributionImpl3.probability(106);
        double double26 = poissonDistributionImpl3.getMean();
        double double28 = poissonDistributionImpl3.probability(3);
        int int30 = poissonDistributionImpl3.inverseCumulativeProbability(0.36787943195528694d);
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
// flaky "6) test1038(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3.2093315791106567E-171d + "'", double25 == 3.2093315791106567E-171d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.06131324019524039d + "'", double28 == 0.06131324019524039d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.902447399449791E-155d, (double) (byte) 0);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) (byte) 10, (int) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) 34);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl3.cumulativeProbability(1.17246204865673E-37d, (double) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 100");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.999778782798785E-13d, (double) 100L);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability((int) 'a', 41);
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
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.01377703554215E-7d, 110);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) ' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 106);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = poissonDistributionImpl1.inverseCumulativeProbability((double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, (double) (short) -1, (int) (short) 100);
        int[] intArray5 = poissonDistributionImpl3.sample((int) (short) 10);
        int int7 = poissonDistributionImpl3.getDomainUpperBound(0.999999992542288d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl3.cumulativeProbability(104, 30);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
// flaky "7) test1044(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 31, 41, 29, 38, 39, 43, 33, 26, 31, 38 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        int int10 = poissonDistributionImpl3.sample();
        double double11 = poissonDistributionImpl3.getMean();
        int int13 = poissonDistributionImpl3.getDomainLowerBound(0.18393972058572114d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = poissonDistributionImpl3.cumulativeProbability(97, (int) (short) 1);
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
// flaky "4) test1045(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.probability(1.0d);
        double double13 = poissonDistributionImpl3.normalApproximateProbability(2);
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) '#');
        double double16 = poissonDistributionImpl3.getMean();
        double double18 = poissonDistributionImpl3.cumulativeProbability(0.40894881836993996d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.36787944117144233d + "'", double11 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9331927987311419d + "'", double13 == 0.9331927987311419d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6321205588285574d + "'", double18 == 0.6321205588285574d);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (int) '4');
        double double4 = poissonDistributionImpl2.probability(7.457712003500205E-9d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(26, 15);
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
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.05698471084507295d, 35);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(0.20223062088848806d, 0.1251100357211333d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 37, (double) 106);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(2147483647, 15);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        double double14 = poissonDistributionImpl3.probability(3.8243984514608465E-153d);
        double double16 = poissonDistributionImpl3.cumulativeProbability((double) 'a');
        double double18 = poissonDistributionImpl3.cumulativeProbability((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = poissonDistributionImpl3.cumulativeProbability(5.347030737638007E-35d, 1.0457262607030534E-29d);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9999999907838444d + "'", double18 == 0.9999999907838444d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(99);
        double double4 = poissonDistributionImpl1.getMean();
        double double6 = poissonDistributionImpl1.normalApproximateProbability(34);
        double double8 = poissonDistributionImpl1.normalApproximateProbability((int) (byte) 100);
        double double10 = poissonDistributionImpl1.cumulativeProbability(0.039860996809147134d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.719682636442159E-60d + "'", double4 == 4.719682636442159E-60d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5429999234951242d);
        int int2 = poissonDistributionImpl1.sample();
        double double4 = poissonDistributionImpl1.cumulativeProbability(4);
// flaky "5) test1053(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9997490375305196d + "'", double4 == 0.9997490375305196d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0137769446139089E-7d);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (int) '4');
        double double4 = poissonDistributionImpl2.probability((int) (short) 1);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.36083758160943114d + "'", double4 == 0.36083758160943114d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.07257897695541599d + "'", double6 == 0.07257897695541599d);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 43);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (double) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a');
        double double4 = poissonDistributionImpl1.cumulativeProbability((int) (byte) -1, 3);
        double double6 = poissonDistributionImpl1.probability((double) (short) -1);
        double double8 = poissonDistributionImpl1.cumulativeProbability(102);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.17246204865673E-37d + "'", double4 == 1.17246204865673E-37d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.7156847426216517d + "'", double8 == 0.7156847426216517d);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.probability((int) '4');
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        int[] intArray17 = poissonDistributionImpl3.sample(1);
        int int19 = poissonDistributionImpl3.inverseCumulativeProbability(0.308537538725987d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.560969057281241E-69d + "'", double13 == 4.560969057281241E-69d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(intArray17);
// flaky "6) test1059(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.40894881836993996d, (double) 24);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.875285095517683E-30d, (int) (byte) 10);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(31);
        double double6 = poissonDistributionImpl2.cumulativeProbability(106);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5578297452874029d);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.57198604755006E-167d, 7.875285095517683E-30d, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainLowerBound((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability(27, 5);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(34, (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.999999999231987d, 6.685526970917836E-59d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        int int19 = poissonDistributionImpl3.inverseCumulativeProbability(0.9999546000702375d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "8) test1067(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) (short) 0);
        double double13 = poissonDistributionImpl3.probability((double) (-1L));
        double double15 = poissonDistributionImpl3.probability(0.025956482467509034d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(52.0d, 44.0d, 9);
        double double5 = poissonDistributionImpl3.probability(3.9606298142722176E-69d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.probability(12);
        int int14 = poissonDistributionImpl3.getDomainUpperBound(1.0E-12d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "7) test1070(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.680129694168893E-10d + "'", double12 == 7.680129694168893E-10d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability(0.0d, 0.1251100357211333d);
        double double14 = poissonDistributionImpl3.normalApproximateProbability(104);
        double double17 = poissonDistributionImpl3.cumulativeProbability(1.1102230246251565E-16d, (double) 27);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6321205588285574d + "'", double12 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.36787944117144256d + "'", double17 == 0.36787944117144256d);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        int int10 = poissonDistributionImpl3.sample();
        int[] intArray12 = poissonDistributionImpl3.sample(98);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "8) test1072(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl2.cumulativeProbability((double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 100");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', (int) (byte) 1);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(36);
        int int5 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0528363998149075E-10d + "'", double4 == 4.0528363998149075E-10d);
// flaky "9) test1074(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 95 + "'", int5 == 95);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.88940969307282E-43d, 0.1251100357211333d, 0);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.01377703554215E-7d, 4.560969057281241E-69d, 13);
        double double6 = poissonDistributionImpl3.cumulativeProbability(32, 105);
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9936865915923108d);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        // The following exception was thrown during execution in test generation
        try {
            double double24 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 10, (int) (byte) -1);
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
// flaky "10) test1078(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.36787944117144233d + "'", double21 == 0.36787944117144233d);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(32.0d, (int) 'a');
        double double4 = poissonDistributionImpl2.cumulativeProbability(33);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6150373563537195d + "'", double4 == 0.6150373563537195d);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability((int) ' ');
        double double16 = poissonDistributionImpl3.probability(0);
        int int17 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.36787944117144233d + "'", double16 == 0.36787944117144233d);
// flaky "9) test1080(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9386867598047597d, 99);
        double double4 = poissonDistributionImpl2.probability(4.560969057281241E-69d);
        double double6 = poissonDistributionImpl2.cumulativeProbability(23);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 104, 4.560969057281241E-69d, (int) '4');
        double double5 = poissonDistributionImpl3.cumulativeProbability(7.043845779425746E-168d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.813556821545286E-46d + "'", double5 == 6.813556821545286E-46d);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, 0.8160602794142788d, 2);
        int int4 = poissonDistributionImpl3.sample();
// flaky "10) test1083(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.5065674758999414E-46d);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.40894881836993996d, 0.5259020955950889d, 15);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.962564426565066E-37d, 0.6321205588285574d);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) (byte) 0);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.3678794411123646d);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.67364477971208d, 3);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int int13 = poissonDistributionImpl3.getDomainLowerBound(1.4230202807276707E-23d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = poissonDistributionImpl3.cumulativeProbability(37, 26);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        int int15 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 35);
        int int20 = poissonDistributionImpl3.getDomainLowerBound((double) 32);
        double double22 = poissonDistributionImpl3.cumulativeProbability(73);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, 3.8785349352299523E-28d, 112);
        double double5 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double10 = poissonDistributionImpl3.getMean();
        double double12 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        int int13 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
// flaky "11) test1092(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.25464638004358264d);
        double double2 = poissonDistributionImpl1.getMean();
        int[] intArray4 = poissonDistributionImpl1.sample(44);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl1.cumulativeProbability(80, (int) '4');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25464638004358264d + "'", double2 == 0.25464638004358264d);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.560969057281241E-69d, (double) '4', (int) 'a');
        double double5 = poissonDistributionImpl3.probability(29);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        // The following exception was thrown during execution in test generation
        try {
            double double26 = poissonDistributionImpl3.cumulativeProbability(104, 51);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.cumulativeProbability(0.9386867598047597d);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "12) test1096(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6321205588285574d + "'", double9 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        double double11 = poissonDistributionImpl3.probability((double) 106);
        poissonDistributionImpl3.reseedRandomGenerator((long) 10);
        double double15 = poissonDistributionImpl3.cumulativeProbability(0.9999999999977743d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = poissonDistributionImpl3.cumulativeProbability(14, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.2093315791106567E-171d + "'", double11 == 3.2093315791106567E-171d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6321205588285574d + "'", double15 == 0.6321205588285574d);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int int13 = poissonDistributionImpl3.getDomainUpperBound(0.9331927987311419d);
        int int15 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double17 = poissonDistributionImpl3.normalApproximateProbability(24);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2147483647, 6.305116760146996E-16d, 35);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(3.2093315791106567E-171d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2146192320 + "'", int5 == 2146192320);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3980856271290693E-36d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.0d);
        double double4 = poissonDistributionImpl1.getMean();
        int int5 = poissonDistributionImpl1.sample();
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.3980856271290693E-36d + "'", double4 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.021990921302225148d, 0.999999898622288d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, 0);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(4.793034378392443E-7d);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (short) 1);
        double double7 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "13) test1102(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 33 });
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        int int13 = poissonDistributionImpl3.inverseCumulativeProbability(9.216155638647194E-8d);
        int[] intArray15 = poissonDistributionImpl3.sample((int) (short) 0);
        double double16 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] {});
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int int15 = poissonDistributionImpl3.getDomainLowerBound((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = poissonDistributionImpl3.cumulativeProbability(93, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(6.305116760146989E-16d);
        int int3 = poissonDistributionImpl1.getDomainLowerBound(0.9331927987311419d);
        int int5 = poissonDistributionImpl1.inverseCumulativeProbability(1.0398180320558363E-12d);
        double double7 = poissonDistributionImpl1.cumulativeProbability(0.8862636038898793d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999999999999993d + "'", double7 == 0.9999999999999993d);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d, 33);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.560969057281241E-69d, (double) '4', (int) 'a');
        poissonDistributionImpl3.reseedRandomGenerator(1L);
        poissonDistributionImpl3.reseedRandomGenerator((long) 31);
        int int8 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability(0.0d, 0.1251100357211333d);
        int int14 = poissonDistributionImpl3.getDomainLowerBound(6.305116760146996E-16d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6321205588285574d + "'", double12 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        double double12 = poissonDistributionImpl3.cumulativeProbability(0.36787944117144233d, (double) 100.0f);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.cumulativeProbability(3.9606298142722176E-69d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.36787944117144256d + "'", double12 == 0.36787944117144256d);
// flaky "14) test1109(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6321205588285574d + "'", double15 == 0.6321205588285574d);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(41);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787943195528694d, (double) (-1L), 10);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability(4.448081146614204E-6d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (10) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0d, 3);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl2.cumulativeProbability(4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (3) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5269687609254716d, (double) 112, 0);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) 2);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.9386867598047597d);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) -1, (int) (short) 10);
        double double9 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8862636038898793d + "'", double7 == 0.8862636038898793d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f);
        poissonDistributionImpl3.reseedRandomGenerator(100L);
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, (int) (byte) 100);
        double double17 = poissonDistributionImpl3.normalApproximateProbability(37);
        poissonDistributionImpl3.reseedRandomGenerator((long) 37);
        double double21 = poissonDistributionImpl3.probability((double) 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999907838444d + "'", double10 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.813234320208393E-13d + "'", double21 == 2.813234320208393E-13d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 7.875285095517683E-30d, 73);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.813234320208393E-13d, 104.0d);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.01891663740103536d, 4.5399929762484845E-4d);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        double double11 = poissonDistributionImpl2.getMean();
        double double12 = poissonDistributionImpl2.getMean();
        int[] intArray14 = poissonDistributionImpl2.sample(37);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        java.lang.Class<?> wildcardClass11 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "11) test1120(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.186804141704334E-276d, (double) (byte) 1, 0);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        int int12 = poissonDistributionImpl3.getDomainUpperBound(0.14723260883568248d);
        double double14 = poissonDistributionImpl3.cumulativeProbability(0.05956661497600297d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6321205588285574d + "'", double10 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6321205588285574d + "'", double14 == 0.6321205588285574d);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 11, 12);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        double double23 = poissonDistributionImpl3.probability((int) (short) 1);
        double double26 = poissonDistributionImpl3.cumulativeProbability(100, 112);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "2) test1124(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.36787944117144233d + "'", double21 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.36787944117144233d + "'", double23 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        int int13 = poissonDistributionImpl3.inverseCumulativeProbability(9.216155638647194E-8d);
        int int15 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, (double) (byte) 1, 32);
        int int5 = poissonDistributionImpl3.getDomainLowerBound(1.1173711675821023E-12d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.probability(0.36787944117144233d);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = poissonDistributionImpl3.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "15) test1127(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.216155638647194E-8d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.999999999954943d);
        int[] intArray5 = poissonDistributionImpl1.sample(37);
        double double8 = poissonDistributionImpl1.cumulativeProbability((int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        double double4 = poissonDistributionImpl3.getMean();
        int int5 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-12d + "'", double4 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 0.18393972058572114d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 186, (-1.0d));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9997803485788277d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.8862636038898793d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        poissonDistributionImpl3.reseedRandomGenerator((long) 0);
        double double9 = poissonDistributionImpl3.normalApproximateProbability(37);
        double double11 = poissonDistributionImpl3.cumulativeProbability(23);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = poissonDistributionImpl3.inverseCumulativeProbability((double) 37);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.996934337990238d, 0.6027489844659351d);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.14723260883568248d, 52.0d, 38);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((double) 104);
        int int7 = poissonDistributionImpl3.getDomainLowerBound(0.8345580221844533d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 38);
        double double21 = poissonDistributionImpl3.cumulativeProbability(38, (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, 0.8160602794142788d, 2);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        int int7 = poissonDistributionImpl3.getDomainLowerBound(0.9601390031908519d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        int int10 = poissonDistributionImpl3.sample();
        int int12 = poissonDistributionImpl3.getDomainUpperBound(0.308537538725987d);
        double double14 = poissonDistributionImpl3.probability(3.5601874895062087E-41d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "16) test1138(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 38, 3.57198604755006E-167d);
        double double5 = poissonDistributionImpl2.cumulativeProbability(1.17246204865673E-37d, (double) 34);
        poissonDistributionImpl2.reseedRandomGenerator((long) 99);
        double double9 = poissonDistributionImpl2.probability(0.999999999954943d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability(1.4230202807276707E-23d);
        int int13 = poissonDistributionImpl2.getDomainLowerBound((double) (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.29140699867905834d + "'", double5 == 0.29140699867905834d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double11 = poissonDistributionImpl3.getMean();
        double double13 = poissonDistributionImpl3.cumulativeProbability(106);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6321205588285574d + "'", double10 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f);
        int[] intArray12 = poissonDistributionImpl3.sample(23);
        int int13 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999907838444d + "'", double10 == 0.9999999907838444d);
        org.junit.Assert.assertNotNull(intArray12);
// flaky "17) test1141(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray12, new int[] { 2, 2, 2, 2, 0, 3, 1, 0, 1, 0, 1, 1, 2, 1, 4, 0, 0, 2, 1, 0, 1, 1, 0 });
// flaky "12) test1141(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6027489844659351d, 33);
        int int3 = poissonDistributionImpl2.sample();
// flaky "18) test1142(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainLowerBound((double) (-1));
        double double8 = poissonDistributionImpl3.cumulativeProbability(4.560969057281241E-69d, (double) 34);
        poissonDistributionImpl3.reseedRandomGenerator(100L);
        double double12 = poissonDistributionImpl3.probability(15);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = poissonDistributionImpl3.cumulativeProbability(0.9999999999991455d, 0.9938427862994814d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.999778782798785E-13d + "'", double8 == 9.999778782798785E-13d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.647163731812068E-193d + "'", double12 == 7.647163731812068E-193d);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double18 = poissonDistributionImpl3.getMean();
        int int20 = poissonDistributionImpl3.getDomainLowerBound(4.539992976248491E-5d);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = poissonDistributionImpl3.cumulativeProbability(0.9386867598047597d, 0.9601390031908519d);
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
// flaky "19) test1144(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double14 = poissonDistributionImpl3.cumulativeProbability((double) (short) 0, (double) 'a');
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        double double17 = poissonDistributionImpl3.getMean();
        int int19 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.813234320208393E-13d, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999999999997d);
        double double2 = poissonDistributionImpl1.getMean();
        int int3 = poissonDistributionImpl1.sample();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999997d + "'", double2 == 0.9999999999999997d);
// flaky "20) test1147(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int int13 = poissonDistributionImpl3.getDomainUpperBound(0.9331927987311419d);
        poissonDistributionImpl3.reseedRandomGenerator((long) 104);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 105, 1);
        int int3 = poissonDistributionImpl2.sample();
        int[] intArray5 = poissonDistributionImpl2.sample(42);
// flaky "21) test1149(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115 + "'", int3 == 115);
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.57198604755006E-167d, 1.0398180320558363E-12d, 3);
        double double5 = poissonDistributionImpl3.cumulativeProbability(3.1598158774371023E-77d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 10.0d);
        double double4 = poissonDistributionImpl2.probability(0.533676680517062d);
        int int6 = poissonDistributionImpl2.getDomainUpperBound(0.05698471084507295d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.039860996809147134d, 0.0d);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) 102);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample((int) (short) 100);
        double double16 = poissonDistributionImpl3.getMean();
        int[] intArray18 = poissonDistributionImpl3.sample(43);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = poissonDistributionImpl3.cumulativeProbability(88, 4);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) (short) 0);
        double double13 = poissonDistributionImpl3.probability((double) (-1L));
        poissonDistributionImpl3.reseedRandomGenerator((long) 102);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 106, 9);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        poissonDistributionImpl3.reseedRandomGenerator((long) 106);
        double double26 = poissonDistributionImpl3.probability(0.999999999954943d);
        java.lang.Class<?> wildcardClass27 = poissonDistributionImpl3.getClass();
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7596379528070493E-10d, 2);
        poissonDistributionImpl2.reseedRandomGenerator((long) 24);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(0.6922006339347749d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        int int22 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "22) test1158(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.36787944117144233d + "'", double21 == 0.36787944117144233d);
// flaky "3) test1158(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double20 = poissonDistributionImpl3.cumulativeProbability(14, 93);
        double double22 = poissonDistributionImpl3.cumulativeProbability(51);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.2198466942977575E-12d + "'", double20 == 4.2198466942977575E-12d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.05956661497600297d, 0.0d);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 104, 32);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        int[] intArray30 = poissonDistributionImpl3.sample(28);
        double double32 = poissonDistributionImpl3.probability(13);
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
// flaky "23) test1162(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray26, new int[] { 2, 1, 2, 3, 0, 0, 1, 0, 3, 2, 0, 0, 0, 0, 2, 0, 1, 2, 0, 0, 2, 4, 0 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 5.907792072437627E-11d + "'", double32 == 5.907792072437627E-11d);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.88940969307282E-43d, (double) 1, 41);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability((double) 80, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 27);
        double double3 = poissonDistributionImpl1.cumulativeProbability(9);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.7847658147250014E-5d + "'", double3 == 5.7847658147250014E-5d);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        int[] intArray13 = poissonDistributionImpl3.sample((int) 'a');
        double double14 = poissonDistributionImpl3.getMean();
        double double16 = poissonDistributionImpl3.probability(3.5601874895062087E-41d);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.999999898622288d + "'", double18 == 0.999999898622288d);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double18 = poissonDistributionImpl3.cumulativeProbability((int) ' ', 100);
        double double20 = poissonDistributionImpl3.probability(0.36787944117144256d);
        int int22 = poissonDistributionImpl3.getDomainLowerBound(2.755731922395672E-127d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "24) test1166(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double15 = poissonDistributionImpl3.probability((int) 'a');
        double double17 = poissonDistributionImpl3.probability((double) 30);
        double double19 = poissonDistributionImpl3.probability((double) 0L);
        double double22 = poissonDistributionImpl3.cumulativeProbability(0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "25) test1167(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.8243984514608465E-153d + "'", double15 == 3.8243984514608465E-153d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.3869009421120585E-33d + "'", double17 == 1.3869009421120585E-33d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.36787944117144233d + "'", double19 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9999999907838444d + "'", double22 == 0.9999999907838444d);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d, (double) (-1), 0);
        double double5 = poissonDistributionImpl3.probability(0.14723260883568248d);
        double double7 = poissonDistributionImpl3.probability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6922006275553464d + "'", double7 == 0.6922006275553464d);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (int) '4');
        double double4 = poissonDistributionImpl2.probability(0.308537538725987d);
        int int6 = poissonDistributionImpl2.getDomainLowerBound(0.533676680517062d);
        double double8 = poissonDistributionImpl2.cumulativeProbability(3.139132792048018E-17d);
        int int10 = poissonDistributionImpl2.inverseCumulativeProbability((double) 1L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4421702547125971d + "'", double8 == 0.4421702547125971d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d);
        double double4 = poissonDistributionImpl1.cumulativeProbability(46, (int) 'a');
        int int6 = poissonDistributionImpl1.getDomainLowerBound(3.720075976020836E-44d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2147483647, (double) 1, 44);
        double double5 = poissonDistributionImpl3.probability((double) 99);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.6321205588285574d);
        double double13 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999907838444d + "'", double10 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        double double25 = poissonDistributionImpl3.probability((double) (-1));
        double double27 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double29 = poissonDistributionImpl3.probability((int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "26) test1173(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.308537538725987d + "'", double23 == 0.308537538725987d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4.560969057281241E-69d + "'", double29 == 4.560969057281241E-69d);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.8243984514608465E-153d, (int) (byte) 10);
        double double3 = poissonDistributionImpl2.getMean();
        double double6 = poissonDistributionImpl2.cumulativeProbability((int) (byte) -1, 37);
        double double7 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.8243984514608465E-153d + "'", double3 == 3.8243984514608465E-153d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.8243984514608465E-153d + "'", double7 == 3.8243984514608465E-153d);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.8243984514608465E-153d, 3.57198604755006E-167d);
        double double5 = poissonDistributionImpl2.cumulativeProbability((int) (short) -1, 0);
        double double7 = poissonDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double9 = poissonDistributionImpl2.probability(4.0528363998149075E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int[] intArray15 = poissonDistributionImpl3.sample(42);
        poissonDistributionImpl3.reseedRandomGenerator((long) 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "27) test1176(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1, 0, 0, 0, 0, 1, 1, 0, 1, 1 });
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        double double25 = poissonDistributionImpl3.probability(106);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = poissonDistributionImpl3.cumulativeProbability(106, 100);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.6728134305602215E-44d + "'", double22 == 2.6728134305602215E-44d);
// flaky "28) test1177(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3.2093315791106567E-171d + "'", double25 == 3.2093315791106567E-171d);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int int6 = poissonDistributionImpl3.sample();
        double double8 = poissonDistributionImpl3.probability(29);
        double double10 = poissonDistributionImpl3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
// flaky "29) test1178(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.160702826336122E-32d + "'", double8 == 4.160702826336122E-32d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6321205588285574d + "'", double10 == 0.6321205588285574d);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability((int) ' ');
        double double16 = poissonDistributionImpl3.cumulativeProbability(24);
        double double18 = poissonDistributionImpl3.normalApproximateProbability(106);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        int int15 = poissonDistributionImpl3.getDomainUpperBound(0.6321205588285574d);
        double double17 = poissonDistributionImpl3.normalApproximateProbability((int) (short) -1);
        int[] intArray19 = poissonDistributionImpl3.sample(99);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability(0.3678794411123646d);
        double double22 = poissonDistributionImpl3.getMean();
        int[] intArray24 = poissonDistributionImpl3.sample(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.06680720126885803d + "'", double17 == 0.06680720126885803d);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] {});
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) '#');
        int int16 = poissonDistributionImpl3.getDomainLowerBound(3.57198604755006E-167d);
        double double18 = poissonDistributionImpl3.cumulativeProbability((int) '4');
        int[] intArray20 = poissonDistributionImpl3.sample((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1, 0, 1, 0, 0, 3, 2, 0, 1, 0 });
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability(100);
        int int16 = poissonDistributionImpl3.getDomainLowerBound((double) ' ');
        int[] intArray18 = poissonDistributionImpl3.sample(15);
        double double20 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int22 = poissonDistributionImpl3.getDomainLowerBound(0.18393972058572114d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray18);
// flaky "30) test1182(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 0, 1, 2, 1, 1, 0, 1, 1, 0, 0, 0, 4, 0, 1 });
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        double double11 = poissonDistributionImpl2.getMean();
        double double12 = poissonDistributionImpl2.getMean();
        int int14 = poissonDistributionImpl2.getDomainUpperBound((double) 14);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = poissonDistributionImpl2.cumulativeProbability(24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double10 = poissonDistributionImpl3.getMean();
        double double12 = poissonDistributionImpl3.probability(0);
        double double13 = poissonDistributionImpl3.getMean();
        double double14 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.36787944117144233d + "'", double12 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.448081146614204E-6d, 7.033719554105805E-46d);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', 9.216155638647194E-8d, 0);
        int int4 = poissonDistributionImpl3.sample();
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl3.getClass();
// flaky "31) test1186(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.216155638647194E-8d, 4.670902356181524E-139d, 186);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', (int) (byte) 1);
        int int3 = poissonDistributionImpl2.sample();
        double double4 = poissonDistributionImpl2.getMean();
        int int6 = poissonDistributionImpl2.getDomainLowerBound(1.1102230246251565E-16d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky "32) test1188(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 109 + "'", int3 == 109);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8345580221844533d, 1.7401052582713831E-47d);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 15);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        int int8 = poissonDistributionImpl3.sample();
        double double10 = poissonDistributionImpl3.normalApproximateProbability(34);
        int int12 = poissonDistributionImpl3.getDomainLowerBound(0.6321205588285574d);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
// flaky "33) test1190(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) 10L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        double double11 = poissonDistributionImpl3.cumulativeProbability(0.6321205588285574d, (double) 100L);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = poissonDistributionImpl3.cumulativeProbability((double) 98, 5.609088260248484E-6d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "13) test1192(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.36787944117144256d + "'", double11 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.normalApproximateProbability(10);
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1, 186);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.36787944117144256d + "'", double15 == 0.36787944117144256d);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8345580221844533d, 0.0d);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8345580221844533d + "'", double3 == 0.8345580221844533d);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        double double5 = poissonDistributionImpl3.probability((int) (byte) 100);
        double double6 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.941866060050443E-159d + "'", double5 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.216155638647194E-8d);
        int int3 = poissonDistributionImpl1.getDomainLowerBound((double) (-1));
        double double6 = poissonDistributionImpl1.cumulativeProbability(37, 86);
        double double8 = poissonDistributionImpl1.probability(0.5578297452874029d);
        poissonDistributionImpl1.reseedRandomGenerator((long) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 112, 0);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 3);
        double double3 = poissonDistributionImpl1.probability((int) (byte) 10);
        double double5 = poissonDistributionImpl1.probability((int) '#');
        double double8 = poissonDistributionImpl1.cumulativeProbability(0.3525511311226325d, 52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.101511794681424E-4d + "'", double3 == 8.101511794681424E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.4106148140883866E-25d + "'", double5 == 2.4106148140883866E-25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.950212931632136d + "'", double8 == 0.950212931632136d);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(104.0d, 0.0d);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        double double14 = poissonDistributionImpl3.cumulativeProbability(32);
        double double16 = poissonDistributionImpl3.cumulativeProbability(104);
        double double18 = poissonDistributionImpl3.cumulativeProbability(38.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "34) test1200(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.7472115020283746d, 12);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        double double6 = poissonDistributionImpl2.probability((int) (short) -1);
        double double8 = poissonDistributionImpl2.probability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability((double) 5, (double) 115);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6.305116760146989E-16d + "'", double8 == 6.305116760146989E-16d);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double9 = poissonDistributionImpl3.getMean();
        int int11 = poissonDistributionImpl3.inverseCumulativeProbability(0.999999999940922d);
        double double12 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        int int15 = poissonDistributionImpl3.getDomainLowerBound((double) 2147483647);
        double double17 = poissonDistributionImpl3.normalApproximateProbability(105);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "35) test1204(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.probability(38.0d);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) (-1));
        double double16 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.033719554105805E-46d + "'", double13 == 7.033719554105805E-46d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', (int) (byte) 1);
        int int3 = poissonDistributionImpl2.sample();
        int int4 = poissonDistributionImpl2.sample();
        double double6 = poissonDistributionImpl2.probability(5);
        int int7 = poissonDistributionImpl2.sample();
// flaky "36) test1206(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
// flaky "14) test1206(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 82 + "'", int4 == 82);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.347030737638007E-35d + "'", double6 == 5.347030737638007E-35d);
// flaky "4) test1206(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8430188007045427d);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double16 = poissonDistributionImpl3.cumulativeProbability(37, 37);
        int int18 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double21 = poissonDistributionImpl3.cumulativeProbability(13, 99);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = poissonDistributionImpl3.sample((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5.907796474247107E-11d + "'", double21 == 5.907796474247107E-11d);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a');
        double double4 = poissonDistributionImpl1.cumulativeProbability((int) (byte) -1, 3);
        int int6 = poissonDistributionImpl1.inverseCumulativeProbability(0.0d);
        double double8 = poissonDistributionImpl1.cumulativeProbability(11);
        double double10 = poissonDistributionImpl1.cumulativeProbability(0.9999998986222932d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.17246204865673E-37d + "'", double4 == 1.17246204865673E-37d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.5080394273921536E-28d + "'", double8 == 1.5080394273921536E-28d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.471972337343043E-43d + "'", double10 == 7.471972337343043E-43d);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) 100);
        int[] intArray4 = poissonDistributionImpl2.sample(51);
        int int6 = poissonDistributionImpl2.getDomainLowerBound(4.219851480312614E-12d);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        int int23 = poissonDistributionImpl3.getDomainUpperBound((double) 1.0f);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "37) test1211(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(30);
        double double5 = poissonDistributionImpl1.cumulativeProbability((double) (short) -1);
        double double8 = poissonDistributionImpl1.cumulativeProbability(28, (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.999999999954943d + "'", double3 == 0.999999999954943d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.253367380355975E-6d + "'", double8 == 2.253367380355975E-6d);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 100, 0.0030656620097619935d);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double17 = poissonDistributionImpl3.probability(26);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 9.121924876459277E-28d + "'", double17 == 9.121924876459277E-28d);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.457712003500205E-9d, 41);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(46);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) (byte) 0);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(1.7401052582713831E-47d);
        int[] intArray6 = poissonDistributionImpl2.sample(43);
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1L), 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.4421702547125802d + "'", double9 == 0.4421702547125802d);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, 98);
        double double4 = poissonDistributionImpl2.cumulativeProbability(1.962564426565066E-37d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.999999999999d + "'", double4 == 0.999999999999d);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(6.813556821545286E-46d, 3.2093315791106567E-171d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        double double8 = poissonDistributionImpl3.getMean();
        int[] intArray10 = poissonDistributionImpl3.sample(36);
        double double12 = poissonDistributionImpl3.cumulativeProbability(80);
        poissonDistributionImpl3.reseedRandomGenerator((long) 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        int int8 = poissonDistributionImpl2.getDomainUpperBound((double) 11);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.normalApproximateProbability((int) (short) 10);
        double double11 = poissonDistributionImpl3.probability((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.941866060050443E-159d + "'", double11 == 3.941866060050443E-159d);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.01891663740103536d, 0.0027693957155115767d);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        int int5 = poissonDistributionImpl1.getDomainUpperBound((double) (-1L));
        poissonDistributionImpl1.reseedRandomGenerator((long) (byte) 10);
        int int8 = poissonDistributionImpl1.sample();
        int int9 = poissonDistributionImpl1.sample();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.cumulativeProbability(9.216155638647194E-8d);
        double double14 = poissonDistributionImpl3.cumulativeProbability(2);
        int int16 = poissonDistributionImpl3.getDomainLowerBound((double) 2147483647);
        int int17 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6321205588285574d + "'", double12 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9386867598047597d + "'", double14 == 0.9386867598047597d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky "38) test1224(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        double double13 = poissonDistributionImpl3.getMean();
        double double15 = poissonDistributionImpl3.probability(12);
        poissonDistributionImpl3.reseedRandomGenerator((long) 31);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "39) test1225(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.680129694168893E-10d + "'", double15 == 7.680129694168893E-10d);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        double double9 = poissonDistributionImpl3.cumulativeProbability(100);
        int int11 = poissonDistributionImpl3.inverseCumulativeProbability(3.1598158774371023E-77d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d, 24);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4');
        double double4 = poissonDistributionImpl1.cumulativeProbability((int) (byte) 0, 14);
        double double6 = poissonDistributionImpl1.probability(9.216155633002718E-9d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.291633944458635E-10d + "'", double4 == 4.291633944458635E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int int17 = poissonDistributionImpl3.getDomainLowerBound(0.36787944117144256d);
        int int19 = poissonDistributionImpl3.getDomainUpperBound(4.719682636442159E-60d);
        int int20 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) '#');
        int int4 = poissonDistributionImpl2.getDomainUpperBound(0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6728134305602215E-44d, (int) (byte) 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 23);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.probability(0.18393972058572117d);
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.6728134305602215E-44d + "'", double5 == 2.6728134305602215E-44d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.8133051444001467E-13d, (int) (short) 10);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.8133051444001467E-13d + "'", double3 == 2.8133051444001467E-13d);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (int) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) (byte) 10, (int) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) 34);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10L);
        double double9 = poissonDistributionImpl3.probability(0.6027489844659351d);
        double double11 = poissonDistributionImpl3.normalApproximateProbability(4);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl3.cumulativeProbability(0.999999992542288d, 0.6640509287659724d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.04425363959909373d, 0.9999999999991455d);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, 44);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) -1, (double) 32);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1.0f));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4');
        double double3 = poissonDistributionImpl1.probability((int) (short) 10);
        double double4 = poissonDistributionImpl1.getMean();
        double double6 = poissonDistributionImpl1.probability((int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0398180320558363E-12d + "'", double3 == 1.0398180320558363E-12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.688982796070711E-9d + "'", double6 == 7.688982796070711E-9d);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(104.0d, 0.0d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 104);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(6);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int int17 = poissonDistributionImpl3.getDomainUpperBound((double) 35);
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 10);
        double double21 = poissonDistributionImpl3.probability(186);
        int int23 = poissonDistributionImpl3.getDomainLowerBound((double) 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999907838444d + "'", double19 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(30);
        double double5 = poissonDistributionImpl1.cumulativeProbability((double) (short) -1);
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.999999999954943d + "'", double3 == 0.999999999954943d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        double double25 = poissonDistributionImpl3.probability(3.1627334188024467E-75d);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = poissonDistributionImpl3.cumulativeProbability(0.4421702547125802d, 4.018416977195786E-54d);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int5 = poissonDistributionImpl2.sample();
        int int7 = poissonDistributionImpl2.getDomainLowerBound((double) '4');
        double double9 = poissonDistributionImpl2.probability((double) 37);
        org.junit.Assert.assertNotNull(intArray4);
// flaky "40) test1244(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.06186911463179348d + "'", double9 == 0.06186911463179348d);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ');
        double double2 = poissonDistributionImpl1.getMean();
        double double3 = poissonDistributionImpl1.getMean();
        double double5 = poissonDistributionImpl1.cumulativeProbability(73);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999999998405164d + "'", double5 == 0.9999999998405164d);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int int6 = poissonDistributionImpl3.sample();
        double double7 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
// flaky "41) test1246(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, 0.5429999234951242d, 36);
        int int5 = poissonDistributionImpl3.getDomainLowerBound(4.539992976248491E-5d);
        int int7 = poissonDistributionImpl3.getDomainLowerBound(7.186804141704334E-276d);
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, (double) (short) 10);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 1L);
        int int5 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
// flaky "15) test1248(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.609088260248484E-6d, 103);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.457712003500205E-9d, 41);
        poissonDistributionImpl2.reseedRandomGenerator((long) 38);
        poissonDistributionImpl2.reseedRandomGenerator((long) ' ');
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d, 104);
        double double4 = poissonDistributionImpl2.probability(34);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.018416977195786E-54d + "'", double4 == 4.018416977195786E-54d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 4.925222664969737E-19d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 3.720075976020836E-44d, 1);
        int int4 = poissonDistributionImpl3.sample();
        double double6 = poissonDistributionImpl3.probability(2147483647);
        int int7 = poissonDistributionImpl3.sample();
// flaky "42) test1253(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
// flaky "16) test1253(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        int int16 = poissonDistributionImpl3.getDomainUpperBound((double) (byte) 1);
        int int17 = poissonDistributionImpl3.sample();
        double double19 = poissonDistributionImpl3.cumulativeProbability(0.03105243133179786d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
// flaky "17) test1254(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6321205588285574d + "'", double19 == 0.6321205588285574d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) 2);
        double double4 = poissonDistributionImpl2.probability((int) 'a');
        double double6 = poissonDistributionImpl2.cumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.719682636442159E-60d + "'", double4 == 4.719682636442159E-60d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.993992273873336E-4d + "'", double6 == 4.993992273873336E-4d);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.4230202807276707E-23d, (double) 5);
        double double4 = poissonDistributionImpl2.probability(32);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int int17 = poissonDistributionImpl3.getDomainUpperBound((double) 35);
        poissonDistributionImpl3.reseedRandomGenerator((long) 24);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.normalApproximateProbability((int) '4');
        int int19 = poissonDistributionImpl3.getDomainLowerBound(0.5269687609254716d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.999999999940922d, (int) (short) 100);
        int[] intArray4 = poissonDistributionImpl2.sample(30);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.216155638647194E-8d, (double) 29);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.457712003500205E-9d);
        int[] intArray3 = poissonDistributionImpl1.sample(35);
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.probability((int) '4');
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        int int17 = poissonDistributionImpl3.getDomainUpperBound(1.0137771196302933E-7d);
        java.lang.Class<?> wildcardClass18 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.560969057281241E-69d + "'", double13 == 4.560969057281241E-69d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 4.719682636442159E-60d, 99);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((double) 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.907796474247107E-11d, 100);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double11 = poissonDistributionImpl3.getMean();
        double double14 = poissonDistributionImpl3.cumulativeProbability(38, 10000000);
        int int15 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6321205588285574d + "'", double10 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
// flaky "43) test1265(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        int int13 = poissonDistributionImpl3.inverseCumulativeProbability(9.216155638647194E-8d);
        double double15 = poissonDistributionImpl3.probability(2);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) -1);
        int[] intArray19 = poissonDistributionImpl3.sample(102);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.18393972058572114d + "'", double15 == 0.18393972058572114d);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int[] intArray17 = poissonDistributionImpl3.sample((int) 'a');
        double double19 = poissonDistributionImpl3.normalApproximateProbability(30);
        double double21 = poissonDistributionImpl3.cumulativeProbability(7.688982796070711E-9d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.6321205588285574d + "'", double21 == 0.6321205588285574d);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(44.0d, 10.0d, 93);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(93, 34);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double18 = poissonDistributionImpl3.getMean();
        double double20 = poissonDistributionImpl3.normalApproximateProbability(0);
        int int21 = poissonDistributionImpl3.sample();
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "44) test1269(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.308537538725987d + "'", double20 == 0.308537538725987d);
// flaky "2) test1269(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double16 = poissonDistributionImpl3.cumulativeProbability((double) 2, (double) 'a');
        int int17 = poissonDistributionImpl3.sample();
        int int18 = poissonDistributionImpl3.sample();
        poissonDistributionImpl3.reseedRandomGenerator((long) 34);
        double double22 = poissonDistributionImpl3.probability(4.018416977195786E-54d);
        int int24 = poissonDistributionImpl3.getDomainUpperBound(0.6922006339347749d);
        int int26 = poissonDistributionImpl3.getDomainLowerBound(0.9997803485788277d);
        double double29 = poissonDistributionImpl3.cumulativeProbability(32, 38);
        double double31 = poissonDistributionImpl3.normalApproximateProbability((int) '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.18393972058572117d + "'", double16 == 0.18393972058572117d);
// flaky "45) test1270(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky "18) test1270(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = poissonDistributionImpl3.cumulativeProbability((double) (byte) 10, 0.9999998986222932d);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.993992273873336E-4d, 4.864649182067619E-63d);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 30, (double) 10000000);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.0d);
        int int5 = poissonDistributionImpl2.sample();
        int int7 = poissonDistributionImpl2.getDomainUpperBound(1.0137743067240024E-7d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "46) test1273(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability(3.8243984514608465E-153d);
        double double11 = poissonDistributionImpl3.cumulativeProbability(1.7401052582713831E-47d);
        double double14 = poissonDistributionImpl3.cumulativeProbability((double) (byte) 10, (double) 32);
        int int15 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6321205588285574d + "'", double11 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0137771200291468E-7d + "'", double14 == 1.0137771200291468E-7d);
// flaky "19) test1274(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        double double23 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 0);
        int int24 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.6321205588285574d + "'", double21 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6321205588285574d + "'", double23 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117146065d, (double) 104, 15);
        int int4 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        poissonDistributionImpl3.reseedRandomGenerator((long) 99);
        double double16 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 3);
        int int18 = poissonDistributionImpl3.inverseCumulativeProbability(0.9386867598047597d);
        double double20 = poissonDistributionImpl3.probability(35);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = poissonDistributionImpl3.cumulativeProbability(9.88940969307282E-43d, 0.007566654960414148d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3525511311226325d + "'", double16 == 0.3525511311226325d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.5601874895062087E-41d + "'", double20 == 3.5601874895062087E-41d);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 0, 14);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, 0.25464638004358264d);
        double double4 = poissonDistributionImpl2.probability((double) (-1L));
        int int6 = poissonDistributionImpl2.getDomainLowerBound(9.216155633002718E-9d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 12, 0.028444728018643173d);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        double double14 = poissonDistributionImpl3.normalApproximateProbability((int) (short) -1);
        int int16 = poissonDistributionImpl3.getDomainUpperBound((double) 32);
        double double18 = poissonDistributionImpl3.normalApproximateProbability(82);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06680720126885803d + "'", double14 == 0.06680720126885803d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        int int9 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 38 + "'", int9 == 38);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        double double14 = poissonDistributionImpl3.probability(3.8243984514608465E-153d);
        double double16 = poissonDistributionImpl3.cumulativeProbability((double) 'a');
        double double18 = poissonDistributionImpl3.cumulativeProbability((int) (short) 10);
        int[] intArray20 = poissonDistributionImpl3.sample(0);
        double double22 = poissonDistributionImpl3.cumulativeProbability(0.999999999954943d);
        int[] intArray24 = poissonDistributionImpl3.sample((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9999999907838444d + "'", double18 == 0.9999999907838444d);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.6321205588285574d + "'", double22 == 0.6321205588285574d);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] {});
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d, 2147483647);
        double double4 = poissonDistributionImpl2.probability(88);
        double double6 = poissonDistributionImpl2.cumulativeProbability(98);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 6.685526970917836E-59d, 103);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7596379528070493E-10d);
        int[] intArray3 = poissonDistributionImpl1.sample(110);
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability(32);
        double double16 = poissonDistributionImpl3.getMean();
        double double17 = poissonDistributionImpl3.getMean();
        java.lang.Class<?> wildcardClass18 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 35);
        double double3 = poissonDistributionImpl1.cumulativeProbability((int) (short) 0);
        int int5 = poissonDistributionImpl1.inverseCumulativeProbability(0.999999999940922d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.305116760146996E-16d + "'", double3 == 6.305116760146996E-16d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 78 + "'", int5 == 78);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 2.7455062667769425E-9d, 99);
        double double5 = poissonDistributionImpl3.probability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.5399929762484854E-5d + "'", double5 == 4.5399929762484854E-5d);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) 2);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.9386867598047597d);
        double double6 = poissonDistributionImpl2.probability(100.0d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 51);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.539992976248491E-5d + "'", double4 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.864649182067619E-63d + "'", double6 == 4.864649182067619E-63d);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f);
        poissonDistributionImpl3.reseedRandomGenerator(100L);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.cumulativeProbability(15);
        int int17 = poissonDistributionImpl3.getDomainUpperBound((double) 38);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = poissonDistributionImpl3.cumulativeProbability(0.5578297452874029d, 3.115285807098189E-13d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999907838444d + "'", double10 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9999999999999825d + "'", double15 == 0.9999999999999825d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 1L);
        double double14 = poissonDistributionImpl3.probability(3);
        poissonDistributionImpl3.reseedRandomGenerator((long) 5);
        int[] intArray18 = poissonDistributionImpl3.sample(23);
        double double19 = poissonDistributionImpl3.getMean();
        java.lang.Class<?> wildcardClass20 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "47) test1292(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06131324019524039d + "'", double14 == 0.06131324019524039d);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 1, 1, 0, 1, 2, 2, 2, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2 });
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 106);
        double double15 = poissonDistributionImpl3.cumulativeProbability(0.999999999954943d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(1.2460656213271568E-39d);
        double double19 = poissonDistributionImpl3.probability((int) '#');
        double double22 = poissonDistributionImpl3.cumulativeProbability(0.6027489844659351d, (double) 3);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = poissonDistributionImpl3.cumulativeProbability(4.560969057281241E-69d, 1.0040290630831367E-103d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "48) test1293(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6321205588285574d + "'", double15 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.5601874895062087E-41d + "'", double19 == 3.5601874895062087E-41d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3525511311226325d + "'", double22 == 0.3525511311226325d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7401052582713831E-47d, 4.5399929762484845E-4d);
        double double4 = poissonDistributionImpl2.probability(3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.781633496103664E-142d + "'", double4 == 8.781633496103664E-142d);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(8.322102657191705E-4d, (int) 'a');
        double double3 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability(4.925222664969737E-19d, 1.4076594357809174E-73d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.322102657191705E-4d + "'", double3 == 8.322102657191705E-4d);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        double double14 = poissonDistributionImpl3.probability((int) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, 99);
        double double21 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100);
        double double23 = poissonDistributionImpl3.cumulativeProbability(0.9999999998405164d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "20) test1296(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6321205588285574d + "'", double23 == 0.6321205588285574d);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double13 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double15 = poissonDistributionImpl3.cumulativeProbability(10000000);
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(0.8160602794142788d);
        int int19 = poissonDistributionImpl3.inverseCumulativeProbability(4.448081146614204E-6d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.691462461274013d + "'", double13 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        double double4 = poissonDistributionImpl1.getMean();
        int int6 = poissonDistributionImpl1.getDomainLowerBound(0.9999999999977743d);
        double double8 = poissonDistributionImpl1.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.539992976248491E-5d + "'", double8 == 4.539992976248491E-5d);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.normalApproximateProbability(44);
        int int11 = poissonDistributionImpl3.getDomainLowerBound(3.8243984514608465E-153d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl3.cumulativeProbability((double) 73, 0.9331927987311419d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6640509287659724d, 7.043845779425746E-168d);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.18393972058572117d, (double) 1L);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.18393972058572117d + "'", double3 == 0.18393972058572117d);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (short) 1);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 100);
        double double9 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "49) test1303(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 40 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) (byte) 0);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.cumulativeProbability(32);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        int int9 = poissonDistributionImpl2.getDomainLowerBound(0.691462461274013d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8160602794142788d + "'", double3 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (int) '4');
        double double4 = poissonDistributionImpl2.probability(0.308537538725987d);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.025956482467509034d, (double) 35, 34);
        int int5 = poissonDistributionImpl3.getDomainUpperBound(1.2460656213271568E-39d);
        poissonDistributionImpl3.reseedRandomGenerator((long) 102);
        double double9 = poissonDistributionImpl3.probability(37);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.5034409561692122E-102d + "'", double9 == 1.5034409561692122E-102d);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.14723260883568248d, (double) 0.0f);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 38, 3.57198604755006E-167d);
        double double5 = poissonDistributionImpl2.cumulativeProbability(1.17246204865673E-37d, (double) 34);
        double double6 = poissonDistributionImpl2.getMean();
        double double8 = poissonDistributionImpl2.cumulativeProbability(4.925222664969737E-19d);
        int[] intArray10 = poissonDistributionImpl2.sample(186);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.29140699867905834d + "'", double5 == 0.29140699867905834d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 38.0d + "'", double6 == 38.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.139132792048018E-17d + "'", double8 == 3.139132792048018E-17d);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(32.0d, 0.0030656618967475464d);
        poissonDistributionImpl2.reseedRandomGenerator(0L);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 100);
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = poissonDistributionImpl3.sample((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8345580221844533d, 1.7401052582713831E-47d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(80);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, (double) (short) -1, (int) (short) 100);
        int[] intArray5 = poissonDistributionImpl3.sample((int) (short) 10);
        int int7 = poissonDistributionImpl3.getDomainUpperBound(0.999999992542288d);
        int int9 = poissonDistributionImpl3.getDomainLowerBound(1.1173711675821023E-12d);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "50) test1312(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 41, 36, 35, 34, 36, 33, 52, 41, 37, 41 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainLowerBound(100.0d);
        double double15 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = poissonDistributionImpl3.cumulativeProbability(1.3980856271290628E-36d, 1.7401052582713831E-47d);
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
// flaky "21) test1313(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        int int15 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 35);
        double double20 = poissonDistributionImpl3.probability(42);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.6183476108973206E-52d + "'", double20 == 2.6183476108973206E-52d);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f);
        poissonDistributionImpl3.reseedRandomGenerator(100L);
        double double14 = poissonDistributionImpl3.cumulativeProbability(2.7455062667769425E-9d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = poissonDistributionImpl3.cumulativeProbability((double) 5, 4.448081146614204E-6d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999907838444d + "'", double10 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6321205588285574d + "'", double14 == 0.6321205588285574d);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        double double14 = poissonDistributionImpl3.cumulativeProbability(32);
        int[] intArray16 = poissonDistributionImpl3.sample((int) 'a');
        double double18 = poissonDistributionImpl3.cumulativeProbability(0.18393972058572117d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "22) test1316(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6321205588285574d + "'", double18 == 0.6321205588285574d);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, (double) (byte) -1, 30);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability(4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 100");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 100, 0);
        double double3 = poissonDistributionImpl2.getMean();
        int int5 = poissonDistributionImpl2.getDomainUpperBound(0.6027489844659351d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(99);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7596379528070493E-10d, 0.7472115020283746d, 28);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
        double double25 = poissonDistributionImpl3.cumulativeProbability(4.539992976248491E-5d, (double) 14);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "51) test1320(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6321205588285574d + "'", double20 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.3678794411711612d + "'", double25 == 0.3678794411711612d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.1401737047361744E-120d, 12);
        double double4 = poissonDistributionImpl2.probability(10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.5065674758999414E-46d, 104);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int16 = poissonDistributionImpl3.sample();
        double double18 = poissonDistributionImpl3.probability(0.0d);
        double double20 = poissonDistributionImpl3.probability(0.6150373563537195d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "52) test1323(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 1, 0, 0, 2, 0, 1, 2, 1, 3 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky "23) test1323(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144233d + "'", double18 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        double double14 = poissonDistributionImpl3.cumulativeProbability((int) 'a', 2147483647);
        int int16 = poissonDistributionImpl3.getDomainLowerBound((double) (-1));
        int int18 = poissonDistributionImpl3.getDomainUpperBound((double) 24);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = poissonDistributionImpl3.inverseCumulativeProbability((double) 100);
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
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4');
        int int2 = poissonDistributionImpl1.sample();
        int int3 = poissonDistributionImpl1.sample();
// flaky "53) test1325(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
// flaky "24) test1325(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(4.560969057281241E-69d);
        double double5 = poissonDistributionImpl1.probability(0.0030656620097619935d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 44, 4.719682636442159E-60d);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.9999999999999997d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 107 + "'", int4 == 107);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (short) 1);
        double double8 = poissonDistributionImpl2.normalApproximateProbability((int) '#');
        double double10 = poissonDistributionImpl2.probability(38);
        int int11 = poissonDistributionImpl2.sample();
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "54) test1328(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 31 });
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.533676680517062d + "'", double8 == 0.533676680517062d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.05698471084507295d + "'", double10 == 0.05698471084507295d);
// flaky "25) test1328(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37 + "'", int11 == 37);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, 0.6321205588285574d);
        double double3 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability(0.6150373563537195d, 0.36787943195528694d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8160602794142788d + "'", double3 == 0.8160602794142788d);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', 0.19699216367798777d, 88);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, 0.8160602794142788d, 2);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        poissonDistributionImpl3.reseedRandomGenerator((long) 28);
        double double10 = poissonDistributionImpl3.cumulativeProbability(43, 2146192320);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        int int17 = poissonDistributionImpl3.getDomainUpperBound((double) 100);
        poissonDistributionImpl3.reseedRandomGenerator((long) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 102, (-1));
        int int4 = poissonDistributionImpl2.getDomainUpperBound(0.25464638152708935d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) 105);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.308537538725987d);
        int int5 = poissonDistributionImpl2.sample();
        int int7 = poissonDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6391624183905688d + "'", double4 == 0.6391624183905688d);
// flaky "26) test1334(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 38, 3.57198604755006E-167d);
        double double5 = poissonDistributionImpl2.cumulativeProbability(1.17246204865673E-37d, (double) 34);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(0.3678794411123646d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.29140699867905834d + "'", double5 == 0.29140699867905834d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability((int) ' ');
        double double16 = poissonDistributionImpl3.cumulativeProbability(24);
        double double18 = poissonDistributionImpl3.probability((int) (short) 10);
        java.lang.Class<?> wildcardClass19 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0137771196302933E-7d + "'", double18 == 1.0137771196302933E-7d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.941866060050443E-159d, 0.06680720126885803d, 0);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f);
        int[] intArray12 = poissonDistributionImpl3.sample(23);
        double double14 = poissonDistributionImpl3.cumulativeProbability(4.2913989097407664E-60d);
        int int15 = poissonDistributionImpl3.sample();
        java.lang.Class<?> wildcardClass16 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999907838444d + "'", double10 == 0.9999999907838444d);
        org.junit.Assert.assertNotNull(intArray12);
// flaky "55) test1338(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 1, 1, 1, 0, 2, 2, 3, 1, 3, 1, 0, 1, 2, 4, 2, 0, 0, 1, 3, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6321205588285574d + "'", double14 == 0.6321205588285574d);
// flaky "5) test1338(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.8785349352299523E-28d, 0.025956482467509034d);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.2198466942977575E-12d, 3.2093315791106567E-171d);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        poissonDistributionImpl3.reseedRandomGenerator((long) 3);
        double double14 = poissonDistributionImpl3.cumulativeProbability(0.0d, (double) 2146192320);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainLowerBound(97.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d, 24);
        double double5 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10, 106);
        double double7 = poissonDistributionImpl2.probability(1.01377703554215E-7d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.958833674910238E-12d + "'", double5 == 8.958833674910238E-12d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double9 = poissonDistributionImpl3.getMean();
        int int11 = poissonDistributionImpl3.getDomainLowerBound(10.0d);
        double double12 = poissonDistributionImpl3.getMean();
        int int14 = poissonDistributionImpl3.getDomainUpperBound((double) 36);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.457712003500205E-9d, 41);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.3678794411123646d);
        int int6 = poissonDistributionImpl2.getDomainLowerBound(0.06680720126885803d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.999999992542288d + "'", double4 == 0.999999992542288d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double13 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double15 = poissonDistributionImpl3.cumulativeProbability(10000000);
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(0.8160602794142788d);
        int[] intArray19 = poissonDistributionImpl3.sample(37);
        int int21 = poissonDistributionImpl3.getDomainLowerBound(3.2093315791106567E-171d);
        int int22 = poissonDistributionImpl3.sample();
        int int24 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double26 = poissonDistributionImpl3.probability((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.691462461274013d + "'", double13 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
// flaky "27) test1346(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0137771196302933E-7d + "'", double26 == 1.0137771196302933E-7d);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(52.0d, (int) (short) 1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 'a');
        double double6 = poissonDistributionImpl2.normalApproximateProbability(16);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.2621516760377176E-7d + "'", double6 == 4.2621516760377176E-7d);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d);
        double double3 = poissonDistributionImpl1.cumulativeProbability(32);
        double double6 = poissonDistributionImpl1.cumulativeProbability(24, 33);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0137771200291468E-7d, 1.0040290630831367E-103d, 2147483647);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainLowerBound((double) (-1));
        double double8 = poissonDistributionImpl3.cumulativeProbability(4.560969057281241E-69d, (double) 34);
        double double10 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.sample();
        int int13 = poissonDistributionImpl3.getDomainUpperBound(3.1627334188024467E-75d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.999778782798785E-13d + "'", double8 == 9.999778782798785E-13d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8345580221844533d, 41);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(6.305116760146996E-16d);
        poissonDistributionImpl2.reseedRandomGenerator(0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, 3.720075976020836E-44d);
        double double5 = poissonDistributionImpl2.cumulativeProbability((int) (byte) -1, 11);
        int[] intArray7 = poissonDistributionImpl2.sample(10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0457262607030534E-29d + "'", double5 == 1.0457262607030534E-29d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "56) test1352(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 87, 96, 82, 104, 101, 101, 102, 97, 103, 95 });
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        double double25 = poissonDistributionImpl3.probability(0.028444728018643173d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.139132792048018E-17d);
        double double3 = poissonDistributionImpl1.probability(11);
        int int5 = poissonDistributionImpl1.getDomainLowerBound(0.5578297452874029d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.307197512236221E-190d + "'", double3 == 7.307197512236221E-190d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9652365304395534d, 27);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(35);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double15 = poissonDistributionImpl3.probability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double18 = poissonDistributionImpl3.cumulativeProbability((double) 33, (double) (short) -1);
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
        org.junit.Assert.assertNotNull(intArray13);
// flaky "28) test1356(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.8243984514608465E-153d + "'", double15 == 3.8243984514608465E-153d);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9846716899511899d, (int) (short) 100);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.40894881836993996d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1);
        double double3 = poissonDistributionImpl1.probability((int) (byte) 10);
        int[] intArray5 = poissonDistributionImpl1.sample(3);
        int int7 = poissonDistributionImpl1.inverseCumulativeProbability(0.999999992542288d);
        double double9 = poissonDistributionImpl1.probability(0.18393972058572114d);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0137771196302933E-7d + "'", double3 == 1.0137771196302933E-7d);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "57) test1358(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 0, 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.cumulativeProbability(0.9386867598047597d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl3.cumulativeProbability(7.186804141704334E-276d, 5.907792072437627E-11d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "29) test1359(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6321205588285574d + "'", double9 == 0.6321205588285574d);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(52.0d, (double) (byte) -1, 15);
        double double5 = poissonDistributionImpl3.normalApproximateProbability((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl3.cumulativeProbability(0.6922006339347749d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 52");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.2518874825673265E-12d + "'", double5 == 1.2518874825673265E-12d);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.720075976020836E-44d);
        int int2 = poissonDistributionImpl1.sample();
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (int) (byte) -1);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(4.160702826336122E-32d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(106, 104);
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
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.8243984514608465E-153d, (int) (byte) 10);
        poissonDistributionImpl2.reseedRandomGenerator((long) 2147483647);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(1.7401052582713831E-47d);
        int int8 = poissonDistributionImpl2.getDomainLowerBound(0.17390895361798006d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        int int16 = poissonDistributionImpl3.getDomainUpperBound((double) (byte) 1);
        int int17 = poissonDistributionImpl3.sample();
        int int19 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
// flaky "58) test1364(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.560969057281241E-69d, 0.5259020955950889d, 95);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability((int) ' ');
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(0.29140699867905834d);
        double double18 = poissonDistributionImpl3.cumulativeProbability(0.9997803485788277d);
        int[] intArray20 = poissonDistributionImpl3.sample(43);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6321205588285574d + "'", double18 == 0.6321205588285574d);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(0.691462461274013d);
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 10);
        double double22 = poissonDistributionImpl3.cumulativeProbability(11, 100);
        java.lang.Class<?> wildcardClass23 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "6) test1367(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999907838444d + "'", double19 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 9.216155616442734E-9d + "'", double22 == 9.216155616442734E-9d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl2.cumulativeProbability(0.25464638152708935d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 100");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        // The following exception was thrown during execution in test generation
        try {
            double double24 = poissonDistributionImpl3.cumulativeProbability(100, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6321205588285574d + "'", double19 == 0.6321205588285574d);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 0, 0, 1, 2, 0, 2, 2, 0, 1, 0, 2, 0, 1, 0, 1, 1, 1, 1, 1, 2, 1, 1, 2 });
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) (short) -1);
        double double13 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 10L);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.36787943195528694d + "'", double13 == 0.36787943195528694d);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 38, 3.57198604755006E-167d);
        double double5 = poissonDistributionImpl2.cumulativeProbability(1.17246204865673E-37d, (double) 34);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl2.cumulativeProbability(1.1173711675821023E-12d, 3.720075976020836E-44d);
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
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(8.958833674910238E-12d);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 37, 0);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(8.322102657191705E-4d, (double) 95);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability((double) (-1.0f), (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3678794445618948d, (-1));
        double double4 = poissonDistributionImpl2.normalApproximateProbability(29);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 73);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(44);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 100);
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        double double14 = poissonDistributionImpl3.probability(32);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 10);
        double double18 = poissonDistributionImpl3.probability(1);
        double double20 = poissonDistributionImpl3.probability((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.3980856271290693E-36d + "'", double14 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144233d + "'", double18 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.36787944117144233d + "'", double20 == 0.36787944117144233d);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, (double) (byte) -1, 30);
        poissonDistributionImpl3.reseedRandomGenerator(100L);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', 2.170057723151973E-33d, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability(7.307197512236221E-190d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 32");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.560969057281241E-69d, (double) '4', (int) 'a');
        poissonDistributionImpl3.reseedRandomGenerator(1L);
        poissonDistributionImpl3.reseedRandomGenerator((long) 31);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = poissonDistributionImpl3.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.999778782798785E-13d, (double) 100L);
        double double4 = poissonDistributionImpl2.probability(0.8430188007045427d);
        int int5 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d);
        poissonDistributionImpl1.reseedRandomGenerator((long) 41);
        double double5 = poissonDistributionImpl1.probability((double) 23);
        int int7 = poissonDistributionImpl1.getDomainLowerBound(100.0d);
        int int9 = poissonDistributionImpl1.getDomainUpperBound(0.0d);
        double double12 = poissonDistributionImpl1.cumulativeProbability(0, 43);
        double double14 = poissonDistributionImpl1.normalApproximateProbability((int) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.7476693956635508E-33d + "'", double5 == 2.7476693956635508E-33d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability(3.8243984514608465E-153d);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.062340213690675E-8d, (double) (short) 10);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(9);
        int int6 = poissonDistributionImpl2.getDomainUpperBound(4.2913989097407664E-60d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainLowerBound(100.0d);
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        double double18 = poissonDistributionImpl3.normalApproximateProbability(34);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = poissonDistributionImpl3.cumulativeProbability(0.6321205588285574d, 0.25464638152708935d);
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
// flaky "30) test1385(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.probability(1.0d);
        double double13 = poissonDistributionImpl3.normalApproximateProbability(2);
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) '#');
        double double17 = poissonDistributionImpl3.cumulativeProbability(36);
        double double19 = poissonDistributionImpl3.cumulativeProbability(4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.36787944117144233d + "'", double11 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9331927987311419d + "'", double13 == 0.9331927987311419d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.996934337990238d + "'", double19 == 0.996934337990238d);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', (int) (byte) 1);
        int int3 = poissonDistributionImpl2.sample();
        int int4 = poissonDistributionImpl2.sample();
        double double6 = poissonDistributionImpl2.probability(5);
        int[] intArray8 = poissonDistributionImpl2.sample((int) ' ');
// flaky "59) test1387(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
// flaky "31) test1387(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 83 + "'", int4 == 83);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.347030737638007E-35d + "'", double6 == 5.347030737638007E-35d);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1.0f), 1.4076594357809174E-73d, 9);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(8.781633496103664E-142d);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        double double11 = poissonDistributionImpl3.cumulativeProbability(0.6321205588285574d, (double) 100L);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int15 = poissonDistributionImpl3.getDomainUpperBound((double) (byte) 1);
        double double16 = poissonDistributionImpl3.getMean();
        double double18 = poissonDistributionImpl3.probability((double) 107);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "60) test1390(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.36787944117144256d + "'", double11 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.9993753075800303E-173d + "'", double18 == 2.9993753075800303E-173d);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 105, (double) 15);
        int[] intArray4 = poissonDistributionImpl2.sample(38);
        double double6 = poissonDistributionImpl2.probability(107);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03781461598070298d + "'", double6 == 0.03781461598070298d);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 3, (double) 38);
        int[] intArray4 = poissonDistributionImpl2.sample(73);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.2518874825673265E-12d, 82);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double14 = poissonDistributionImpl3.cumulativeProbability((double) (short) 0, (double) 'a');
        double double16 = poissonDistributionImpl3.probability((double) (-1L));
        double double18 = poissonDistributionImpl3.normalApproximateProbability(103);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int5 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 98);
        org.junit.Assert.assertNotNull(intArray4);
// flaky "32) test1395(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.941866060050443E-159d);
        poissonDistributionImpl1.reseedRandomGenerator((long) 32);
        int int5 = poissonDistributionImpl1.getDomainLowerBound(0.3525511311226325d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.probability(0.36787944117144233d);
        int int17 = poissonDistributionImpl3.getDomainLowerBound(0.1251100357211333d);
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) 'a');
        poissonDistributionImpl3.reseedRandomGenerator((long) '#');
        poissonDistributionImpl3.reseedRandomGenerator((long) 102);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "33) test1397(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(99);
        int[] intArray5 = poissonDistributionImpl1.sample((int) ' ');
        double double7 = poissonDistributionImpl1.cumulativeProbability(1.4230202807276707E-23d);
        double double9 = poissonDistributionImpl1.probability(110);
        double double11 = poissonDistributionImpl1.probability(0.05956661497600297d);
        double double14 = poissonDistributionImpl1.cumulativeProbability(28, 34);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.17246204865673E-37d, 73);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0137743067240024E-7d, 4.219851480312614E-12d, 24);
        double double4 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0137743067240024E-7d + "'", double4 == 1.0137743067240024E-7d);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability(3.8243984514608465E-153d);
        double double11 = poissonDistributionImpl3.cumulativeProbability(1.7401052582713831E-47d);
        double double13 = poissonDistributionImpl3.probability(106);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6321205588285574d + "'", double11 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.2093315791106567E-171d + "'", double13 == 3.2093315791106567E-171d);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06161675254888723d, 0.9999998986222932d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(1.4222929602677774E-229d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9402803946842729d + "'", double4 == 0.9402803946842729d);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d);
        double double3 = poissonDistributionImpl1.probability((double) 100);
        double double5 = poissonDistributionImpl1.probability(0.07034028736850317d);
        double double6 = poissonDistributionImpl1.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.043845779425746E-168d + "'", double3 == 7.043845779425746E-168d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8160602794142788d + "'", double6 == 0.8160602794142788d);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787943195528694d, 3.941866060050443E-159d, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, 36);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 1L);
        double double14 = poissonDistributionImpl3.probability(3);
        poissonDistributionImpl3.reseedRandomGenerator((long) 5);
        int int17 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "61) test1405(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06131324019524039d + "'", double14 == 0.06131324019524039d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.680129694168893E-10d, 10.0d);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 32);
        poissonDistributionImpl2.reseedRandomGenerator((long) ' ');
        double double6 = poissonDistributionImpl2.cumulativeProbability(0.9999999907838444d);
        int[] intArray8 = poissonDistributionImpl2.sample(93);
        double double10 = poissonDistributionImpl2.normalApproximateProbability(26);
        int int11 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.139132792048018E-17d + "'", double6 == 3.139132792048018E-17d);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.03105243133179786d + "'", double10 == 0.03105243133179786d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999546000702375d, 38);
        double double4 = poissonDistributionImpl2.probability(28);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2051256383269262E-30d + "'", double4 == 1.2051256383269262E-30d);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3525511311226325d, (double) 44);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, 106);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(1.17246204865673E-37d);
        double double7 = poissonDistributionImpl2.cumulativeProbability(0, 99);
        int int9 = poissonDistributionImpl2.getDomainLowerBound(0.028444728018643173d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        double double9 = poissonDistributionImpl3.cumulativeProbability(100);
        double double11 = poissonDistributionImpl3.normalApproximateProbability(36);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.2518874825673265E-12d, 6);
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 0);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        double double6 = poissonDistributionImpl2.probability((int) (short) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 31);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.1102230246251565E-16d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(23);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (double) ' ', (int) (short) 100);
        double double5 = poissonDistributionImpl3.probability(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) '#', 38);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.720075976020836E-44d + "'", double5 == 3.720075976020836E-44d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.1173711675821023E-12d + "'", double9 == 1.1173711675821023E-12d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9605336665255937d + "'", double11 == 0.9605336665255937d);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.039860996809147134d, 1.962564426565066E-37d, 37);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, 38.0d, (int) 'a');
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) 38);
        int int6 = poissonDistributionImpl3.sample();
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999999999977743d + "'", double5 == 0.9999999999977743d);
// flaky "62) test1418(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 14 + "'", int6 == 14);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d);
        poissonDistributionImpl1.reseedRandomGenerator((long) 41);
        double double5 = poissonDistributionImpl1.probability((double) 23);
        int int7 = poissonDistributionImpl1.getDomainLowerBound(100.0d);
        int int9 = poissonDistributionImpl1.getDomainUpperBound(0.0d);
        double double12 = poissonDistributionImpl1.cumulativeProbability(0, 43);
        java.lang.Class<?> wildcardClass13 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.7476693956635508E-33d + "'", double5 == 2.7476693956635508E-33d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 105, 4.448081146614204E-6d, 2147483647);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 38, 10.0d, 2147483647);
        int[] intArray5 = poissonDistributionImpl3.sample(34);
        int int6 = poissonDistributionImpl3.sample();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) -1, 52);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "63) test1421(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 44 + "'", int6 == 44);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9960697873735121d + "'", double9 == 0.9960697873735121d);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.2093315791106567E-171d);
        double double3 = poissonDistributionImpl1.probability((int) (byte) 100);
        int int5 = poissonDistributionImpl1.getDomainLowerBound(8.781633496103664E-142d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.probability((int) '4');
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        int int17 = poissonDistributionImpl3.getDomainUpperBound(1.0137771196302933E-7d);
        double double18 = poissonDistributionImpl3.getMean();
        double double21 = poissonDistributionImpl3.cumulativeProbability((double) ' ', 100.0d);
        int int23 = poissonDistributionImpl3.getDomainUpperBound(0.36083758160943114d);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = poissonDistributionImpl3.cumulativeProbability(9.216155638647194E-8d, 7.457712003500205E-9d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.560969057281241E-69d + "'", double13 == 4.560969057281241E-69d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(6.685526970917836E-59d, 44);
        double double4 = poissonDistributionImpl2.probability(15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6922006339347749d);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        int[] intArray13 = poissonDistributionImpl3.sample((int) 'a');
        double double14 = poissonDistributionImpl3.getMean();
        java.lang.Class<?> wildcardClass15 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability((int) ' ');
        int int16 = poissonDistributionImpl3.getDomainUpperBound((double) 1.0f);
        double double18 = poissonDistributionImpl3.probability((int) (byte) 0);
        double double21 = poissonDistributionImpl3.cumulativeProbability(34, 43);
        int[] intArray23 = poissonDistributionImpl3.sample(12);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144233d + "'", double18 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(intArray23);
// flaky "64) test1428(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1, 2, 2, 1, 1, 1, 2, 0, 0, 1, 0, 0 });
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.560969057281241E-69d, 99);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(99);
        int int4 = poissonDistributionImpl1.sample();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 1L);
        double double14 = poissonDistributionImpl3.probability(3);
        poissonDistributionImpl3.reseedRandomGenerator((long) 5);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = poissonDistributionImpl3.cumulativeProbability((double) 37, 4.993992273873336E-4d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "65) test1431(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06131324019524039d + "'", double14 == 0.06131324019524039d);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((int) (byte) -1);
        double double12 = poissonDistributionImpl3.cumulativeProbability(10, 32);
        poissonDistributionImpl3.reseedRandomGenerator((long) 42);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "66) test1432(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771200291468E-7d + "'", double12 == 1.0137771200291468E-7d);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.18393972058572117d, 0.5578297452874029d);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(51);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.1251100357211333d);
        int int5 = poissonDistributionImpl1.getDomainLowerBound(0.0030656618967475464d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.139132792048018E-17d);
        double double3 = poissonDistributionImpl1.probability(11);
        double double6 = poissonDistributionImpl1.cumulativeProbability(11, 24);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.307197512236221E-190d + "'", double3 == 7.307197512236221E-190d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.2518874825673265E-12d, 35);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(10);
        int int7 = poissonDistributionImpl3.getDomainUpperBound(35.0d);
        double double9 = poissonDistributionImpl3.normalApproximateProbability((int) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability(0);
        double double14 = poissonDistributionImpl3.cumulativeProbability(0.01891663740103536d, (double) 10.0f);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "67) test1437(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 1, 0, 0, 1, 2, 0, 0, 0, 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.691462461274013d + "'", double9 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6321205588285574d + "'", double11 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.36787943195528694d + "'", double14 == 0.36787943195528694d);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability((int) ' ');
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(0.29140699867905834d);
        int int17 = poissonDistributionImpl3.sample();
        int int18 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
// flaky "68) test1438(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
// flaky "34) test1438(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        double double4 = poissonDistributionImpl1.getMean();
        double double7 = poissonDistributionImpl1.cumulativeProbability(4.560969057281241E-69d, (double) 99);
        double double9 = poissonDistributionImpl1.cumulativeProbability(0.999999898622288d);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999546000702375d + "'", double7 == 0.9999546000702375d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, 3.57198604755006E-167d);
        double double4 = poissonDistributionImpl2.probability((int) (byte) -1);
        double double7 = poissonDistributionImpl2.cumulativeProbability(5, 5);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0013335812360537602d + "'", double7 == 0.0013335812360537602d);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 14, 0.8345580221844533d, (int) (byte) 0);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2520179332262523d + "'", double5 == 0.2520179332262523d);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.999778782798785E-13d, 0.7156847426216517d, 0);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, (double) (byte) -1, 3);
        int[] intArray5 = poissonDistributionImpl3.sample((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "69) test1443(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 7 });
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainLowerBound((double) (short) 1);
        int int7 = poissonDistributionImpl2.sample();
        double double9 = poissonDistributionImpl2.normalApproximateProbability(2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "70) test1444(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.9701958953177723E-8d + "'", double9 == 1.9701958953177723E-8d);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        java.lang.Class<?> wildcardClass24 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability(100);
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(0.6321205588285574d);
        double double18 = poissonDistributionImpl3.probability((int) '#');
        int[] intArray20 = poissonDistributionImpl3.sample(100);
        int[] intArray22 = poissonDistributionImpl3.sample(100);
        double double25 = poissonDistributionImpl3.cumulativeProbability(0.6150373563537195d, (double) 100L);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.5601874895062087E-41d + "'", double18 == 3.5601874895062087E-41d);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.36787944117144256d + "'", double25 == 0.36787944117144256d);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 106, 0.06680720126885803d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 44);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.033719554105805E-46d, 3.115285807098189E-13d);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 31);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.043845779425746E-168d, (double) 37);
        double double4 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.999999992542288d);
        double double2 = poissonDistributionImpl1.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.999999992542288d + "'", double2 == 0.999999992542288d);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d, 104);
        double double5 = poissonDistributionImpl2.cumulativeProbability(23, 10000000);
        int int7 = poissonDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        double double4 = poissonDistributionImpl1.getMean();
        int int6 = poissonDistributionImpl1.getDomainLowerBound(0.9999999999977743d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl1.cumulativeProbability((int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.probability((int) '4');
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        int int17 = poissonDistributionImpl3.getDomainUpperBound(1.0137771196302933E-7d);
        double double18 = poissonDistributionImpl3.getMean();
        double double21 = poissonDistributionImpl3.cumulativeProbability((double) ' ', 100.0d);
        int int23 = poissonDistributionImpl3.getDomainUpperBound((double) 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.560969057281241E-69d + "'", double13 == 4.560969057281241E-69d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.993992273873336E-4d);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.007566654960414148d, 2.9248445663341396E-10d, 110);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        double double4 = poissonDistributionImpl1.getMean();
        int int6 = poissonDistributionImpl1.getDomainLowerBound((double) 91);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.probability((int) '4');
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        int int17 = poissonDistributionImpl3.getDomainUpperBound(1.0137771196302933E-7d);
        double double18 = poissonDistributionImpl3.getMean();
        double double21 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 46);
        int int23 = poissonDistributionImpl3.getDomainUpperBound(1.2518874825673265E-12d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.560969057281241E-69d + "'", double13 == 4.560969057281241E-69d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.36787944117144256d + "'", double21 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8345580221844533d, 0.0d);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 37, 0.25464638004358264d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(36, (int) (short) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, 38.0d, (int) 'a');
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        double double7 = poissonDistributionImpl3.probability((double) (-1));
        double double9 = poissonDistributionImpl3.probability(4);
        double double10 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) 43);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.539992976248491E-5d + "'", double5 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.01891663740103536d + "'", double9 == 0.01891663740103536d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.05698471084507295d, 35);
        double double4 = poissonDistributionImpl2.cumulativeProbability(105);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 38);
        int[] intArray8 = poissonDistributionImpl2.sample(32);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(99);
        int[] intArray5 = poissonDistributionImpl1.sample((int) ' ');
        double double7 = poissonDistributionImpl1.normalApproximateProbability(35);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        poissonDistributionImpl3.reseedRandomGenerator((long) 37);
        double double28 = poissonDistributionImpl3.normalApproximateProbability(43);
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
// flaky "71) test1463(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
// flaky "35) test1463(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        double double4 = poissonDistributionImpl3.getMean();
        int[] intArray6 = poissonDistributionImpl3.sample(29);
        double double8 = poissonDistributionImpl3.probability(1.874213734312014E-145d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-12d + "'", double4 == 1.0E-12d);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        double double27 = poissonDistributionImpl3.probability(0.03781461598070298d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "72) test1465(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.06131324019524039d + "'", double25 == 0.06131324019524039d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3980856271290693E-36d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.0d);
        double double5 = poissonDistributionImpl1.cumulativeProbability(5.628682978044818E-21d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a');
        double double4 = poissonDistributionImpl1.cumulativeProbability((int) (byte) -1, 3);
        int int6 = poissonDistributionImpl1.inverseCumulativeProbability(0.0d);
        double double8 = poissonDistributionImpl1.cumulativeProbability(11);
        poissonDistributionImpl1.reseedRandomGenerator((long) 104);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.17246204865673E-37d + "'", double4 == 1.17246204865673E-37d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.5080394273921536E-28d + "'", double8 == 1.5080394273921536E-28d);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, 0.25464638152708935d, (int) (byte) 10);
        int int5 = poissonDistributionImpl3.getDomainLowerBound(1.7401052582713831E-47d);
        double double7 = poissonDistributionImpl3.probability(4.448081146614204E-6d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double18 = poissonDistributionImpl3.getMean();
        int[] intArray20 = poissonDistributionImpl3.sample(38);
        double double22 = poissonDistributionImpl3.normalApproximateProbability(28);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "73) test1469(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(3);
        double double10 = poissonDistributionImpl2.probability(3.139132792048018E-17d);
        double double12 = poissonDistributionImpl2.normalApproximateProbability(0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.062340213690675E-8d + "'", double8 == 5.062340213690675E-8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.7455062667769425E-9d + "'", double12 == 2.7455062667769425E-9d);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.9606298142722176E-69d, 1.874213734312014E-145d);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787943195528694d, 3.941866060050443E-159d, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 10, 15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        poissonDistributionImpl3.reseedRandomGenerator((long) 12);
        int int15 = poissonDistributionImpl3.getDomainUpperBound((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int int17 = poissonDistributionImpl3.getDomainLowerBound(0.36787944117144256d);
        int int18 = poissonDistributionImpl3.sample();
        poissonDistributionImpl3.reseedRandomGenerator((long) 16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6321205588285574d, 0.039860996809147134d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(2);
        double double6 = poissonDistributionImpl2.cumulativeProbability(0.007566654960414148d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9736445389005101d + "'", double4 == 0.9736445389005101d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5319622942224367d + "'", double6 == 0.5319622942224367d);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a');
        double double4 = poissonDistributionImpl1.cumulativeProbability((int) (byte) -1, 3);
        int int6 = poissonDistributionImpl1.inverseCumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl1.cumulativeProbability(28, (int) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.17246204865673E-37d + "'", double4 == 1.17246204865673E-37d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double13 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double15 = poissonDistributionImpl3.cumulativeProbability(10000000);
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(0.8160602794142788d);
        double double18 = poissonDistributionImpl3.getMean();
        double double20 = poissonDistributionImpl3.probability(5);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = poissonDistributionImpl3.inverseCumulativeProbability((double) 6);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.691462461274013d + "'", double13 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0030656620097620196d + "'", double20 == 0.0030656620097620196d);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.88940969307282E-43d, (double) 1, 41);
        poissonDistributionImpl3.reseedRandomGenerator((long) 32);
        double double8 = poissonDistributionImpl3.cumulativeProbability(50, 94);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(0.1251100357211333d);
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double21 = poissonDistributionImpl3.cumulativeProbability((double) (byte) 0);
        double double24 = poissonDistributionImpl3.cumulativeProbability(0.0030656618967475464d, (double) 33);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6321205588285574d + "'", double19 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.6321205588285574d + "'", double21 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.36787944117144256d + "'", double24 == 0.36787944117144256d);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.18393972058572114d);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(0.1251100357211333d);
        double double19 = poissonDistributionImpl3.cumulativeProbability(3);
        double double22 = poissonDistributionImpl3.cumulativeProbability(4, 32);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9846716899511899d + "'", double19 == 0.9846716899511899d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.015328310048810079d + "'", double22 == 0.015328310048810079d);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.028861154135454092d);
        int int3 = poissonDistributionImpl1.getDomainLowerBound((double) 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.probability(0.36787944117144233d);
        double double17 = poissonDistributionImpl3.probability(4.5399929762484854E-5d);
        int int18 = poissonDistributionImpl3.sample();
        double double20 = poissonDistributionImpl3.probability(100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "36) test1483(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
// flaky "7) test1483(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.941866060050443E-159d + "'", double20 == 3.941866060050443E-159d);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d, 100);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.06131324019524039d);
        double double6 = poissonDistributionImpl2.probability(0.039860996809147134d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.cumulativeProbability(9.216155638647194E-8d);
        double double14 = poissonDistributionImpl3.cumulativeProbability(2);
        int int16 = poissonDistributionImpl3.getDomainLowerBound(1.17246204865673E-37d);
        poissonDistributionImpl3.reseedRandomGenerator((long) 94);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6321205588285574d + "'", double12 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9386867598047597d + "'", double14 == 0.9386867598047597d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(10);
        int int7 = poissonDistributionImpl3.getDomainLowerBound(5.628682978044818E-21d);
        double double8 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) 24);
        int int12 = poissonDistributionImpl3.getDomainLowerBound(0.9846716899511899d);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "74) test1486(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 2, 1, 1, 1, 0, 1, 2, 1, 0 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', (int) (byte) 1);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability(4.291633944458635E-10d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 32");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int[] intArray17 = poissonDistributionImpl3.sample((int) 'a');
        double double19 = poissonDistributionImpl3.cumulativeProbability(104);
        java.lang.Class<?> wildcardClass20 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.88940969307282E-43d, (double) 1, 41);
        int int4 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        double double10 = poissonDistributionImpl3.probability(95);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "75) test1490(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.561279838000423E-149d + "'", double10 == 3.561279838000423E-149d);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.probability(104);
        double double22 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f, (double) 15);
        int int23 = poissonDistributionImpl3.sample();
        int int25 = poissonDistributionImpl3.inverseCumulativeProbability(0.9960697873735121d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "37) test1491(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.57198604755006E-167d + "'", double19 == 3.57198604755006E-167d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0137769446139089E-7d + "'", double22 == 1.0137769446139089E-7d);
// flaky "76) test1491(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(10);
        int int7 = poissonDistributionImpl3.getDomainUpperBound(35.0d);
        double double9 = poissonDistributionImpl3.normalApproximateProbability((int) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability(0);
        int int13 = poissonDistributionImpl3.getDomainUpperBound(0.3678794411123646d);
        double double16 = poissonDistributionImpl3.cumulativeProbability(8.322102657191705E-4d, (double) 10.0f);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "77) test1492(org.apache.commons.math.distribution.RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 0, 0, 3, 0, 0, 0, 2, 2, 0 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.691462461274013d + "'", double9 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6321205588285574d + "'", double11 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.36787943195528694d + "'", double16 == 0.36787943195528694d);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.631895849694923E-44d, (int) (short) 0);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d, (double) (-1), 0);
        double double4 = poissonDistributionImpl3.getMean();
        int int6 = poissonDistributionImpl3.getDomainUpperBound((double) 30);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.36787944117144233d + "'", double4 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 102, 0.3525511311226325d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(51);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7491967533898295E-8d + "'", double4 == 1.7491967533898295E-8d);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        double double16 = poissonDistributionImpl3.cumulativeProbability((int) '4');
        int int18 = poissonDistributionImpl3.getDomainLowerBound(0.9999966023268753d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        double double9 = poissonDistributionImpl3.cumulativeProbability((double) 30);
        int[] intArray11 = poissonDistributionImpl3.sample(26);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        double double8 = poissonDistributionImpl3.getMean();
        int[] intArray10 = poissonDistributionImpl3.sample(36);
        double double12 = poissonDistributionImpl3.cumulativeProbability(80);
        double double14 = poissonDistributionImpl3.probability(12);
        double double15 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.680129694168893E-10d + "'", double14 == 7.680129694168893E-10d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.139132792048018E-17d, 4.291633944458635E-10d, 106);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06186911463179348d);
    }
}
