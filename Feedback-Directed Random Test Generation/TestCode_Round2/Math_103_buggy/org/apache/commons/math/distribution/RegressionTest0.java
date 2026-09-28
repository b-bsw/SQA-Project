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
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(1.7976931348623157E308d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(1.0d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.inverseCumulativeProbability((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.cumulativeProbability(10.0d, 1.7976931348623157E308d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability(Double.POSITIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability((double) 1, (-68.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(Double.POSITIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1L), Double.NEGATIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.inverseCumulativeProbability((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 0, (-100.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.cumulativeProbability((double) (short) 100, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(Double.POSITIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability((double) 10, (-68.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation(Double.NEGATIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.inverseCumulativeProbability((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.8339767539364704d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation(Double.NEGATIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 100, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (short) 0);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability(Double.POSITIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability((double) 100.0f, 0.4490776072831239d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 100, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 'a');
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl2.cumulativeProbability((double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double15 = normalDistributionImpl2.cumulativeProbability((double) (short) -1, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.cumulativeProbability(Double.POSITIVE_INFINITY, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.003989356314631598d + "'", double15 == 0.003989356314631598d);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl0.cumulativeProbability((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        normalDistributionImpl2.setMean(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(Double.NEGATIVE_INFINITY, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.inverseCumulativeProbability((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double9 = normalDistributionImpl2.getDomainLowerBound(Double.POSITIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.inverseCumulativeProbability(11.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double8 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double9 = normalDistributionImpl2.getDomainLowerBound(Double.POSITIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double8 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) 1);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.inverseCumulativeProbability(99.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, (-100.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        normalDistributionImpl2.setMean((double) 10L);
        double double23 = normalDistributionImpl2.getInitialDomain(32.0d);
        java.lang.Class<?> wildcardClass24 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 11.0d + "'", double23 == 11.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(100.0d, (-68.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(Double.POSITIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.cumulativeProbability(101.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double4 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        normalDistributionImpl2.setMean((double) 10L);
        java.lang.Class<?> wildcardClass22 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean((double) '#');
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.cumulativeProbability((double) (short) 1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        double double23 = normalDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (-68.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 101.0d + "'", double23 == 101.0d);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.4960106436853684d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double9 = normalDistributionImpl2.getDomainLowerBound(Double.POSITIVE_INFINITY);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability((double) 'a', (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4960106436853684d + "'", double10 == 0.4960106436853684d);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        double double23 = normalDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = normalDistributionImpl2.cumulativeProbability(0.01213919411360942d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 101.0d + "'", double23 == 101.0d);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = normalDistributionImpl2.cumulativeProbability(0.15864037517600482d, 0.8339767539364704d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(Double.POSITIVE_INFINITY);
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        double double11 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        normalDistributionImpl0.setMean((double) (byte) 0);
        double double9 = normalDistributionImpl0.getInitialDomain(409.37500000520356d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (byte) 100);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl2.setMean((double) (byte) 100);
        double double8 = normalDistributionImpl2.getDomainUpperBound((double) (byte) -1);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.34134474606854304d, 0.01213919411360942d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        double double7 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.getDomainUpperBound((double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.inverseCumulativeProbability((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double5 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double11 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.34134474606854304d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.501361765869532d + "'", double12 == 0.501361765869532d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double4 = normalDistributionImpl2.getInitialDomain((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        normalDistributionImpl2.setMean(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.cumulativeProbability((double) ' ', (-0.8413596248239952d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        normalDistributionImpl2.setMean((double) 10L);
        normalDistributionImpl2.setStandardDeviation(0.026126956040166516d);
        double double25 = normalDistributionImpl2.getInitialDomain(1.7976931348623157E308d);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.026126956040166d + "'", double25 == 10.026126956040166d);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl0.cumulativeProbability(0.6153338488435729d, 0.5020106023922443d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double11 = normalDistributionImpl2.getDomainUpperBound((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.inverseCumulativeProbability((-100.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, 0.5039893563146316d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (short) 0);
        double double7 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.inverseCumulativeProbability((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.cumulativeProbability((double) 'a', 10.026126956040166d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        normalDistributionImpl2.setMean((double) 10L);
        double double23 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double25 = normalDistributionImpl2.getDomainLowerBound((double) ' ');
        java.lang.Class<?> wildcardClass26 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) ' ', (-0.9000000000335028d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.501361765869532d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setStandardDeviation((double) '4');
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 10.0d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double12 = normalDistributionImpl2.cumulativeProbability(0.34134474606854304d, 0.5027585141294139d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl2.cumulativeProbability(101.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.439419620615228E-4d + "'", double12 == 6.439419620615228E-4d);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability((double) (short) 100, 0.996954640520628d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.5033270473131487d);
        double double10 = normalDistributionImpl2.getDomainLowerBound(10.026126956040166d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.inverseCumulativeProbability(59.120415885425516d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-99.73312743878357d) + "'", double8 == (-99.73312743878357d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getInitialDomain(0.5039893563146316d);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double5 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-100.0d) + "'", double5 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.cumulativeProbability(1.5d, 0.026126956040166516d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.cumulativeProbability(129.0d, 0.5020106023922443d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        normalDistributionImpl2.setMean((double) 10L);
        normalDistributionImpl2.setStandardDeviation(0.026126956040166516d);
        double double25 = normalDistributionImpl2.getInitialDomain(1.7976931348623157E308d);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double30 = normalDistributionImpl2.cumulativeProbability((double) ' ', 0.5020079759221441d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.026126956040166d + "'", double25 == 10.026126956040166d);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass2 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        normalDistributionImpl0.setMean((double) 1L);
        double double9 = normalDistributionImpl0.getDomainLowerBound((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl0.cumulativeProbability(0.003989356314631598d, Double.NEGATIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01213919411360942d, 0.4490776072831239d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.cumulativeProbability((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.539827837277029d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getInitialDomain((-68.0d));
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', 0.34134474606854304d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.cumulativeProbability(0.841344746068543d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        normalDistributionImpl2.setMean((double) 10L);
        double double23 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double25 = normalDistributionImpl2.getDomainLowerBound((double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double28 = normalDistributionImpl2.cumulativeProbability(97.0d, 0.341344746068543d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound(0.6153338488435729d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double11 = normalDistributionImpl2.getDomainUpperBound((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        double double23 = normalDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        normalDistributionImpl2.setMean((-68.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double28 = normalDistributionImpl2.cumulativeProbability(8.890252991080594E-4d, 129.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 101.0d + "'", double23 == 101.0d);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        double double23 = normalDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double25 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = normalDistributionImpl2.inverseCumulativeProbability((-68.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 101.0d + "'", double23 == 101.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.8339767539364704d);
        double double9 = normalDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8339767539364704d + "'", double9 == 0.8339767539364704d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.341344746068543d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        normalDistributionImpl2.setMean((double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = normalDistributionImpl2.cumulativeProbability((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double15 = normalDistributionImpl2.cumulativeProbability((double) (short) -1, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.5543122344752192E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.003989356314631598d + "'", double15 == 0.003989356314631598d);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double7 = normalDistributionImpl0.getDomainUpperBound(101.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.cumulativeProbability(100.00012139194168d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.8339767539364704d);
        normalDistributionImpl2.setMean((-99.73312743878357d));
        double double11 = normalDistributionImpl2.getDomainUpperBound((-0.8413596248239952d));
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.cumulativeProbability(0.29812036135129827d, 0.16602324606352958d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.73312743878357d) + "'", double11 == (-99.73312743878357d));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.691462461274013d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability((double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.inverseCumulativeProbability((double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.inverseCumulativeProbability((-0.9000000000335028d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 10, 1.0d);
        normalDistributionImpl2.setMean((double) (-1.0f));
        normalDistributionImpl2.setStandardDeviation(59.120415885425516d);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NEGATIVE_INFINITY, (double) ' ');
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.inverseCumulativeProbability((-0.8413596248239952d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-0.9000000000335028d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        normalDistributionImpl0.setMean((double) (byte) 0);
        double double9 = normalDistributionImpl0.getInitialDomain(409.37500000520356d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-1.0d));
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain(1.0d);
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getInitialDomain(6.439419620615228E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-32.0d) + "'", double5 == (-32.0d));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0d, 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.987287113132458E-5d + "'", double6 == 8.987287113132458E-5d);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(101.0d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.6153338488435729d);
        double double19 = normalDistributionImpl2.getInitialDomain((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 29.324838582032726d + "'", double17 == 29.324838582032726d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl2.cumulativeProbability((-1.7976931348623157E308d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.NEGATIVE_INFINITY + "'", double15 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, (double) ' ');
        normalDistributionImpl2.setStandardDeviation(0.01213919411360942d);
        double double5 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability(0.5039854140850405d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.inverseCumulativeProbability((-1.7976931348623157E308d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, (double) ' ');
        normalDistributionImpl2.setStandardDeviation(0.01213919411360942d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.026126956040166516d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (byte) 100);
        normalDistributionImpl2.setMean((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-0.8413596248239952d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(11.0d);
        java.lang.Class<?> wildcardClass24 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.996954640520628d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        normalDistributionImpl2.setStandardDeviation(0.4960106436853684d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl2.inverseCumulativeProbability(100.00012139194168d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        normalDistributionImpl2.setMean(0.0d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.getDomainUpperBound((double) 0L);
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(409.37500000520356d, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.cumulativeProbability((-100.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setStandardDeviation((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-128.26949715237384d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl2.cumulativeProbability((double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        double double7 = normalDistributionImpl0.getInitialDomain(0.539827837277029d);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.01213919411360942d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5000484283777002d + "'", double9 == 0.5000484283777002d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        double double23 = normalDistributionImpl2.inverseCumulativeProbability(0.16602324606352958d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 99.02999982830094d + "'", double23 == 99.02999982830094d);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        normalDistributionImpl2.setMean((double) 10L);
        double double23 = normalDistributionImpl2.getInitialDomain(32.0d);
        double double25 = normalDistributionImpl2.cumulativeProbability(0.16116265572688077d);
        double double27 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 11.0d + "'", double23 == 11.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.551115123125783E-16d + "'", double25 == 5.551115123125783E-16d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        normalDistributionImpl2.setMean(0.5033270473131487d);
        double double17 = normalDistributionImpl2.getInitialDomain(0.7688235963189542d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.50332704731315d + "'", double17 == 35.50332704731315d);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getMean();
        double double19 = normalDistributionImpl2.cumulativeProbability(0.996954640520628d, 107.0d);
        double double21 = normalDistributionImpl2.getDomainUpperBound(101.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.3668235531222151d + "'", double19 == 0.3668235531222151d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        double double10 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(0.501361765869532d, (-0.9000000000335028d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        normalDistributionImpl2.setStandardDeviation(0.9991109747008919d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getInitialDomain((-68.0d));
        double double15 = normalDistributionImpl2.getInitialDomain(0.7228081817379124d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability(0.9990117802233995d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        normalDistributionImpl2.setMean(100.0d);
        double double13 = normalDistributionImpl2.cumulativeProbability((double) 0, (double) 100L);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.341344746068543d + "'", double13 == 0.341344746068543d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        normalDistributionImpl2.setMean((double) (byte) -1);
        normalDistributionImpl2.setStandardDeviation((double) (short) 1);
        double double18 = normalDistributionImpl2.cumulativeProbability(0.4490776072831239d, (double) (byte) 10);
        java.lang.Class<?> wildcardClass19 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.07365795537454656d + "'", double18 == 0.07365795537454656d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.8339767539364704d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.cumulativeProbability(Double.POSITIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5039893563146316d);
        double double6 = normalDistributionImpl2.cumulativeProbability(29.324838582032726d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9000000000335028d) + "'", double4 == (-0.9000000000335028d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9987872496534157d + "'", double6 == 0.9987872496534157d);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound(0.6153338488435729d);
        normalDistributionImpl0.setMean(0.5039854140850405d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.34134474606854304d, 0.01213919411360942d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.5039893563146316d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.16852760746683781d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5000484283777002d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, (double) ' ');
        normalDistributionImpl2.setStandardDeviation(0.01213919411360942d);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.01213919411360942d + "'", double6 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(100.00012139194168d, (-12.799211304789129d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.getInitialDomain(6.439419620615228E-4d);
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5020106023922443d);
        normalDistributionImpl2.setMean(0.5000484283777002d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5062582824999134d + "'", double7 == 0.5062582824999134d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        normalDistributionImpl2.setMean((double) 10L);
        normalDistributionImpl2.setStandardDeviation(0.026126956040166516d);
        double double25 = normalDistributionImpl2.getInitialDomain(1.7976931348623157E308d);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = normalDistributionImpl2.inverseCumulativeProbability(10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.026126956040166d + "'", double25 == 10.026126956040166d);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5020106023922443d);
        normalDistributionImpl2.setMean(0.5000484283777002d);
        double double11 = normalDistributionImpl2.cumulativeProbability((-100.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.cumulativeProbability((double) '4', 0.0020476378332464074d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5062582824999134d + "'", double7 == 0.5062582824999134d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.429343765339881E-4d + "'", double11 == 8.429343765339881E-4d);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        normalDistributionImpl2.setMean((double) 10L);
        normalDistributionImpl2.setStandardDeviation(0.026126956040166516d);
        double double25 = normalDistributionImpl2.getInitialDomain(1.7976931348623157E308d);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        normalDistributionImpl2.setStandardDeviation(6.106226635438361E-16d);
        // The following exception was thrown during execution in test generation
        try {
            double double31 = normalDistributionImpl2.inverseCumulativeProbability((-90.53983024611358d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.026126956040166d + "'", double25 == 10.026126956040166d);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getInitialDomain(32.0d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 107.0d + "'", double10 == 107.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5033270473131487d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5020079759221441d + "'", double11 == 0.5020079759221441d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double8 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation(101.0d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(10.026126956040166d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainUpperBound((double) 10.0f);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 10L);
        double double7 = normalDistributionImpl0.cumulativeProbability((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.inverseCumulativeProbability(10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass22 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double15 = normalDistributionImpl2.cumulativeProbability((double) (short) -1, 0.0d);
        double double17 = normalDistributionImpl2.getInitialDomain(32.0d);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.003989356314631598d + "'", double15 == 0.003989356314631598d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability((double) 1L, 5.551115123125783E-16d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) '#');
        double double10 = normalDistributionImpl0.getDomainUpperBound((double) 0.0f);
        double double12 = normalDistributionImpl0.getInitialDomain(0.37665202364295614d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 34.0d + "'", double12 == 34.0d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.getDomainLowerBound((-12.799211304789129d));
        double double13 = normalDistributionImpl2.getInitialDomain(0.5039854140850405d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.15864037517600482d, 0.503327047302336d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0013750926571968192d + "'", double7 == 0.0013750926571968192d);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5039893563146316d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getInitialDomain(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-99.73312743878357d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9000000000335028d) + "'", double4 == (-0.9000000000335028d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.cumulativeProbability(0.3668235531222151d, Double.POSITIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.539827837277029d + "'", double8 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5033270473131487d, 0.003989356314631598d);
        double double4 = normalDistributionImpl2.getDomainLowerBound((-68.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getMean();
        double double17 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl2.inverseCumulativeProbability(99.02999982830094d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getMean();
        double double19 = normalDistributionImpl2.cumulativeProbability(0.15864037517600482d, (double) 1L);
        double double20 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean((-1.7976931348623157E308d));
        java.lang.Class<?> wildcardClass23 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0020476378332464074d + "'", double19 == 0.0020476378332464074d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getMean();
        double double17 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(Double.NEGATIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double8 = normalDistributionImpl2.cumulativeProbability(10.026126956040166d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability(0.19981031319245302d, (-12.799211304789129d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.816634256911273d + "'", double8 == 0.816634256911273d);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        double double18 = normalDistributionImpl2.inverseCumulativeProbability(0.341344746068543d);
        java.lang.Class<?> wildcardClass19 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 59.120415885425516d + "'", double18 == 59.120415885425516d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) 1);
        double double12 = normalDistributionImpl2.cumulativeProbability((-40.87958411457447d), (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.1586552539043654d + "'", double12 == 0.1586552539043654d);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-99.73312743878357d), (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.8339767539364704d);
        normalDistributionImpl2.setMean((-99.73312743878357d));
        normalDistributionImpl2.setMean(0.341344746068543d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        normalDistributionImpl2.setMean((double) 10L);
        normalDistributionImpl2.setStandardDeviation(0.026126956040166516d);
        double double25 = normalDistributionImpl2.getInitialDomain(1.7976931348623157E308d);
        java.lang.Class<?> wildcardClass26 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.026126956040166d + "'", double25 == 10.026126956040166d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.cumulativeProbability(3.0324839434953876d, 0.1586552539043654d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl2.inverseCumulativeProbability((-1.7976931348623157E308d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.7228081817379124d, 32.0d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.5543122344752192E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.34134474606854304d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.cumulativeProbability(Double.POSITIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-40.87958411457447d) + "'", double12 == (-40.87958411457447d));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double4 = normalDistributionImpl2.getInitialDomain((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability((-100.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation(0.4490776072831239d);
        double double14 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), Double.POSITIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, (double) '4');
        normalDistributionImpl2.setStandardDeviation(0.16852760746683781d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getDomainLowerBound((-40.87958411457447d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.16852760746683781d + "'", double14 == 0.16852760746683781d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6153338488435729d, 1.0d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (short) 0);
        double double7 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.getDomainLowerBound(0.5039893563146316d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1.0f));
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5039893563146316d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9000000000335028d) + "'", double4 == (-0.9000000000335028d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5020106023922443d);
        normalDistributionImpl2.setMean(0.5000484283777002d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.cumulativeProbability(0.6153338488435729d, (-68.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5062582824999134d + "'", double7 == 0.5062582824999134d);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.34134474606854304d, 0.01213919411360942d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.5062582824999134d, 0.5020079759221441d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(Double.POSITIVE_INFINITY);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.cumulativeProbability((double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.5001042314730403d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(0.1586552539043654d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double4 = normalDistributionImpl2.getInitialDomain((double) (-1));
        normalDistributionImpl2.setMean(1.7976931348623157E308d);
        normalDistributionImpl2.setMean((double) 'a');
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', 0.34134474606854304d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(8.429343765339881E-4d, (-27.529693043639718d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        double double23 = normalDistributionImpl2.inverseCumulativeProbability(0.5000484283777002d);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = normalDistributionImpl2.cumulativeProbability((-27.529693043639718d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.00012139194168d + "'", double23 == 100.00012139194168d);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, (double) ' ');
        normalDistributionImpl2.setStandardDeviation(0.01213919411360942d);
        double double5 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability(0.16602324606352958d, (-0.9000000000335028d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(9.047742753903742E-4d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.5001042314730403d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.7976931348623157E308d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setStandardDeviation((double) 100L);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getDomainLowerBound((-99.73312743878357d));
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.inverseCumulativeProbability((-99.73312743878357d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0L, 8.890252991080594E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.cumulativeProbability(0.16116265572688077d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getInitialDomain(32.0d);
        normalDistributionImpl2.setMean((double) '4');
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 107.0d + "'", double10 == 107.0d);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double8 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(107.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl0.inverseCumulativeProbability((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double8 = normalDistributionImpl2.cumulativeProbability(10.026126956040166d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability((double) 100.0f, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.816634256911273d + "'", double8 == 0.816634256911273d);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) (short) 100);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.01213919411360942d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability((double) (-1.0f), (-68.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-128.26949715237384d) + "'", double4 == (-128.26949715237384d));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 'a');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.999987716976066d);
        double double6 = normalDistributionImpl2.getInitialDomain((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 194.0d + "'", double6 == 194.0d);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(101.0d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.6153338488435729d);
        double double19 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double21 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        double double23 = normalDistributionImpl2.getDomainLowerBound((double) 1.0f);
        java.lang.Class<?> wildcardClass24 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 29.324838582032726d + "'", double17 == 29.324838582032726d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-100.0d) + "'", double21 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        double double17 = normalDistributionImpl2.cumulativeProbability(3.0324839434953876d);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5120960066622517d + "'", double17 == 0.5120960066622517d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        double double23 = normalDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double25 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double26 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double29 = normalDistributionImpl2.cumulativeProbability(9.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 101.0d + "'", double23 == 101.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getDomainLowerBound(0.691462461274013d);
        double double6 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability(0.02860714277600379d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.4960106436853684d);
        double double9 = normalDistributionImpl2.getInitialDomain(10.026126956040166d);
        normalDistributionImpl2.setMean(129.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.cumulativeProbability((double) ' ', (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getInitialDomain(32.0d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability((double) (short) -1);
        normalDistributionImpl2.setMean((double) 10);
        double double13 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4960106436853684d + "'", double10 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1), (-0.9000000000335028d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.inverseCumulativeProbability(10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (-314.0626513812741d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = normalDistributionImpl2.cumulativeProbability(34.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(0.16852760746683781d, (-1.7976931348623157E308d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) ' ', 0.29812036135129827d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.996954640520628d, 0.5006333584453674d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getInitialDomain(10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.5d + "'", double6 == 1.5d);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.getInitialDomain(6.439419620615228E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, (-99.73312743878357d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(100.00012139194168d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(129.0d, 100.00012139194168d);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl2.cumulativeProbability((double) '#', 0.503327047302336d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        double double15 = normalDistributionImpl2.getDomainUpperBound((-100.0d));
        normalDistributionImpl2.setStandardDeviation((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl2.cumulativeProbability(34.0d, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.34134474606854304d, 0.01213919411360942d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.5039893563146316d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.cumulativeProbability(11.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.5033270473131487d);
        normalDistributionImpl2.setStandardDeviation(0.5033270473131487d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-99.73312743878357d) + "'", double8 == (-99.73312743878357d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getInitialDomain(32.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d, 0.0020476378332464074d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 107.0d + "'", double10 == 107.0d);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        double double23 = normalDistributionImpl2.inverseCumulativeProbability(0.996954640520628d);
        double double25 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        normalDistributionImpl2.setMean(0.9987872496534157d);
        java.lang.Class<?> wildcardClass28 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 102.74285731024536d + "'", double23 == 102.74285731024536d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double10 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.inverseCumulativeProbability((-99.98786080588638d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double8 = normalDistributionImpl2.getDomainUpperBound(0.5020106023922443d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.inverseCumulativeProbability(Double.NEGATIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.inverseCumulativeProbability((-32.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.0d), 0.501361765869532d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.4960106436853684d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        normalDistributionImpl2.setMean((double) 10L);
        double double22 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = normalDistributionImpl2.cumulativeProbability(0.5020429585576492d, 0.026126956040166516d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.07365795537454656d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 100, (-312.05092239451676d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getInitialDomain(0.5039893563146316d);
        double double7 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(32.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, 409.37500000520356d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.691462461274013d + "'", double4 == 0.691462461274013d);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.5039854140850405d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.0d, 409.37500000520356d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 1);
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.16852760746683781d + "'", double12 == 0.16852760746683781d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) 1);
        double double11 = normalDistributionImpl2.getInitialDomain(0.5062828993298469d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getInitialDomain(0.691462461274013d);
        double double12 = normalDistributionImpl2.getDomainLowerBound((-128.26949715237384d));
        double double14 = normalDistributionImpl2.getDomainUpperBound((-32.0d));
        double double15 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', (-68.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        double double15 = normalDistributionImpl2.cumulativeProbability((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5341532272166142d + "'", double15 == 0.5341532272166142d);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean(99.0d);
        normalDistributionImpl2.setMean(Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double5 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setStandardDeviation((double) 100L);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getDomainLowerBound((-99.73312743878357d));
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setStandardDeviation((double) 100L);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getInitialDomain(0.5062582824999134d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.POSITIVE_INFINITY, (-0.8413596248239952d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        double double23 = normalDistributionImpl2.inverseCumulativeProbability(0.996954640520628d);
        double double25 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 102.74285731024536d + "'", double23 == 102.74285731024536d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        double double23 = normalDistributionImpl2.inverseCumulativeProbability(0.5000484283777002d);
        java.lang.Class<?> wildcardClass24 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.00012139194168d + "'", double23 == 100.00012139194168d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getMean();
        double double19 = normalDistributionImpl2.cumulativeProbability(0.15864037517600482d, (double) 1L);
        java.lang.Class<?> wildcardClass20 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0020476378332464074d + "'", double19 == 0.0020476378332464074d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-0.8413596248239952d));
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.3668235531222151d);
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainLowerBound(129.0d);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainUpperBound((-1.7976931348623157E308d));
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        normalDistributionImpl2.setStandardDeviation(0.5002938527002967d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(0.5062582824999134d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.34134474606854304d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(0.01213919411360942d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation(0.4490776072831239d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double8 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.1586403751760048d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.1586403751760048d), 10.0d);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.inverseCumulativeProbability((-1.5543122344752192E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 10L);
        normalDistributionImpl0.setStandardDeviation(0.5d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.inverseCumulativeProbability((-800.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        normalDistributionImpl2.setMean(0.16852760746683781d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.5020106023922443d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.cumulativeProbability(Double.NEGATIVE_INFINITY, 409.37500000520356d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5013304021987853d + "'", double15 == 0.5013304021987853d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl2.cumulativeProbability(34.0d, 0.5027585141294139d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.6153338488435729d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain(1.0d);
        double double18 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double21 = normalDistributionImpl2.cumulativeProbability(0.4960106436853684d, 0.7228081817379124d);
        double double22 = normalDistributionImpl2.getStandardDeviation();
        double double23 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 9.047742753903742E-4d + "'", double21 == 9.047742753903742E-4d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, 409.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(1.7976931348623157E308d);
        double double6 = normalDistributionImpl2.getInitialDomain((-314.0626513812741d));
        normalDistributionImpl2.setStandardDeviation(101.0d);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.5000484283777002d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4992439296527548d + "'", double10 == 0.4992439296527548d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        normalDistributionImpl0.setStandardDeviation(0.9991109747008919d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) 0.0f);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9991109747008919d + "'", double6 == 0.9991109747008919d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8339767539364704d, 0.5019947133392674d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getInitialDomain(0.501361765869532d);
        double double8 = normalDistributionImpl2.cumulativeProbability((-312.05092239451676d), 0.5039854140850405d);
        double double10 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability((-0.9000000000335028d), (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5062828993298469d + "'", double8 == 0.5062828993298469d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.inverseCumulativeProbability(0.16852760746683781d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.9990117802232268d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5039854140850405d + "'", double8 == 0.5039854140850405d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 10, 1.0d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5020106023922443d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5062582824999134d + "'", double7 == 0.5062582824999134d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.16852760746683781d, (-0.8413596248239952d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        normalDistributionImpl2.setStandardDeviation(0.5002938527002967d);
        normalDistributionImpl2.setMean(309.37500000520356d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double14 = normalDistributionImpl2.cumulativeProbability((-1.1586403751760048d), 35.50332704731315d);
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.10360644854994305d + "'", double14 == 0.10360644854994305d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        normalDistributionImpl2.setMean((double) 10L);
        double double23 = normalDistributionImpl2.getInitialDomain(32.0d);
        double double25 = normalDistributionImpl2.cumulativeProbability(0.16116265572688077d);
        double double27 = normalDistributionImpl2.getDomainUpperBound(0.4966435003267168d);
        double double29 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 11.0d + "'", double23 == 11.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.551115123125783E-16d + "'", double25 == 5.551115123125783E-16d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.7976931348623157E308d) + "'", double29 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.getDomainUpperBound((double) 0L);
        double double14 = normalDistributionImpl2.getDomainUpperBound(0.5020079759221441d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl2.cumulativeProbability(0.816634256911273d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.0d), (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability((-68.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        double double23 = normalDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double25 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double26 = normalDistributionImpl2.getStandardDeviation();
        double double28 = normalDistributionImpl2.getInitialDomain(0.29812036135129827d);
        java.lang.Class<?> wildcardClass29 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 101.0d + "'", double23 == 101.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 99.0d + "'", double28 == 99.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getDomainLowerBound(0.38212483247943946d);
        double double11 = normalDistributionImpl2.getInitialDomain(0.0d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-100.0d) + "'", double11 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.661338147750939E-16d) + "'", double12 == (-6.661338147750939E-16d));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(101.0d);
        double double17 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double19 = normalDistributionImpl2.getDomainUpperBound(0.5039854140850405d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        double double17 = normalDistributionImpl2.getDomainLowerBound((double) 0L);
        double double19 = normalDistributionImpl2.getDomainLowerBound(0.5013304021987853d);
        normalDistributionImpl2.setMean(0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.6153338488435729d);
        double double15 = normalDistributionImpl2.getInitialDomain((-1.1586403751760048d));
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-0.9000000000335028d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-100.0d) + "'", double15 == (-100.0d));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double4 = normalDistributionImpl2.getInitialDomain((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.cumulativeProbability((-32.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setStandardDeviation((double) 100L);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getDomainLowerBound((-99.73312743878357d));
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double15 = normalDistributionImpl2.getDomainUpperBound(10.026126956040166d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.cumulativeProbability(400.12500003330143d, 0.5026547384068555d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-0.9000000000335028d), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double4 = normalDistributionImpl2.getInitialDomain((double) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0, 0.003989356314631598d);
        normalDistributionImpl2.setMean(0.5039854140850405d);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setMean((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(29.324838582032726d, (-90.53983024611358d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5020106023922443d);
        double double9 = normalDistributionImpl2.getDomainLowerBound((-99.73312743878357d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5062582824999134d + "'", double7 == 0.5062582824999134d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, 409.37500000520356d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.13514946487744206d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.getInitialDomain(0.5039893563146316d);
        double double9 = normalDistributionImpl2.getDomainUpperBound(0.5120960066622517d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        double double23 = normalDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double25 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = normalDistributionImpl2.cumulativeProbability((-314.0626513812741d), (-68.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 101.0d + "'", double23 == 101.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1), 6.439419620615228E-4d);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.16108488682834415d, (-68.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 10L);
        normalDistributionImpl0.setStandardDeviation(0.5d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 'a');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.999987716976066d);
        double double7 = normalDistributionImpl2.cumulativeProbability((-99.73312743878357d), (-0.9000000000335028d));
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.13514946487744206d + "'", double7 == 0.13514946487744206d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (-1L));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(Double.NEGATIVE_INFINITY);
        normalDistributionImpl2.setStandardDeviation(29.324838582032726d);
        double double21 = normalDistributionImpl2.getDomainUpperBound((-312.05092239451676d));
        java.lang.Class<?> wildcardClass22 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.NEGATIVE_INFINITY + "'", double15 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain(1.0d);
        double double18 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double20 = normalDistributionImpl2.cumulativeProbability(0.341344746068543d);
        java.lang.Class<?> wildcardClass21 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.501361765869532d + "'", double20 == 0.501361765869532d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double12 = normalDistributionImpl2.getDomainUpperBound(100.0d);
        normalDistributionImpl2.setStandardDeviation(35.50332704731315d);
        double double15 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double4 = normalDistributionImpl2.getInitialDomain((double) (-1));
        normalDistributionImpl2.setMean(1.7976931348623157E308d);
        double double7 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.4490776072831239d);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0L, 8.890252991080594E-4d);
        double double4 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.890252991080594E-4d + "'", double5 == 8.890252991080594E-4d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound((double) 10);
        double double15 = normalDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        double double18 = normalDistributionImpl2.getDomainUpperBound((-99.98786080588638d));
        double double19 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(Double.NEGATIVE_INFINITY);
        normalDistributionImpl2.setStandardDeviation(29.324838582032726d);
        double double21 = normalDistributionImpl2.getDomainUpperBound((-312.05092239451676d));
        double double23 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = normalDistributionImpl2.cumulativeProbability(0.5000000000002491d, 6.429456955875379E-4d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.NEGATIVE_INFINITY + "'", double15 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double4 = normalDistributionImpl2.getDomainUpperBound(34.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability((-27.529693043639718d));
        double double5 = normalDistributionImpl0.getDomainLowerBound(0.5020106023922443d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((-0.9000000000335028d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.5543122344752192E-15d) + "'", double3 == (-1.5543122344752192E-15d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8339767539364704d, (double) 10L);
        normalDistributionImpl2.setStandardDeviation(0.5062828993298469d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.9772498680518209d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        double double18 = normalDistributionImpl2.inverseCumulativeProbability(0.341344746068543d);
        double double19 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 59.120415885425516d + "'", double18 == 59.120415885425516d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) -1, 1.7976931348623157E308d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound((double) 10);
        double double15 = normalDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        double double18 = normalDistributionImpl2.getDomainUpperBound((-99.98786080588638d));
        normalDistributionImpl2.setStandardDeviation(0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double8 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.5020028532139044d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getMean();
        double double19 = normalDistributionImpl2.cumulativeProbability(0.15864037517600482d, (double) 1L);
        double double20 = normalDistributionImpl2.getMean();
        double double22 = normalDistributionImpl2.cumulativeProbability(0.15864037517600482d);
        normalDistributionImpl2.setStandardDeviation(90.26536848661516d);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = normalDistributionImpl2.cumulativeProbability((double) 1.0f, 0.5062582824999134d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0020476378332464074d + "'", double19 == 0.0020476378332464074d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.1590394216775845d + "'", double22 == 0.1590394216775845d);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.841344746068543d);
        normalDistributionImpl2.setStandardDeviation(0.3668235531222151d);
        double double20 = normalDistributionImpl2.cumulativeProbability(7.773567058553255E-4d, 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.4144226483220369d + "'", double20 == 0.4144226483220369d);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) 10);
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.3668235531222151d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.cumulativeProbability(309.37500000520356d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(129.0d, 0.03877026173060294d);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainUpperBound((double) 10.0f);
        double double13 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.13514946487744206d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-0.9000000000335028d), 0.38212483247943946d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(194.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9000000000335028d) + "'", double4 == (-0.9000000000335028d));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(99.02999982830094d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NEGATIVE_INFINITY, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.cumulativeProbability((-299.4363000875007d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        double double7 = normalDistributionImpl0.getInitialDomain(0.539827837277029d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.1590394216775845d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.cumulativeProbability(97.0d, 0.501361765869532d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 10.0f);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        normalDistributionImpl2.setMean((double) (byte) -1);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain((double) (short) 100);
        double double18 = normalDistributionImpl2.getDomainUpperBound((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = normalDistributionImpl2.cumulativeProbability(0.4960106436853684d, (-799.5509223927169d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 99.0d + "'", double16 == 99.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) 100L);
        double double6 = normalDistributionImpl2.getDomainLowerBound(6.106226635438361E-16d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.inverseCumulativeProbability(10.026126956040166d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) 10);
        double double6 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.15864037517600482d);
        double double9 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.15864037517600482d + "'", double9 == 0.15864037517600482d);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.026126956040166516d, 100.0d);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0, 0.003989356314631598d);
        normalDistributionImpl2.setMean(0.5002938527002967d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability(90.26536848661516d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-0.8413596248239952d));
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.cumulativeProbability(0.0d, (-69.90167018868739d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain(1.0d);
        double double18 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        java.lang.Class<?> wildcardClass19 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) '#');
        double double10 = normalDistributionImpl0.getDomainUpperBound((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability((-299.4363000875007d), 0.3406824094489751d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        normalDistributionImpl2.setMean(100.0d);
        double double13 = normalDistributionImpl2.cumulativeProbability((double) 0, (double) 100L);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.341344746068543d + "'", double13 == 0.341344746068543d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double5 = normalDistributionImpl0.cumulativeProbability(0.5027585141294139d);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6924329677782861d + "'", double5 == 0.6924329677782861d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(101.0d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.6153338488435729d);
        double double19 = normalDistributionImpl2.getDomainLowerBound(11.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 29.324838582032726d + "'", double17 == 29.324838582032726d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        normalDistributionImpl2.setMean(0.0d);
        double double17 = normalDistributionImpl2.cumulativeProbability(59.120415885425516d);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.5120960066622517d);
        normalDistributionImpl2.setMean(0.19981031319245302d);
        java.lang.Class<?> wildcardClass22 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.7228081817379124d + "'", double17 == 0.7228081817379124d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5020429585576492d + "'", double19 == 0.5020429585576492d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 1);
        double double5 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl0.inverseCumulativeProbability(1.7976931348623157E308d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.691462461274013d + "'", double4 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.cumulativeProbability(59.120415885425516d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-799.5509223927169d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7228081817379124d + "'", double9 == 0.7228081817379124d);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', 0.3668235531222151d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(8.890252991080594E-4d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((-90.53983024611358d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability((double) (byte) -1, 0.5003566436642092d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.NEGATIVE_INFINITY + "'", double5 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.8339767539364704d);
        normalDistributionImpl2.setMean((-99.73312743878357d));
        double double11 = normalDistributionImpl2.getDomainUpperBound((-0.8413596248239952d));
        double double13 = normalDistributionImpl2.getDomainLowerBound((-90.53983024611358d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.73312743878357d) + "'", double11 == (-99.73312743878357d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-0.8413596248239952d));
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double16 = normalDistributionImpl2.cumulativeProbability(309.37500000520356d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl2.cumulativeProbability(0.691462461274013d, 0.376841142650683d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9990394412085004d + "'", double16 == 0.9990394412085004d);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5020079759221441d, (-6.661338147750939E-16d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.34134474606854304d);
        normalDistributionImpl2.setStandardDeviation(0.9991109747008919d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-40.87958411457447d) + "'", double12 == (-40.87958411457447d));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        normalDistributionImpl2.setStandardDeviation(1.0d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(101.0d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.6153338488435729d);
        double double19 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        java.lang.Class<?> wildcardClass20 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 29.324838582032726d + "'", double17 == 29.324838582032726d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        double double23 = normalDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        normalDistributionImpl2.setMean(100.00503989243838d);
        java.lang.Class<?> wildcardClass26 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 101.0d + "'", double23 == 101.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        normalDistributionImpl2.setMean(59.120415885425516d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability((double) 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        normalDistributionImpl2.setMean((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.9772498680518209d, (-0.8413596248239952d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getInitialDomain((double) ' ');
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) 1);
        normalDistributionImpl2.setMean((-181.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 200.0d + "'", double17 == 200.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(0.9990117802232268d, (-0.18951904809965026d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        double double10 = normalDistributionImpl2.getDomainUpperBound(6.106226635438361E-16d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(0.5039854140850405d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.9990117802232268d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5039854140850405d + "'", double8 == 0.5039854140850405d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getInitialDomain(10.0d);
        double double8 = normalDistributionImpl0.getDomainLowerBound(0.4960106436853684d);
        double double10 = normalDistributionImpl0.getDomainUpperBound(0.010090298830658262d);
        double double12 = normalDistributionImpl0.getDomainLowerBound(0.5026547384068555d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.5d + "'", double6 == 1.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainUpperBound((double) 10.0f);
        double double13 = normalDistributionImpl2.getDomainUpperBound(0.5062582824999134d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.16116265572688077d);
        double double6 = normalDistributionImpl2.cumulativeProbability((-181.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.546219801024759d + "'", double4 == 0.546219801024759d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.440092820663267E-15d + "'", double6 == 5.440092820663267E-15d);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound((double) 10);
        double double15 = normalDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.inverseCumulativeProbability((-1.5543122344752192E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(101.0d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.6153338488435729d);
        double double19 = normalDistributionImpl2.getInitialDomain((double) 100L);
        java.lang.Class<?> wildcardClass20 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 29.324838582032726d + "'", double17 == 29.324838582032726d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.816634256911273d, (-12.799211304789129d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) 10);
        double double6 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.1590394216775845d);
        double double15 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-3.0d) + "'", double15 == (-3.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(100.0d);
        normalDistributionImpl2.setStandardDeviation(0.3668235531222151d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        normalDistributionImpl2.setMean((double) (byte) -1);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain((double) (short) 100);
        double double18 = normalDistributionImpl2.getInitialDomain(0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 99.0d + "'", double16 == 99.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-101.0d) + "'", double18 == (-101.0d));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5020079759221441d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5039893563146316d);
        double double6 = normalDistributionImpl2.getDomainLowerBound(0.503327047302336d);
        double double9 = normalDistributionImpl2.cumulativeProbability(8.890252991080594E-4d, 0.999987716976066d);
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5001042314730403d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9000000000335028d) + "'", double4 == (-0.9000000000335028d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.039396101914527804d + "'", double9 == 0.039396101914527804d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain(1.0d);
        double double18 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double19 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.cumulativeProbability(0.4966435003267168d);
        double double24 = normalDistributionImpl2.cumulativeProbability(0.07365795537454656d, 100.00012139194168d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.5019813127606616d + "'", double21 == 0.5019813127606616d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.3410511871010289d + "'", double24 == 0.3410511871010289d);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getInitialDomain((-68.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.cumulativeProbability(100.00503989243838d, 0.5020028532139044d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5033270473131487d, 0.4490776072831239d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(29.324838582032726d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.4992439296527548d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation(Double.NEGATIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 96.93366833316512d + "'", double15 == 96.93366833316512d);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6153338488435729d, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double11 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setMean((double) (short) -1);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.9990117802233995d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-0.15864037517600482d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.16852760746683781d, (-27.529693043639718d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.1586403751760048d), 100.00503989243838d);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getInitialDomain(0.5039893563146316d);
        double double7 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        double double9 = normalDistributionImpl2.getInitialDomain((double) 0L);
        normalDistributionImpl2.setStandardDeviation(0.5020429585576492d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        double double11 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        normalDistributionImpl2.setStandardDeviation(0.003989356314631598d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl2.cumulativeProbability(99.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        double double10 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        normalDistributionImpl2.setMean(0.01213919411360942d);
        double double14 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl2.cumulativeProbability(0.4992439296527548d, 0.3668235531222151d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.01213919411360942d + "'", double14 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.01213919411360942d + "'", double16 == 0.01213919411360942d);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 10, 0.501361765869532d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, (double) ' ');
        normalDistributionImpl2.setStandardDeviation(0.01213919411360942d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainLowerBound(309.37500000520356d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability((-799.5509223927169d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.841344746068543d, (double) 100);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        double double23 = normalDistributionImpl2.inverseCumulativeProbability(0.996954640520628d);
        double double25 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        normalDistributionImpl2.setMean(0.9987872496534157d);
        double double28 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double31 = normalDistributionImpl2.cumulativeProbability((-99.00088902533815d), 0.5013304021987853d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 102.74285731024536d + "'", double23 == 102.74285731024536d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.9987872496534157d + "'", double28 == 0.9987872496534157d);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double15 = normalDistributionImpl2.getInitialDomain(0.16852760746683781d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-100.0d) + "'", double15 == (-100.0d));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5020028532139044d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6255158347233201d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        double double11 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.cumulativeProbability(0.003233364812544881d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getInitialDomain(0.691462461274013d);
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.9991601276537112d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 314.1692288583126d + "'", double12 == 314.1692288583126d);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 8.987287113132458E-5d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.16852760746683781d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.cumulativeProbability((double) (short) 100, (-27.529693043639718d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double9 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation((double) 100L);
        normalDistributionImpl0.setMean(6.429456955875379E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        normalDistributionImpl2.setMean((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.cumulativeProbability(0.9991601276537112d, 6.429456955875379E-4d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) 100L);
        double double6 = normalDistributionImpl2.getDomainLowerBound(6.106226635438361E-16d);
        normalDistributionImpl2.setStandardDeviation(200.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) 10);
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.3668235531222151d);
        normalDistributionImpl2.setStandardDeviation((double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainUpperBound((double) 10.0f);
        double double13 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(6.439419620630119E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-321.8666021266556d) + "'", double15 == (-321.8666021266556d));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.6153338488435729d);
        double double15 = normalDistributionImpl2.getInitialDomain(0.5039854140850405d);
        double double17 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5017915544255316d + "'", double19 == 0.5017915544255316d);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003989356314631598d, 100.00012139194168d);
        normalDistributionImpl2.setStandardDeviation((double) (byte) 1);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(Double.NEGATIVE_INFINITY);
        double double18 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.NEGATIVE_INFINITY + "'", double15 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        normalDistributionImpl2.setMean(59.120415885425516d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (short) 100);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 59.120415885425516d + "'", double8 == 59.120415885425516d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.5020079759221441d);
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double10 = normalDistributionImpl2.getInitialDomain((-0.8413596248239952d));
        double double11 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.503327047302336d + "'", double6 == 0.503327047302336d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.15864037517600482d) + "'", double10 == (-0.15864037517600482d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 1, 409.37500000520356d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability((-90.53983024611358d));
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4115308789714541d + "'", double5 == 0.4115308789714541d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(97.67965765688128d);
        normalDistributionImpl2.setMean((-799.5509223927169d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 0, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability((-32.0d), 102.74285731024536d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.0d), 0.501361765869532d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.4960106436853684d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.cumulativeProbability((double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(Double.NEGATIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        double double23 = normalDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double25 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double26 = normalDistributionImpl2.getStandardDeviation();
        double double28 = normalDistributionImpl2.getInitialDomain(0.29812036135129827d);
        double double29 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 101.0d + "'", double23 == 101.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 99.0d + "'", double28 == 99.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain(1.0d);
        double double18 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double21 = normalDistributionImpl2.cumulativeProbability(0.4960106436853684d, 0.7228081817379124d);
        double double23 = normalDistributionImpl2.getDomainLowerBound((double) 100L);
        java.lang.Class<?> wildcardClass24 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 9.047742753903742E-4d + "'", double21 == 9.047742753903742E-4d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5039893563146316d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability((double) '#', (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9000000000335028d) + "'", double4 == (-0.9000000000335028d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 'a');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.999987716976066d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability(9.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(Double.NEGATIVE_INFINITY);
        normalDistributionImpl2.setStandardDeviation(29.324838582032726d);
        double double21 = normalDistributionImpl2.getDomainUpperBound((-312.05092239451676d));
        double double23 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double25 = normalDistributionImpl2.cumulativeProbability(0.5006153217161514d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.NEGATIVE_INFINITY + "'", double15 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5068101625618202d + "'", double25 == 0.5068101625618202d);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1917219015966306d, 99.55092239271687d);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.cumulativeProbability(59.120415885425516d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((-0.8413596248239952d));
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl2.cumulativeProbability((-9.0d), (-128.26949715237384d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7228081817379124d + "'", double9 == 0.7228081817379124d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.4966435003267168d + "'", double12 == 0.4966435003267168d);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.getInitialDomain(0.5039893563146316d);
        normalDistributionImpl2.setStandardDeviation(0.5027585141294139d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.1586403751760048d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.16116265572688077d, 9.047742753903742E-4d);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.501361765869532d, 0.7228081817379124d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7228081817379124d + "'", double3 == 0.7228081817379124d);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        normalDistributionImpl2.setStandardDeviation((double) 1.0f);
        java.lang.Class<?> wildcardClass22 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5020106023922443d);
        normalDistributionImpl2.setMean(0.5000484283777002d);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.5019947133392674d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5062582824999134d + "'", double7 == 0.5062582824999134d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain(1.0d);
        double double18 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double20 = normalDistributionImpl2.cumulativeProbability(0.341344746068543d);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = normalDistributionImpl2.cumulativeProbability(314.1692288583126d, (-90.53983024611358d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.501361765869532d + "'", double20 == 0.501361765869532d);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getInitialDomain(0.5039893563146316d);
        double double7 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.getDomainUpperBound((double) 0L);
        double double14 = normalDistributionImpl2.getDomainUpperBound(0.5020079759221441d);
        double double16 = normalDistributionImpl2.getDomainUpperBound(100.00012139194168d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0013750926571968192d, (-12.799211304789129d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5019947030907408d, (-181.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setStandardDeviation((double) 100L);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getDomainLowerBound((-99.73312743878357d));
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 1L);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.5120960066622517d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.890252991080594E-4d + "'", double4 == 8.890252991080594E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        normalDistributionImpl2.setMean((double) (-1));
        normalDistributionImpl2.setStandardDeviation(0.7688235963189542d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', 0.34134474606854304d);
        normalDistributionImpl2.setMean((double) ' ');
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(101.0d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.6153338488435729d);
        double double19 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double21 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        double double23 = normalDistributionImpl2.getInitialDomain(5.551115123125783E-16d);
        double double25 = normalDistributionImpl2.cumulativeProbability(409.37500000520356d);
        double double27 = normalDistributionImpl2.inverseCumulativeProbability(6.439419620630119E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 29.324838582032726d + "'", double17 == 29.324838582032726d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-100.0d) + "'", double21 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-100.0d) + "'", double23 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9999787774020832d + "'", double25 == 0.9999787774020832d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-321.8666021266556d) + "'", double27 == (-321.8666021266556d));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5039893563146316d, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(190.26126956039283d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((-0.9000000000335028d));
        normalDistributionImpl2.setMean(0.4490776072831239d);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(8.890252991080594E-4d);
        double double13 = normalDistributionImpl2.cumulativeProbability((-321.8666021266556d), (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-312.05092239451676d) + "'", double10 == (-312.05092239451676d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5374108872856648d + "'", double13 == 0.5374108872856648d);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getInitialDomain(0.501361765869532d);
        normalDistributionImpl2.setMean(400.12500003330143d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-0.18951904809965026d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5039893563146316d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getInitialDomain(100.0d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9000000000335028d) + "'", double4 == (-0.9000000000335028d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        normalDistributionImpl2.setStandardDeviation(0.4960106436853684d);
        double double16 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }
}

