package org.apache.commons.math.distribution;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3869009421120585E-33d, 99);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        int int8 = poissonDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = poissonDistributionImpl2.normalApproximateProbability(24);
        int int12 = poissonDistributionImpl2.getDomainLowerBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = poissonDistributionImpl2.cumulativeProbability(46, 36);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.03796348149127876d + "'", double10 == 0.03796348149127876d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainUpperBound(4.560969057281241E-69d);
        int[] intArray16 = poissonDistributionImpl3.sample(3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "1) test0503(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(intArray16);
// flaky "1) test0503(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 2, 0 });
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        double double25 = poissonDistributionImpl3.cumulativeProbability(37);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = poissonDistributionImpl3.sample((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.25464638004358264d);
        double double2 = poissonDistributionImpl1.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl1.cumulativeProbability(1.4230202807276707E-23d, 0.9999999907838444d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25464638004358264d + "'", double2 == 0.25464638004358264d);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.4421702547125971d, 2.7455062667769425E-9d);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(4.5399929762484845E-4d);
        int int17 = poissonDistributionImpl3.sample();
        int int19 = poissonDistributionImpl3.getDomainUpperBound(6.305116760146996E-16d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
// flaky "2) test0507(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = poissonDistributionImpl1.sample((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double9 = poissonDistributionImpl3.getMean();
        double double11 = poissonDistributionImpl3.cumulativeProbability(10000000);
        int int13 = poissonDistributionImpl3.getDomainLowerBound(0.999999999954943d);
        int int15 = poissonDistributionImpl3.getDomainUpperBound(0.9999999999999825d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = poissonDistributionImpl3.cumulativeProbability(1.2460656213271568E-39d, 7.457712003500205E-9d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, (double) (byte) -1, 3);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((double) 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3980856271290693E-36d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.0d);
        double double4 = poissonDistributionImpl1.getMean();
        double double6 = poissonDistributionImpl1.cumulativeProbability((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.3980856271290693E-36d + "'", double4 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
        double double30 = poissonDistributionImpl3.cumulativeProbability((int) '#', (int) (short) 100);
        double double31 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "3) test0512(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.06131324019524039d + "'", double25 == 0.06131324019524039d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.36787944117144233d + "'", double27 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) 2);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.9386867598047597d);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (short) 1, 14);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = poissonDistributionImpl2.inverseCumulativeProbability((double) 24);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9652365304395534d + "'", double7 == 0.9652365304395534d);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, 99);
        double double4 = poissonDistributionImpl2.cumulativeProbability(23);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06680720126885803d, 4.719682636442159E-60d);
        double double5 = poissonDistributionImpl2.cumulativeProbability(29, 110);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int4 = poissonDistributionImpl3.sample();
        double double5 = poissonDistributionImpl3.getMean();
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10L);
        double double8 = poissonDistributionImpl3.getMean();
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (byte) 0, 4.793034378392443E-7d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-12d + "'", double5 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-12d + "'", double8 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.999999999999d + "'", double11 == 0.999999999999d);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.011604342211143792d);
        double double2 = poissonDistributionImpl1.getMean();
        int int3 = poissonDistributionImpl1.sample();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011604342211143792d + "'", double2 == 0.011604342211143792d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int16 = poissonDistributionImpl3.sample();
        double double18 = poissonDistributionImpl3.probability(0.0d);
        double double21 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "4) test0518(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1, 1, 1, 0, 3, 0, 0, 2, 0, 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky "2) test0518(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144233d + "'", double18 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.6321205588285574d + "'", double21 == 0.6321205588285574d);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        int int10 = poissonDistributionImpl3.getDomainLowerBound(10.0d);
        int int11 = poissonDistributionImpl3.sample();
        double double13 = poissonDistributionImpl3.probability(4.793034378392443E-7d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "5) test0519(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double11 = poissonDistributionImpl3.getMean();
        double double14 = poissonDistributionImpl3.cumulativeProbability(38, 10000000);
        int int16 = poissonDistributionImpl3.getDomainLowerBound(0.18393972058572114d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6321205588285574d + "'", double10 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        int int15 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 35);
        double double20 = poissonDistributionImpl3.cumulativeProbability(3.941866060050443E-159d);
        int int22 = poissonDistributionImpl3.getDomainUpperBound(0.3678794445618948d);
        double double24 = poissonDistributionImpl3.cumulativeProbability(0.5429999234951242d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6321205588285574d + "'", double20 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6321205588285574d + "'", double24 == 0.6321205588285574d);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        poissonDistributionImpl3.reseedRandomGenerator((long) 10);
        double double11 = poissonDistributionImpl3.probability(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "6) test0522(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 3 });
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        int int17 = poissonDistributionImpl3.getDomainUpperBound(4.5399929762484854E-5d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        double double16 = poissonDistributionImpl3.normalApproximateProbability((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double19 = poissonDistributionImpl3.cumulativeProbability((double) 43, (double) 1L);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3980856271290628E-36d);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        double double14 = poissonDistributionImpl3.probability((int) (short) -1);
        double double15 = poissonDistributionImpl3.getMean();
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "7) test0526(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability(100);
        int int16 = poissonDistributionImpl3.getDomainUpperBound(100.0d);
        int[] intArray18 = poissonDistributionImpl3.sample(12);
        double double20 = poissonDistributionImpl3.probability(15);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(intArray18);
// flaky "8) test0527(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 1, 2, 0, 4, 0, 0, 0, 1, 1, 1, 1 });
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.813234320208393E-13d + "'", double20 == 2.813234320208393E-13d);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = poissonDistributionImpl3.inverseCumulativeProbability((double) 'a');
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
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = poissonDistributionImpl3.cumulativeProbability((double) 24, 0.6922006275553462d);
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
// flaky "9) test0529(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
// flaky "3) test0529(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0d, 3);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(99, 36);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', 0.06131324019524039d, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(2.8133051444001467E-13d, 2.9552158909873505E-5d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        int[] intArray8 = poissonDistributionImpl2.sample(106);
        int int10 = poissonDistributionImpl2.getDomainLowerBound((double) 34);
        java.lang.Class<?> wildcardClass11 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (int) '4');
        double double4 = poissonDistributionImpl2.probability(7.457712003500205E-9d);
        double double7 = poissonDistributionImpl2.cumulativeProbability(2, 99);
        double double10 = poissonDistributionImpl2.cumulativeProbability(0.06161675254888723d, (double) 44);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.19699216367798777d + "'", double7 == 0.19699216367798777d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5578297452874029d + "'", double10 == 0.5578297452874029d);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7596379528070493E-10d, (double) 99, 30);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(1.7401052582713831E-47d, 4.018416977195786E-54d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.308537538725987d, 106);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 100, 80);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int int14 = poissonDistributionImpl3.getDomainLowerBound(0.999999999954943d);
        double double15 = poissonDistributionImpl3.getMean();
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) 3);
        java.lang.Class<?> wildcardClass18 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9846716899511899d + "'", double17 == 0.9846716899511899d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3980856271290693E-36d, (double) (short) 10);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(7.875285095517683E-30d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int17 = poissonDistributionImpl3.getDomainLowerBound((double) 3);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = poissonDistributionImpl3.cumulativeProbability(0.3525511311226325d, 0.999999999999d);
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
        org.junit.Assert.assertNotNull(intArray13);
// flaky "10) test0538(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 2, 1, 0, 1, 1, 1, 5, 1, 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability(0.0d, 0.1251100357211333d);
        double double14 = poissonDistributionImpl3.normalApproximateProbability(104);
        double double16 = poissonDistributionImpl3.probability(1.7401052582713831E-47d);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) 29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6321205588285574d + "'", double12 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7476693956635508E-33d, 31);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.680129694168893E-10d, 0.008575364588394788d);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int13 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "1) test0542(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "11) test0542(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) -1, 80);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999999977743d, 0.0d);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int11 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
