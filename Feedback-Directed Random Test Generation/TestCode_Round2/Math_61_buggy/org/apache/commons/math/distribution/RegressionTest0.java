package org.apache.commons.math.distribution;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0L, (double) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int0 = org.apache.commons.math.distribution.PoissonDistributionImpl.DEFAULT_MAX_ITERATIONS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10000000 + "'", int0 == 10000000);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability((double) '#', (double) (-1L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) -1);
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
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            int int7 = poissonDistributionImpl3.inverseCumulativeProbability((double) '#');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        double double0 = org.apache.commons.math.distribution.PoissonDistributionImpl.DEFAULT_EPSILON;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0E-12d + "'", double0 == 1.0E-12d);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = poissonDistributionImpl3.sample((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f, 0.0d);
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl3.cumulativeProbability((int) 'a', 1);
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
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability((double) 2147483647, (double) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "1) test0017(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 2 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0, (double) (-1L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl3.cumulativeProbability((double) 'a', 10.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl3.cumulativeProbability((int) '4', (int) (byte) 10);
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
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = poissonDistributionImpl3.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "2) test0021(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass13 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1), (double) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(10);
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
// flaky "3) test0025(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 2, 0, 0, 0, 2, 0, 2, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0L, (double) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0, (double) (short) 10, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0.0f, (double) (-1L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        int int9 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f, (double) (byte) 0);
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
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int int9 = poissonDistributionImpl3.getDomainUpperBound(0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl3.cumulativeProbability(7.457712003500205E-9d, 1.0E-12d);
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
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 1);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, (double) (short) -1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(10000000, 10000000);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (100) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (double) 10.0f, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 10000000);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        java.lang.Class<?> wildcardClass16 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((-1.0d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, (double) (short) -1, (int) (short) 100);
        int[] intArray5 = poissonDistributionImpl3.sample((int) (short) 10);
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
// flaky "4) test0041(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 41, 48, 20, 27, 25, 34, 29, 35, 35, 27 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        int int8 = poissonDistributionImpl2.getDomainLowerBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0.0f, (double) 10000000);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        int int11 = poissonDistributionImpl3.getDomainUpperBound(9.216155638647194E-8d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray9 = poissonDistributionImpl3.sample((int) (byte) 100);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 104);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "5) test0048(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100, 2);
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
// flaky "6) test0049(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 100);
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
// flaky "7) test0050(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 5 });
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 38);
        java.lang.Class<?> wildcardClass19 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', (int) (byte) 1);
        int int3 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl2.inverseCumulativeProbability(0.1251100357211333d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
// flaky "8) test0052(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 87 + "'", int3 == 87);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (double) ' ', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(0.36787943195528694d, (double) (-1.0f));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int5 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        int[] intArray9 = poissonDistributionImpl2.sample(1);
        org.junit.Assert.assertNotNull(intArray4);
// flaky "9) test0054(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 37 + "'", int5 == 37);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 31 });
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) 2);
        poissonDistributionImpl2.reseedRandomGenerator((long) ' ');
        int[] intArray6 = poissonDistributionImpl2.sample(2);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 12, 10 });
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl3.cumulativeProbability(1.0E-12d, 0.36787943195528694d);
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
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, (int) (byte) -1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        int int8 = poissonDistributionImpl2.getDomainLowerBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(4.560969057281241E-69d, (double) (byte) 0);
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
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        double double11 = poissonDistributionImpl2.getMean();
        double double12 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int16 = poissonDistributionImpl3.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = poissonDistributionImpl3.cumulativeProbability(0.9386867598047597d, 1.0137771196302933E-7d);
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
// flaky "10) test0061(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1, 2, 1, 1, 1, 1, 0, 2, 1, 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky "1) test0061(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) -1, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double16 = poissonDistributionImpl3.cumulativeProbability((double) '#', 0.06680720126885803d);
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
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        java.lang.Class<?> wildcardClass14 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl3.cumulativeProbability((double) 'a', (double) '4');
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
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0L, (double) 10.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability(0.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0.0f, (double) (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = poissonDistributionImpl2.inverseCumulativeProbability(0.14723260883568248d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        double double11 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl2.cumulativeProbability(0.8160602794142788d, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        double double9 = poissonDistributionImpl3.cumulativeProbability(100);
        double double11 = poissonDistributionImpl3.probability(2147483647);
        int int13 = poissonDistributionImpl3.inverseCumulativeProbability(0.8160602794142788d);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) '#');
        java.lang.Class<?> wildcardClass16 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double17 = poissonDistributionImpl3.cumulativeProbability(32);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = poissonDistributionImpl3.cumulativeProbability((double) (byte) 0, (double) (-1));
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
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int16 = poissonDistributionImpl3.sample();
        double double18 = poissonDistributionImpl3.cumulativeProbability(3.57198604755006E-167d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, (double) (byte) -1);
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
// flaky "11) test0073(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1, 3, 2, 1, 3, 0, 4, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky "2) test0073(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6321205588285574d + "'", double18 == 0.6321205588285574d);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 0, 0.36787944117144233d, 38);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(100.0d, 3);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(38);
        double double20 = poissonDistributionImpl3.cumulativeProbability((-1), (-1));
        int int21 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
// flaky "3) test0077(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.999778782798785E-13d, 0.0d, (int) (byte) 10);
        int int5 = poissonDistributionImpl3.getDomainLowerBound((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability(0.36787943195528694d, 0.9386867598047597d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl3.cumulativeProbability(100, 34);
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
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = poissonDistributionImpl3.cumulativeProbability(2147483647, 1);
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
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(38);
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
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.8243984514608465E-153d, (int) (byte) 10);
        poissonDistributionImpl2.reseedRandomGenerator((long) 2147483647);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787943195528694d, (double) (short) 10);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double14 = poissonDistributionImpl3.cumulativeProbability((int) '#', 104);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        int int9 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 38 + "'", int9 == 38);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainLowerBound(100.0d);
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        int int17 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "12) test0087(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
// flaky "4) test0087(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int16 = poissonDistributionImpl3.sample();
        double double18 = poissonDistributionImpl3.cumulativeProbability(3.57198604755006E-167d);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = poissonDistributionImpl3.sample((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "13) test0088(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1, 0, 2, 0, 0, 1, 2, 2, 0, 0 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky "1) test0088(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6321205588285574d + "'", double18 == 0.6321205588285574d);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1.0f), (double) 10000000, 30);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl3.cumulativeProbability(9.216155638647194E-8d, 0.0d);
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
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.probability((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.457712003500205E-9d + "'", double8 == 7.457712003500205E-9d);
// flaky "14) test0091(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.793034378392443E-7d + "'", double11 == 4.793034378392443E-7d);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(0.1251100357211333d);
        java.lang.Class<?> wildcardClass18 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainLowerBound((double) (-1));
        double double8 = poissonDistributionImpl3.cumulativeProbability(4.560969057281241E-69d, (double) 34);
        poissonDistributionImpl3.reseedRandomGenerator((long) 10000000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.999778782798785E-13d + "'", double8 == 9.999778782798785E-13d);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
        // The following exception was thrown during execution in test generation
        try {
            double double26 = poissonDistributionImpl3.cumulativeProbability(106, (int) ' ');
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
// flaky "15) test0094(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 4 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.308537538725987d + "'", double23 == 0.308537538725987d);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        java.lang.Class<?> wildcardClass14 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.probability((int) '4');
        double double15 = poissonDistributionImpl3.probability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = poissonDistributionImpl3.cumulativeProbability(0.36787943195528694d, 0.9999999907838444d);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.36787944117144233d + "'", double15 == 0.36787944117144233d);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.216155638647194E-8d);
        double double3 = poissonDistributionImpl1.probability((double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.559174711623875E-287d + "'", double3 == 5.559174711623875E-287d);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) (byte) 0);
        double double4 = poissonDistributionImpl2.cumulativeProbability((int) (short) 100);
        double double6 = poissonDistributionImpl2.probability(2);
        int int8 = poissonDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14723260883568248d + "'", double6 == 0.14723260883568248d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double10 = poissonDistributionImpl2.probability(99);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.457712003500205E-9d + "'", double8 == 7.457712003500205E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.925222664969737E-19d + "'", double10 == 4.925222664969737E-19d);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        poissonDistributionImpl3.reseedRandomGenerator((long) 0);
        double double9 = poissonDistributionImpl3.normalApproximateProbability((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.06680720126885803d + "'", double9 == 0.06680720126885803d);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d, 1.17246204865673E-37d, (int) (byte) 0);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainLowerBound((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability(10.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double16 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) 'a');
        double double19 = poissonDistributionImpl3.cumulativeProbability(1, 99);
        java.lang.Class<?> wildcardClass20 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.36787944117144256d + "'", double19 == 0.36787944117144256d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double9 = poissonDistributionImpl3.getMean();
        int int11 = poissonDistributionImpl3.getDomainLowerBound(0.6321205588285574d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100, 0.18393972058572114d);
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
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        int[] intArray11 = poissonDistributionImpl3.sample((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.probability(0.36787944117144233d);
        int int16 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "16) test0108(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
// flaky "2) test0108(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6321205588285574d, (double) 0.0f, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl3.inverseCumulativeProbability(0.36787944117144233d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (10) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(3.2093315791106567E-171d, 0.29140699867905834d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) (byte) 0);
        double double4 = poissonDistributionImpl2.cumulativeProbability((int) (short) 100);
        double double6 = poissonDistributionImpl2.probability(2);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability(9.999778782798785E-13d, (double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14723260883568248d + "'", double6 == 0.14723260883568248d);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) -1, (double) 10000000, (int) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl2.cumulativeProbability(0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 32");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability((-1));
        int int10 = poissonDistributionImpl2.getDomainUpperBound(7.457712003500205E-9d);
        int[] intArray12 = poissonDistributionImpl2.sample(41);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int5 = poissonDistributionImpl2.sample();
        int[] intArray7 = poissonDistributionImpl2.sample(34);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability(106);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky "17) test0116(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl1.cumulativeProbability(1.3980856271290693E-36d, 3.2093315791106567E-171d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl3.cumulativeProbability((int) '#', (-1));
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
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        int int22 = poissonDistributionImpl3.getDomainUpperBound(10.0d);
        double double24 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "18) test0119(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.308537538725987d + "'", double20 == 0.308537538725987d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.8160602794142788d + "'", double24 == 0.8160602794142788d);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double18 = poissonDistributionImpl3.cumulativeProbability(0.999999999954943d, 0.9386867598047597d);
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
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d);
        double double4 = poissonDistributionImpl1.cumulativeProbability((int) (byte) -1, 5);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int[] intArray17 = poissonDistributionImpl3.sample((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double20 = poissonDistributionImpl3.cumulativeProbability(3.720075976020836E-44d, 4.793034378392443E-7d);
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
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) (short) -1);
        double double12 = poissonDistributionImpl3.probability((double) 10L);
        java.lang.Class<?> wildcardClass13 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0.0f, (double) '#', 24);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 104, 104);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (int) (byte) -1);
        int int3 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability(3.941866060050443E-159d, (double) 24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
// flaky "5) test0127(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((int) (byte) -1);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 0);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "6) test0128(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((double) 2, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, 3.720075976020836E-44d);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 0);
        int[] intArray6 = poissonDistributionImpl2.sample(99);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        int int8 = poissonDistributionImpl3.sample();
        double double10 = poissonDistributionImpl3.probability(35);
        java.lang.Class<?> wildcardClass11 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "7) test0132(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
// flaky "19) test0132(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.5601874895062087E-41d + "'", double10 == 3.5601874895062087E-41d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) 2);
        double double4 = poissonDistributionImpl2.probability((int) 'a');
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.719682636442159E-60d + "'", double4 == 4.719682636442159E-60d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.560969057281241E-69d, (double) 0.0f);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        double double8 = poissonDistributionImpl3.getMean();
        java.lang.Class<?> wildcardClass9 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int5 = poissonDistributionImpl2.sample();
        double double7 = poissonDistributionImpl2.cumulativeProbability((-1));
        int int8 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertNotNull(intArray4);
