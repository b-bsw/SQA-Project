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
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0L, 8.890252991080594E-4d);
        double double4 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        double double30 = normalDistributionImpl2.getStandardDeviation();
        double double31 = normalDistributionImpl2.getStandardDeviation();
        double double33 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.026126956040166d + "'", double25 == 10.026126956040166d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 6.106226635438361E-16d + "'", double30 == 6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 6.106226635438361E-16d + "'", double31 == 6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + Double.NEGATIVE_INFINITY + "'", double33 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        normalDistributionImpl2.setMean(0.0d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.NEGATIVE_INFINITY + "'", double17 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d);
        normalDistributionImpl2.setStandardDeviation(200.0d);
        double double13 = normalDistributionImpl2.getInitialDomain((-0.15864037517600482d));
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.cumulativeProbability(97.0d, 11.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5001042314730403d + "'", double9 == 0.5001042314730403d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-200.0d) + "'", double13 == (-200.0d));
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        double double7 = normalDistributionImpl0.getInitialDomain(0.539827837277029d);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.01213919411360942d);
        double double11 = normalDistributionImpl0.getDomainUpperBound(100.00012139194168d);
        double double13 = normalDistributionImpl0.getDomainLowerBound(8.429343765339881E-4d);
        double double15 = normalDistributionImpl0.inverseCumulativeProbability(5.551115123125783E-16d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl0.cumulativeProbability((double) 'a', 9.047742753903742E-4d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5000484283777002d + "'", double9 == 0.5000484283777002d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-800.0d) + "'", double15 == (-800.0d));
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 1);
        double double6 = normalDistributionImpl0.getInitialDomain(0.039396101914527804d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.cumulativeProbability(10.026126956040166d, 0.9990394412085004d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.691462461274013d + "'", double4 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.0d));
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 9.047742753903742E-4d + "'", double21 == 9.047742753903742E-4d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double14 = normalDistributionImpl2.cumulativeProbability((-1.1586403751760048d), 35.50332704731315d);
        normalDistributionImpl2.setStandardDeviation(0.16852760746683781d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.cumulativeProbability((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.10360644854994305d + "'", double14 == 0.10360644854994305d);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getInitialDomain((-68.0d));
        normalDistributionImpl2.setStandardDeviation(0.01213919411360942d);
        double double17 = normalDistributionImpl2.cumulativeProbability(9.047742753903742E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl2.inverseCumulativeProbability(0.5039854140850412d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5297069799427127d + "'", double17 == 0.5297069799427127d);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.841500270091506d, (double) 100);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.841500270091506d + "'", double4 == 0.841500270091506d);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getInitialDomain(99.02999982830094d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.5d + "'", double8 == 1.5d);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl2.cumulativeProbability(Double.POSITIVE_INFINITY, 0.5006153217161514d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        normalDistributionImpl2.setStandardDeviation((double) (short) 100);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3410511871010289d, (-100.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        double double24 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0020476378332464074d + "'", double19 == 0.0020476378332464074d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + Double.NEGATIVE_INFINITY + "'", double24 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        double double17 = normalDistributionImpl2.getDomainLowerBound(99.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double14 = normalDistributionImpl2.getDomainUpperBound(200.0d);
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.37665202364295614d);
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getInitialDomain((double) (-1));
        normalDistributionImpl2.setMean(0.5d);
        double double23 = normalDistributionImpl2.getDomainLowerBound(9.0d);
        double double25 = normalDistributionImpl2.getDomainLowerBound(0.539827837277029d);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 99.0d + "'", double19 == 99.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.5d + "'", double23 == 0.5d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5d + "'", double25 == 0.5d);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, (double) '4');
        normalDistributionImpl2.setStandardDeviation(0.16852760746683781d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.16852760746683781d + "'", double14 == 0.16852760746683781d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) 10);
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.3668235531222151d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability((double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.841344746068543d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double18 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl2.cumulativeProbability((-1.7976931348623157E308d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        double double17 = normalDistributionImpl2.getInitialDomain(0.0013750926571968192d);
        double double19 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double20 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-100.0d) + "'", double17 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 'a');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.999987716976066d);
        double double7 = normalDistributionImpl2.cumulativeProbability((-99.73312743878357d), (-0.9000000000335028d));
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.cumulativeProbability((double) ' ', 0.9990394412085004d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.13514946487744206d + "'", double7 == 0.13514946487744206d);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        normalDistributionImpl2.setMean(11.0d);
        double double14 = normalDistributionImpl2.cumulativeProbability(6.106226635438361E-16d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl2.cumulativeProbability(0.9987872496534157d, (-90.53983024611358d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.37665202364295614d + "'", double14 == 0.37665202364295614d);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 100.0f, 0.996954640520628d);
        normalDistributionImpl2.setMean(29.324838582032726d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        normalDistributionImpl2.setStandardDeviation(0.4960106436853684d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        normalDistributionImpl2.setMean((double) (byte) -1);
        double double15 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-5.773159728050814E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.501361765869532d, 0.7228081817379124d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 0, (-5.773159728050814E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 'a');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.999987716976066d);
        double double7 = normalDistributionImpl2.cumulativeProbability((-99.73312743878357d), (-0.9000000000335028d));
        double double8 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.13514946487744206d + "'", double7 == 0.13514946487744206d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        double double10 = normalDistributionImpl2.getDomainUpperBound(6.106226635438361E-16d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(8.429343765339881E-4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.546219801024759d, (-0.5d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(35.50332704731315d, 0.5026547384068555d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(97.77142633673954d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound((double) 10);
        double double15 = normalDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        normalDistributionImpl0.setMean((double) (byte) 0);
        double double9 = normalDistributionImpl0.getInitialDomain(409.37500000520356d);
        normalDistributionImpl0.setMean(0.341344746068543d);
        double double12 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.341344746068543d + "'", double12 == 0.341344746068543d);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        double double25 = normalDistributionImpl2.cumulativeProbability(0.5020429585576492d);
        java.lang.Class<?> wildcardClass26 = normalDistributionImpl2.getClass();
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5020028532139044d + "'", double25 == 0.5020028532139044d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.5020079759221441d);
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double10 = normalDistributionImpl2.getInitialDomain((-0.8413596248239952d));
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.9999999999999823d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.503327047302336d + "'", double6 == 0.503327047302336d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.15864037517600482d) + "'", double10 == (-0.15864037517600482d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.2032093049234251d + "'", double12 == 1.2032093049234251d);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) 10);
        double double6 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.841344746068543d);
        double double17 = normalDistributionImpl2.getDomainUpperBound(0.501361765869532d);
        double double19 = normalDistributionImpl2.getDomainUpperBound((-99.73312743878357d));
        double double21 = normalDistributionImpl2.getDomainUpperBound(0.4993376909985171d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.841344746068543d);
        double double17 = normalDistributionImpl2.getDomainUpperBound(0.501361765869532d);
        double double19 = normalDistributionImpl2.getDomainUpperBound((-99.73312743878357d));
        // The following exception was thrown during execution in test generation
        try {
            double double22 = normalDistributionImpl2.cumulativeProbability(197.0d, 0.9999787774020832d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability((double) (short) -1);
        normalDistributionImpl2.setMean((double) 10);
        double double13 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4960106436853684d + "'", double10 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(314.1692288583126d, (-100.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5001042314730403d + "'", double9 == 0.5001042314730403d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        normalDistributionImpl2.setMean(Double.NEGATIVE_INFINITY);
        double double22 = normalDistributionImpl2.getDomainLowerBound(0.47161763576680055d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 59.120415885425516d + "'", double18 == 59.120415885425516d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.7976931348623157E308d) + "'", double22 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability((double) (short) -1);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.16108488682834415d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.cumulativeProbability(0.010090298830658262d, (-1.1586403751760048d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4960106436853684d + "'", double10 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) 10);
        double double6 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability(0.5068289254012387d, 0.059977535157524076d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-321.8666021266556d), 10.026126956040166d);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        double double8 = normalDistributionImpl2.getDomainUpperBound(0.5000484283777002d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, 0.4993376909985171d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5d, (-800.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) 100L);
        double double6 = normalDistributionImpl2.getDomainLowerBound(0.4960106436853684d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        double double14 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.5000000000002491d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setMean((-99.62334797635704d));
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.0d), 0.501361765869532d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.4960106436853684d);
        double double6 = normalDistributionImpl2.getDomainLowerBound(0.5000025689567479d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        double double23 = normalDistributionImpl2.getInitialDomain(0.507670861292653d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.NEGATIVE_INFINITY + "'", double15 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 29.324838582032726d + "'", double23 == 29.324838582032726d);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 1.0f, (double) ' ');
        double double3 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean((double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double4 = normalDistributionImpl2.getInitialDomain((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.5374108872856648d, 129.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-181.0d), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double9 = normalDistributionImpl2.getDomainUpperBound(8.3936365174897E-4d);
        normalDistributionImpl2.setMean((-1.0d));
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1L));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-101.0d) + "'", double13 == (-101.0d));
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        double double17 = normalDistributionImpl2.getDomainLowerBound((double) 0L);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getInitialDomain(10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.inverseCumulativeProbability((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.5d + "'", double6 == 1.5d);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain(1.0d);
        normalDistributionImpl2.setMean((double) (short) -1);
        double double19 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.cumulativeProbability((double) 1.0f);
        double double18 = normalDistributionImpl2.getInitialDomain(0.4960106436853684d);
        double double20 = normalDistributionImpl2.cumulativeProbability(0.691462461274013d);
        double double21 = normalDistributionImpl2.getStandardDeviation();
        double double24 = normalDistributionImpl2.cumulativeProbability((-5.773159728050814E-15d), 29.324838582032726d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5039893563146316d + "'", double16 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5027585141294139d + "'", double20 == 0.5027585141294139d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.11533384884315512d + "'", double24 == 0.11533384884315512d);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain(1.0d);
        double double17 = normalDistributionImpl2.getMean();
        double double19 = normalDistributionImpl2.inverseCumulativeProbability(0.3406824094489751d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-41.060142464627134d) + "'", double19 == (-41.060142464627134d));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        normalDistributionImpl2.setMean(0.039396101914527804d);
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
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.341344746068543d);
        normalDistributionImpl2.setMean(0.5062582824999134d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setStandardDeviation((double) 100L);
        double double9 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.cumulativeProbability(0.9991574196213242d, 0.8339767539364704d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) -1, 0.5039854140850412d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getInitialDomain(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5039854140850412d + "'", double3 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.503985414085041d) + "'", double5 == (-1.503985414085041d));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (byte) 100);
        normalDistributionImpl2.setMean((double) '4');
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(8.429343765339881E-4d);
        double double13 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(100.84134474606854d);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.84134474606854d + "'", double16 == 100.84134474606854d);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        normalDistributionImpl2.setMean(0.16852760746683781d);
        normalDistributionImpl2.setMean(0.5019947030907408d);
        double double17 = normalDistributionImpl2.getDomainUpperBound(0.9999999999999823d);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.9999787774020832d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5019866608109517d + "'", double19 == 0.5019866608109517d);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        java.lang.Class<?> wildcardClass20 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.3668235531222151d + "'", double19 == 0.3668235531222151d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
            double double23 = normalDistributionImpl2.cumulativeProbability(0.15864037517600482d, 59.120415885425516d);
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
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(101.0d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.6153338488435729d);
        double double19 = normalDistributionImpl2.getInitialDomain((double) 100L);
        normalDistributionImpl2.setStandardDeviation(0.003233364812544881d);
        java.lang.Class<?> wildcardClass22 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 29.324838582032726d + "'", double17 == 29.324838582032726d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.5013304021987853d, 0.999987716976066d);
        double double17 = normalDistributionImpl2.getDomainLowerBound((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0012518388356499988d + "'", double15 == 0.0012518388356499988d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setMean((-99.62334797635704d));
        double double10 = normalDistributionImpl2.cumulativeProbability(0.001349898031630159d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8404349207008496d + "'", double10 == 0.8404349207008496d);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.841344746068543d, (double) 100);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.10360644854994305d);
        double double5 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.841344746068543d + "'", double5 == 0.841344746068543d);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(6.439419620615228E-4d, 0.5d);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setStandardDeviation((double) 100L);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getInitialDomain(0.5062582824999134d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        normalDistributionImpl0.setMean((double) 1L);
        double double9 = normalDistributionImpl0.getDomainLowerBound((double) (short) -1);
        normalDistributionImpl0.setStandardDeviation(8.987287113132458E-5d);
        double double13 = normalDistributionImpl0.getDomainUpperBound((-40.87958411457447d));
        double double14 = normalDistributionImpl0.getMean();
        double double15 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 8.987287113132458E-5d + "'", double15 == 8.987287113132458E-5d);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, (double) '4');
        double double13 = normalDistributionImpl2.cumulativeProbability(0.5039854140850412d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5020106023922443d + "'", double13 == 0.5020106023922443d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double16 = normalDistributionImpl2.getMean();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double4 = normalDistributionImpl0.getDomainUpperBound(32.0d);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5033270473131487d);
        double double13 = normalDistributionImpl2.getDomainLowerBound((-33.0d));
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5020079759221441d + "'", double11 == 0.5020079759221441d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(309.37500000520356d);
        normalDistributionImpl0.setMean(200.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setStandardDeviation((double) 100L);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getInitialDomain(0.5062582824999134d);
        normalDistributionImpl2.setMean((-799.5509223927169d));
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-0.18951904809965026d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-190.53983024611358d), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        double double20 = normalDistributionImpl2.getDomainUpperBound((-3.0d));
        normalDistributionImpl2.setStandardDeviation(0.9772498680518209d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        normalDistributionImpl2.setMean(0.003989356314631598d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.inverseCumulativeProbability((-99.73312743878357d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) '#');
        double double10 = normalDistributionImpl0.getDomainUpperBound((double) 0.0f);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getDomainUpperBound(100.84134474606854d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3199999997720503d, (-0.9000000000335028d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 100L, (-1.5543122344752192E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double14 = normalDistributionImpl2.cumulativeProbability(0.9990117802233995d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getDomainUpperBound((-100.0d));
        double double19 = normalDistributionImpl2.cumulativeProbability((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5039893563146316d + "'", double19 == 0.5039893563146316d);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 1.0f, (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(96.93366833316512d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(8.890252991080594E-4d);
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 10.0f);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.13306917105380833d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-11.119995541385146d) + "'", double4 == (-11.119995541385146d));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(97.77142633673954d, 0.5374108872856648d);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) 100L);
        double double6 = normalDistributionImpl2.getDomainLowerBound(6.106226635438361E-16d);
        double double9 = normalDistributionImpl2.cumulativeProbability((double) (byte) 0, (double) 'a');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.89024926669868E-4d + "'", double9 == 8.89024926669868E-4d);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability((-100.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.6153338488435729d);
        double double15 = normalDistributionImpl2.getDomainUpperBound(0.501361765869532d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(0.691462461274013d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl2.cumulativeProbability((-0.5d), (-27.529693043639718d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003989356314631598d, 0.691462461274013d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.996954640520628d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6954518175886446d + "'", double4 == 0.6954518175886446d);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(Double.NEGATIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl2.inverseCumulativeProbability((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
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
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain(1.0d);
        double double17 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.503985414085041d));
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.cumulativeProbability(0.6954518175886446d, (-2.1649348980190553E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, (double) (byte) 100);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.5062828993298469d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(Double.NEGATIVE_INFINITY);
        double double19 = normalDistributionImpl2.getInitialDomain((double) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.NEGATIVE_INFINITY + "'", double15 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.9990117802232268d);
        normalDistributionImpl2.setMean(0.691462461274013d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) ' ', (-41.060142464627134d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double11 = normalDistributionImpl2.getDomainUpperBound((-800.0d));
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-100.0d) + "'", double11 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, 8.987287113132458E-5d);
        double double4 = normalDistributionImpl2.getDomainLowerBound((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.9953360887357412d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getInitialDomain(0.0013750926571968192d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-132.0d) + "'", double9 == (-132.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01213919411360942d, 0.4490776072831239d);
        normalDistributionImpl2.setMean((double) 100L);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability(0.5027585141294139d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(Double.POSITIVE_INFINITY);
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.9991574196213242d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainLowerBound((-69.90167018868739d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 1.0f, (double) ' ');
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        java.lang.Class<?> wildcardClass24 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, (double) ' ');
        normalDistributionImpl2.setStandardDeviation(0.01213919411360942d);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.01213919411360942d + "'", double6 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.01213919411360942d + "'", double7 == 0.01213919411360942d);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-52.0d), 197.0d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9991601276537112d, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.cumulativeProbability((double) 1.0f);
        normalDistributionImpl2.setMean(0.0020476378332464074d);
        java.lang.Class<?> wildcardClass19 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5039893563146316d + "'", double16 == 0.5039893563146316d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.cumulativeProbability((-0.18951904809965026d), 0.341344746068543d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1917219015966306d + "'", double10 == 0.1917219015966306d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.03877026173060294d, 0.19981031319245302d);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4490776072831239d, 0.9999999999999823d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4490776072831239d + "'", double3 == 0.4490776072831239d);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-0.8413596248239952d));
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.3668235531222151d);
        double double18 = normalDistributionImpl2.cumulativeProbability(0.501361765869532d);
        normalDistributionImpl2.setMean(0.3406824094489751d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5053565223803516d + "'", double18 == 0.5053565223803516d);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.4960106436853684d);
        double double9 = normalDistributionImpl2.getInitialDomain(10.026126956040166d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability((double) (short) -1);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.16108488682834415d);
        double double15 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        double double17 = normalDistributionImpl2.getDomainLowerBound(200.0d);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.5026547384068555d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4960106436853684d + "'", double10 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.16108488682834415d + "'", double15 == 0.16108488682834415d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.16108488682834415d + "'", double17 == 0.16108488682834415d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5013626639053514d + "'", double19 == 0.5013626639053514d);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '4');
        double double14 = normalDistributionImpl2.getInitialDomain(409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
            normalDistributionImpl2.setStandardDeviation((-1.5543122344752192E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
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
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.getDomainUpperBound((double) 0.0f);
        double double14 = normalDistributionImpl2.getDomainUpperBound((-321.8666021266556d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        normalDistributionImpl2.setMean(59.120415885425516d);
        double double8 = normalDistributionImpl2.cumulativeProbability(52.0d);
        double double10 = normalDistributionImpl2.cumulativeProbability(200.0d);
        double double12 = normalDistributionImpl2.getDomainUpperBound((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.47161763576680055d + "'", double8 == 0.47161763576680055d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9205522273689688d + "'", double10 == 0.9205522273689688d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 59.120415885425516d + "'", double12 == 59.120415885425516d);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(0.16852760746683781d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-90.0d) + "'", double13 == (-90.0d));
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double11 = normalDistributionImpl2.getDomainUpperBound((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.cumulativeProbability(0.8404349207008496d, 0.5020028532139044d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.039396101914527804d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.5013304021987853d);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        normalDistributionImpl2.setMean((-5.773159728050814E-15d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
            double double17 = normalDistributionImpl2.cumulativeProbability(0.08939857521611085d, (-5.773159728050814E-15d));
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
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 'a');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.999987716976066d);
        double double5 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double14 = normalDistributionImpl2.cumulativeProbability(0.9990117802233995d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double18 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.9990117802233995d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        double double25 = normalDistributionImpl2.cumulativeProbability(0.5039854140850412d);
        double double26 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass27 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 6.106226635438361E-16d + "'", double25 == 6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.getInitialDomain(0.5039893563146316d);
        normalDistributionImpl2.setStandardDeviation(0.5027585141294139d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-190.53983024611358d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double18 = normalDistributionImpl2.getMean();
        double double20 = normalDistributionImpl2.getDomainLowerBound(0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        double double10 = normalDistributionImpl2.cumulativeProbability((double) 10);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.8339767539364704d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability((double) 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.539827837277029d + "'", double10 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.NEGATIVE_INFINITY + "'", double14 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 10.0f);
        normalDistributionImpl2.setMean(0.5053565223803516d);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-0.8413596248239952d));
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '4');
        double double13 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl2.inverseCumulativeProbability((-799.5509223927169d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 10);
        double double12 = normalDistributionImpl2.cumulativeProbability((-0.8413596248239952d));
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.inverseCumulativeProbability((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.4966435003267168d + "'", double12 == 0.4966435003267168d);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double14 = normalDistributionImpl2.cumulativeProbability(0.9990117802233995d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.cumulativeProbability(0.07365795537454656d);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5002938527002967d + "'", double17 == 0.5002938527002967d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        normalDistributionImpl2.setMean(0.16852760746683781d);
        normalDistributionImpl2.setMean(0.5019947030907408d);
        double double17 = normalDistributionImpl2.getDomainUpperBound(0.9999999999999823d);
        double double19 = normalDistributionImpl2.getInitialDomain(0.5020052938315906d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.50199470309074d + "'", double19 == 100.50199470309074d);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(101.0d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.6153338488435729d);
        double double19 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double22 = normalDistributionImpl2.cumulativeProbability(6.429456955875379E-4d, 34.0d);
        normalDistributionImpl2.setStandardDeviation(10.0d);
        double double25 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass26 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 29.324838582032726d + "'", double17 == 29.324838582032726d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.13306917105380833d + "'", double22 == 0.13306917105380833d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5039854140850405d);
        double double9 = normalDistributionImpl2.cumulativeProbability((-321.8666021266556d));
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.506713322768457d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.cumulativeProbability(5.440092820663267E-15d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9991574196213242d + "'", double7 == 0.9991574196213242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0551338408836273E-12d + "'", double9 == 2.0551338408836273E-12d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.001349898031630159d, (-32.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        normalDistributionImpl2.setMean(Double.NEGATIVE_INFINITY);
        java.lang.Class<?> wildcardClass21 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 59.120415885425516d + "'", double18 == 59.120415885425516d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getDomainUpperBound(0.5013626639053514d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(99.02999982830094d, 0.1586552539043654d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-90.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        normalDistributionImpl2.setMean(11.0d);
        double double14 = normalDistributionImpl2.cumulativeProbability(6.106226635438361E-16d);
        double double16 = normalDistributionImpl2.getInitialDomain(0.507670861292653d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.37665202364295614d + "'", double14 == 0.37665202364295614d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 46.0d + "'", double16 == 46.0d);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (short) 0);
        double double7 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.getDomainLowerBound(0.5039893563146316d);
        double double11 = normalDistributionImpl2.getInitialDomain((-69.90167018868739d));
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-146.37048343391822d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-100.0d) + "'", double11 == (-100.0d));
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.cumulativeProbability((double) 1.0f);
        double double18 = normalDistributionImpl2.getInitialDomain(0.4960106436853684d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl2.inverseCumulativeProbability((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5039893563146316d + "'", double16 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.5039893563146316d);
        double double14 = normalDistributionImpl2.getInitialDomain((double) 1L);
        double double16 = normalDistributionImpl2.cumulativeProbability(5.440092820663267E-15d);
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.50398935631463d + "'", double14 == 100.50398935631463d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4979893818807349d + "'", double16 == 0.4979893818807349d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        double double7 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '#');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.002774428975804377d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-277.33138319894914d) + "'", double4 == (-277.33138319894914d));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        normalDistributionImpl2.setStandardDeviation(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability((-40.87958411457447d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 309.37500000520356d + "'", double10 == 309.37500000520356d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
            double double19 = normalDistributionImpl2.cumulativeProbability(0.004639639218063429d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.5000025689567479d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(0.0d, (-132.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.439419620630119E-4d + "'", double6 == 6.439419620630119E-4d);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) (short) 100);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.01213919411360942d);
        normalDistributionImpl2.setMean((double) 10.0f);
        double double7 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-128.26949715237384d) + "'", double4 == (-128.26949715237384d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getInitialDomain((double) (-1));
        normalDistributionImpl2.setMean(0.5d);
        double double23 = normalDistributionImpl2.getInitialDomain(10.026126956040166d);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = normalDistributionImpl2.inverseCumulativeProbability(Double.NEGATIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 99.0d + "'", double19 == 99.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.5d + "'", double23 == 1.5d);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double5 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        normalDistributionImpl0.setStandardDeviation(0.5039854140850412d);
        normalDistributionImpl0.setMean((-126.12663573645062d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8339767539364704d, 107.0d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 107.0d + "'", double3 == 107.0d);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        normalDistributionImpl0.setMean((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.inverseCumulativeProbability(59.121059827387576d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainUpperBound((double) 10.0f);
        double double13 = normalDistributionImpl2.getDomainUpperBound(0.5062582824999134d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.004639639218063429d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5000185094824923d + "'", double15 == 0.5000185094824923d);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5020106023922443d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.cumulativeProbability(0.9772498680518209d, 0.7228081817379124d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5062582824999134d + "'", double7 == 0.5062582824999134d);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-0.8413596248239952d));
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double16 = normalDistributionImpl2.getDomainLowerBound((-312.05092239451676d));
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl2.cumulativeProbability(0.003989356314631598d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double14 = normalDistributionImpl2.getDomainUpperBound(200.0d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.cumulativeProbability(97.77142633673954d, 0.3406824094489751d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.841344746068543d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.8339767539364704d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(9.047742753903742E-4d, (double) 10.0f);
        double double4 = normalDistributionImpl2.getInitialDomain(8.89024926669868E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.9999787774020832d, 0.5019866608109517d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9.99909522572461d) + "'", double4 == (-9.99909522572461d));
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainUpperBound((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.inverseCumulativeProbability(10.503989356314632d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double15 = normalDistributionImpl2.getDomainLowerBound(0.539827837277029d);
        double double18 = normalDistributionImpl2.cumulativeProbability(8.429343765339881E-4d, 0.9990117802232268d);
        double double20 = normalDistributionImpl2.cumulativeProbability((double) 100);
        double double22 = normalDistributionImpl2.inverseCumulativeProbability(0.9953360887357412d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5039893563146316d + "'", double11 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.003982051263416553d + "'", double18 == 0.003982051263416553d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.841344746068543d + "'", double20 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 259.9799562906546d + "'", double22 == 259.9799562906546d);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.5033270473131487d);
        double double11 = normalDistributionImpl2.cumulativeProbability(0.539827837277029d, (double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound(1.5d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl2.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-99.73312743878357d) + "'", double8 == (-99.73312743878357d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.3936365174897E-4d + "'", double11 == 8.3936365174897E-4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.8339767539364704d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        double double30 = normalDistributionImpl2.cumulativeProbability(8.429343765339881E-4d);
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.1591531807176773d + "'", double30 == 0.1591531807176773d);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainLowerBound((double) 1.0f);
        double double9 = normalDistributionImpl2.getInitialDomain((-100.841359624824d));
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.cumulativeProbability(107.0d, 1.0000484283777002d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-100.0d) + "'", double5 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-132.0d) + "'", double9 == (-132.0d));
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(Double.NEGATIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl2.cumulativeProbability(0.25986015636209525d, 0.011224171101298197d);
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
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability(0.16108488682834415d);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.9999999996226588d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-99.00088902533815d) + "'", double7 == (-99.00088902533815d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5039893563131264d + "'", double9 == 0.5039893563131264d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, 409.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(1.7976931348623157E308d);
        double double6 = normalDistributionImpl2.getInitialDomain((-314.0626513812741d));
        double double8 = normalDistributionImpl2.getInitialDomain(0.0d);
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.5016193542725117d);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.0012209691105105058d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.691462461274013d + "'", double10 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        normalDistributionImpl2.setMean(100.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(0.5001042314730403d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.546219801024759d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 200.0d + "'", double13 == 200.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.15998055559522822d + "'", double15 == 0.15998055559522822d);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(101.0d);
        double double17 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double18 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.13306917105380833d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation(0.4490776072831239d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getStandardDeviation();
        double double19 = normalDistributionImpl2.getInitialDomain(62.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4490776072831239d + "'", double14 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4490776072831239d + "'", double16 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.4490776072831239d + "'", double17 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.4490776072831239d + "'", double19 == 0.4490776072831239d);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        double double20 = normalDistributionImpl2.cumulativeProbability((-99.73312743878357d), 0.9990117802233995d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-33.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.13819004034332988d + "'", double20 == 0.13819004034332988d);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(6.106226635438361E-16d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain(1.0d);
        double double17 = normalDistributionImpl2.getMean();
        double double18 = normalDistributionImpl2.getStandardDeviation();
        double double20 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double21 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-100.0d) + "'", double20 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5013626639053514d, (-200.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        double double21 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0020476378332464074d + "'", double19 == 0.0020476378332464074d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', 0.3668235531222151d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        // The following exception was thrown during execution in test generation
        try {
            double double21 = normalDistributionImpl2.inverseCumulativeProbability((double) 100.0f);
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
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.9990117802232268d);
        normalDistributionImpl2.setMean((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(0.37665202364295614d, (-41.060142464627134d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.POSITIVE_INFINITY, (-11.119995541385146d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-32.0d), 0.07365795537454656d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.cumulativeProbability(32.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.cumulativeProbability(59.120415885425516d);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (short) 1);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7228081817379124d + "'", double9 == 0.7228081817379124d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5039893563146316d + "'", double11 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 1);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5000484283777002d);
        double double9 = normalDistributionImpl0.getInitialDomain(0.5019947030907408d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.inverseCumulativeProbability((double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.691462461274013d + "'", double4 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0000484283777002d + "'", double9 == 1.0000484283777002d);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double12 = normalDistributionImpl2.cumulativeProbability(0.34134474606854304d, 0.5027585141294139d);
        double double14 = normalDistributionImpl2.cumulativeProbability((double) ' ');
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.439419620615228E-4d + "'", double12 == 6.439419620615228E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6255158347233201d + "'", double14 == 0.6255158347233201d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-0.9000000000335028d), 0.38212483247943946d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability((double) 10, 59.120415885425516d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainLowerBound(129.0d);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getInitialDomain(0.5d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl2.inverseCumulativeProbability(1.0000484283777002d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        normalDistributionImpl0.setMean((double) (byte) 0);
        double double9 = normalDistributionImpl0.getInitialDomain(409.37500000520356d);
        double double11 = normalDistributionImpl0.cumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.cumulativeProbability((-90.0d), 0.010090298830658262d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0, 100.00012139194168d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.9991601276537112d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.5543122344752192E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5039860010376033d + "'", double4 == 0.5039860010376033d);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        normalDistributionImpl2.setMean(0.01213919411360942d);
        double double14 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double17 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.01213919411360942d + "'", double14 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.01213919411360942d + "'", double16 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.01213919411360942d + "'", double17 == 0.01213919411360942d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5039893563146316d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9000000000335028d) + "'", double4 == (-0.9000000000335028d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) (short) 100);
        double double4 = normalDistributionImpl2.getDomainLowerBound((-5.773159728050814E-15d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d);
        normalDistributionImpl2.setStandardDeviation(200.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.cumulativeProbability(409.37500000520356d, 107.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5001042314730403d + "'", double9 == 0.5001042314730403d);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(100.0d);
        normalDistributionImpl2.setMean(0.01213919411360942d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8339767539364704d, (double) 10L);
        normalDistributionImpl2.setStandardDeviation(0.5062828993298469d);
        double double7 = normalDistributionImpl2.cumulativeProbability(1.418208683034269E-4d, 0.5026547384068555d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.20663873465193733d + "'", double7 == 0.20663873465193733d);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.34134474606854304d);
        double double14 = normalDistributionImpl2.cumulativeProbability(0.34134474606854304d);
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.6823959331695719d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.501361765869532d + "'", double12 == 0.501361765869532d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.501361765869532d + "'", double14 == 0.501361765869532d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) (short) 100);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.01213919411360942d);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (byte) 0);
        double double8 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 100);
        double double10 = normalDistributionImpl2.cumulativeProbability(46.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-128.26949715237384d) + "'", double4 == (-128.26949715237384d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.16602324606352958d + "'", double6 == 0.16602324606352958d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3050257308975194d + "'", double10 == 0.3050257308975194d);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.cumulativeProbability(97.0d, 0.506713322768457d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        normalDistributionImpl2.setStandardDeviation(0.16602324606352958d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl2.cumulativeProbability((-1.5543122344752192E-15d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.16602324606352958d + "'", double13 == 0.16602324606352958d);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability((double) 100.0f, 0.9999787774020832d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        normalDistributionImpl2.setMean(100.0d);
        double double12 = normalDistributionImpl2.getDomainUpperBound((-31.623158857349317d));
        double double14 = normalDistributionImpl2.cumulativeProbability((-128.26949715237384d));
        double double16 = normalDistributionImpl2.cumulativeProbability(99.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.011224171101298197d + "'", double14 == 0.011224171101298197d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4960106436853684d + "'", double16 == 0.4960106436853684d);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-2.1649348980190553E-15d), (-11.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double7 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-128.26949715237384d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.3668235531222151d + "'", double19 == 0.3668235531222151d);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.816634256911273d, (-5.773159728050814E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.5039893563146316d);
        double double14 = normalDistributionImpl2.getInitialDomain((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.50398935631463d + "'", double14 == 100.50398935631463d);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        double double26 = normalDistributionImpl2.getMean();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 101.0d + "'", double23 == 101.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        normalDistributionImpl2.setMean(100.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(0.16108488682834415d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(9.0d, (double) 'a');
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.29812036135129827d + "'", double7 == 0.29812036135129827d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability((double) (short) -1);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.15864037517600482d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4960106436853684d + "'", double10 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        normalDistributionImpl2.setMean((double) (-1));
        normalDistributionImpl2.setStandardDeviation(0.7688235963189542d);
        double double16 = normalDistributionImpl2.getDomainLowerBound((double) 0);
        double double17 = normalDistributionImpl2.getStandardDeviation();
        double double18 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.7688235963189542d + "'", double17 == 0.7688235963189542d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-299.4363000875007d), 99.0d);
        normalDistributionImpl2.setMean(0.4966435003267168d);
        normalDistributionImpl2.setMean((double) 100.0f);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        normalDistributionImpl2.setMean(0.16852760746683781d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.5020106023922443d);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        double double18 = normalDistributionImpl2.getDomainLowerBound((-0.9000000000335028d));
        double double20 = normalDistributionImpl2.getDomainUpperBound((-11.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5013304021987853d + "'", double15 == 0.5013304021987853d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.16852760746683781d + "'", double20 == 0.16852760746683781d);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability(0.5378382600176361d, 0.003233364812544881d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.cumulativeProbability(0.5020429585576492d, (-5.773159728050814E-15d));
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
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getInitialDomain((-68.0d));
        normalDistributionImpl2.setStandardDeviation(0.01213919411360942d);
        double double17 = normalDistributionImpl2.cumulativeProbability(9.047742753903742E-4d);
        double double19 = normalDistributionImpl2.getDomainLowerBound(0.5062828993298469d);
        double double21 = normalDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5297069799427127d + "'", double17 == 0.5297069799427127d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.5d + "'", double21 == 0.5d);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(Double.POSITIVE_INFINITY);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl2.cumulativeProbability(0.9999999999999823d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        normalDistributionImpl2.setMean(0.0d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl2.inverseCumulativeProbability((-128.26949715237384d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.NEGATIVE_INFINITY + "'", double17 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(Double.NEGATIVE_INFINITY);
        double double18 = normalDistributionImpl2.getDomainLowerBound((double) 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getDomainUpperBound(8.3936365174897E-4d);
        normalDistributionImpl2.setMean(5.440092820663267E-15d);
        normalDistributionImpl2.setStandardDeviation(0.7228081817379124d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(100.16852760746684d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.440092820663267E-15d + "'", double12 == 5.440092820663267E-15d);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(Double.POSITIVE_INFINITY);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.cumulativeProbability(0.4557288934945513d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        normalDistributionImpl2.setStandardDeviation(0.5002938527002967d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(Double.POSITIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl2.setMean((double) (byte) 100);
        double double9 = normalDistributionImpl2.cumulativeProbability((-27.529693043639718d), 0.996954640520628d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.cumulativeProbability(1.7976931348623157E308d, 97.67965765688128d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.059977535157524076d + "'", double9 == 0.059977535157524076d);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        double double28 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass29 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.026126956040166d + "'", double25 == 10.026126956040166d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9990117802233995d, 0.4966435003267168d);
        normalDistributionImpl2.setMean((-99.98786080588638d));
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getInitialDomain(0.0012518388356499988d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4966435003267168d + "'", double5 == 0.4966435003267168d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.4845043062131d) + "'", double7 == (-100.4845043062131d));
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double14 = normalDistributionImpl2.cumulativeProbability(0.9990117802233995d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getDomainUpperBound((-100.0d));
        double double19 = normalDistributionImpl2.getDomainLowerBound(409.37500000520356d);
        double double21 = normalDistributionImpl2.inverseCumulativeProbability(0.5068289254012387d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.711841352131704d + "'", double21 == 1.711841352131704d);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(100.0d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0020476378332464074d, 7.773567058553255E-4d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.773567058553255E-4d + "'", double3 == 7.773567058553255E-4d);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        normalDistributionImpl2.setStandardDeviation((double) (short) 1);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        double double14 = normalDistributionImpl2.getDomainUpperBound(0.816634256911273d);
        double double15 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.cumulativeProbability(0.5002938527002967d, 314.1692288583126d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        double double7 = normalDistributionImpl0.getDomainLowerBound((double) 0L);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        double double21 = normalDistributionImpl2.getInitialDomain((double) (byte) 100);
        double double24 = normalDistributionImpl2.cumulativeProbability((double) (-1L), 0.3406824094489751d);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = normalDistributionImpl2.inverseCumulativeProbability(0.3050257308975194d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 200.0d + "'", double21 == 200.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.003233364812544881d + "'", double24 == 0.003233364812544881d);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.1590394216775845d);
        double double15 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        double double18 = normalDistributionImpl2.cumulativeProbability(0.0d, 0.5020027136551392d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = normalDistributionImpl2.cumulativeProbability((double) (short) 1, (-312.05092239451676d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-3.0d) + "'", double15 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0012541753965479852d + "'", double18 == 0.0012541753965479852d);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.cumulativeProbability((-27.529693043639718d));
        double double5 = normalDistributionImpl0.getDomainLowerBound(0.5020106023922443d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.cumulativeProbability((double) (short) 10, 0.16116265572688077d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.5543122344752192E-15d) + "'", double3 == (-1.5543122344752192E-15d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        double double27 = normalDistributionImpl2.getDomainLowerBound(0.16852760746683781d);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = normalDistributionImpl2.cumulativeProbability((double) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.7976931348623157E308d) + "'", double27 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5003566436642092d, (double) 10L);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.942890293094024E-15d, 409.37500000520356d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 409.37500000520356d + "'", double3 == 409.37500000520356d);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9772498680518209d, (-99.73180342032491d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, (double) ' ');
        normalDistributionImpl2.setStandardDeviation(0.01213919411360942d);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getInitialDomain(0.999987716976066d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.01213919411360942d + "'", double6 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 101.01213919411362d + "'", double8 == 101.01213919411362d);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double14 = normalDistributionImpl2.cumulativeProbability(0.9990117802233995d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double18 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = normalDistributionImpl2.cumulativeProbability(0.5006153217161514d, 8.3936365174897E-4d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.getInitialDomain(0.5039893563146316d);
        normalDistributionImpl2.setStandardDeviation(0.5027585141294139d);
        double double11 = normalDistributionImpl2.getDomainLowerBound((-52.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        double double14 = normalDistributionImpl2.cumulativeProbability((-200.0d));
        double double15 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.001349898031630159d + "'", double14 == 0.001349898031630159d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) (short) 100);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.841344746068543d + "'", double8 == 0.841344746068543d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01213919411360942d, 0.4490776072831239d);
        normalDistributionImpl2.setMean((double) 100L);
        double double6 = normalDistributionImpl2.getDomainUpperBound((-799.5509223927169d));
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.1590394216775845d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '4');
        normalDistributionImpl2.setMean(10.026126956040166d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-26.12663573645063d));
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
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.getDomainUpperBound((double) 0L);
        double double14 = normalDistributionImpl2.getDomainLowerBound(1.0d);
        double double16 = normalDistributionImpl2.getDomainUpperBound((double) ' ');
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (byte) -1);
        normalDistributionImpl2.setMean((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 101.0d + "'", double4 == 101.0d);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double2 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(309.37500000520356d);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.cumulativeProbability(0.38212483247943946d, (-100.4845043062131d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 309.37500000520356d + "'", double5 == 309.37500000520356d);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) -1, 0.5039854140850412d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.5068101625618202d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.09950447039473481d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.5033270473131487d);
        normalDistributionImpl2.setStandardDeviation(0.5033270473131487d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.cumulativeProbability((double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-99.73312743878357d) + "'", double8 == (-99.73312743878357d));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 10L, 96.93366833316512d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
            double double24 = normalDistributionImpl2.cumulativeProbability((-277.33138319894914d), (-90.0d));
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
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01213919411360942d, 0.4490776072831239d);
        double double3 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.inverseCumulativeProbability(99.55092239271687d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01213919411360942d + "'", double3 == 0.01213919411360942d);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        // The following exception was thrown during execution in test generation
        try {
            double double25 = normalDistributionImpl2.cumulativeProbability(0.5020079759221441d, (-126.12663573645062d));
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
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d);
        normalDistributionImpl2.setStandardDeviation(200.0d);
        normalDistributionImpl2.setStandardDeviation(309.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(0.5d);
        normalDistributionImpl2.setMean(0.9999787774020832d);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5001042314730403d + "'", double9 == 0.5001042314730403d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double9 = normalDistributionImpl2.getInitialDomain((double) 10.0f);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-90.53983024611358d));
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        double double12 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(35.0d);
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (-90.53983024611358d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        normalDistributionImpl0.setMean((double) (byte) 0);
        double double9 = normalDistributionImpl0.getDomainUpperBound(0.0013750926571968192d);
        double double11 = normalDistributionImpl0.getInitialDomain(0.5020028532139044d);
        double double13 = normalDistributionImpl0.getDomainUpperBound(15.695941430105695d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getInitialDomain(0.691462461274013d);
        double double12 = normalDistributionImpl2.getDomainLowerBound((-128.26949715237384d));
        double double13 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        double double25 = normalDistributionImpl2.getInitialDomain(409.37500000520356d);
        normalDistributionImpl2.setMean(0.3410511871010289d);
        // The following exception was thrown during execution in test generation
        try {
            double double30 = normalDistributionImpl2.cumulativeProbability(400.12500003330143d, (-90.0d));
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 102.74285731024536d + "'", double23 == 102.74285731024536d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 101.0d + "'", double25 == 101.0d);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        normalDistributionImpl2.setMean(100.0d);
        double double12 = normalDistributionImpl2.getDomainUpperBound((-31.623158857349317d));
        double double14 = normalDistributionImpl2.cumulativeProbability((-128.26949715237384d));
        normalDistributionImpl2.setMean((-100.841359624824d));
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.011224171101298197d + "'", double14 == 0.011224171101298197d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        normalDistributionImpl2.setMean(100.0d);
        double double13 = normalDistributionImpl2.cumulativeProbability((double) 0, (double) 100L);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double18 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass19 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.341344746068543d + "'", double13 == 0.341344746068543d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(Double.NEGATIVE_INFINITY);
        normalDistributionImpl2.setStandardDeviation(29.324838582032726d);
        double double21 = normalDistributionImpl2.cumulativeProbability(0.5019947133392674d);
        double double24 = normalDistributionImpl2.cumulativeProbability(1.942890293094024E-15d, 0.3410511871010289d);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = normalDistributionImpl2.cumulativeProbability(409.37500000520356d, 0.0d);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.5068289254012387d + "'", double21 == 0.5068289254012387d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.004639639218063429d + "'", double24 == 0.004639639218063429d);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getInitialDomain(0.691462461274013d);
        double double12 = normalDistributionImpl2.getDomainLowerBound((-128.26949715237384d));
        double double13 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.5039854140850405d);
        normalDistributionImpl2.setMean(0.5341532272166142d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(0.6153338488435729d, 0.00594420241553506d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.7688235963189542d);
        double double14 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        normalDistributionImpl0.setMean((double) 1L);
        double double9 = normalDistributionImpl0.getDomainLowerBound((double) (short) -1);
        normalDistributionImpl0.setStandardDeviation(8.987287113132458E-5d);
        double double13 = normalDistributionImpl0.getDomainUpperBound((-40.87958411457447d));
        double double14 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl0.cumulativeProbability(0.5006153217161514d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5019947030907408d, 99.55092239271687d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(8.89024926669868E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
            double double23 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 0.5033600462439357d);
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
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(35.50332704731315d, 0.5026547384068555d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability((double) (short) -1);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.16108488682834415d);
        double double15 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        double double17 = normalDistributionImpl2.cumulativeProbability(1.2032093049234251d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4960106436853684d + "'", double10 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.16108488682834415d + "'", double15 == 0.16108488682834415d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5041573996674839d + "'", double17 == 0.5041573996674839d);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.getInitialDomain(0.5039893563146316d);
        normalDistributionImpl2.setMean(309.37500000520356d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01213919411360942d, 0.4490776072831239d);
        normalDistributionImpl2.setMean((double) 100L);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) ' ');
        double double8 = normalDistributionImpl2.getInitialDomain(0.02860714277600379d);
        double double10 = normalDistributionImpl2.getInitialDomain(0.6255158347233201d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability((-31.623158857349317d), (-40.87958411457447d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 99.55092239271687d + "'", double8 == 99.55092239271687d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.44907760728313d + "'", double10 == 100.44907760728313d);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double7 = normalDistributionImpl2.cumulativeProbability(9.0d, (double) 'a');
        double double8 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.29812036135129827d + "'", double7 == 0.29812036135129827d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double8 = normalDistributionImpl2.getDomainUpperBound(0.5020106023922443d);
        double double10 = normalDistributionImpl2.cumulativeProbability(99.55092239271687d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0000000000000004d + "'", double10 == 1.0000000000000004d);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        normalDistributionImpl2.setStandardDeviation(0.19981031319245302d);
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
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5002938527002967d, 0.16852760746683781d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.5013304021987853d, 107.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.inverseCumulativeProbability(0.5017915544255316d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.4490776072769937d + "'", double9 == 0.4490776072769937d);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8339767539364704d, (double) 10L);
        normalDistributionImpl2.setStandardDeviation(0.5062828993298469d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability((-146.37048343391822d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.getInitialDomain(0.4960106436853684d);
        normalDistributionImpl2.setStandardDeviation(0.29812036135129827d);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.29812036135129827d + "'", double16 == 0.29812036135129827d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double14 = normalDistributionImpl2.cumulativeProbability(0.9990117802233995d);
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        normalDistributionImpl2.setMean(100.0d);
        double double12 = normalDistributionImpl2.getDomainUpperBound((-31.623158857349317d));
        double double14 = normalDistributionImpl2.cumulativeProbability((-128.26949715237384d));
        double double16 = normalDistributionImpl2.getInitialDomain((-22.36087456351966d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.011224171101298197d + "'", double14 == 0.011224171101298197d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        normalDistributionImpl2.setStandardDeviation(0.010090298830658262d);
        double double19 = normalDistributionImpl2.getDomainLowerBound(0.47161763576680055d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.8339767539364704d);
        double double9 = normalDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double11 = normalDistributionImpl2.getInitialDomain((double) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8339767539364704d + "'", double9 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8339767539364704d + "'", double11 == 0.8339767539364704d);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5039893563146316d, (double) 1L);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.10360644854994305d, 10.503989356314632d);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        double double20 = normalDistributionImpl2.getDomainUpperBound(100.50398935631463d);
        double double22 = normalDistributionImpl2.getInitialDomain(0.9999999999999823d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 200.0d + "'", double22 == 200.0d);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '4');
        double double14 = normalDistributionImpl2.cumulativeProbability(0.5039854140850405d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5038664988968552d + "'", double14 == 0.5038664988968552d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.getInitialDomain(0.5039893563146316d);
        normalDistributionImpl2.setStandardDeviation(0.5027585141294139d);
        double double10 = normalDistributionImpl2.getMean();
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.507670861292653d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double14 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.5001042314730403d);
        double double11 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.cumulativeProbability((double) (byte) 100, 0.5039860010376033d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-100.0d) + "'", double11 == (-100.0d));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.5033270473131487d);
        double double11 = normalDistributionImpl2.cumulativeProbability(0.539827837277029d, (double) (short) 100);
        double double13 = normalDistributionImpl2.getInitialDomain(129.0d);
        double double15 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-99.73312743878357d) + "'", double8 == (-99.73312743878357d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.3936365174897E-4d + "'", double11 == 8.3936365174897E-4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-68.0d) + "'", double13 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.7976931348623157E308d) + "'", double15 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
            double double27 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1);
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.inverseCumulativeProbability((double) 1);
        normalDistributionImpl2.setMean((double) (-1.0f));
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5020106023922443d);
        normalDistributionImpl2.setMean(0.5000484283777002d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.cumulativeProbability(0.5020028532139044d, 0.13819004034332988d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5062582824999134d + "'", double7 == 0.5062582824999134d);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.5033570607468583d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.841500269950151d + "'", double12 == 0.841500269950151d);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        normalDistributionImpl0.setMean(0.5341532272166142d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.cumulativeProbability(59.120415885425516d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-128.26949715237384d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7228081817379124d + "'", double9 == 0.7228081817379124d);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01213919411360942d, 0.4490776072831239d);
        normalDistributionImpl2.setMean((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.5033270473131487d, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double14 = normalDistributionImpl2.getDomainUpperBound(200.0d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.cumulativeProbability(2.0551338408836273E-12d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl2.inverseCumulativeProbability((-321.8666021266556d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.16602324606353464d + "'", double17 == 0.16602324606353464d);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
        normalDistributionImpl2.setMean((-799.5509223927169d));
        // The following exception was thrown during execution in test generation
        try {
            double double29 = normalDistributionImpl2.inverseCumulativeProbability(0.13514946487744206d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
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
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) (short) 100);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        normalDistributionImpl2.setMean(59.120415885425516d);
        double double8 = normalDistributionImpl2.cumulativeProbability(52.0d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.47161763576680055d + "'", double8 == 0.47161763576680055d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 1);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5000484283777002d);
        double double9 = normalDistributionImpl0.getDomainUpperBound(0.003982051263416553d);
        double double10 = normalDistributionImpl0.getMean();
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.691462461274013d + "'", double4 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(6.439419620615228E-4d, 10.026126956040166d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5039893563146316d);
        double double6 = normalDistributionImpl2.getDomainLowerBound(0.503327047302336d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9000000000335028d) + "'", double4 == (-0.9000000000335028d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(99.55092239271687d, 0.9990394412085004d);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean(99.0d);
        double double7 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 99.0d + "'", double7 == 99.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.841500270091506d, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.16643735506845647d, (-90.53983024611358d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        double double22 = normalDistributionImpl2.getInitialDomain((double) 1L);
        java.lang.Class<?> wildcardClass23 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.501361765869532d + "'", double20 == 0.501361765869532d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 10.0f);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(99.49601458591496d);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl0.inverseCumulativeProbability((-181.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 10.0d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.1586552539043654d);
        double double7 = normalDistributionImpl2.cumulativeProbability((-33.0d), (double) (-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-10.0d) + "'", double4 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.45968873858058723d + "'", double7 == 0.45968873858058723d);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.cumulativeProbability(0.5020052938315906d, 0.10360644854994305d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0, 0.003989356314631598d);
        normalDistributionImpl2.setMean(0.5002938527002967d);
        double double5 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability(0.5020079759221441d, 10.026126956040166d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5002938527002967d + "'", double5 == 0.5002938527002967d);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5033270473131487d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.34134474606854304d);
        double double15 = normalDistributionImpl2.getDomainUpperBound(0.1586552539043654d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(11.0d);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.816634256911273d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = normalDistributionImpl2.cumulativeProbability(Double.NEGATIVE_INFINITY, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5020079759221441d + "'", double11 == 0.5020079759221441d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5032578631163334d + "'", double19 == 0.5032578631163334d);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getInitialDomain(0.691462461274013d);
        double double12 = normalDistributionImpl2.getDomainLowerBound((-128.26949715237384d));
        double double14 = normalDistributionImpl2.getDomainUpperBound((-32.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.inverseCumulativeProbability((-33.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getInitialDomain(10.0d);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.341344746068543d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.5d + "'", double6 == 1.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(35.50332704731315d, 0.5026547384068555d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.cumulativeProbability((-299.4363000875007d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainUpperBound((double) 10.0f);
        double double13 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl2.inverseCumulativeProbability(1.000000000000002d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.9990117802232268d);
        normalDistributionImpl2.setMean((double) (short) -1);
        double double8 = normalDistributionImpl2.getInitialDomain((-26.12663573645063d));
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.5019813127606616d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-33.0d) + "'", double8 == (-33.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.8339767539364704d);
        double double9 = normalDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.inverseCumulativeProbability((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8339767539364704d + "'", double9 == 0.8339767539364704d);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        normalDistributionImpl2.setStandardDeviation(0.5039854140850412d);
        double double24 = normalDistributionImpl2.getInitialDomain(0.16116265572688077d);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = normalDistributionImpl2.inverseCumulativeProbability(197.0d);
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 99.49601458591496d + "'", double24 == 99.49601458591496d);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double8 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound((-99.98786080588638d));
        double double12 = normalDistributionImpl2.getDomainLowerBound(101.01213919411362d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + Double.NEGATIVE_INFINITY + "'", double8 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getDomainUpperBound(8.3936365174897E-4d);
        double double8 = normalDistributionImpl2.getInitialDomain(0.08939857521611085d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.cumulativeProbability(101.0d, 100.50398935631463d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        normalDistributionImpl0.setMean((double) (byte) 0);
        double double9 = normalDistributionImpl0.getInitialDomain(409.37500000520356d);
        normalDistributionImpl0.setMean(0.341344746068543d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.0012518388356499988d, 0.9999999993515475d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.inverseCumulativeProbability((-1.3322676295501878E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.37804813188807573d + "'", double14 == 0.37804813188807573d);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 'a');
        normalDistributionImpl2.setStandardDeviation(0.8339767539364704d);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        double double22 = normalDistributionImpl2.getDomainUpperBound(0.5062582824999134d);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = normalDistributionImpl2.inverseCumulativeProbability(Double.NEGATIVE_INFINITY);
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7976931348623157E308d + "'", double22 == 1.7976931348623157E308d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getInitialDomain(0.691462461274013d);
        double double12 = normalDistributionImpl2.getDomainLowerBound((-128.26949715237384d));
        double double13 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl2.inverseCumulativeProbability((-9.99909522572461d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.15864037517600482d + "'", double5 == 0.15864037517600482d);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
        double double25 = normalDistributionImpl2.getInitialDomain(409.37500000520356d);
        double double27 = normalDistributionImpl2.getDomainLowerBound(0.5033270473131487d);
        double double29 = normalDistributionImpl2.getDomainUpperBound((double) 10);
        double double31 = normalDistributionImpl2.getDomainLowerBound(1.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 102.74285731024536d + "'", double23 == 102.74285731024536d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 101.0d + "'", double25 == 101.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.7976931348623157E308d + "'", double29 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, (double) '4');
        double double13 = normalDistributionImpl2.getDomainUpperBound(1.711841352131704d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-69.90167018868739d), (-99.62334797635704d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getInitialDomain(0.501361765869532d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.003982051263416553d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5000496440189875d + "'", double7 == 0.5000496440189875d);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5068289254012387d, 0.5038664988968552d);
        normalDistributionImpl2.setStandardDeviation(29.324838582032726d);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        double double7 = normalDistributionImpl0.getDomainLowerBound((double) 0L);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8339767539364704d, (double) 10);
        double double3 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.9772498680518209d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8339767539364704d + "'", double3 == 0.8339767539364704d);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.8339767539364704d);
        double double9 = normalDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double10 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(3.809557474743208E-5d, 5.551115123125783E-16d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8339767539364704d + "'", double9 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.376841142650683d, 9.498638234130468d);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        double double25 = normalDistributionImpl2.cumulativeProbability(0.5020429585576492d);
        double double27 = normalDistributionImpl2.inverseCumulativeProbability(0.5000025689567479d);
        normalDistributionImpl2.setMean(0.08919152173113587d);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5020028532139044d + "'", double25 == 0.5020028532139044d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 6.439419620630119E-4d + "'", double27 == 6.439419620630119E-4d);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(35.50332704731315d, 0.5026547384068555d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        double double10 = normalDistributionImpl2.cumulativeProbability((double) 10);
        double double12 = normalDistributionImpl2.cumulativeProbability(6.439419620615228E-4d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.539827837277029d + "'", double10 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5000025689567479d + "'", double12 == 0.5000025689567479d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        normalDistributionImpl2.setMean(100.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(0.5001042314730403d);
        normalDistributionImpl2.setStandardDeviation(0.15865525393145702d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 200.0d + "'", double13 == 200.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getInitialDomain(0.5000000000002491d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl2.cumulativeProbability(102.74285731024536d, (-126.12663573645062d));
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 200.0d + "'", double17 == 200.0d);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        normalDistributionImpl2.setMean(100.0d);
        double double12 = normalDistributionImpl2.getDomainUpperBound((-31.623158857349317d));
        double double14 = normalDistributionImpl2.cumulativeProbability((-26.12663573645063d));
        double double16 = normalDistributionImpl2.getDomainUpperBound(0.006292013927202356d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.103606448964639d + "'", double14 == 0.103606448964639d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.341344746068543d);
        java.lang.Class<?> wildcardClass19 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double6 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.546219801024759d);
        normalDistributionImpl2.setStandardDeviation(0.9990117802233995d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 10L);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double14 = normalDistributionImpl2.cumulativeProbability((-1.1586403751760048d), 35.50332704731315d);
        normalDistributionImpl2.setStandardDeviation(0.16852760746683781d);
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.10360644854994305d + "'", double14 == 0.10360644854994305d);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.5039854140850405d);
        normalDistributionImpl2.setMean(0.5341532272166142d);
        double double9 = normalDistributionImpl2.cumulativeProbability((-9.0d), 0.0013750926571968192d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.3085654382512621d + "'", double9 == 0.3085654382512621d);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        double double8 = normalDistributionImpl2.getDomainUpperBound(0.5000484283777002d);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.5062828993298469d);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainUpperBound((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) -1, 0.5039854140850412d);
        double double4 = normalDistributionImpl2.getDomainLowerBound((-146.37048343391822d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5039854140850405d, 0.5026547384068555d);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.9990117802232268d);
        normalDistributionImpl2.setMean(0.5062582824999134d);
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.9991109747008919d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl2.cumulativeProbability(0.5020106023922443d, 0.039396101914527804d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5039854140850405d + "'", double8 == 0.5039854140850405d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 313.0062582842937d + "'", double12 == 313.0062582842937d);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 10L);
        normalDistributionImpl0.setStandardDeviation(0.5d);
        double double8 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((-3.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.cumulativeProbability((double) 1.0f);
        double double18 = normalDistributionImpl2.getInitialDomain(0.4960106436853684d);
        double double20 = normalDistributionImpl2.cumulativeProbability(0.691462461274013d);
        double double22 = normalDistributionImpl2.getDomainUpperBound((-68.0d));
        double double24 = normalDistributionImpl2.getDomainLowerBound(3.0324839434953876d);
        double double25 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-1.7976931348623157E308d));
        double double28 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5039893563146316d + "'", double16 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5027585141294139d + "'", double20 == 0.5027585141294139d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9990117802233995d, 0.4966435003267168d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(97.77142633673954d, 0.11533384884315512d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.5019947030907408d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-99.15865525393146d), 0.376841142650683d);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability(0.34134474606854304d, (double) 'a');
        double double14 = normalDistributionImpl2.getDomainLowerBound(129.0d);
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.9763823569067764d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6153338488435729d + "'", double12 == 0.6153338488435729d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double5 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        normalDistributionImpl2.setMean(11.0d);
        double double14 = normalDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.37665202364295614d + "'", double14 == 0.37665202364295614d);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) 10);
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        double double21 = normalDistributionImpl2.getDomainLowerBound(200.0d);
        java.lang.Class<?> wildcardClass22 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.5002938527002967d);
        double double14 = normalDistributionImpl2.getInitialDomain(0.506713322768457d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 197.0d + "'", double14 == 197.0d);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        normalDistributionImpl2.setMean(0.01213919411360942d);
        double double14 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.01213919411360942d + "'", double14 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.01213919411360942d + "'", double16 == 0.01213919411360942d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5033270473131487d);
        double double13 = normalDistributionImpl2.getDomainLowerBound((-33.0d));
        double double15 = normalDistributionImpl2.cumulativeProbability((double) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5020079759221441d + "'", double11 == 0.5020079759221441d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6984682124530338d + "'", double15 == 0.6984682124530338d);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.039396101914527804d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.5020079759221441d);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.5000025689567479d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5020027136551392d + "'", double9 == 0.5020027136551392d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.439419620630119E-4d + "'", double11 == 6.439419620630119E-4d);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.cumulativeProbability((double) 1.0f);
        double double18 = normalDistributionImpl2.getInitialDomain(0.4960106436853684d);
        double double20 = normalDistributionImpl2.cumulativeProbability(0.691462461274013d);
        double double21 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-9.99909522572461d));
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5039893563146316d + "'", double16 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5027585141294139d + "'", double20 == 0.5027585141294139d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (short) 0);
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.999987716976066d);
        double double10 = normalDistributionImpl2.getDomainUpperBound((double) 1L);
        double double11 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        normalDistributionImpl2.setMean(0.0d);
        double double17 = normalDistributionImpl2.cumulativeProbability(59.120415885425516d);
        double double18 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-68.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.7228081817379124d + "'", double17 == 0.7228081817379124d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double15 = normalDistributionImpl2.getDomainLowerBound(0.539827837277029d);
        double double18 = normalDistributionImpl2.cumulativeProbability(8.429343765339881E-4d, 0.9990117802232268d);
        double double20 = normalDistributionImpl2.getDomainUpperBound(2.0551338408836273E-12d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5039893563146316d + "'", double11 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.003982051263416553d + "'", double18 == 0.003982051263416553d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        normalDistributionImpl2.setMean(100.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(0.5001042314730403d);
        double double15 = normalDistributionImpl2.getInitialDomain((-69.90167018868739d));
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl2.inverseCumulativeProbability(99.03158468176713d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 200.0d + "'", double13 == 200.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        normalDistributionImpl2.setMean((-799.5509223927169d));
        double double28 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.026126956040166d + "'", double25 == 10.026126956040166d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-799.5509223927169d) + "'", double28 == (-799.5509223927169d));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        normalDistributionImpl2.setStandardDeviation(0.08939857521611085d);
        double double27 = normalDistributionImpl2.getDomainLowerBound(0.5016193542725117d);
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        double double17 = normalDistributionImpl2.getDomainLowerBound(0.4115308789714541d);
        double double18 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        normalDistributionImpl2.setStandardDeviation(0.5039854140850412d);
        double double23 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (short) 1);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.getDomainLowerBound(0.0012826018800755623d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5039893563146316d + "'", double11 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.7976931348623157E308d) + "'", double15 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.getInitialDomain(0.1586552539043654d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        double double21 = normalDistributionImpl2.getDomainUpperBound(0.10360644854994305d);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = normalDistributionImpl2.inverseCumulativeProbability((-146.37048343391822d));
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        normalDistributionImpl2.setMean(0.0d);
        normalDistributionImpl2.setMean(0.5020027136551392d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-0.8413596248239952d));
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-6.106226635438361E-16d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.841344746068543d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl2.inverseCumulativeProbability(189.8939857551005d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        normalDistributionImpl2.setMean(0.01213919411360942d);
        double double14 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double17 = normalDistributionImpl2.getStandardDeviation();
        double double19 = normalDistributionImpl2.getInitialDomain(0.503327047302336d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.01213919411360942d + "'", double14 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.01213919411360942d + "'", double16 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.01213919411362d + "'", double19 == 100.01213919411362d);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5039893563146316d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.003989356314631598d);
        normalDistributionImpl2.setMean(99.49601458591496d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9000000000335028d) + "'", double4 == (-0.9000000000335028d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-27.529693043639718d) + "'", double6 == (-27.529693043639718d));
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getDomainUpperBound(2.0551338408836273E-12d);
        double double18 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability((double) (short) -1);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.inverseCumulativeProbability(199.24939592632566d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4960106436853684d + "'", double10 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.020241005302473858d, 6.439419620615228E-4d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5020027136551392d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-0.8413596248239952d));
        double double14 = normalDistributionImpl2.getInitialDomain((-2.1649348980190553E-15d));
        double double16 = normalDistributionImpl2.getInitialDomain(0.506713322768457d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-100.841359624824d) + "'", double14 == (-100.841359624824d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 99.158640375176d + "'", double16 == 99.158640375176d);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getInitialDomain(0.691462461274013d);
        double double12 = normalDistributionImpl2.getDomainLowerBound((-128.26949715237384d));
        double double14 = normalDistributionImpl2.getDomainUpperBound((-32.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl2.cumulativeProbability(87.0d, 0.5013626639053514d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation(0.4490776072831239d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.getStandardDeviation();
        double double18 = normalDistributionImpl2.cumulativeProbability(1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4490776072831239d + "'", double14 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4490776072831239d + "'", double16 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9870192304409138d + "'", double18 == 0.9870192304409138d);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        normalDistributionImpl2.setMean(68.57142857177841d);
        double double12 = normalDistributionImpl2.getDomainUpperBound((-299.4363000875007d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 68.57142857177841d + "'", double12 == 68.57142857177841d);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) (short) 100);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.6823959331695719d);
        double double6 = normalDistributionImpl2.getDomainUpperBound(0.9772498680518209d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        double double22 = normalDistributionImpl2.getDomainUpperBound(0.5062582824999134d);
        double double23 = normalDistributionImpl2.getStandardDeviation();
        double double24 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7976931348623157E308d + "'", double22 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.10360644854994305d, (-0.9702930200572873d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.getDomainUpperBound((double) 0.0f);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(0.5374108872856648d);
        double double16 = normalDistributionImpl2.cumulativeProbability((-799.5509223927169d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.391305229797384d + "'", double14 == 9.391305229797384d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.7755575615628914E-16d + "'", double16 == 2.7755575615628914E-16d);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        double double18 = normalDistributionImpl2.getInitialDomain(0.376841142650683d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        double double11 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        normalDistributionImpl2.setMean(99.49601458591496d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(189.8939857551005d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 99.49601458591496d + "'", double15 == 99.49601458591496d);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(99.55092239271687d, 0.34794284620061744d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.9990117802232268d);
        double double10 = normalDistributionImpl2.getDomainLowerBound(35.50332704731315d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5039854140850405d + "'", double8 == 0.5039854140850405d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        normalDistributionImpl2.setMean(11.0d);
        double double14 = normalDistributionImpl2.cumulativeProbability(0.503327047302336d);
        double double15 = normalDistributionImpl2.getMean();
        double double17 = normalDistributionImpl2.getDomainUpperBound((-0.8413596248239952d));
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.38212483247943946d + "'", double14 == 0.38212483247943946d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 11.0d + "'", double17 == 11.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(7.773567058553255E-4d, (-6.661338147750939E-16d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (byte) 100);
        normalDistributionImpl2.setMean((double) '4');
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(8.429343765339881E-4d);
        double double13 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(100.84134474606854d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        normalDistributionImpl2.setMean(11.0d);
        double double14 = normalDistributionImpl2.cumulativeProbability(0.503327047302336d);
        double double15 = normalDistributionImpl2.getMean();
        double double17 = normalDistributionImpl2.getDomainUpperBound((-0.8413596248239952d));
        double double19 = normalDistributionImpl2.cumulativeProbability((-99.73312743878357d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.38212483247943946d + "'", double14 == 0.38212483247943946d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 11.0d + "'", double17 == 11.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.786090957127012E-4d + "'", double19 == 7.786090957127012E-4d);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, (double) '4');
        double double13 = normalDistributionImpl2.cumulativeProbability(0.5039854140850412d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain((-1.3877787807814457E-15d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5020106023922443d + "'", double13 == 0.5020106023922443d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-100.0d) + "'", double16 == (-100.0d));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.841344746068543d);
        normalDistributionImpl2.setStandardDeviation(0.3668235531222151d);
        normalDistributionImpl2.setMean(1.0d);
        double double21 = normalDistributionImpl2.cumulativeProbability(0.5020052938315906d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.08729746340859079d + "'", double21 == 0.08729746340859079d);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5033270473131487d, 0.003989356314631598d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.4144226483220369d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.cumulativeProbability(0.0012541753965479852d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4993376909985171d + "'", double4 == 0.4993376909985171d);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-146.37048343391822d), 0.5026547384068555d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-10.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double19 = normalDistributionImpl2.getInitialDomain((double) (-1));
        normalDistributionImpl2.setMean(0.5d);
        double double23 = normalDistributionImpl2.getInitialDomain(10.026126956040166d);
        double double25 = normalDistributionImpl2.getInitialDomain(0.07365795537454656d);
        normalDistributionImpl2.setMean(0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 99.0d + "'", double19 == 99.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.5d + "'", double23 == 1.5d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-0.5d) + "'", double25 == (-0.5d));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0, 0.003989356314631598d);
        normalDistributionImpl2.setStandardDeviation(9.391305229797384d);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-0.8413596248239952d));
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double16 = normalDistributionImpl2.cumulativeProbability(309.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(0.003982051263416553d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl2.cumulativeProbability(0.010090298830658262d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
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
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        normalDistributionImpl2.setMean((double) (byte) -1);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain((double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.inverseCumulativeProbability((-1.3322676295501878E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 99.0d + "'", double16 == 99.0d);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3402525686119483d, 9.0d);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5017915544255316d, (-32.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        normalDistributionImpl2.setMean((double) (byte) -1);
        normalDistributionImpl2.setStandardDeviation((double) (short) 1);
        double double18 = normalDistributionImpl2.cumulativeProbability(0.4490776072831239d, (double) (byte) 10);
        normalDistributionImpl2.setMean(Double.POSITIVE_INFINITY);
        double double21 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = normalDistributionImpl2.inverseCumulativeProbability((-100.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.07365795537454656d + "'", double18 == 0.07365795537454656d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + Double.POSITIVE_INFINITY + "'", double21 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        double double25 = normalDistributionImpl2.cumulativeProbability(0.5039854140850412d);
        double double27 = normalDistributionImpl2.getDomainLowerBound(10.0d);
        double double29 = normalDistributionImpl2.cumulativeProbability(0.10360644854994305d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 6.106226635438361E-16d + "'", double25 == 6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.1102230246251565E-15d) + "'", double29 == (-1.1102230246251565E-15d));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        double double21 = normalDistributionImpl2.getDomainUpperBound(0.10360644854994305d);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = normalDistributionImpl2.cumulativeProbability((-321.8666021266556d));
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        double double10 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.getDomainLowerBound(52.0d);
        double double15 = normalDistributionImpl2.getDomainUpperBound(0.9991601276537112d);
        java.lang.Class<?> wildcardClass16 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double14 = normalDistributionImpl2.cumulativeProbability(0.9990117802233995d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double19 = normalDistributionImpl2.getInitialDomain(0.16852760746683781d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = normalDistributionImpl2.inverseCumulativeProbability(9.391305229797384d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-100.0d) + "'", double19 == (-100.0d));
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl2.setMean((double) (byte) 100);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.18406012534675953d + "'", double8 == 0.18406012534675953d);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(Double.POSITIVE_INFINITY);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl2.cumulativeProbability((double) (short) 10, 0.011224171101298197d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(1.5d, 0.9870192304409138d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double4 = normalDistributionImpl2.getInitialDomain((double) (-1));
        normalDistributionImpl2.setMean(1.7976931348623157E308d);
        double double7 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.4490776072831239d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4490776072831239d + "'", double10 == 0.4490776072831239d);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-99.73312743878357d), 0.15864037517600482d);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, (double) '4');
        normalDistributionImpl2.setStandardDeviation(0.16852760746683781d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5039893563146316d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(0.0494714680336481d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9000000000335028d) + "'", double4 == (-0.9000000000335028d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5417911261200851d + "'", double7 == 0.5417911261200851d);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        normalDistributionImpl2.setMean(100.0d);
        double double12 = normalDistributionImpl2.getDomainUpperBound((-31.623158857349317d));
        double double14 = normalDistributionImpl2.cumulativeProbability((-128.26949715237384d));
        normalDistributionImpl2.setMean((-100.841359624824d));
        double double18 = normalDistributionImpl2.inverseCumulativeProbability(0.5376487498992404d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.011224171101298197d + "'", double14 == 0.011224171101298197d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-91.39016588280106d) + "'", double18 == (-91.39016588280106d));
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01213919411360942d, 0.4490776072831239d);
        normalDistributionImpl2.setMean((double) 100L);
        normalDistributionImpl2.setStandardDeviation(0.19981031319245302d);
        double double8 = normalDistributionImpl2.getDomainUpperBound(0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.16116265572688077d);
        double double6 = normalDistributionImpl2.getInitialDomain(0.15906338502133233d);
        double double8 = normalDistributionImpl2.getInitialDomain(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.546219801024759d + "'", double4 == 0.546219801024759d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-11.0d) + "'", double8 == (-11.0d));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5033270473131487d, 0.003989356314631598d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.003233364812544881d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.8339767539364704d);
        normalDistributionImpl2.setMean((-99.73312743878357d));
        double double11 = normalDistributionImpl2.getDomainUpperBound((-0.8413596248239952d));
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.cumulativeProbability(100.00503989243838d, 97.67965765688128d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.73312743878357d) + "'", double11 == (-99.73312743878357d));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(101.0d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.6153338488435729d);
        double double19 = normalDistributionImpl2.getInitialDomain((double) 100L);
        normalDistributionImpl2.setStandardDeviation(0.003233364812544881d);
        double double22 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = normalDistributionImpl2.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.003233364812544881d + "'", double22 == 0.003233364812544881d);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        double double25 = normalDistributionImpl2.cumulativeProbability(0.5039854140850412d);
        double double27 = normalDistributionImpl2.getDomainLowerBound(10.0d);
        double double28 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 6.106226635438361E-16d + "'", double25 == 6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0L, 8.890252991080594E-4d);
        double double4 = normalDistributionImpl2.cumulativeProbability(5.551115123125783E-16d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.4992439296527548d, (-6.106226635438361E-16d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5000000000002491d + "'", double4 == 0.5000000000002491d);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound(0.1586664807605242d);
        double double9 = normalDistributionImpl2.getDomainLowerBound(0.011224171101298197d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        double double22 = normalDistributionImpl2.getStandardDeviation();
        double double23 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double15 = normalDistributionImpl2.getDomainUpperBound(0.5032578631163334d);
        double double18 = normalDistributionImpl2.cumulativeProbability(0.34134474606854304d, 0.546219801024759d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5039893563146316d + "'", double11 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.173250249250419E-4d + "'", double18 == 8.173250249250419E-4d);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.841344746068543d, (double) 100);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.5013304021987853d);
        double double6 = normalDistributionImpl2.getInitialDomain(99.55092239271687d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.84134474606854d + "'", double6 == 100.84134474606854d);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        normalDistributionImpl2.setMean((double) (byte) -1);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.inverseCumulativeProbability(0.4979893818807349d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.5039893563037323d) + "'", double16 == (-1.5039893563037323d));
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        double double12 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(35.0d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        double double10 = normalDistributionImpl2.cumulativeProbability((double) 10);
        double double12 = normalDistributionImpl2.cumulativeProbability(6.439419620615228E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.inverseCumulativeProbability((-9.831472392533161d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.539827837277029d + "'", double10 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5000025689567479d + "'", double12 == 0.5000025689567479d);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.getDomainUpperBound((double) 0L);
        double double14 = normalDistributionImpl2.getDomainLowerBound(1.0d);
        double double16 = normalDistributionImpl2.cumulativeProbability(0.0020476378332464074d);
        double double18 = normalDistributionImpl2.getInitialDomain(9.498638234130468d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5000081688930658d + "'", double16 == 0.5000081688930658d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.841344746068543d);
        normalDistributionImpl2.setStandardDeviation(0.3668235531222151d);
        double double19 = normalDistributionImpl2.getDomainLowerBound((-11.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability(309.37500000520356d);
        normalDistributionImpl2.setMean((-40.87958411457447d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9990117802233995d + "'", double5 == 0.9990117802233995d);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), 0.5027585141294139d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(31.0d, 0.15906338502133233d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        double double12 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(35.0d);
        double double16 = normalDistributionImpl2.cumulativeProbability((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4012936743170763d + "'", double16 == 0.4012936743170763d);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        normalDistributionImpl2.setMean(0.16852760746683781d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.5020106023922443d);
        double double17 = normalDistributionImpl2.cumulativeProbability((-128.26949715237384d));
        double double19 = normalDistributionImpl2.getInitialDomain(101.0d);
        double double21 = normalDistributionImpl2.getDomainUpperBound(0.5376487498992404d);
        double double24 = normalDistributionImpl2.cumulativeProbability(0.841500270091506d, 1.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5013304021987853d + "'", double15 == 0.5013304021987853d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.09950447039473481d + "'", double17 == 0.09950447039473481d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.16852760746684d + "'", double19 == 100.16852760746684d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.002626897160349584d + "'", double24 == 0.002626897160349584d);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double12 = normalDistributionImpl2.getDomainUpperBound((double) 1L);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(0.4115308789714541d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.539827837277029d + "'", double8 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-22.36087456351966d) + "'", double14 == (-22.36087456351966d));
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability((-374.59034152034485d), 0.0012541753965479852d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.942890293094024E-15d, (-374.59034152034485d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-800.0d), 313.0062582842937d);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5019947030907408d + "'", double7 == 0.5019947030907408d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        normalDistributionImpl2.setMean(0.0d);
        double double17 = normalDistributionImpl2.getDomainUpperBound(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6153338488435729d, 1.0d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation(0.4490776072831239d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4490776072831239d + "'", double14 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getInitialDomain(0.691462461274013d);
        double double12 = normalDistributionImpl2.getDomainUpperBound(Double.NEGATIVE_INFINITY);
        double double14 = normalDistributionImpl2.cumulativeProbability(0.01213919411360942d);
        double double16 = normalDistributionImpl2.getInitialDomain((double) 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5000484283777002d + "'", double14 == 0.5000484283777002d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-100.0d) + "'", double16 == (-100.0d));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.5000000000002491d);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation(0.4490776072831239d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-2.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4490776072831239d + "'", double14 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4490776072831239d + "'", double16 == 0.4490776072831239d);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01213919411360942d, 0.4490776072831239d);
        normalDistributionImpl2.setMean((double) 100L);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) ' ');
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d);
        normalDistributionImpl2.setStandardDeviation(200.0d);
        normalDistributionImpl2.setStandardDeviation(309.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(0.5d);
        normalDistributionImpl2.setMean(0.9999787774020832d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl2.cumulativeProbability((double) 100L, (-52.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5001042314730403d + "'", double9 == 0.5001042314730403d);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (-11.119995541385146d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setStandardDeviation((double) 100L);
        double double9 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation((double) 1L);
        normalDistributionImpl2.setMean(0.11845872098528987d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }
}