// flaky "2) test0545(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "3) test0546(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        double double14 = poissonDistributionImpl3.probability(3.8243984514608465E-153d);
        double double16 = poissonDistributionImpl3.cumulativeProbability((double) 'a');
        int[] intArray18 = poissonDistributionImpl3.sample(46);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.631895849694923E-44d, 24);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 100, 0);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.probability(7.033719554105805E-46d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(3.941866060050443E-159d, 3.139132792048018E-17d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.999999999999d, 0.0d, 10);
        int[] intArray5 = poissonDistributionImpl3.sample(44);
        int[] intArray7 = poissonDistributionImpl3.sample(35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.902447399449791E-155d, 13);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(97.0d);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.57198604755006E-167d, (int) '4');
        int int4 = poissonDistributionImpl2.getDomainUpperBound(0.6391624183905688d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0137771200291468E-7d, 3.8243984514608465E-153d);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0137771196302933E-7d, (int) (byte) -1);
        int[] intArray4 = poissonDistributionImpl2.sample(104);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(4.2913989097407664E-60d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5429999234951242d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.533676680517062d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d, 100);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.06131324019524039d);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        double double14 = poissonDistributionImpl3.cumulativeProbability(32);
        int[] intArray16 = poissonDistributionImpl3.sample((int) 'a');
        int int18 = poissonDistributionImpl3.getDomainUpperBound(1.0137771196302933E-7d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "4) test0559(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6426402136161335d, 0.011604342211143792d, 43);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        poissonDistributionImpl3.reseedRandomGenerator((long) 46);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "12) test0561(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        int int13 = poissonDistributionImpl3.inverseCumulativeProbability(9.216155638647194E-8d);
        double double15 = poissonDistributionImpl3.probability(2);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) -1);
        double double18 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.18393972058572114d + "'", double15 == 0.18393972058572114d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.4018914738572114E-169d, 4.719682636442159E-60d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.36787943195528694d);
        double double6 = poissonDistributionImpl2.probability(0.06727319239963177d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3678794445618948d, 2.7596379528070493E-10d);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(7.875285095517683E-30d);
        int int5 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int17 = poissonDistributionImpl3.getDomainLowerBound((double) 3);
        int int19 = poissonDistributionImpl3.getDomainLowerBound(4.925222664969737E-19d);
        double double21 = poissonDistributionImpl3.probability(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "13) test0565(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 1, 1, 0, 1, 1, 1, 1, 0, 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.36787944117144233d + "'", double21 == 0.36787944117144233d);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 43, 6.305116760146989E-16d, 46);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 0, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        int int15 = poissonDistributionImpl3.getDomainUpperBound((double) (-1L));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "5) test0568(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3678794445618948d, 2.7596379528070493E-10d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(31, 15);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, 4.018416977195786E-54d);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 100);
        double double6 = poissonDistributionImpl2.probability(0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.999999999999d + "'", double6 == 0.999999999999d);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        double double9 = poissonDistributionImpl3.cumulativeProbability((double) 30);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl3.cumulativeProbability(1.7401052582713831E-47d, 0.1251100357211333d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, (double) (short) 10);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double6 = poissonDistributionImpl2.probability((double) (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (double) (-1), (-1));
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double6 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability((double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 10");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        int int9 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 38 + "'", int9 == 38);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.probability(0.0d);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) 86);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.36787944117144233d + "'", double10 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (double) (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability((double) 38);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0137771200291468E-7d, (double) (-1));
        double double4 = poissonDistributionImpl2.probability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.1598158774371023E-77d + "'", double4 == 3.1598158774371023E-77d);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double9 = poissonDistributionImpl3.getMean();
        int int11 = poissonDistributionImpl3.getDomainLowerBound(0.6321205588285574d);
        int[] intArray13 = poissonDistributionImpl3.sample(24);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 10, 2);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "14) test0578(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, 1, 1, 1, 1, 3, 0, 4, 1, 0, 0, 3, 1, 1, 1, 2, 0, 0, 1, 1, 2, 1, 0 });
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) -1, 6.305116760146996E-16d, (int) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.999999999954943d, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((double) 104, 0.6391624183905688d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) -1, 0.9846716899511899d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        int int8 = poissonDistributionImpl3.sample();
        double double10 = poissonDistributionImpl3.normalApproximateProbability(34);
        double double12 = poissonDistributionImpl3.probability(30);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
// flaky "15) test0582(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.3869009421120585E-33d + "'", double12 == 1.3869009421120585E-33d);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (double) 0.0f, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(38);
        double double20 = poissonDistributionImpl3.cumulativeProbability((-1), (-1));
        double double23 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 10.0f);
        poissonDistributionImpl3.reseedRandomGenerator((long) 15);
        int int27 = poissonDistributionImpl3.inverseCumulativeProbability(0.36787944117144256d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.36787943195528694d + "'", double23 == 0.36787943195528694d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.021990921302225148d, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(100, (int) 'a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5578297452874029d, 2);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) 'a');
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.9997803485788277d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.1173711675821023E-12d, 4.719682636442159E-60d);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 106, 12);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.062340213690675E-8d);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5429999234951242d, 32);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        double double14 = poissonDistributionImpl3.probability((int) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, 99);
        int[] intArray21 = poissonDistributionImpl3.sample(100);
        int int23 = poissonDistributionImpl3.inverseCumulativeProbability(3.4018914738572114E-169d);
        int int25 = poissonDistributionImpl3.inverseCumulativeProbability(4.793034378392443E-7d);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = poissonDistributionImpl3.inverseCumulativeProbability((double) 31);
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
// flaky "6) test0592(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.631895849694923E-44d, 0.0d);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.4230202807276707E-23d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(29);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(9.999778782798785E-13d);
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        int int20 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6321205588285574d + "'", double19 == 0.6321205588285574d);
// flaky "16) test0595(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6728134305602215E-44d, (int) (byte) 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 23);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability((int) '4', 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        double double9 = poissonDistributionImpl3.normalApproximateProbability((int) '4');
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 100.0f);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, 3.57198604755006E-167d);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(14, 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.115285807098189E-13d + "'", double7 == 3.115285807098189E-13d);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.941866060050443E-159d, 36);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int int17 = poissonDistributionImpl3.getDomainLowerBound(0.36787944117144256d);
        int int18 = poissonDistributionImpl3.sample();
        int int19 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 98);
        double double6 = poissonDistributionImpl2.probability(12);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.448081146614204E-6d + "'", double6 == 4.448081146614204E-6d);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, 9.999778782798785E-13d);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 3, (double) 38);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 1L);
        int int13 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "4) test0604(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "17) test0604(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787943195528694d, 3.941866060050443E-159d, (int) (short) 1);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(2);
        double double7 = poissonDistributionImpl3.probability(37);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl3.cumulativeProbability(0.36083758160943114d, 2.7596379528070493E-10d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9997803485788277d + "'", double5 == 0.9997803485788277d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.2913989097407664E-60d + "'", double7 == 4.2913989097407664E-60d);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.999999999954943d, 34);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, (int) (byte) 1);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(4.018416977195786E-54d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36083758160943114d, (int) (byte) 10);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 0);
        double double13 = poissonDistributionImpl3.probability(0.039860996809147134d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "18) test0610(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 3 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', (int) (byte) 1);
        int int3 = poissonDistributionImpl2.sample();
        int int4 = poissonDistributionImpl2.sample();
        double double6 = poissonDistributionImpl2.probability(5);
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl2.getClass();
// flaky "19) test0611(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 93 + "'", int3 == 93);
// flaky "5) test0611(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.347030737638007E-35d + "'", double6 == 5.347030737638007E-35d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 30, (double) 10000000);
        poissonDistributionImpl2.reseedRandomGenerator((long) 30);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6922006275553462d, 1.1173711675821023E-12d, 99);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.normalApproximateProbability((int) '4');
        java.lang.Class<?> wildcardClass18 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (double) ' ', (int) (short) 100);
        double double5 = poissonDistributionImpl3.probability(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) '#', 38);
        int int10 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.720075976020836E-44d + "'", double5 == 3.720075976020836E-44d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.1173711675821023E-12d + "'", double9 == 1.1173711675821023E-12d);