// flaky "20) test0136(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 23 + "'", int5 == 23);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky "8) test0136(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) -1, 41);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.cumulativeProbability(9.216155638647194E-8d);
        java.lang.Class<?> wildcardClass13 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6321205588285574d + "'", double12 == 0.6321205588285574d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        double double13 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = poissonDistributionImpl3.cumulativeProbability(99, 37);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "21) test0139(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 3 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(38);
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (short) 10);
        java.lang.Class<?> wildcardClass20 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999907838444d + "'", double19 == 0.9999999907838444d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1L), (double) '#', 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', 9.216155638647194E-8d, 0);
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 32");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        poissonDistributionImpl3.reseedRandomGenerator((long) 99);
        double double15 = poissonDistributionImpl3.probability(23);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.4230202807276707E-23d + "'", double15 == 1.4230202807276707E-23d);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(0.1251100357211333d);
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) (short) 10);
        double double20 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999907838444d + "'", double19 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample((int) (short) 100);
        double double17 = poissonDistributionImpl3.probability(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.5601874895062087E-41d + "'", double17 == 3.5601874895062087E-41d);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (double) (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        int int25 = poissonDistributionImpl3.getDomainUpperBound((double) (-1.0f));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "22) test0147(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9386867598047597d, (double) 34, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl3.inverseCumulativeProbability(100.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.18393972058572114d, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl2.cumulativeProbability(1.0E-12d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) '4');
        double double4 = poissonDistributionImpl2.cumulativeProbability(3.720075976020836E-44d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(32, (int) (short) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.999999999999d + "'", double4 == 0.999999999999d);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample((int) (short) 100);
        int int17 = poissonDistributionImpl3.getDomainUpperBound(0.06680720126885803d);
        double double19 = poissonDistributionImpl3.probability(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.36787944117144233d + "'", double19 == 0.36787944117144233d);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(3);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = poissonDistributionImpl2.sample((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.062340213690675E-8d + "'", double8 == 5.062340213690675E-8d);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, (double) (byte) 0);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (-1L));
        double double5 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, 0.9386867598047597d);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 24);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability(100);
        int int16 = poissonDistributionImpl3.getDomainUpperBound(100.0d);
        double double18 = poissonDistributionImpl3.cumulativeProbability(10);
        java.lang.Class<?> wildcardClass19 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9999999907838444d + "'", double18 == 0.9999999907838444d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3980856271290693E-36d, (double) (short) 10);
        double double4 = poissonDistributionImpl2.normalApproximateProbability((-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6321205588285574d, (double) 0.0f, 10);
        double double4 = poissonDistributionImpl3.getMean();
        int[] intArray6 = poissonDistributionImpl3.sample((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = poissonDistributionImpl3.inverseCumulativeProbability((double) '4');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6321205588285574d + "'", double4 == 0.6321205588285574d);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "23) test0157(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1 });
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0137771196302933E-7d);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.probability(38.0d);
        java.lang.Class<?> wildcardClass14 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.033719554105805E-46d + "'", double13 == 7.033719554105805E-46d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.560969057281241E-69d, (double) '4', (int) 'a');
        int int5 = poissonDistributionImpl3.getDomainUpperBound(0.8160602794142788d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability(38, (int) (byte) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 10.0d);
        double double4 = poissonDistributionImpl2.probability(0.533676680517062d);
        double double6 = poissonDistributionImpl2.cumulativeProbability(3.8243984514608465E-153d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6321205588285574d + "'", double6 == 0.6321205588285574d);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) -1, 23);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability(1.0398180320558363E-12d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 106);
        double double16 = poissonDistributionImpl3.cumulativeProbability((-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "24) test0164(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6321205588285574d + "'", double16 == 0.6321205588285574d);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', (int) (byte) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(35);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 100, 0);
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
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0.0f, (double) 38);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6321205588285574d, (double) 0.0f, 10);
        double double4 = poissonDistributionImpl3.getMean();
        int[] intArray6 = poissonDistributionImpl3.sample((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability((double) 34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (10) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6321205588285574d + "'", double4 == 0.6321205588285574d);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "25) test0167(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 2 });
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, (double) (byte) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) 2147483647);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1L), 0.06680720126885803d, 2);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(99);
        int[] intArray5 = poissonDistributionImpl1.sample((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl1.cumulativeProbability((double) 35, 0.06680720126885803d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) 34);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(35.0d, 2.6728134305602215E-44d);
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
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        int int10 = poissonDistributionImpl3.sample();
        double double12 = poissonDistributionImpl3.cumulativeProbability(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "26) test0172(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999907838444d + "'", double12 == 0.9999999907838444d);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 0, 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(10);
        double double7 = poissonDistributionImpl3.probability((double) 10);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "27) test0174(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 2, 0, 1, 1, 2, 1, 2, 1, 1, 0 });
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0137771196302933E-7d + "'", double7 == 1.0137771196302933E-7d);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, (double) (short) -1, (int) (short) 100);
        int[] intArray5 = poissonDistributionImpl3.sample((int) (short) 10);
        int int7 = poissonDistributionImpl3.getDomainLowerBound((double) 100L);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "28) test0175(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 42, 28, 43, 35, 52, 28, 27, 39, 40, 34 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        poissonDistributionImpl3.reseedRandomGenerator((long) 105);
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
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0, (double) (short) 0, 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, 0.9386867598047597d);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((int) (byte) 0);
        double double12 = poissonDistributionImpl3.cumulativeProbability((-1), (-1));
        int int13 = poissonDistributionImpl3.sample();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = poissonDistributionImpl3.inverseCumulativeProbability((-1.0d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "29) test0180(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
// flaky "9) test0180(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 100);
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
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, (double) (short) 10);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability(2147483647, 36);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8345580221844533d + "'", double6 == 0.8345580221844533d);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1L), 0.06680720126885803d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, 0.8160602794142788d, 2);
        int[] intArray5 = poissonDistributionImpl3.sample(3);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "30) test0185(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 0, 2 });
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d);
        int[] intArray3 = poissonDistributionImpl1.sample(1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0 });
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.probability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = poissonDistributionImpl3.cumulativeProbability(104, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.36787944117144233d + "'", double10 == 0.36787944117144233d);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainUpperBound(4.560969057281241E-69d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = poissonDistributionImpl3.inverseCumulativeProbability((double) 2);
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
// flaky "31) test0188(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.36787943195528694d + "'", double17 == 0.36787943195528694d);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        int int14 = poissonDistributionImpl3.sample();
        double double16 = poissonDistributionImpl3.probability((double) 1);
        java.lang.Class<?> wildcardClass17 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
// flaky "32) test0189(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.36787944117144233d + "'", double16 == 0.36787944117144233d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(3);
        int int10 = poissonDistributionImpl2.getDomainLowerBound((double) 35);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.062340213690675E-8d + "'", double8 == 5.062340213690675E-8d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 30, 1.0398180320558363E-12d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, (int) 'a');
        int int3 = poissonDistributionImpl2.sample();
        double double6 = poissonDistributionImpl2.cumulativeProbability((double) (-1.0f), 2.7476693956635508E-33d);