// flaky "20) test0615(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.probability(0.9999546000702375d);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.457712003500205E-9d + "'", double8 == 7.457712003500205E-9d);
// flaky "21) test0616(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.4230202807276707E-23d, (double) 5);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4230202807276707E-23d + "'", double3 == 1.4230202807276707E-23d);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) '#');
        int int16 = poissonDistributionImpl3.getDomainLowerBound(3.57198604755006E-167d);
        double double18 = poissonDistributionImpl3.cumulativeProbability((int) '4');
        int int20 = poissonDistributionImpl3.getDomainUpperBound(9.999778782798785E-13d);
        double double22 = poissonDistributionImpl3.probability(15);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.813234320208393E-13d + "'", double22 == 2.813234320208393E-13d);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 106);
        poissonDistributionImpl1.reseedRandomGenerator((long) 73);
        double double6 = poissonDistributionImpl1.cumulativeProbability(80, (int) 'a');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.20223062088848806d + "'", double6 == 0.20223062088848806d);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        int int24 = poissonDistributionImpl3.getDomainUpperBound(3.826311454135856E-163d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "22) test0620(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6321205588285574d + "'", double20 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3980856271290693E-36d, (double) (short) 10);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (double) ' ', (int) (short) 100);
        double double5 = poissonDistributionImpl3.probability(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.inverseCumulativeProbability(0.36787944117144233d);
        int[] intArray10 = poissonDistributionImpl3.sample((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.720075976020836E-44d + "'", double5 == 3.720075976020836E-44d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertNotNull(intArray10);
// flaky "23) test0622(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray10, new int[] { 107 });
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 30, (double) 10000000);
        double double4 = poissonDistributionImpl2.probability(0.9846716899511899d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.471972337343043E-43d, 0.6391624183905688d, 36);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = poissonDistributionImpl3.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        int[] intArray5 = poissonDistributionImpl1.sample((int) 'a');
        int int6 = poissonDistributionImpl1.sample();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = poissonDistributionImpl1.inverseCumulativeProbability((double) '4');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "24) test0625(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.025956482467509034d, 0.9353755231673158d);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.025956482467509034d + "'", double3 == 0.025956482467509034d);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability(3.8243984514608465E-153d);
        double double11 = poissonDistributionImpl3.normalApproximateProbability(44);
        double double13 = poissonDistributionImpl3.cumulativeProbability(0.06161675254888723d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6321205588285574d + "'", double13 == 0.6321205588285574d);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability(3.8243984514608465E-153d);
        double double11 = poissonDistributionImpl3.cumulativeProbability(1.7401052582713831E-47d);
        double double13 = poissonDistributionImpl3.cumulativeProbability((double) 10);
        double double15 = poissonDistributionImpl3.normalApproximateProbability(29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6321205588285574d + "'", double11 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999999907838444d + "'", double13 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029285828261849244d, (int) '4');
        double double4 = poissonDistributionImpl2.probability(5.062340213690675E-8d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 0.25464638004358264d, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
        // The following exception was thrown during execution in test generation
        try {
            int int23 = poissonDistributionImpl3.inverseCumulativeProbability((double) 100L);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.06680720126885803d + "'", double17 == 0.06680720126885803d);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        int int12 = poissonDistributionImpl3.getDomainUpperBound((double) 10000000);
        poissonDistributionImpl3.reseedRandomGenerator((long) 80);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "7) test0632(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 44, (int) (short) 10);
        double double4 = poissonDistributionImpl2.probability(1.7401052582713831E-47d);
        double double5 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl2.cumulativeProbability(106, 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 44.0d + "'", double5 == 44.0d);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f);
        poissonDistributionImpl3.reseedRandomGenerator(100L);
        int[] intArray14 = poissonDistributionImpl3.sample((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999907838444d + "'", double10 == 0.9999999907838444d);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, (int) 'a');
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (-1));
        int int6 = poissonDistributionImpl2.sample();
// flaky "8) test0635(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (double) 24);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        double double14 = poissonDistributionImpl3.probability((int) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double19 = poissonDistributionImpl3.cumulativeProbability(41, (int) (byte) 10);
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
// flaky "9) test0637(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        double double24 = poissonDistributionImpl3.cumulativeProbability(99, 10000000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.06680720126885803d + "'", double17 == 0.06680720126885803d);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7401052582713831E-47d, 38);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029285828261849244d, (int) '4');
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (-1L));
        double double6 = poissonDistributionImpl2.cumulativeProbability((double) 5);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999991455d + "'", double6 == 0.9999999999991455d);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        poissonDistributionImpl3.reseedRandomGenerator((long) 12);
        poissonDistributionImpl3.reseedRandomGenerator((long) 13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double18 = poissonDistributionImpl3.cumulativeProbability((int) ' ', 100);
        java.lang.Class<?> wildcardClass19 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "25) test0642(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        double double14 = poissonDistributionImpl3.cumulativeProbability(32);
        double double16 = poissonDistributionImpl3.cumulativeProbability(104);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = poissonDistributionImpl3.cumulativeProbability(1.0E-12d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "10) test0643(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.3013378484179026E-15d);
        double double3 = poissonDistributionImpl1.cumulativeProbability((double) 98);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(32.0d, 0.0030656618967475464d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((double) 1.0f, 0.9331927987311419d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        int int13 = poissonDistributionImpl3.inverseCumulativeProbability(9.216155638647194E-8d);
        int int14 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky "11) test0646(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, 38.0d, (int) 'a');
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = poissonDistributionImpl3.inverseCumulativeProbability((double) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.539992976248491E-5d + "'", double5 == 4.539992976248491E-5d);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        int[] intArray5 = poissonDistributionImpl1.sample((int) 'a');
        int int6 = poissonDistributionImpl1.sample();
        double double8 = poissonDistributionImpl1.probability(0.36787944117146065d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "26) test0648(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        int int16 = poissonDistributionImpl3.getDomainUpperBound((double) (byte) 1);
        double double19 = poissonDistributionImpl3.cumulativeProbability(46, (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.021990921302225148d);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 1L);
        double double14 = poissonDistributionImpl3.probability(3);
        int int16 = poissonDistributionImpl3.getDomainUpperBound((double) 104);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = poissonDistributionImpl3.cumulativeProbability((double) 5, 6.685526970917836E-59d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "27) test0651(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06131324019524039d + "'", double14 == 0.06131324019524039d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.probability(0.36787943195528694d);
        double double14 = poissonDistributionImpl3.cumulativeProbability(0, 3);
        double double16 = poissonDistributionImpl3.cumulativeProbability(97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9846716899511899d + "'", double14 == 0.9846716899511899d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9386867598047597d, 0.0d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 23);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(43, 34);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        int[] intArray26 = poissonDistributionImpl3.sample(23);
        int int28 = poissonDistributionImpl3.getDomainUpperBound((double) '4');
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
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 2, 0, 0, 2, 2, 1, 0, 1, 2, 3, 0, 0, 3, 2, 2, 1, 1, 2, 2, 1, 1, 0, 1 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl2.cumulativeProbability(2.6728134305602215E-44d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9652365304395534d, 86);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9331927987311419d, 4.018416977195786E-54d);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability(32);
        double double16 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = poissonDistributionImpl3.inverseCumulativeProbability((double) 93);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6728134305602215E-44d, (int) (byte) 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 23);
        double double6 = poissonDistributionImpl2.cumulativeProbability((double) 33);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainUpperBound(4.560969057281241E-69d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(1, (int) (short) 10);
        double double19 = poissonDistributionImpl3.cumulativeProbability(0.6391624183905688d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "12) test0660(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.36787943195528694d + "'", double17 == 0.36787943195528694d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6321205588285574d + "'", double19 == 0.6321205588285574d);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3980856271290693E-36d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl1.cumulativeProbability(1.2518874825673265E-12d, 0.0030656618967475464d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, 4.018416977195786E-54d);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(28);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 32, (double) 1L, 43);
        double double6 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 10000000);
        int int8 = poissonDistributionImpl3.getDomainUpperBound(35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.05698471084507295d, 35);
        double double5 = poissonDistributionImpl2.cumulativeProbability(3, (int) (byte) 100);
        double double8 = poissonDistributionImpl2.cumulativeProbability((double) 0L, 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.9552158909873505E-5d + "'", double5 == 2.9552158909873505E-5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.944608511521997d + "'", double8 == 0.944608511521997d);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        double double9 = poissonDistributionImpl3.cumulativeProbability(100);
        double double11 = poissonDistributionImpl3.probability(2147483647);
        int int13 = poissonDistributionImpl3.inverseCumulativeProbability(0.8160602794142788d);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double18 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1, 106);
        double double20 = poissonDistributionImpl3.cumulativeProbability(37);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, 0.5429999234951242d, 36);
        int int5 = poissonDistributionImpl3.getDomainLowerBound(4.539992976248491E-5d);
        int[] intArray7 = poissonDistributionImpl3.sample(97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double14 = poissonDistributionImpl3.cumulativeProbability((double) (short) 0, (double) 'a');
        double double16 = poissonDistributionImpl3.probability((double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100L, 4.018416977195786E-54d);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6728134305602215E-44d, (int) (byte) 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 23);
        poissonDistributionImpl2.reseedRandomGenerator((long) 98);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        double double9 = poissonDistributionImpl3.cumulativeProbability((double) 30);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl3.cumulativeProbability(3.2093315791106567E-171d, 4.864649182067619E-63d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 100);
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        double double14 = poissonDistributionImpl3.probability(32);
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(0.18393972058572117d);
        double double19 = poissonDistributionImpl3.cumulativeProbability(30, 110);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.3980856271290693E-36d + "'", double14 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl3.cumulativeProbability((double) 32, 1.0d);
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
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainUpperBound(4.560969057281241E-69d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(0, (int) (short) 10);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        int[] intArray21 = poissonDistributionImpl3.sample(43);
        double double23 = poissonDistributionImpl3.normalApproximateProbability(24);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "13) test0672(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9999999907838444d + "'", double17 == 0.9999999907838444d);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int int15 = poissonDistributionImpl3.getDomainLowerBound((double) (short) 1);
        java.lang.Class<?> wildcardClass16 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) '4');
        double double4 = poissonDistributionImpl2.cumulativeProbability(3.720075976020836E-44d);
        poissonDistributionImpl2.reseedRandomGenerator(10L);
        double double9 = poissonDistributionImpl2.cumulativeProbability(0.0d, 3.2093315791106567E-171d);
        double double11 = poissonDistributionImpl2.normalApproximateProbability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.999999999999d + "'", double4 == 0.999999999999d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.999999999999d + "'", double9 == 0.999999999999d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.560969057281241E-69d, (double) '4', (int) 'a');
        double double5 = poissonDistributionImpl3.normalApproximateProbability((int) (short) 10);
        double double7 = poissonDistributionImpl3.cumulativeProbability(102);
        poissonDistributionImpl3.reseedRandomGenerator((long) 44);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.216155638647194E-8d, 9.999778782798785E-13d, 13);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, (double) (short) 10);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 1);
        double double8 = poissonDistributionImpl2.probability(27);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8345580221844533d + "'", double6 == 0.8345580221844533d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.170057723151973E-33d + "'", double8 == 2.170057723151973E-33d);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        int int10 = poissonDistributionImpl3.getDomainUpperBound((double) 3);
        int int12 = poissonDistributionImpl3.getDomainUpperBound((double) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.160702826336122E-32d, 0.0d);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.probability(38.0d);
        double double15 = poissonDistributionImpl3.normalApproximateProbability(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.033719554105805E-46d + "'", double13 == 7.033719554105805E-46d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.308537538725987d + "'", double15 == 0.308537538725987d);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, (double) (short) -1, (int) (short) 100);
        int[] intArray5 = poissonDistributionImpl3.sample((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl3.cumulativeProbability((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
// flaky "28) test0681(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 24, 20, 33, 37, 35, 37, 28, 34, 35, 45 });
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        double double14 = poissonDistributionImpl3.probability((int) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double17 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "14) test0682(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.139132792048018E-17d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl1.cumulativeProbability(44, 9);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.457712003500205E-9d, 41);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.3678794411123646d);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(110);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.999999992542288d + "'", double4 == 0.999999992542288d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        double double11 = poissonDistributionImpl3.cumulativeProbability(0.6321205588285574d, (double) 100L);
        double double12 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 100);
        double double15 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "29) test0685(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.36787944117144256d + "'", double11 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 104);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(15);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.normalApproximateProbability(10);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = poissonDistributionImpl3.cumulativeProbability(36, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 38, 10.0d, 2147483647);
        int[] intArray5 = poissonDistributionImpl3.sample(34);
        int int7 = poissonDistributionImpl3.getDomainUpperBound(0.003594758625082517d);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainLowerBound(100.0d);
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        double double18 = poissonDistributionImpl3.normalApproximateProbability(34);
        double double20 = poissonDistributionImpl3.cumulativeProbability(86);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "15) test0690(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) 100);
        double double4 = poissonDistributionImpl2.cumulativeProbability(2147483647);
        double double6 = poissonDistributionImpl2.probability((-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) (byte) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) ' ');
        double double4 = poissonDistributionImpl2.probability((double) 10.0f);
        int[] intArray6 = poissonDistributionImpl2.sample(106);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999999999997d);
        double double3 = poissonDistributionImpl1.probability(1.3869009421120585E-33d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        int[] intArray5 = poissonDistributionImpl1.sample((int) 'a');
        int int6 = poissonDistributionImpl1.sample();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = poissonDistributionImpl1.inverseCumulativeProbability((double) 33);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "30) test0695(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 106);
        double double15 = poissonDistributionImpl3.cumulativeProbability(0.999999999954943d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(1.2460656213271568E-39d);
        double double19 = poissonDistributionImpl3.cumulativeProbability(38.0d);
        java.lang.Class<?> wildcardClass20 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "31) test0696(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6321205588285574d + "'", double15 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.720075976020836E-44d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl1.cumulativeProbability(4.793034378392443E-7d, 0.8160602794142788d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d, 24);
        double double4 = poissonDistributionImpl2.cumulativeProbability(2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9936865915923108d + "'", double4 == 0.9936865915923108d);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double6 = poissonDistributionImpl3.getMean();
        double double7 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.normalApproximateProbability(34);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (int) (byte) -1);
        int int3 = poissonDistributionImpl2.sample();
        double double4 = poissonDistributionImpl2.getMean();
        int int6 = poissonDistributionImpl2.getDomainUpperBound(2.631895849694923E-44d);
// flaky "16) test0700(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(4.5399929762484845E-4d);
        int int17 = poissonDistributionImpl3.sample();
        double double19 = poissonDistributionImpl3.probability((int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
// flaky "32) test0701(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (short) 1);
        double double7 = poissonDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "33) test0702(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 29 });
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', (-1.0d), 10);
        int[] intArray5 = poissonDistributionImpl3.sample(37);
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.139132792048018E-17d);
        double double3 = poissonDistributionImpl1.probability(11);
        int int4 = poissonDistributionImpl1.sample();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.307197512236221E-190d + "'", double3 == 7.307197512236221E-190d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 106);
        double double15 = poissonDistributionImpl3.cumulativeProbability(0.999999999954943d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(1.2460656213271568E-39d);
        double double19 = poissonDistributionImpl3.cumulativeProbability(38.0d);
        int int20 = poissonDistributionImpl3.sample();
        double double22 = poissonDistributionImpl3.probability(2.8161075942893507E-12d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "6) test0705(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6321205588285574d + "'", double15 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
// flaky "34) test0705(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6426402136161335d, (double) 97);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3980856271290693E-36d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(7.471972337343043E-43d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, 106);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(1.17246204865673E-37d);
        int int5 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky "17) test0708(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4');
        double double3 = poissonDistributionImpl1.probability((int) (short) 10);
        double double5 = poissonDistributionImpl1.normalApproximateProbability(10000000);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = poissonDistributionImpl1.inverseCumulativeProbability((double) 4);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0398180320558363E-12d + "'", double3 == 1.0398180320558363E-12d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double13 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double16 = poissonDistributionImpl3.cumulativeProbability(0, 24);
        int[] intArray18 = poissonDistributionImpl3.sample((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.691462461274013d + "'", double13 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        int int15 = poissonDistributionImpl3.getDomainUpperBound(0.6321205588285574d);
        double double17 = poissonDistributionImpl3.normalApproximateProbability((int) (short) -1);
        int int19 = poissonDistributionImpl3.getDomainLowerBound((double) 2147483647);
        int int21 = poissonDistributionImpl3.getDomainLowerBound(7.214425871271413E-5d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.06680720126885803d + "'", double17 == 0.06680720126885803d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(38);
        int int18 = poissonDistributionImpl3.sample();
        int int20 = poissonDistributionImpl3.getDomainLowerBound(0.14723260883568248d);
        double double22 = poissonDistributionImpl3.probability(10000000);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
// flaky "35) test0712(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        double double25 = poissonDistributionImpl3.cumulativeProbability(0, 4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "36) test0713(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 3 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6321205588285574d + "'", double20 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.996934337990238d + "'", double25 == 0.996934337990238d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2, 0.03796348149127876d, (int) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999999999997d);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = poissonDistributionImpl1.inverseCumulativeProbability((double) 43);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        int int10 = poissonDistributionImpl3.sample();
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
// flaky "18) test0716(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.88940969307282E-43d);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 30, (double) 10000000);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.0d);
        int int5 = poissonDistributionImpl2.sample();
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "37) test0718(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 0, 0.5429999234951242d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.probability(38.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.033719554105805E-46d + "'", double13 == 7.033719554105805E-46d);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0137771196302933E-7d, 2.7476693956635508E-33d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(7.457712003500205E-9d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(0.05956661497600297d, 0.029285828261849244d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999998986222932d + "'", double4 == 0.9999998986222932d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.609088260248484E-6d, 4.160702826336122E-32d, 27);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(1.2460656213271568E-39d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.999778782798785E-13d, (double) 100L);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability(29, 5);
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
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.2460656213271568E-39d, (double) 44, (int) (short) 10);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029285828261849244d, 6.305116760146989E-16d, 73);
        double double6 = poissonDistributionImpl3.cumulativeProbability(1.3869009421120585E-33d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.028861154135454092d + "'", double6 == 0.028861154135454092d);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', 9.216155638647194E-8d, 0);
        int int4 = poissonDistributionImpl3.sample();
        double double6 = poissonDistributionImpl3.probability(31);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
// flaky "38) test0726(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.07034028736850317d + "'", double6 == 0.07034028736850317d);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability((-1));
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(9.216155638647194E-8d, 0.533676680517062d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        int int12 = poissonDistributionImpl3.getDomainUpperBound(0.14723260883568248d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = poissonDistributionImpl3.cumulativeProbability((int) '4', 32);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6321205588285574d + "'", double10 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 12, (double) (byte) -1, 80);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d, 100);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.06131324019524039d);
        double double5 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.36787944117144233d + "'", double5 == 0.36787944117144233d);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3980856271290693E-36d, (double) (short) 10);
        int int3 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability(100);
        int int16 = poissonDistributionImpl3.getDomainLowerBound((double) ' ');
        int int18 = poissonDistributionImpl3.getDomainLowerBound((double) 43);
        double double20 = poissonDistributionImpl3.probability(1.0E-12d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.probability((double) 12);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0876756987846234E-153d + "'", double5 == 2.0876756987846234E-153d);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int[] intArray17 = poissonDistributionImpl3.sample((int) 'a');
        double double19 = poissonDistributionImpl3.normalApproximateProbability(30);
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
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        poissonDistributionImpl3.reseedRandomGenerator((long) 99);
        double double16 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 3);
        int int18 = poissonDistributionImpl3.inverseCumulativeProbability(0.9386867598047597d);
        double double20 = poissonDistributionImpl3.probability(35);
        int int22 = poissonDistributionImpl3.inverseCumulativeProbability(1.0137771200291468E-7d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3525511311226325d + "'", double16 == 0.3525511311226325d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.5601874895062087E-41d + "'", double20 == 3.5601874895062087E-41d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, (double) (short) 10);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
// flaky "39) test0736(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.0528363998149075E-10d, (int) '4');
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.559174711623875E-287d);
        poissonDistributionImpl1.reseedRandomGenerator((long) 80);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(52.0d, 44.0d, 9);
        int int4 = poissonDistributionImpl3.sample();
// flaky "40) test0739(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) 2);
        double double4 = poissonDistributionImpl2.probability((int) 'a');
        double double6 = poissonDistributionImpl2.probability(106);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.719682636442159E-60d + "'", double4 == 4.719682636442159E-60d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.9606298142722176E-69d + "'", double6 == 3.9606298142722176E-69d);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.8133051444001467E-13d, 0.05698471084507295d, (int) (short) 100);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.2460656213271568E-39d, (double) 27, (int) (byte) -1);
        double double4 = poissonDistributionImpl3.getMean();
        double double5 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2460656213271568E-39d + "'", double4 == 1.2460656213271568E-39d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.2460656213271568E-39d + "'", double5 == 1.2460656213271568E-39d);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 33, 0.18393972058572117d, 97);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, (double) (short) -1, (int) (short) 100);
        int[] intArray5 = poissonDistributionImpl3.sample((int) (short) 10);
        int int7 = poissonDistributionImpl3.getDomainUpperBound(0.999999992542288d);
        double double9 = poissonDistributionImpl3.probability((int) '#');
        int int10 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
// flaky "41) test0744(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 37, 39, 35, 38, 42, 35, 49, 27, 39, 30 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.06727319239963177d + "'", double9 == 0.06727319239963177d);
// flaky "1) test0744(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 10);
        double double16 = poissonDistributionImpl3.cumulativeProbability(28);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "42) test0745(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 104);
        double double3 = poissonDistributionImpl1.cumulativeProbability(106);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6027489844659351d + "'", double3 == 0.6027489844659351d);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.902447399449791E-155d, (int) '#');
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9331927987311419d);
        java.lang.Class<?> wildcardClass2 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, 4.018416977195786E-54d);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 100);
        double double6 = poissonDistributionImpl2.probability(0.999999898622288d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        double double26 = poissonDistributionImpl3.probability(0.025956482467509034d);
        double double28 = poissonDistributionImpl3.cumulativeProbability(1.3980856271290628E-36d);
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.6321205588285574d + "'", double28 == 0.6321205588285574d);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d);
        double double4 = poissonDistributionImpl1.cumulativeProbability(30, 104);
        double double6 = poissonDistributionImpl1.probability(33);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.974267574860327E-43d + "'", double6 == 2.974267574860327E-43d);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.999778782798785E-13d, 0.0d, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl3.inverseCumulativeProbability(1.01377703554215E-7d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (10) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 1L);
        double double14 = poissonDistributionImpl3.probability(3);
        poissonDistributionImpl3.reseedRandomGenerator((long) 5);
        int[] intArray18 = poissonDistributionImpl3.sample(4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "43) test0753(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06131324019524039d + "'", double14 == 0.06131324019524039d);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 1, 1, 0 });
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.probability(1.0d);
        double double13 = poissonDistributionImpl3.normalApproximateProbability(2);
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) '#');
        double double17 = poissonDistributionImpl3.normalApproximateProbability(43);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.36787944117144233d + "'", double11 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9331927987311419d + "'", double13 == 0.9331927987311419d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (int) '4');
        double double4 = poissonDistributionImpl2.probability(0.308537538725987d);
        int int6 = poissonDistributionImpl2.getDomainLowerBound(0.533676680517062d);
        double double8 = poissonDistributionImpl2.cumulativeProbability(3.139132792048018E-17d);
        int int10 = poissonDistributionImpl2.getDomainUpperBound(3.8243984514608465E-153d);
        int int12 = poissonDistributionImpl2.getDomainLowerBound(3.4018914738572114E-169d);
        int int14 = poissonDistributionImpl2.inverseCumulativeProbability(0.6922006275553462d);
        double double16 = poissonDistributionImpl2.probability(86);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4421702547125971d + "'", double8 == 0.4421702547125971d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.670902356181524E-139d + "'", double16 == 4.670902356181524E-139d);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        int int23 = poissonDistributionImpl3.getDomainLowerBound(1.2518874825673265E-12d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "44) test0756(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, 0.5429999234951242d, 36);
        int int5 = poissonDistributionImpl3.getDomainLowerBound(4.539992976248491E-5d);
        int int6 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "45) test0757(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 102);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.308537538725987d, 106);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(3.4018914738572114E-169d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a');
        int int3 = poissonDistributionImpl1.getDomainUpperBound(4.539992976248491E-5d);
        double double5 = poissonDistributionImpl1.cumulativeProbability(37);
        double double8 = poissonDistributionImpl1.cumulativeProbability(43, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.8161075942893507E-12d + "'", double5 == 2.8161075942893507E-12d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5269687609254716d + "'", double8 == 0.5269687609254716d);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.021990921302225148d, 0.18393972058572114d, 23);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability(3.8243984514608465E-153d);
        double double11 = poissonDistributionImpl3.cumulativeProbability(1.7401052582713831E-47d);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6321205588285574d + "'", double11 == 0.6321205588285574d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, (int) 'a');
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.probability((double) 10);
        double double7 = poissonDistributionImpl2.normalApproximateProbability(2147483647);
        int int9 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