// flaky "33) test0192(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3678794445618948d + "'", double6 == 0.3678794445618948d);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int4 = poissonDistributionImpl3.sample();
        double double5 = poissonDistributionImpl3.getMean();
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10L);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-12d + "'", double5 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-12d + "'", double8 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double17 = poissonDistributionImpl3.cumulativeProbability(32);
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100);
        int int21 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4', (-1.0d), 100);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability(37);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 52");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 106);
        double double15 = poissonDistributionImpl3.cumulativeProbability(0.999999999954943d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(1.2460656213271568E-39d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = poissonDistributionImpl3.cumulativeProbability(43, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "10) test0196(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6321205588285574d + "'", double15 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', 9.216155638647194E-8d, 0);
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability((double) (-1L), (double) 44);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        double double11 = poissonDistributionImpl3.cumulativeProbability(0.6321205588285574d, (double) 100L);
        double double12 = poissonDistributionImpl3.getMean();
        double double13 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "34) test0198(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.36787944117144256d + "'", double11 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (short) 1);
        double double8 = poissonDistributionImpl2.normalApproximateProbability((int) '#');
        double double10 = poissonDistributionImpl2.probability(5);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "35) test0199(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 23 });
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.533676680517062d + "'", double8 == 0.533676680517062d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.7596379528070493E-10d + "'", double10 == 2.7596379528070493E-10d);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (int) (byte) -1);
        int int3 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability(1, 2147483647);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