// flaky "46) test0763(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.01377703554215E-7d + "'", double5 == 1.01377703554215E-7d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.999999999999d);
        int int2 = poissonDistributionImpl1.sample();
// flaky "47) test0764(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        double double23 = poissonDistributionImpl3.cumulativeProbability(30);
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
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 23, 3.5601874895062087E-41d, (int) 'a');
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        double double14 = poissonDistributionImpl3.cumulativeProbability(32);
        double double16 = poissonDistributionImpl3.cumulativeProbability(104);
        int[] intArray18 = poissonDistributionImpl3.sample((int) (short) 100);
        double double20 = poissonDistributionImpl3.probability((double) (-1));
        int int22 = poissonDistributionImpl3.getDomainLowerBound(0.4919298095548862d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "48) test0767(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(10);
        double double7 = poissonDistributionImpl3.probability(2);
        double double9 = poissonDistributionImpl3.normalApproximateProbability(29);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "49) test0768(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 3, 2, 0, 1, 0, 0, 4, 4, 0, 0 });
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.18393972058572114d + "'", double7 == 0.18393972058572114d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 0, 28);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(38);
        double double19 = poissonDistributionImpl3.normalApproximateProbability(99);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = poissonDistributionImpl3.cumulativeProbability((double) 110, 0.999999999940922d);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 105, 0.6922006339347749d, 35);
        int[] intArray5 = poissonDistributionImpl3.sample(34);
        poissonDistributionImpl3.reseedRandomGenerator((long) 12);
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', (int) (byte) 1);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = poissonDistributionImpl2.sample((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9386867598047597d, (int) (byte) 100);
        double double4 = poissonDistributionImpl2.probability(32);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.962564426565066E-37d + "'", double4 == 1.962564426565066E-37d);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double6 = poissonDistributionImpl2.probability(38.0d);
        double double8 = poissonDistributionImpl2.probability(0.996934337990238d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.308537538725987d + "'", double4 == 0.308537538725987d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.033719554105805E-46d + "'", double6 == 7.033719554105805E-46d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.probability((int) '4');
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 1);
        double double16 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.560969057281241E-69d + "'", double13 == 4.560969057281241E-69d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06131324019524039d, (double) 37);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 34);
        java.lang.Class<?> wildcardClass2 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 30, 0.8862636038898793d);
        double double5 = poissonDistributionImpl2.cumulativeProbability(86, 99);
        int int6 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.1102230246251565E-16d + "'", double5 == 1.1102230246251565E-16d);
// flaky "50) test0778(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 26 + "'", int6 == 26);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6728134305602215E-44d, 0.691462461274013d, 37);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0);
        double double7 = poissonDistributionImpl3.cumulativeProbability(9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        // The following exception was thrown during execution in test generation
        try {
            double double28 = poissonDistributionImpl3.cumulativeProbability((double) 2, 0.3678794445618948d);
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
// flaky "51) test0780(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.308537538725987d + "'", double23 == 0.308537538725987d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.2460656213271568E-39d + "'", double25 == 1.2460656213271568E-39d);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 23, 100.0d, 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound(1.01377703554215E-7d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        int int14 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int int15 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "52) test0782(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 3 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
// flaky "2) test0782(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3678794411123646d);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9846716899511899d, 34);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(1.0398180320558363E-12d);
        double double14 = poissonDistributionImpl3.probability(2);
        int int16 = poissonDistributionImpl3.getDomainUpperBound(1.17246204865673E-37d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.18393972058572114d + "'", double14 == 0.18393972058572114d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.609088260248484E-6d, 105);
        double double4 = poissonDistributionImpl2.cumulativeProbability(4);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int5 = poissonDistributionImpl2.sample();
        int int7 = poissonDistributionImpl2.getDomainLowerBound((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability(1.1102230246251565E-16d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky "53) test0787(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36 + "'", int5 == 36);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = poissonDistributionImpl3.cumulativeProbability((double) 110, 4.018416977195786E-54d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "54) test0788(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, 3.57198604755006E-167d);
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.07257897695541599d + "'", double4 == 0.07257897695541599d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        double double28 = poissonDistributionImpl3.cumulativeProbability(15);
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
// flaky "7) test0790(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
// flaky "55) test0790(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.9999999999999825d + "'", double28 == 0.9999999999999825d);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.974267574860327E-43d);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (double) (-1), (-1));
        double double5 = poissonDistributionImpl3.probability((int) (byte) -1);
        double double6 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl3.cumulativeProbability(36, 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainLowerBound((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl2.cumulativeProbability(7.875285095517683E-30d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainLowerBound((double) (-1));
        double double8 = poissonDistributionImpl3.cumulativeProbability(4.560969057281241E-69d, (double) 34);
        int int9 = poissonDistributionImpl3.sample();
        int int11 = poissonDistributionImpl3.inverseCumulativeProbability(0.9999999907838444d);
        int int12 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.999778782798785E-13d + "'", double8 == 9.999778782798785E-13d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        poissonDistributionImpl3.reseedRandomGenerator((long) 29);
        double double15 = poissonDistributionImpl3.cumulativeProbability(0, 99);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "56) test0795(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) ' ');
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 1);
        int int6 = poissonDistributionImpl2.getDomainUpperBound(0.01891663740103536d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003594758625082517d + "'", double4 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        int int15 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 35);
        double double20 = poissonDistributionImpl3.cumulativeProbability(3.941866060050443E-159d);
        int int22 = poissonDistributionImpl3.getDomainUpperBound(0.3678794445618948d);
        int int23 = poissonDistributionImpl3.sample();
        double double25 = poissonDistributionImpl3.cumulativeProbability(0.6027489844659351d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6321205588285574d + "'", double20 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6321205588285574d + "'", double25 == 0.6321205588285574d);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (double) ' ', (int) (short) 100);
        double double5 = poissonDistributionImpl3.probability(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double8 = poissonDistributionImpl3.cumulativeProbability(80);
        double double11 = poissonDistributionImpl3.cumulativeProbability(15, 10000000);
        double double13 = poissonDistributionImpl3.probability(73);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.720075976020836E-44d + "'", double5 == 3.720075976020836E-44d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.021990921302225148d + "'", double8 == 0.021990921302225148d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.322102657191705E-4d + "'", double13 == 8.322102657191705E-4d);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) '#');
        int int16 = poissonDistributionImpl3.getDomainLowerBound(3.57198604755006E-167d);
        double double18 = poissonDistributionImpl3.cumulativeProbability((int) '4');
        int int20 = poissonDistributionImpl3.getDomainUpperBound(9.999778782798785E-13d);
        int int21 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        double double16 = poissonDistributionImpl3.normalApproximateProbability((int) '4');
        int int18 = poissonDistributionImpl3.getDomainUpperBound(0.011604342211143792d);
        double double20 = poissonDistributionImpl3.cumulativeProbability(35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 51, 0);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7476693956635508E-33d, (double) 80);
        int int3 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.011604342211143792d);
        double double2 = poissonDistributionImpl1.getMean();
        int[] intArray4 = poissonDistributionImpl1.sample((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011604342211143792d + "'", double2 == 0.011604342211143792d);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, 0.8160602794142788d, 2);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        int int7 = poissonDistributionImpl3.getDomainLowerBound((double) (byte) 1);
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        int int13 = poissonDistributionImpl3.inverseCumulativeProbability(9.216155638647194E-8d);
        double double15 = poissonDistributionImpl3.probability(2);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) -1);
        int int19 = poissonDistributionImpl3.getDomainUpperBound((double) 86);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.18393972058572114d + "'", double15 == 0.18393972058572114d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 44, (int) (short) 10);
        double double4 = poissonDistributionImpl2.probability(1.7401052582713831E-47d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability((int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 44");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double9 = poissonDistributionImpl3.getMean();
        double double11 = poissonDistributionImpl3.cumulativeProbability(10000000);
        int int13 = poissonDistributionImpl3.getDomainLowerBound(0.999999999954943d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = poissonDistributionImpl3.cumulativeProbability(0.029285828261849244d, 0.999999992542288d);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.9418660600503296E-157d);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.sample();
        java.lang.Class<?> wildcardClass15 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "57) test0809(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
// flaky "8) test0809(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 100);
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        int int14 = poissonDistributionImpl3.inverseCumulativeProbability(1.0137771200291468E-7d);
        java.lang.Class<?> wildcardClass15 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9846716899511899d, 32);
        double double4 = poissonDistributionImpl2.cumulativeProbability(2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9224963690453434d + "'", double4 == 0.9224963690453434d);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 2.7455062667769425E-9d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, 3.720075976020836E-44d);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(104);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.67364477971208d + "'", double6 == 0.67364477971208d);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        double double14 = poissonDistributionImpl3.probability(3.8243984514608465E-153d);
        java.lang.Class<?> wildcardClass15 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainLowerBound(100.0d);
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        double double18 = poissonDistributionImpl3.normalApproximateProbability(34);
        int int20 = poissonDistributionImpl3.getDomainLowerBound(4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "58) test0815(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, (double) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(0.9999999907838444d, 0.6426402136161335d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, (double) (short) -1, (int) (short) 100);
        int[] intArray5 = poissonDistributionImpl3.sample((int) (short) 10);
        int int7 = poissonDistributionImpl3.getDomainUpperBound(0.999999992542288d);
        double double8 = poissonDistributionImpl3.getMean();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.05956661497600297d);
        double double12 = poissonDistributionImpl3.probability(2.755731922395672E-127d);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "59) test0817(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 33, 32, 28, 36, 47, 36, 35, 38, 33 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 1.7401052582713831E-47d, (int) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (double) 1);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.4421702547125971d, 3.2093315791106567E-171d, (int) '4');
        double double5 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.9846716899511899d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double10 = poissonDistributionImpl3.getMean();
        double double12 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        int int14 = poissonDistributionImpl3.inverseCumulativeProbability(9.88940969307282E-43d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 37);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl1.cumulativeProbability(105, (int) 'a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.925222664969737E-19d, 3.139132792048018E-17d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(5);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, 104);
        poissonDistributionImpl2.reseedRandomGenerator(1L);
        double double6 = poissonDistributionImpl2.probability(4.160702826336122E-32d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        poissonDistributionImpl3.reseedRandomGenerator((long) 29);
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) 10, 14);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "60) test0826(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0137743067240024E-7d + "'", double15 == 1.0137743067240024E-7d);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7596379528070493E-10d, 0.9353755231673158d);
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) 'a');
        double double6 = poissonDistributionImpl2.probability(26);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.186804141704334E-276d + "'", double6 == 7.186804141704334E-276d);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double10 = poissonDistributionImpl3.getMean();
        java.lang.Class<?> wildcardClass11 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 86, 0.9386867598047597d);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.039860996809147134d, 30);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 106);
        double double15 = poissonDistributionImpl3.cumulativeProbability(0.999999999954943d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(1.2460656213271568E-39d);
        double double19 = poissonDistributionImpl3.cumulativeProbability(38.0d);
        int int20 = poissonDistributionImpl3.sample();
        int int21 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "61) test0831(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6321205588285574d + "'", double15 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
// flaky "9) test0831(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
// flaky "3) test0831(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability(0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "4) test0832(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6321205588285574d + "'", double19 == 0.6321205588285574d);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        int int23 = poissonDistributionImpl3.getDomainUpperBound(2.755731922395672E-127d);
        int int24 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.06680720126885803d + "'", double17 == 0.06680720126885803d);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10);
        int int3 = poissonDistributionImpl1.getDomainUpperBound(0.6922006275553462d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.011604342211143792d, (double) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(7.471972337343043E-43d, 7.680129694168893E-10d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.probability(1.0d);
        double double13 = poissonDistributionImpl3.normalApproximateProbability(2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) 42);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.36787944117144233d + "'", double11 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9331927987311419d + "'", double13 == 0.9331927987311419d);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        poissonDistributionImpl3.reseedRandomGenerator((long) 0);
        double double9 = poissonDistributionImpl3.normalApproximateProbability(37);
        double double11 = poissonDistributionImpl3.cumulativeProbability(41);
        double double13 = poissonDistributionImpl3.cumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (-1.0f));
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6321205588285574d + "'", double13 == 0.6321205588285574d);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((double) 0.0f);
        double double12 = poissonDistributionImpl3.cumulativeProbability(0.0d, 0.533676680517062d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "62) test0838(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6321205588285574d + "'", double12 == 0.6321205588285574d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        double double28 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double30 = poissonDistributionImpl3.cumulativeProbability(2.8161075942893507E-12d);
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
// flaky "63) test0839(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3.2093315791106567E-171d + "'", double25 == 3.2093315791106567E-171d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.8160602794142788d + "'", double28 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.6321205588285574d + "'", double30 == 0.6321205588285574d);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (int) '4');
        double double4 = poissonDistributionImpl2.probability(0.308537538725987d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 26);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (short) 1);
        int int7 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl2.cumulativeProbability(7.471972337343043E-43d, 32.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "64) test0841(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 29 });
// flaky "10) test0841(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.457712003500205E-9d);
        poissonDistributionImpl1.reseedRandomGenerator((long) (byte) 1);
        int[] intArray5 = poissonDistributionImpl1.sample(36);
        int[] intArray7 = poissonDistributionImpl1.sample(38);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, 0.5429999234951242d, 36);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.691462461274013d);
        int int7 = poissonDistributionImpl3.inverseCumulativeProbability(4.793034378392443E-7d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4919298095548862d + "'", double5 == 0.4919298095548862d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(30);
        int int5 = poissonDistributionImpl1.getDomainUpperBound(0.0d);
        double double7 = poissonDistributionImpl1.cumulativeProbability(0.021990921302225148d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.999999999954943d + "'", double3 == 0.999999999954943d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) (byte) 0);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.cumulativeProbability(32);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        int int9 = poissonDistributionImpl2.getDomainLowerBound(0.691462461274013d);
        int int10 = poissonDistributionImpl2.sample();
        java.lang.Class<?> wildcardClass11 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8160602794142788d + "'", double3 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "65) test0845(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability((int) ' ');
        double double16 = poissonDistributionImpl3.probability(0);
        int int18 = poissonDistributionImpl3.inverseCumulativeProbability(1.3980856271290693E-36d);
        java.lang.Class<?> wildcardClass19 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.36787944117144233d + "'", double16 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        double double9 = poissonDistributionImpl3.normalApproximateProbability((int) '4');
        int int11 = poissonDistributionImpl3.inverseCumulativeProbability(1.1173711675821023E-12d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.139132792048018E-17d);
        int int3 = poissonDistributionImpl1.getDomainLowerBound(0.19699216367798777d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        double double25 = poissonDistributionImpl3.cumulativeProbability(37);
        double double27 = poissonDistributionImpl3.cumulativeProbability(36);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.04425363959909373d, (double) (byte) 0);
        double double4 = poissonDistributionImpl2.cumulativeProbability(43);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        double double25 = poissonDistributionImpl3.probability(15);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "66) test0851(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.36787944117144233d + "'", double21 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.36787944117144233d + "'", double23 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2.813234320208393E-13d + "'", double25 == 2.813234320208393E-13d);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3678794445618948d, (-1));
        double double4 = poissonDistributionImpl2.normalApproximateProbability(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.586219203359673d + "'", double4 == 0.586219203359673d);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainLowerBound((double) (-1));
        double double8 = poissonDistributionImpl3.cumulativeProbability(4.560969057281241E-69d, (double) 34);
        int int10 = poissonDistributionImpl3.getDomainUpperBound((double) 42);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.999778782798785E-13d + "'", double8 == 9.999778782798785E-13d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.probability((double) 10000000);
        double double16 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "19) test0854(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl1.cumulativeProbability(38.0d, (double) 1L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 38, 3.57198604755006E-167d);
        double double5 = poissonDistributionImpl2.cumulativeProbability(1.17246204865673E-37d, (double) 34);
        poissonDistributionImpl2.reseedRandomGenerator((long) 99);
        double double9 = poissonDistributionImpl2.normalApproximateProbability(27);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.29140699867905834d + "'", double5 == 0.29140699867905834d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.04425363959909373d + "'", double9 == 0.04425363959909373d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029285828261849244d, 0.5429999234951242d, 0);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = poissonDistributionImpl3.cumulativeProbability(98, 37);
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
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (double) (-1), (-1));
        double double5 = poissonDistributionImpl3.probability(34);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.5377671420713246E-9d + "'", double5 == 1.5377671420713246E-9d);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 105, 0.6922006339347749d, 35);
        int[] intArray5 = poissonDistributionImpl3.sample(34);
        int int7 = poissonDistributionImpl3.getDomainLowerBound((double) (-1L));
        double double9 = poissonDistributionImpl3.cumulativeProbability(4.2913989097407664E-60d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.5065674758999414E-46d + "'", double9 == 2.5065674758999414E-46d);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) '#');
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 105, 0.6922006339347749d, 35);
        int[] intArray5 = poissonDistributionImpl3.sample((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        // The following exception was thrown during execution in test generation
        try {
            double double25 = poissonDistributionImpl3.cumulativeProbability(15, 2);
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
// flaky "11) test0863(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999907838444d + "'", double19 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 9.216155616442734E-9d + "'", double22 == 9.216155616442734E-9d);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, 5.062340213690675E-8d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(4.3013378484179026E-15d, 2.170057723151973E-33d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        double double24 = poissonDistributionImpl3.cumulativeProbability(100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
// flaky "67) test0865(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.normalApproximateProbability(10);
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        int[] intArray14 = poissonDistributionImpl3.sample(14);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 1, 1, 2, 1, 0, 0, 0, 2, 1, 3, 3, 1, 0 });
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3525511311226325d, 105);
        double double4 = poissonDistributionImpl2.probability(44.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.1627334188024467E-75d + "'", double4 == 3.1627334188024467E-75d);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 0);
        double double12 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "20) test0868(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 44);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 10.0d);
        double double4 = poissonDistributionImpl2.probability(0.533676680517062d);
        int int6 = poissonDistributionImpl2.getDomainUpperBound(0.028861154135454092d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability(100);
        double double16 = poissonDistributionImpl3.normalApproximateProbability(2);
        double double18 = poissonDistributionImpl3.probability(37);
        int int20 = poissonDistributionImpl3.getDomainLowerBound((double) 102);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9331927987311419d + "'", double16 == 0.9331927987311419d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.6728134305602215E-44d + "'", double18 == 2.6728134305602215E-44d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.457712003500205E-9d, 41);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.3678794411123646d);
        int int5 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.999999992542288d + "'", double4 == 0.999999992542288d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(3);
        int int9 = poissonDistributionImpl2.sample();
        int int11 = poissonDistributionImpl2.getDomainLowerBound(1.7401052582713831E-47d);
        int int13 = poissonDistributionImpl2.getDomainUpperBound(1.0398180320558363E-12d);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.062340213690675E-8d + "'", double8 == 5.062340213690675E-8d);