// flaky "36) test0200(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 1.0E-12d, 100);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 0.9386867598047597d, 105);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        int int12 = poissonDistributionImpl3.getDomainUpperBound(0.14723260883568248d);
        double double14 = poissonDistributionImpl3.cumulativeProbability(41);
        java.lang.Class<?> wildcardClass15 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6321205588285574d + "'", double10 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, (double) (short) 10);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = poissonDistributionImpl2.inverseCumulativeProbability((double) 36);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8345580221844533d + "'", double6 == 0.8345580221844533d);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6728134305602215E-44d, 106);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) (-1.0f));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int[] intArray17 = poissonDistributionImpl3.sample((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double20 = poissonDistributionImpl3.cumulativeProbability(0.14723260883568248d, 9.216155638647194E-8d);
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
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
            int int23 = poissonDistributionImpl3.inverseCumulativeProbability(100.0d);
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
// flaky "11) test0209(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 30);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
// flaky "37) test0210(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray4, new int[] { 34, 40, 39, 37, 38, 44, 42, 40, 35, 39 });
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1);
        double double3 = poissonDistributionImpl1.probability((int) (byte) 10);
        double double5 = poissonDistributionImpl1.cumulativeProbability(34);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0137771196302933E-7d + "'", double3 == 1.0137771196302933E-7d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (double) (-1), (-1));
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100, (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 105, 1.0398180320558363E-12d);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1), 32);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        int int5 = poissonDistributionImpl1.getDomainUpperBound((double) (-1L));
        poissonDistributionImpl1.reseedRandomGenerator((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl1.cumulativeProbability((double) 'a', (double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability((int) ' ');
        int int16 = poissonDistributionImpl3.getDomainUpperBound((double) 1.0f);
        double double18 = poissonDistributionImpl3.normalApproximateProbability(43);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a');
        int int3 = poissonDistributionImpl1.getDomainUpperBound(4.539992976248491E-5d);
        double double5 = poissonDistributionImpl1.cumulativeProbability(4.719682636442159E-60d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.471972337343043E-43d + "'", double5 == 7.471972337343043E-43d);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(4.018416977195786E-54d, 0.14723260883568248d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray9 = poissonDistributionImpl3.sample((int) (byte) 100);
        int int10 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray9);
// flaky "38) test0220(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "12) test0221(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6321205588285574d + "'", double20 == 0.6321205588285574d);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1);
        double double3 = poissonDistributionImpl1.probability((int) (byte) 10);
        int[] intArray5 = poissonDistributionImpl1.sample(3);
        int[] intArray7 = poissonDistributionImpl1.sample(10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0137771196302933E-7d + "'", double3 == 1.0137771196302933E-7d);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "39) test0222(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 2, 1, 0 });
        org.junit.Assert.assertNotNull(intArray7);
// flaky "13) test0222(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0, 0, 0, 1, 1, 2, 0, 1, 0, 2 });
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double17 = poissonDistributionImpl3.cumulativeProbability(32);
        double double19 = poissonDistributionImpl3.probability((double) 106);
        java.lang.Class<?> wildcardClass20 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.2093315791106567E-171d + "'", double19 == 3.2093315791106567E-171d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(99);
        double double6 = poissonDistributionImpl1.cumulativeProbability(35, 100);
        int int8 = poissonDistributionImpl1.getDomainUpperBound(3.8243984514608465E-153d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6728134305602215E-44d, 0.691462461274013d, 37);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(34, 30);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability(4.018416977195786E-54d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 30);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainUpperBound(4.560969057281241E-69d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = poissonDistributionImpl3.cumulativeProbability((int) '4', 32);
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
// flaky "40) test0228(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) (-1L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((int) (byte) 0);
        double double12 = poissonDistributionImpl3.cumulativeProbability((-1), (-1));
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "41) test0230(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        double double8 = poissonDistributionImpl3.getMean();
        int[] intArray10 = poissonDistributionImpl3.sample(44);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (double) (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability(35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        int int15 = poissonDistributionImpl3.getDomainLowerBound((double) 2147483647);
        java.lang.Class<?> wildcardClass16 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "42) test0234(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.probability(1.0d);
        double double13 = poissonDistributionImpl3.normalApproximateProbability(2);
        double double16 = poissonDistributionImpl3.cumulativeProbability(5, 37);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.36787944117144233d + "'", double11 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9331927987311419d + "'", double13 == 0.9331927987311419d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0030656620097619935d + "'", double16 == 0.0030656620097619935d);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6321205588285574d + "'", double11 == 0.6321205588285574d);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d, (double) (-1), 0);
        double double5 = poissonDistributionImpl3.probability(0.14723260883568248d);
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.01377703554215E-7d);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability((int) '#', 41);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.457712003500205E-9d + "'", double8 == 7.457712003500205E-9d);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.139132792048018E-17d, 0.0d);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', (int) (byte) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(35);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability((int) '4', 3);
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
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8345580221844533d, 0.06680720126885803d, 36);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, 0.691462461274013d);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        int int15 = poissonDistributionImpl3.getDomainLowerBound((double) 2147483647);
        double double17 = poissonDistributionImpl3.probability(105);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "43) test0244(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.4018914738572114E-169d + "'", double17 == 3.4018914738572114E-169d);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4', (-1.0d), 100);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (100) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.probability(0.36787943195528694d);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        double double14 = poissonDistributionImpl3.normalApproximateProbability((int) (short) -1);
        double double16 = poissonDistributionImpl3.probability((double) 30);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06680720126885803d + "'", double14 == 0.06680720126885803d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.3869009421120585E-33d + "'", double16 == 1.3869009421120585E-33d);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(52.0d, (double) 3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 52");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (double) 23, 3);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(0.1251100357211333d);
        double double19 = poissonDistributionImpl3.cumulativeProbability(1.4230202807276707E-23d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6321205588285574d + "'", double19 == 0.6321205588285574d);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        double double20 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "44) test0251(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        int int7 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
// flaky "14) test0252(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3980856271290693E-36d, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 99);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl1.cumulativeProbability((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.probability(1.3869009421120585E-33d);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 38 + "'", int9 == 38);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, 1.17246204865673E-37d);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7476693956635508E-33d, 0.0030656620097620196d);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, (double) 99, 2147483647);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (short) 1);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = poissonDistributionImpl2.inverseCumulativeProbability(0.18393972058572114d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "45) test0260(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 40 });
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.4230202807276707E-23d, (double) 5);
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) (-1L), 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        // The following exception was thrown during execution in test generation
        try {
            double double24 = poissonDistributionImpl3.cumulativeProbability(4.018416977195786E-54d, (double) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (int) '4');
        double double4 = poissonDistributionImpl2.probability(7.457712003500205E-9d);
        double double7 = poissonDistributionImpl2.cumulativeProbability(2, 99);
        int int9 = poissonDistributionImpl2.getDomainLowerBound(4.018416977195786E-54d);
        double double11 = poissonDistributionImpl2.probability((double) 37);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.19699216367798777d + "'", double7 == 0.19699216367798777d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7401052582713831E-47d + "'", double11 == 1.7401052582713831E-47d);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
            double double22 = poissonDistributionImpl3.cumulativeProbability(43, 0);
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
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (short) 1);
        double double8 = poissonDistributionImpl2.probability(0.025956482467509034d);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "46) test0265(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 34 });
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        double double24 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "15) test0266(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.36787944117144233d + "'", double21 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.36787944117144233d + "'", double23 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        int int10 = poissonDistributionImpl3.sample();
        int int12 = poissonDistributionImpl3.getDomainUpperBound(0.308537538725987d);
        java.lang.Class<?> wildcardClass13 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "16) test0267(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double13 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double15 = poissonDistributionImpl3.cumulativeProbability(10000000);
        poissonDistributionImpl3.reseedRandomGenerator((long) 34);
        double double19 = poissonDistributionImpl3.normalApproximateProbability(44);
        int[] intArray21 = poissonDistributionImpl3.sample(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.691462461274013d + "'", double13 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] {});
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        double double4 = poissonDistributionImpl1.getMean();
        double double7 = poissonDistributionImpl1.cumulativeProbability(4.560969057281241E-69d, (double) 99);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl1.cumulativeProbability((double) 12, 0.9999999999977743d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999546000702375d + "'", double7 == 0.9999546000702375d);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        double double23 = poissonDistributionImpl3.probability(3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.691462461274013d + "'", double13 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.06131324019524039d + "'", double23 == 0.06131324019524039d);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 30);
        double double4 = poissonDistributionImpl2.cumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999999997d + "'", double4 == 0.9999999999999997d);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        int int15 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 35);
        double double20 = poissonDistributionImpl3.cumulativeProbability(3.941866060050443E-159d);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = poissonDistributionImpl3.cumulativeProbability((double) 10, (double) 0L);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6321205588285574d + "'", double20 == 0.6321205588285574d);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl3.cumulativeProbability(43, 32);
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
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) -1, 0.19699216367798777d, (int) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int17 = poissonDistributionImpl3.getDomainLowerBound((double) 3);
        int int19 = poissonDistributionImpl3.getDomainLowerBound(10.0d);
        java.lang.Class<?> wildcardClass20 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "47) test0276(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, 4, 1, 2, 0, 2, 1, 2, 0 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d, (double) (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl3.inverseCumulativeProbability((double) 106);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.025956482467509034d);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        int int25 = poissonDistributionImpl3.sample();
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
// flaky "48) test0280(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
// flaky "17) test0280(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
// flaky "3) test0280(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.05698471084507295d);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((-1.0d), 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 12, 30);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability(100);
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(0.6321205588285574d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = poissonDistributionImpl3.cumulativeProbability((double) 24, (double) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.probability(0.36787943195528694d);
        double double13 = poissonDistributionImpl3.probability(98);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.902447399449791E-155d + "'", double13 == 3.902447399449791E-155d);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability(32);
        double double17 = poissonDistributionImpl3.cumulativeProbability(27);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06680720126885803d, 7.033719554105805E-46d, 37);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.probability(7.033719554105805E-46d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "49) test0288(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, 0.14723260883568248d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((int) (short) 100, 44);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d, (-1.0d), 106);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        java.lang.Class<?> wildcardClass21 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "18) test0291(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6321205588285574d + "'", double20 == 0.6321205588285574d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 1L);
        double double14 = poissonDistributionImpl3.probability(3);
        java.lang.Class<?> wildcardClass15 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "50) test0292(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06131324019524039d + "'", double14 == 0.06131324019524039d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 30, (double) 10000000);
        poissonDistributionImpl2.reseedRandomGenerator((long) 30);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(106, 41);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9386867598047597d, 0.0d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 23);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        double double24 = poissonDistributionImpl3.normalApproximateProbability(44);
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
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, (int) 'a');
        int int3 = poissonDistributionImpl2.sample();
        int int5 = poissonDistributionImpl2.getDomainLowerBound(0.6922006339347749d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl2.cumulativeProbability(0.19699216367798777d, 0.999999999999d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky "51) test0296(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability((int) ' ');
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(0.29140699867905834d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = poissonDistributionImpl3.cumulativeProbability(80, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        int int14 = poissonDistributionImpl3.getDomainUpperBound((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = poissonDistributionImpl3.cumulativeProbability(7.214425871271413E-5d, 0.533676680517062d);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        double double9 = poissonDistributionImpl3.cumulativeProbability(100);
        double double11 = poissonDistributionImpl3.normalApproximateProbability(36);
        double double13 = poissonDistributionImpl3.probability((double) 'a');
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability(7.033719554105805E-46d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = poissonDistributionImpl3.cumulativeProbability(10.0d, 0.14723260883568248d);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.8243984514608465E-153d + "'", double13 == 3.8243984514608465E-153d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.999778782798785E-13d, (double) 100L);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 'a');
        int[] intArray8 = poissonDistributionImpl2.sample(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 106);
        double double15 = poissonDistributionImpl3.cumulativeProbability(0.999999999954943d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(1.2460656213271568E-39d);
        double double18 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "52) test0301(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6321205588285574d + "'", double15 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) 2);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.9386867598047597d);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        int int8 = poissonDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = poissonDistributionImpl2.normalApproximateProbability(24);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl2.cumulativeProbability((double) 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.03796348149127876d + "'", double10 == 0.03796348149127876d);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
            double double28 = poissonDistributionImpl3.cumulativeProbability((double) 36, 1.1173711675821023E-12d);
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
// flaky "53) test0304(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.308537538725987d + "'", double23 == 0.308537538725987d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.2460656213271568E-39d + "'", double25 == 1.2460656213271568E-39d);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.57198604755006E-167d, (int) (byte) 100);
        double double4 = poissonDistributionImpl2.probability(30);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.999778782798785E-13d, 0.0d, (int) (byte) 10);
        int int5 = poissonDistributionImpl3.getDomainLowerBound((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double9 = poissonDistributionImpl3.getMean();
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 1L);
        int int13 = poissonDistributionImpl3.getDomainLowerBound((double) (byte) 1);
        double double15 = poissonDistributionImpl3.cumulativeProbability(98);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 32, (double) 1L, 43);
        double double6 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 10000000);
        double double8 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.609088260248484E-6d + "'", double8 == 5.609088260248484E-6d);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        int int12 = poissonDistributionImpl3.getDomainUpperBound(0.14723260883568248d);
        double double14 = poissonDistributionImpl3.cumulativeProbability(41);
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = poissonDistributionImpl3.cumulativeProbability(3.4018914738572114E-169d, 6.305116760146996E-16d);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.033719554105805E-46d, 4.925222664969737E-19d, 106);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 104, 32);
        double double5 = poissonDistributionImpl2.cumulativeProbability(30, 80);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.008575364588394788d + "'", double5 == 0.008575364588394788d);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int int17 = poissonDistributionImpl3.getDomainUpperBound((double) 35);
        double double18 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d);
        poissonDistributionImpl1.reseedRandomGenerator((long) 2147483647);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 41, 0.0d, 3);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5429999234951242d, 35);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double13 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double15 = poissonDistributionImpl3.cumulativeProbability(10000000);
        poissonDistributionImpl3.reseedRandomGenerator((long) 34);
        double double19 = poissonDistributionImpl3.normalApproximateProbability(44);
        double double21 = poissonDistributionImpl3.normalApproximateProbability(24);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.691462461274013d + "'", double13 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1.0f), 97.0d, 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 38, 3.57198604755006E-167d);
        double double5 = poissonDistributionImpl2.cumulativeProbability(1.17246204865673E-37d, (double) 34);
        double double6 = poissonDistributionImpl2.getMean();
        double double8 = poissonDistributionImpl2.probability(30);
        int int9 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.29140699867905834d + "'", double5 == 0.29140699867905834d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 38.0d + "'", double6 == 38.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.029285828261849244d + "'", double8 == 0.029285828261849244d);
// flaky "54) test0319(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 46 + "'", int9 == 46);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) -1, 98);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double13 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double15 = poissonDistributionImpl3.cumulativeProbability(10000000);
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(0.8160602794142788d);
        int[] intArray19 = poissonDistributionImpl3.sample(37);
        double double21 = poissonDistributionImpl3.cumulativeProbability(38);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.691462461274013d + "'", double13 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        int int8 = poissonDistributionImpl3.sample();
        double double10 = poissonDistributionImpl3.probability(35);
        double double12 = poissonDistributionImpl3.cumulativeProbability(4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "19) test0322(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
// flaky "55) test0322(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.5601874895062087E-41d + "'", double10 == 3.5601874895062087E-41d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6321205588285574d + "'", double12 == 0.6321205588285574d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.680129694168893E-10d);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        poissonDistributionImpl3.reseedRandomGenerator((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 100);
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
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (int) '4');
        double double4 = poissonDistributionImpl2.probability(0.308537538725987d);
        int int6 = poissonDistributionImpl2.getDomainUpperBound(0.14723260883568248d);
        int[] intArray8 = poissonDistributionImpl2.sample(23);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(intArray8);
// flaky "56) test0325(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 2, 0, 1, 0, 1, 2, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1 });
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        java.lang.Class<?> wildcardClass18 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "57) test0326(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.025956482467509034d, 0.9353755231673158d);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 1);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        int int12 = poissonDistributionImpl3.getDomainUpperBound((double) 10000000);
        int int14 = poissonDistributionImpl3.inverseCumulativeProbability(4.719682636442159E-60d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "20) test0328(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "58) test0329(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 41 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06131324019524039d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) (byte) 10, (int) (short) -1);
        double double5 = poissonDistributionImpl3.probability((double) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.039860996809147134d + "'", double5 == 0.039860996809147134d);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787943195528694d, 3.941866060050443E-159d, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', (int) (byte) 1);
        int int3 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(0.8862636038898793d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 97");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
// flaky "59) test0333(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 83 + "'", int3 == 83);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        double double14 = poissonDistributionImpl3.cumulativeProbability((int) 'a', 2147483647);
        int int16 = poissonDistributionImpl3.getDomainLowerBound((double) (-1));
        int int18 = poissonDistributionImpl3.getDomainUpperBound((double) 24);
        double double20 = poissonDistributionImpl3.cumulativeProbability(23);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int17 = poissonDistributionImpl3.getDomainLowerBound((double) 3);
        int int19 = poissonDistributionImpl3.getDomainLowerBound(10.0d);
        double double22 = poissonDistributionImpl3.cumulativeProbability(24, 43);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "60) test0335(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 1, 0, 1, 1, 4, 1, 1, 1, 3 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9386867598047597d, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double17 = poissonDistributionImpl3.cumulativeProbability(32);
        double double19 = poissonDistributionImpl3.cumulativeProbability((-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0030656620097619935d, 1.2460656213271568E-39d, (-1));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, 106);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(1.17246204865673E-37d);
        int[] intArray6 = poissonDistributionImpl2.sample(23);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
// flaky "61) test0339(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 2, 0, 2, 0, 0, 1, 3, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0 });
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        int int14 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        double double16 = poissonDistributionImpl3.probability(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "21) test0340(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6321205588285574d + "'", double12 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.36787944117144233d + "'", double16 == 0.36787944117144233d);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3525511311226325d, (double) 5);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double10 = poissonDistributionImpl2.probability(0.9999999999999997d);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.457712003500205E-9d + "'", double8 == 7.457712003500205E-9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, 0.5429999234951242d, 36);
        int[] intArray5 = poissonDistributionImpl3.sample(10);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "62) test0343(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 1, 1, 3, 0, 1, 1, 0, 0, 0 });
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 106);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) 3);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "22) test0344(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d, 104);
        double double4 = poissonDistributionImpl2.probability((int) (byte) 1);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25464638004358264d + "'", double4 == 0.25464638004358264d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        double double9 = poissonDistributionImpl3.cumulativeProbability(100);
        double double11 = poissonDistributionImpl3.probability(2147483647);
        int int13 = poissonDistributionImpl3.inverseCumulativeProbability(0.8160602794142788d);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double17 = poissonDistributionImpl3.cumulativeProbability(12);
        java.lang.Class<?> wildcardClass18 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.999999999940922d + "'", double17 == 0.999999999940922d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, 0.25464638004358264d);
        double double4 = poissonDistributionImpl2.probability((double) (-1L));
        int int6 = poissonDistributionImpl2.getDomainLowerBound((double) 10L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        int int15 = poissonDistributionImpl3.getDomainUpperBound(0.6321205588285574d);
        double double17 = poissonDistributionImpl3.normalApproximateProbability((int) (short) -1);
        int[] intArray19 = poissonDistributionImpl3.sample(99);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.06680720126885803d + "'", double17 == 0.06680720126885803d);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 98, 1.4230202807276707E-23d, 23);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double9 = poissonDistributionImpl3.getMean();
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 1L);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        double double11 = poissonDistributionImpl2.getMean();
        double double12 = poissonDistributionImpl2.getMean();
        int int13 = poissonDistributionImpl2.sample();
        double double15 = poissonDistributionImpl2.normalApproximateProbability(23);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = poissonDistributionImpl2.inverseCumulativeProbability(0.691462461274013d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 38 + "'", int13 == 38);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.025956482467509034d + "'", double15 == 0.025956482467509034d);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability(100);
        double double16 = poissonDistributionImpl3.normalApproximateProbability(2);
        double double17 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9331927987311419d + "'", double16 == 0.9331927987311419d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, (int) 'a');
        double double4 = poissonDistributionImpl2.probability(46);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.685526970917836E-59d + "'", double4 == 6.685526970917836E-59d);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.457712003500205E-9d);
        poissonDistributionImpl1.reseedRandomGenerator((long) (byte) 1);
        int[] intArray5 = poissonDistributionImpl1.sample(36);
        double double7 = poissonDistributionImpl1.cumulativeProbability(0.6922006339347749d);
        double double9 = poissonDistributionImpl1.cumulativeProbability(0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.999999992542288d + "'", double7 == 0.999999992542288d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.999999992542288d + "'", double9 == 0.999999992542288d);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.8243984514608465E-153d, (int) (byte) 10);
        double double3 = poissonDistributionImpl2.getMean();
        int[] intArray5 = poissonDistributionImpl2.sample((int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.8243984514608465E-153d + "'", double3 == 3.8243984514608465E-153d);
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (double) 24, 27);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.999778782798785E-13d, (double) 100L);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        int[] intArray6 = poissonDistributionImpl2.sample(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, 104);
        poissonDistributionImpl2.reseedRandomGenerator(1L);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(99);
        int[] intArray5 = poissonDistributionImpl1.sample((int) ' ');
        double double7 = poissonDistributionImpl1.cumulativeProbability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0.0f, 4.5399929762484845E-4d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.999778782798785E-13d, (double) 100L);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 'a');
        int int8 = poissonDistributionImpl2.getDomainUpperBound(4.925222664969737E-19d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.2913989097407664E-60d);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.probability(24);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = poissonDistributionImpl2.inverseCumulativeProbability((double) 104);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.011604342211143792d + "'", double11 == 0.011604342211143792d);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9386867598047597d);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((int) (byte) -1);
        double double11 = poissonDistributionImpl3.probability((double) (byte) 100);
        int int13 = poissonDistributionImpl3.getDomainLowerBound(38.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "23) test0365(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.941866060050443E-159d + "'", double11 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        int[] intArray13 = poissonDistributionImpl3.sample((int) 'a');
        int[] intArray15 = poissonDistributionImpl3.sample(80);
        double double17 = poissonDistributionImpl3.probability(29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.160702826336122E-32d + "'", double17 == 4.160702826336122E-32d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7596379528070493E-10d, 3.902447399449791E-155d, 23);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.216155638647194E-8d, 0.9331927987311419d);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, (int) 'a');
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.probability((double) 10);
        double double6 = poissonDistributionImpl2.getMean();