// flaky "68) test0873(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) '4');
        double double4 = poissonDistributionImpl2.cumulativeProbability(3.720075976020836E-44d);
        poissonDistributionImpl2.reseedRandomGenerator(10L);
        poissonDistributionImpl2.reseedRandomGenerator((long) 73);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.999999999999d + "'", double4 == 0.999999999999d);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.probability(0.0d);
        double double13 = poissonDistributionImpl3.cumulativeProbability(4.5399929762484854E-5d, (double) 38);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.36787944117144233d + "'", double10 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.36787944117144256d + "'", double13 == 0.36787944117144256d);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double16 = poissonDistributionImpl3.cumulativeProbability(37, 37);
        int int18 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int int20 = poissonDistributionImpl3.getDomainUpperBound((double) ' ');
        double double22 = poissonDistributionImpl3.cumulativeProbability(24);
        int int24 = poissonDistributionImpl3.getDomainUpperBound(2.974267574860327E-43d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.probability((double) 10000000);
        double double17 = poissonDistributionImpl3.cumulativeProbability(4.539992976248491E-5d);
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        double double21 = poissonDistributionImpl3.normalApproximateProbability(5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "21) test0877(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.9999966023268753d + "'", double21 == 0.9999966023268753d);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double11 = poissonDistributionImpl3.getMean();
        double double14 = poissonDistributionImpl3.cumulativeProbability(38, 10000000);
        int int16 = poissonDistributionImpl3.getDomainLowerBound(0.14723260883568248d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = poissonDistributionImpl3.cumulativeProbability((double) 51, (double) 10);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6321205588285574d + "'", double10 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 30);
        int int3 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl2.inverseCumulativeProbability(0.6922006275553462d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (30) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
// flaky "69) test0879(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 40 + "'", int3 == 40);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000, 0.0d);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (int) (short) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.normalApproximateProbability(100);
        poissonDistributionImpl2.reseedRandomGenerator((long) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 38 + "'", int9 == 38);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d, 1.17246204865673E-37d, (int) (byte) 0);
        int int4 = poissonDistributionImpl3.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        double double9 = poissonDistributionImpl3.cumulativeProbability(100);
        double double10 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.216155638647194E-8d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.999999999954943d);
        int[] intArray5 = poissonDistributionImpl1.sample(37);
        double double8 = poissonDistributionImpl1.cumulativeProbability((double) '#', (double) 98);
        double double10 = poissonDistributionImpl1.normalApproximateProbability(14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 46);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.560969057281241E-69d, (double) '4', (int) 'a');
        double double5 = poissonDistributionImpl3.normalApproximateProbability((int) (short) 10);
        double double7 = poissonDistributionImpl3.cumulativeProbability(102);
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.14723260883568248d, 52.0d, 38);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(86, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(52.0d, 44.0d, 9);
        double double6 = poissonDistributionImpl3.cumulativeProbability((double) 46, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8430188007045427d + "'", double6 == 0.8430188007045427d);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, (int) 'a');
        double double4 = poissonDistributionImpl2.probability(5);
        int[] intArray6 = poissonDistributionImpl2.sample(100);
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0030656618967475464d + "'", double4 == 0.0030656618967475464d);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 0.06161675254888723d, 33);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.sample();
        double double16 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "22) test0892(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "70) test0892(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        int int20 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "23) test0893(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky "71) test0893(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        double double15 = poissonDistributionImpl3.getMean();
        double double17 = poissonDistributionImpl3.probability(10);
        double double18 = poissonDistributionImpl3.getMean();
        double double20 = poissonDistributionImpl3.cumulativeProbability(93);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0137771196302933E-7d + "'", double17 == 1.0137771196302933E-7d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, 86);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0137771196302933E-7d, (int) (byte) -1);
        int[] intArray4 = poissonDistributionImpl2.sample(104);
        double double5 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0137771196302933E-7d + "'", double5 == 1.0137771196302933E-7d);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.4018914738572114E-169d, 4.719682636442159E-60d);
        int[] intArray4 = poissonDistributionImpl2.sample(38);
        double double7 = poissonDistributionImpl2.cumulativeProbability(3.9606298142722176E-69d, (double) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0030656620097619935d, 1.1173711675821023E-12d);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.560969057281241E-69d);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 104, 4.560969057281241E-69d, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(86, 106);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (52) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.8243984514608465E-153d, (int) (byte) 10);
        poissonDistributionImpl2.reseedRandomGenerator((long) 2147483647);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(1.7401052582713831E-47d);
        double double8 = poissonDistributionImpl2.probability(88);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.01377703554215E-7d, (double) (-1.0f));
        int[] intArray4 = poissonDistributionImpl2.sample(52);
        double double6 = poissonDistributionImpl2.probability(0.9652365304395534d);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.8243984514608465E-153d, 3.57198604755006E-167d);
        double double5 = poissonDistributionImpl2.cumulativeProbability((int) (short) -1, 0);
        int[] intArray7 = poissonDistributionImpl2.sample(10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6321205588285574d, (double) 106, 5);
        double double6 = poissonDistributionImpl3.cumulativeProbability((double) (byte) 0, 0.308537538725987d);
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6640509287659724d + "'", double6 == 0.6640509287659724d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        int int9 = poissonDistributionImpl3.getDomainLowerBound(4.793034378392443E-7d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        double double9 = poissonDistributionImpl3.cumulativeProbability(100);
        double double11 = poissonDistributionImpl3.probability(2147483647);
        int int13 = poissonDistributionImpl3.inverseCumulativeProbability(0.8160602794142788d);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double17 = poissonDistributionImpl3.cumulativeProbability(12);
        int int19 = poissonDistributionImpl3.getDomainLowerBound((double) 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.999999999940922d + "'", double17 == 0.999999999940922d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double13 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double15 = poissonDistributionImpl3.cumulativeProbability(10000000);
        poissonDistributionImpl3.reseedRandomGenerator((long) 34);
        int int19 = poissonDistributionImpl3.getDomainLowerBound(0.003594758625082517d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = poissonDistributionImpl3.cumulativeProbability((double) 42, 0.0d);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 52, (double) 4);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.875285095517683E-30d, 3.826311454135856E-163d);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        double double14 = poissonDistributionImpl3.probability((int) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, 99);
        int[] intArray21 = poissonDistributionImpl3.sample(100);
        int int23 = poissonDistributionImpl3.inverseCumulativeProbability(3.4018914738572114E-169d);
        int int25 = poissonDistributionImpl3.inverseCumulativeProbability(4.793034378392443E-7d);
        double double27 = poissonDistributionImpl3.cumulativeProbability((double) 9);
        int int29 = poissonDistributionImpl3.getDomainLowerBound(0.3525511311226325d);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = poissonDistributionImpl3.inverseCumulativeProbability((double) 31);
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
// flaky "24) test0910(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.999999898622288d + "'", double27 == 0.999999898622288d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, (double) (short) 10);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 1);
        int int8 = poissonDistributionImpl2.getDomainUpperBound(0.308537538725987d);
        double double10 = poissonDistributionImpl2.normalApproximateProbability(37);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8345580221844533d + "'", double6 == 0.8345580221844533d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.18393972058572114d, (double) (short) 10);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(5.559174711623875E-287d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 14);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.4230202807276707E-23d, (double) 5);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.4421702547125971d);
        int int5 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        int int25 = poissonDistributionImpl3.inverseCumulativeProbability(3.720075976020836E-44d);
        double double27 = poissonDistributionImpl3.cumulativeProbability(38);
        int int29 = poissonDistributionImpl3.inverseCumulativeProbability(0.9997803485788277d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "72) test0914(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d, (double) (-1), 0);
        double double5 = poissonDistributionImpl3.probability(0.14723260883568248d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability(97, 30);
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
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability(100);
        int int16 = poissonDistributionImpl3.getDomainLowerBound((double) ' ');
        int[] intArray18 = poissonDistributionImpl3.sample(15);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray18);
// flaky "73) test0916(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray18, new int[] { 0, 0, 0, 0, 2, 0, 2, 0, 2, 1, 2, 2, 0, 1, 0 });
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(0);
        int int5 = poissonDistributionImpl2.sample();
        int int6 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.308537538725987d + "'", double4 == 0.308537538725987d);