// flaky "24) test0369(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.01377703554215E-7d + "'", double5 == 1.01377703554215E-7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999907838444d + "'", double6 == 0.9999999907838444d);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int int13 = poissonDistributionImpl3.getDomainUpperBound(7.033719554105805E-46d);
        double double16 = poissonDistributionImpl3.cumulativeProbability(4.2913989097407664E-60d, (double) 12);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3678794411123646d + "'", double16 == 0.3678794411123646d);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, (double) (byte) 0);
        double double4 = poissonDistributionImpl2.probability(52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.628682978044818E-21d + "'", double4 == 5.628682978044818E-21d);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 38, 3.57198604755006E-167d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(3.5601874895062087E-41d, 5.062340213690675E-8d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 38);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.25464638004358264d);
        double double2 = poissonDistributionImpl1.getMean();
        double double3 = poissonDistributionImpl1.getMean();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = poissonDistributionImpl1.sample((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25464638004358264d + "'", double2 == 0.25464638004358264d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.25464638004358264d + "'", double3 == 0.25464638004358264d);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0137771196302933E-7d, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 98);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) -1, 0.999999999940922d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        int int24 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) 34);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.29140699867905834d, 0.999999992542288d, (int) '4');
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 1L);
        double double15 = poissonDistributionImpl3.cumulativeProbability(0.05698471084507295d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "25) test0379(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.36787944117144256d + "'", double15 == 0.36787944117144256d);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) (byte) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 29);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029285828261849244d, (int) '4');
        poissonDistributionImpl2.reseedRandomGenerator((long) 2147483647);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.4018914738572114E-169d, 24);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double10 = poissonDistributionImpl3.getMean();
        int int12 = poissonDistributionImpl3.getDomainUpperBound((double) 23);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (double) 34);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = poissonDistributionImpl3.cumulativeProbability(106, 80);
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
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.011604342211143792d);
        double double3 = poissonDistributionImpl1.cumulativeProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 23, (int) ' ');
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability(100);
        int int16 = poissonDistributionImpl3.getDomainUpperBound(100.0d);
        double double18 = poissonDistributionImpl3.cumulativeProbability(10);
        double double20 = poissonDistributionImpl3.probability(5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9999999907838444d + "'", double18 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0030656620097620196d + "'", double20 == 0.0030656620097620196d);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 32);
        poissonDistributionImpl2.reseedRandomGenerator((long) ' ');
        double double6 = poissonDistributionImpl2.cumulativeProbability(0.9999999907838444d);
        int int8 = poissonDistributionImpl2.getDomainLowerBound(0.19699216367798777d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.139132792048018E-17d + "'", double6 == 3.139132792048018E-17d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        double double11 = poissonDistributionImpl3.probability((double) 106);
        double double13 = poissonDistributionImpl3.cumulativeProbability(0.3525511311226325d);
        java.lang.Class<?> wildcardClass14 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.2093315791106567E-171d + "'", double11 == 3.2093315791106567E-171d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6321205588285574d + "'", double13 == 0.6321205588285574d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 3.902447399449791E-155d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (int) '4');
        double double4 = poissonDistributionImpl2.cumulativeProbability(3.8243984514608465E-153d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4421702547125971d + "'", double4 == 0.4421702547125971d);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(104.0d, (double) (short) 10);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability(32);
        double double16 = poissonDistributionImpl3.getMean();
        double double17 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = poissonDistributionImpl3.cumulativeProbability(0.021990921302225148d, 0.36787944117144256d);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability(1.0137771196302933E-7d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (10) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, 2);
        int int3 = poissonDistributionImpl2.sample();
// flaky "63) test0396(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 86 + "'", int3 == 86);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        double double13 = poissonDistributionImpl3.getMean();
        java.lang.Class<?> wildcardClass14 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "64) test0397(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, 0);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(4.793034378392443E-7d);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.7455062667769425E-9d + "'", double6 == 2.7455062667769425E-9d);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainLowerBound(100.0d);
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        double double18 = poissonDistributionImpl3.cumulativeProbability(98);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "65) test0399(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        double double15 = poissonDistributionImpl3.getMean();
        double double17 = poissonDistributionImpl3.probability(10);
        int[] intArray19 = poissonDistributionImpl3.sample(30);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0137771196302933E-7d + "'", double17 == 1.0137771196302933E-7d);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        // The following exception was thrown during execution in test generation
        try {
            double double26 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1, (int) (short) -1);
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
// flaky "66) test0401(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "67) test0402(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 4, 0, 3, 0, 3, 0, 2, 0, 1, 0 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.03796348149127876d, 44);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(0.05698471084507295d, 0.999999999954943d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, (double) 0, (int) (byte) -1);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.40894881836993996d + "'", double5 == 0.40894881836993996d);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3980856271290693E-36d, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(1.17246204865673E-37d, 4.5399929762484845E-4d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.4230202807276707E-23d, 0.029285828261849244d, 23);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0d, 0.19699216367798777d, (int) (byte) 10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d, 1.17246204865673E-37d, (int) (byte) 0);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl3.cumulativeProbability(0.999999999954943d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl2.cumulativeProbability(106);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (short) 1);
        double double7 = poissonDistributionImpl2.getMean();
        int[] intArray9 = poissonDistributionImpl2.sample(3);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(4.3013378484179026E-15d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "68) test0410(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 40 });
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(intArray9);
// flaky "26) test0410(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray9, new int[] { 34, 34, 33 });
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.19699216367798777d);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 32);
        poissonDistributionImpl2.reseedRandomGenerator((long) ' ');
        double double5 = poissonDistributionImpl2.getMean();
        int int7 = poissonDistributionImpl2.getDomainLowerBound(0.3525511311226325d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 38.0d + "'", double5 == 38.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainUpperBound(0.025956482467509034d);
        java.lang.Class<?> wildcardClass13 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
            double double19 = poissonDistributionImpl3.cumulativeProbability(12, (int) (byte) 1);
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
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 32);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        double double14 = poissonDistributionImpl3.normalApproximateProbability((int) (short) -1);
        double double16 = poissonDistributionImpl3.probability(10000000);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06680720126885803d + "'", double14 == 0.06680720126885803d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3678794445618948d, 2.7596379528070493E-10d);
        double double4 = poissonDistributionImpl2.probability((double) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25464638152708935d + "'", double4 == 0.25464638152708935d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.680129694168893E-10d, 0.0d, 43);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainUpperBound(4.560969057281241E-69d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(0, (int) (short) 10);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double22 = poissonDistributionImpl3.cumulativeProbability((int) 'a', 41);
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
// flaky "69) test0419(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9999999907838444d + "'", double17 == 0.9999999907838444d);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        double double11 = poissonDistributionImpl2.getMean();
        double double12 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 23);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.4421702547125971d);
        double double4 = poissonDistributionImpl1.cumulativeProbability(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6426402136161335d + "'", double4 == 0.6426402136161335d);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        double double9 = poissonDistributionImpl3.cumulativeProbability(100);
        double double11 = poissonDistributionImpl3.normalApproximateProbability(36);
        double double13 = poissonDistributionImpl3.probability((double) 'a');
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability(7.033719554105805E-46d);
        poissonDistributionImpl3.reseedRandomGenerator((long) 29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.8243984514608465E-153d + "'", double13 == 3.8243984514608465E-153d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 38);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        java.lang.Class<?> wildcardClass25 = poissonDistributionImpl3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        int int13 = poissonDistributionImpl3.inverseCumulativeProbability(9.216155638647194E-8d);
        double double15 = poissonDistributionImpl3.probability(2);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) -1);
        double double19 = poissonDistributionImpl3.probability((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = poissonDistributionImpl3.cumulativeProbability(106, 12);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.18393972058572114d + "'", double15 == 0.18393972058572114d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.941866060050443E-159d + "'", double19 == 3.941866060050443E-159d);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(0.691462461274013d);
        int[] intArray19 = poissonDistributionImpl3.sample(98);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "70) test0426(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(30);
        int int5 = poissonDistributionImpl1.getDomainUpperBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl1.cumulativeProbability(5, 3);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.999999999954943d + "'", double3 == 0.999999999954943d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        double double14 = poissonDistributionImpl3.probability((int) (short) -1);
        double double16 = poissonDistributionImpl3.normalApproximateProbability(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "71) test0428(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.308537538725987d + "'", double16 == 0.308537538725987d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) 34);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        int int23 = poissonDistributionImpl3.getDomainLowerBound(0.9846716899511899d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "72) test0430(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 3 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 100);
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        double double14 = poissonDistributionImpl3.probability(32);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = poissonDistributionImpl3.inverseCumulativeProbability((double) 30);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.3980856271290693E-36d + "'", double14 == 1.3980856271290693E-36d);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) 'a');
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "73) test0432(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        int int10 = poissonDistributionImpl3.sample();
        double double11 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "74) test0433(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double17 = poissonDistributionImpl3.cumulativeProbability(32);
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100);
        double double21 = poissonDistributionImpl3.normalApproximateProbability(105);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 100);
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
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        double double21 = poissonDistributionImpl3.normalApproximateProbability(0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "75) test0436(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.308537538725987d + "'", double21 == 0.308537538725987d);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, 9.216155638647194E-8d, 0);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3980856271290693E-36d, (double) (short) 10);
        double double4 = poissonDistributionImpl2.probability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.3980856271290628E-36d + "'", double4 == 1.3980856271290628E-36d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        int int8 = poissonDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = poissonDistributionImpl2.probability((int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.06161675254888723d + "'", double10 == 0.06161675254888723d);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        poissonDistributionImpl3.reseedRandomGenerator((long) 1);
        double double27 = poissonDistributionImpl3.probability(80);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "76) test0440(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.36787944117144233d + "'", double21 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.36787944117144233d + "'", double23 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5.1401737047361744E-120d + "'", double27 == 5.1401737047361744E-120d);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (short) 1);
        double double8 = poissonDistributionImpl2.normalApproximateProbability((int) '#');
        double double10 = poissonDistributionImpl2.probability(38);
        int int11 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl2.cumulativeProbability(86, (int) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "77) test0441(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 29 });
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.533676680517062d + "'", double8 == 0.533676680517062d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.05698471084507295d + "'", double10 == 0.05698471084507295d);
// flaky "27) test0441(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28 + "'", int11 == 28);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3980856271290693E-36d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.0d);
        int int5 = poissonDistributionImpl1.getDomainLowerBound(4.160702826336122E-32d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        double double14 = poissonDistributionImpl3.cumulativeProbability(32);
        int[] intArray16 = poissonDistributionImpl3.sample((int) 'a');
        double double17 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "78) test0443(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double6 = poissonDistributionImpl3.getMean();
        double double7 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = poissonDistributionImpl3.inverseCumulativeProbability((double) 30);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.cumulativeProbability(9.216155638647194E-8d);
        double double14 = poissonDistributionImpl3.cumulativeProbability(2);
        int int16 = poissonDistributionImpl3.getDomainLowerBound(1.17246204865673E-37d);
        int int18 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6321205588285574d + "'", double12 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9386867598047597d + "'", double14 == 0.9386867598047597d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        int int32 = poissonDistributionImpl3.getDomainUpperBound(4.018416977195786E-54d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "79) test0446(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.06131324019524039d + "'", double25 == 0.06131324019524039d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.36787944117144233d + "'", double27 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double9 = poissonDistributionImpl3.getMean();
        int int11 = poissonDistributionImpl3.getDomainLowerBound(10.0d);
        int int13 = poissonDistributionImpl3.getDomainUpperBound(4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9846716899511899d);
        double double2 = poissonDistributionImpl1.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9846716899511899d + "'", double2 == 0.9846716899511899d);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(38);
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (short) 10);
        poissonDistributionImpl3.reseedRandomGenerator((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int23 = poissonDistributionImpl3.inverseCumulativeProbability((double) 34);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999907838444d + "'", double19 == 0.9999999907838444d);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double16 = poissonDistributionImpl3.cumulativeProbability(37, 37);
        double double17 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 6.685526970917836E-59d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        int int23 = poissonDistributionImpl3.inverseCumulativeProbability(3.57198604755006E-167d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.2093315791106567E-171d + "'", double19 == 3.2093315791106567E-171d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double13 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        int int15 = poissonDistributionImpl3.getDomainLowerBound(0.039860996809147134d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6321205588285574d + "'", double13 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        double double25 = poissonDistributionImpl3.cumulativeProbability(0.1251100357211333d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "80) test0454(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.36787944117144233d + "'", double21 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.36787944117144233d + "'", double23 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6321205588285574d + "'", double25 == 0.6321205588285574d);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) (byte) 0);
        double double4 = poissonDistributionImpl2.cumulativeProbability((int) (short) 100);
        double double6 = poissonDistributionImpl2.cumulativeProbability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1.0f, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl2.cumulativeProbability(73);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.18393972058572114d, 5.062340213690675E-8d, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(46, 34);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d, 104);
        double double4 = poissonDistributionImpl2.probability((int) (byte) 1);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(10);
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25464638004358264d + "'", double4 == 0.25464638004358264d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.probability((double) 10000000);
        double double17 = poissonDistributionImpl3.normalApproximateProbability(80);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "81) test0459(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = poissonDistributionImpl3.inverseCumulativeProbability((double) 29);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "82) test0460(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d, (double) (-1), 0);
        int int5 = poissonDistributionImpl3.getDomainLowerBound((double) 1.0f);
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 110);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        int int12 = poissonDistributionImpl3.getDomainLowerBound(1.17246204865673E-37d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "83) test0463(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.57198604755006E-167d, (int) '4');
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) 24);
        double double6 = poissonDistributionImpl2.probability(105);
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3678794445618948d, (double) '4', 35);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int16 = poissonDistributionImpl3.sample();
        double double18 = poissonDistributionImpl3.cumulativeProbability(3.57198604755006E-167d);
        poissonDistributionImpl3.reseedRandomGenerator((long) 1);
        int int21 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "84) test0466(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1, 0, 1, 0, 2, 2, 2, 1, 0, 0 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky "4) test0466(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6321205588285574d + "'", double18 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        double double9 = poissonDistributionImpl3.normalApproximateProbability((int) '4');
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 100.0f);
        int int13 = poissonDistributionImpl3.getDomainUpperBound(7.471972337343043E-43d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = poissonDistributionImpl3.cumulativeProbability((int) (short) 10, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainUpperBound(4.560969057281241E-69d);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) 32, (double) 100L);
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 27);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = poissonDistributionImpl3.inverseCumulativeProbability((double) 80);
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
// flaky "85) test0468(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f);
        poissonDistributionImpl3.reseedRandomGenerator(100L);
        double double14 = poissonDistributionImpl3.cumulativeProbability(2.7455062667769425E-9d);
        double double16 = poissonDistributionImpl3.probability(36);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999907838444d + "'", double10 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6321205588285574d + "'", double14 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.88940969307282E-43d + "'", double16 == 9.88940969307282E-43d);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        int int23 = poissonDistributionImpl3.getDomainLowerBound(0.05698471084507295d);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.57198604755006E-167d, (int) '4');
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) 24);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability((double) 'a', (-1.0d));
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.3013378484179026E-15d, 34);
        poissonDistributionImpl2.reseedRandomGenerator((long) 3);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        double double7 = poissonDistributionImpl2.cumulativeProbability((-1), 2147483647);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability(27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int int14 = poissonDistributionImpl3.getDomainLowerBound(0.999999999954943d);
        double double15 = poissonDistributionImpl3.getMean();
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) 3);
        double double20 = poissonDistributionImpl3.cumulativeProbability(0.0d, 0.011604342211143792d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9846716899511899d + "'", double17 == 0.9846716899511899d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6321205588285574d + "'", double20 == 0.6321205588285574d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        int int12 = poissonDistributionImpl3.getDomainUpperBound(0.14723260883568248d);
        double double14 = poissonDistributionImpl3.cumulativeProbability(41);
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = poissonDistributionImpl3.cumulativeProbability(0.6391624183905688d, 0.0d);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability(100);
        double double16 = poissonDistributionImpl3.normalApproximateProbability(2);
        double double19 = poissonDistributionImpl3.cumulativeProbability(37, 41);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9331927987311419d + "'", double16 == 0.9331927987311419d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.533676680517062d, (double) 100, 44);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        int int26 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "86) test0479(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        int[] intArray11 = poissonDistributionImpl3.sample(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] {});
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6321205588285574d, (double) 0.0f, 10);
        int int4 = poissonDistributionImpl3.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl3.cumulativeProbability((int) '4', 46);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky "87) test0482(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        int[] intArray5 = poissonDistributionImpl1.sample((int) 'a');
        int int6 = poissonDistributionImpl1.sample();
        double double8 = poissonDistributionImpl1.cumulativeProbability(3.941866060050443E-159d);
        double double10 = poissonDistributionImpl1.cumulativeProbability(86);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "88) test0483(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.539992976248491E-5d + "'", double8 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        poissonDistributionImpl3.reseedRandomGenerator((long) 0);
        double double9 = poissonDistributionImpl3.normalApproximateProbability(37);
        double double11 = poissonDistributionImpl3.cumulativeProbability(23);
        double double12 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3869009421120585E-33d, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability(1.2460656213271568E-39d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d);
        poissonDistributionImpl1.reseedRandomGenerator((long) 41);
        double double5 = poissonDistributionImpl1.probability((double) 23);
        double double7 = poissonDistributionImpl1.probability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.7476693956635508E-33d + "'", double5 == 2.7476693956635508E-33d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6922006275553462d + "'", double7 == 0.6922006275553462d);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        int[] intArray28 = poissonDistributionImpl3.sample(2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "89) test0487(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.308537538725987d + "'", double23 == 0.308537538725987d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(intArray28);
// flaky "28) test0487(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray28, new int[] { 3, 1 });
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double13 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        double double15 = poissonDistributionImpl3.cumulativeProbability(0.05698471084507295d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6321205588285574d + "'", double13 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6321205588285574d + "'", double15 == 0.6321205588285574d);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.999999999999d, (double) 23, 12);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int int6 = poissonDistributionImpl3.sample();
        int int8 = poissonDistributionImpl3.getDomainLowerBound(0.999999999999d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
// flaky "90) test0491(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double15 = poissonDistributionImpl3.probability((int) 'a');
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "91) test0492(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.8243984514608465E-153d + "'", double15 == 3.8243984514608465E-153d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double14 = poissonDistributionImpl3.cumulativeProbability((double) (short) 0, (double) 'a');
        double double16 = poissonDistributionImpl3.probability((double) (-1L));
        double double18 = poissonDistributionImpl3.cumulativeProbability(23);
        int int20 = poissonDistributionImpl3.getDomainUpperBound(0.36083758160943114d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) ' ');
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003594758625082517d + "'", double4 == 0.003594758625082517d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        double double13 = poissonDistributionImpl3.getMean();
        int int14 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "92) test0495(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 3 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
// flaky "29) test0495(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) 2);
        poissonDistributionImpl2.reseedRandomGenerator((long) ' ');
        double double6 = poissonDistributionImpl2.cumulativeProbability(0.06161675254888723d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.539992976248491E-5d + "'", double6 == 4.539992976248491E-5d);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        double double14 = poissonDistributionImpl3.normalApproximateProbability((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06680720126885803d + "'", double14 == 0.06680720126885803d);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.probability((double) 10000000);
        int int17 = poissonDistributionImpl3.getDomainLowerBound(0.29140699867905834d);
        int int19 = poissonDistributionImpl3.inverseCumulativeProbability(1.3869009421120585E-33d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "93) test0498(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.999999999940922d, 0.0d, 106);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        int int8 = poissonDistributionImpl3.sample();
        double double10 = poissonDistributionImpl3.normalApproximateProbability(34);
        int int12 = poissonDistributionImpl3.getDomainLowerBound(0.6321205588285574d);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(3.720075976020836E-44d, 35.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
// flaky "94) test0500(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.36787944117144256d + "'", double17 == 0.36787944117144256d);
    }
}