// flaky "25) test0917(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "74) test0917(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0L, 5);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a');
        double double4 = poissonDistributionImpl1.cumulativeProbability((int) (byte) -1, 3);
        int int6 = poissonDistributionImpl1.inverseCumulativeProbability(0.0d);
        int int8 = poissonDistributionImpl1.getDomainLowerBound(0.9999966023268753d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.17246204865673E-37d + "'", double4 == 1.17246204865673E-37d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.631895849694923E-44d);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, (double) (byte) -1, 30);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability(32.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 100");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        poissonDistributionImpl3.reseedRandomGenerator((long) 29);
        poissonDistributionImpl3.reseedRandomGenerator((long) 23);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "26) test0922(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double17 = poissonDistributionImpl3.cumulativeProbability(32);
        double double19 = poissonDistributionImpl3.cumulativeProbability(0.0030656620097619935d);
        int int21 = poissonDistributionImpl3.getDomainUpperBound(0.533676680517062d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6321205588285574d + "'", double19 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.29140699867905834d, 0.5429999234951242d, 106);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        int[] intArray26 = poissonDistributionImpl3.sample(23);
        double double27 = poissonDistributionImpl3.getMean();
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
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 2, 0, 0, 2, 2, 1, 0, 1, 2, 3, 0, 0, 3, 2, 2, 1, 1, 2, 2, 1, 1, 0, 1 });
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d, 1.17246204865673E-37d, (int) (byte) 0);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((double) 1.0f);
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, 28);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.probability((double) 30);
        java.lang.Class<?> wildcardClass11 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.3869009421120585E-33d + "'", double10 == 1.3869009421120585E-33d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "27) test0929(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.3013378484179026E-15d);
        int int2 = poissonDistributionImpl1.sample();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(52.0d, (double) 3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(0.586219203359673d, 0.14723260883568248d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        poissonDistributionImpl3.reseedRandomGenerator((long) 99);
        double double16 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 3);
        int int18 = poissonDistributionImpl3.inverseCumulativeProbability(0.9386867598047597d);
        double double20 = poissonDistributionImpl3.cumulativeProbability(99);
        double double22 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        int int23 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3525511311226325d + "'", double16 == 0.3525511311226325d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.6321205588285574d + "'", double22 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, 99);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((double) 98, 2.7596379528070493E-10d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.2001158042335694E-17d, 0.4421702547125971d, 4);
        int int5 = poissonDistributionImpl3.getDomainLowerBound(0.18393972058572117d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        double double6 = poissonDistributionImpl2.probability(0.0d);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.305116760146989E-16d + "'", double6 == 6.305116760146989E-16d);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        double double21 = poissonDistributionImpl3.cumulativeProbability(0.9997803485788277d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "12) test0936(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06131324019524039d + "'", double14 == 0.06131324019524039d);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 1, 1, 0, 1, 2, 2, 2, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2 });
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.6321205588285574d + "'", double21 == 0.6321205588285574d);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.033719554105805E-46d, 0);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, (int) (byte) 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 46);
        int int6 = poissonDistributionImpl2.getDomainLowerBound(0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f);
        poissonDistributionImpl3.reseedRandomGenerator(100L);
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, (int) (byte) 100);
        double double17 = poissonDistributionImpl3.normalApproximateProbability(37);
        int[] intArray19 = poissonDistributionImpl3.sample(73);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999907838444d + "'", double10 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        poissonDistributionImpl3.reseedRandomGenerator((-1L));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.457712003500205E-9d);
        poissonDistributionImpl1.reseedRandomGenerator((long) (byte) 1);
        int[] intArray5 = poissonDistributionImpl1.sample(36);
        double double7 = poissonDistributionImpl1.cumulativeProbability(0.6922006339347749d);
        double double9 = poissonDistributionImpl1.probability((double) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.999999992542288d + "'", double7 == 0.999999992542288d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((int) (byte) 0);
        double double12 = poissonDistributionImpl3.cumulativeProbability((-1), (-1));
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.probability(11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "28) test0942(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
// flaky "75) test0942(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.216155633002718E-9d + "'", double15 == 9.216155633002718E-9d);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.925222664969737E-19d, 3.139132792048018E-17d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(35.0d, 3.8243984514608465E-153d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.probability((double) 10000000);
        double double17 = poissonDistributionImpl3.cumulativeProbability(4.539992976248491E-5d);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = poissonDistributionImpl3.inverseCumulativeProbability((double) 80);
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
// flaky "29) test0944(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(104, 24);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.9606298142722176E-69d, 0.8345580221844533d, 4);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(1.0398180320558363E-12d);
        double double14 = poissonDistributionImpl3.probability(2);
        int int16 = poissonDistributionImpl3.getDomainUpperBound((double) 44);
        java.lang.Class<?> wildcardClass17 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.18393972058572114d + "'", double14 == 0.18393972058572114d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(0);
        int int5 = poissonDistributionImpl2.sample();
        double double7 = poissonDistributionImpl2.cumulativeProbability(2147483647);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.308537538725987d + "'", double4 == 0.308537538725987d);
// flaky "30) test0948(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        int int14 = poissonDistributionImpl3.sample();
        double double16 = poissonDistributionImpl3.normalApproximateProbability(28);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
// flaky "31) test0949(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7476693956635508E-33d, 0.0d);
        double double4 = poissonDistributionImpl2.probability(31);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 98);
        double double5 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        int int15 = poissonDistributionImpl3.getDomainUpperBound(0.6321205588285574d);
        double double17 = poissonDistributionImpl3.normalApproximateProbability((int) (short) -1);
        java.lang.Class<?> wildcardClass18 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.06680720126885803d + "'", double17 == 0.06680720126885803d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 23, 100.0d, 100);
        double double5 = poissonDistributionImpl3.probability((double) 93);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.8785349352299523E-28d + "'", double5 == 3.8785349352299523E-28d);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.011604342211143792d, (double) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability(42);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 37);
        int int3 = poissonDistributionImpl1.getDomainLowerBound((double) 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        int[] intArray5 = poissonDistributionImpl1.sample((int) 'a');
        int int7 = poissonDistributionImpl1.inverseCumulativeProbability(0.999999999999d);
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 38 + "'", int7 == 38);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        double double14 = poissonDistributionImpl3.probability((int) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, 99);
        int[] intArray21 = poissonDistributionImpl3.sample(100);
        double double22 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "32) test0957(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.609088260248484E-6d, (double) (short) 100, (int) 'a');
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 106, 0.06680720126885803d);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(7.457712003500205E-9d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(9.216155616442734E-9d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999999977743d);
        double double3 = poissonDistributionImpl1.cumulativeProbability(3.8243984514608465E-153d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.36787944117227944d + "'", double3 == 0.36787944117227944d);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) -1, 1.3980856271290693E-36d, 24);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (short) 1);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 51);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "76) test0963(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 40 });
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(8.101511794681424E-4d, 106);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) (short) 0);
        double double14 = poissonDistributionImpl3.cumulativeProbability(0, 4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.996934337990238d + "'", double14 == 0.996934337990238d);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.011604342211143792d);
        double double4 = poissonDistributionImpl1.cumulativeProbability(12, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl1.cumulativeProbability((double) 97, 1.1102230246251565E-16d);
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
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        double double23 = poissonDistributionImpl3.normalApproximateProbability(5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.2093315791106567E-171d + "'", double19 == 3.2093315791106567E-171d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.9999966023268753d + "'", double23 == 0.9999966023268753d);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (short) 1);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 100);
        int int10 = poissonDistributionImpl2.getDomainLowerBound((double) 9);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "77) test0968(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 31 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 24, 5.559174711623875E-287d);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.05698471084507295d, (double) 110, 93);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ');
        double double4 = poissonDistributionImpl1.cumulativeProbability((double) 11, (double) 99);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999943880751789d + "'", double4 == 0.9999943880751789d);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        double double14 = poissonDistributionImpl3.probability(3.8243984514608465E-153d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = poissonDistributionImpl3.cumulativeProbability(0.025956482467509034d, 0.4421702547125971d);
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
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.457712003500205E-9d);
        poissonDistributionImpl1.reseedRandomGenerator((long) (byte) 1);
        int[] intArray5 = poissonDistributionImpl1.sample(36);
        double double7 = poissonDistributionImpl1.cumulativeProbability(0.6922006339347749d);
        double double10 = poissonDistributionImpl1.cumulativeProbability(3.9606298142722176E-69d, 10.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.999999992542288d + "'", double7 == 0.999999992542288d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.457712003500205E-9d + "'", double10 == 7.457712003500205E-9d);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        double double25 = poissonDistributionImpl3.probability(0.20223062088848806d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.6321205588285574d + "'", double21 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6321205588285574d + "'", double23 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.670902356181524E-139d, 2.0876756987846234E-153d, 15);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.457712003500205E-9d);
        double double3 = poissonDistributionImpl1.probability(0.6426402136161335d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        double double11 = poissonDistributionImpl3.cumulativeProbability(0.6321205588285574d, (double) 100L);
        poissonDistributionImpl3.reseedRandomGenerator((long) 42);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "78) test0977(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.36787944117144256d + "'", double11 == 0.36787944117144256d);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 52);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double16 = poissonDistributionImpl3.cumulativeProbability(37, 37);
        int int18 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double20 = poissonDistributionImpl3.cumulativeProbability(0.9997803485788277d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6321205588285574d + "'", double20 == 0.6321205588285574d);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.628682978044818E-21d, 7.457712003500205E-9d, 41);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(3.4018914738572114E-169d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        poissonDistributionImpl3.reseedRandomGenerator(1L);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int4 = poissonDistributionImpl3.sample();
        double double5 = poissonDistributionImpl3.getMean();
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10L);
        double double8 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) 100);
        double double11 = poissonDistributionImpl3.getMean();
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-12d + "'", double5 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-12d + "'", double8 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-12d + "'", double11 == 1.0E-12d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 106);
        double double15 = poissonDistributionImpl3.normalApproximateProbability((int) '#');
        int int16 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "5) test0983(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
// flaky "33) test0983(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.25464638004358264d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.9999545999035672d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((int) (byte) -1);
        double double12 = poissonDistributionImpl3.cumulativeProbability(10, 32);
        double double14 = poissonDistributionImpl3.normalApproximateProbability(2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "34) test0985(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771200291468E-7d + "'", double12 == 1.0137771200291468E-7d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9331927987311419d + "'", double14 == 0.9331927987311419d);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double11 = poissonDistributionImpl3.getMean();
        double double13 = poissonDistributionImpl3.cumulativeProbability(10);
        double double15 = poissonDistributionImpl3.probability(10000000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6321205588285574d + "'", double10 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999999907838444d + "'", double13 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int4 = poissonDistributionImpl3.sample();
        double double5 = poissonDistributionImpl3.getMean();
        double double8 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 32);
        double double10 = poissonDistributionImpl3.probability(106);
        double double12 = poissonDistributionImpl3.normalApproximateProbability(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-12d + "'", double5 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(52.0d, (int) (short) 1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 'a');
        double double6 = poissonDistributionImpl2.normalApproximateProbability(93);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.999999995668283d + "'", double6 == 0.999999995668283d);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        int int15 = poissonDistributionImpl3.getDomainUpperBound(0.6321205588285574d);
        double double17 = poissonDistributionImpl3.probability(14);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.219851480312614E-12d + "'", double17 == 4.219851480312614E-12d);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (double) ' ', (int) (short) 100);
        double double5 = poissonDistributionImpl3.probability(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double8 = poissonDistributionImpl3.cumulativeProbability(0.36083758160943114d);
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.9999999999991455d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.720075976020836E-44d + "'", double5 == 3.720075976020836E-44d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.7200759760208177E-44d + "'", double8 == 3.7200759760208177E-44d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        int int10 = poissonDistributionImpl3.getDomainLowerBound(10.0d);
        int int11 = poissonDistributionImpl3.sample();
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "35) test0991(org.apache.commons.math.distribution.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(32.0d, 73);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 41);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, 1.3869009421120585E-33d);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(104);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.67364477971208d + "'", double4 == 0.67364477971208d);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability(100);
        double double16 = poissonDistributionImpl3.normalApproximateProbability(2);
        double double18 = poissonDistributionImpl3.normalApproximateProbability(43);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9331927987311419d + "'", double16 == 0.9331927987311419d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4', (-1.0d), 100);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(3.115285807098189E-13d, (double) 11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 52");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.1173711675821023E-12d, 2.755731922395672E-127d);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.normalApproximateProbability(44);
        double double11 = poissonDistributionImpl3.probability(80);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.1401737047361744E-120d + "'", double11 == 5.1401737047361744E-120d);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int4 = poissonDistributionImpl3.sample();
        double double5 = poissonDistributionImpl3.getMean();
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10L);
        double double8 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) 100);
        double double11 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl3.cumulativeProbability(4.719682636442159E-60d, 0.36787944117144233d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-12d + "'", double5 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-12d + "'", double8 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-12d + "'", double11 == 1.0E-12d);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.probability(0.36787943195528694d);
        double double13 = poissonDistributionImpl3.cumulativeProbability(32);
        java.lang.Class<?> wildcardClass14 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (double) ' ', (int) (short) 100);
        double double6 = poissonDistributionImpl3.cumulativeProbability(29, 99);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9601390031908519d + "'", double6 == 0.9601390031908519d);
    }
}
