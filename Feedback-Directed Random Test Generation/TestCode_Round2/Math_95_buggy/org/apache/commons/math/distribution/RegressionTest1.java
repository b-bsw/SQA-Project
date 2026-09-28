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
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 100L);
        double double15 = fDistributionImpl2.getDomainLowerBound(Double.POSITIVE_INFINITY);
        double double17 = fDistributionImpl2.getInitialDomain(0.8284628704001276d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (short) 10);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.02887716934657425d);
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = fDistributionImpl2.cumulativeProbability(0.9967719789495215d, 0.17235021937116024d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5093634057790148d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability(0.0d, 0.018345231285955332d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.inverseCumulativeProbability((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5093634057790148d + "'", double13 == 0.5093634057790148d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23076288400994444d + "'", double16 == 0.23076288400994444d);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.inverseCumulativeProbability(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double13 = fDistributionImpl2.cumulativeProbability(0.17235021937116024d, 0.5093634057790148d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.19506275762925057d + "'", double13 == 0.19506275762925057d);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(32.0d);
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.08793604972328362d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.49071513905979386d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5949357068078883d, (double) (short) 1);
        double double4 = fDistributionImpl2.cumulativeProbability(10.0d);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8284628704001276d + "'", double4 == 0.8284628704001276d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability(0.4479640982107486d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.25d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.inverseCumulativeProbability(1.0204081632653061d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L), 0.7246966031342408d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = fDistributionImpl2.cumulativeProbability(0.5949357068078883d, 0.31979861116167463d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5996052885758513d + "'", double17 == 0.5996052885758513d);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainLowerBound(0.9898804402645663d);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.3220459516792461d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.inverseCumulativeProbability((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1829024488312228d + "'", double16 == 0.1829024488312228d);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.4204984331337026d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6554278909379809d + "'", double8 == 0.6554278909379809d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain((double) 100);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 1);
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.41580691019689836d, Double.NaN);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.33409440091453685d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain((double) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.8284628704001276d);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.9999999999999998d);
        double double19 = fDistributionImpl2.getInitialDomain(0.14038325387155903d);
        double double21 = fDistributionImpl2.getInitialDomain(Double.NaN);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getDomainLowerBound(0.37330737634742583d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.cumulativeProbability(0.4906940248809481d);
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5117512873843995d + "'", double18 == 0.5117512873843995d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) ' ', 0.794431337232113d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.06954427012843875d);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability((double) (short) 10);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.013666728010437416d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9967719789495215d + "'", double15 == 0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.cumulativeProbability(1.6636531716106877d, 0.680275844215834d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.5189833010988237d);
        double double4 = fDistributionImpl2.getInitialDomain(0.4923052829221457d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3504236660423056d) + "'", double4 == (-0.3504236660423056d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4906940248809481d + "'", double5 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5189833010988237d + "'", double6 == 0.5189833010988237d);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        java.lang.Class<?> wildcardClass7 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.09487388796007479d, 0.4906940248809481d);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.26479899700216447d + "'", double12 == 0.26479899700216447d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double13 = fDistributionImpl2.cumulativeProbability(0.8609681162053344d, 0.9293804578921561d);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.018345231285955332d + "'", double13 == 0.018345231285955332d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double10 = fDistributionImpl2.getInitialDomain(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainLowerBound(0.1801856291181903d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.cumulativeProbability(0.4394515874848486d, 0.14637555387850465d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) (short) 0);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainLowerBound(0.049950031800927046d);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.0d);
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        double double14 = fDistributionImpl2.getInitialDomain(0.8284628704001276d);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.9999999999915219d);
        double double18 = fDistributionImpl2.cumulativeProbability(0.39151156165974016d);
        double double20 = fDistributionImpl2.getDomainUpperBound(0.9999999999914339d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.25d + "'", double14 == 1.25d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.45447932157420906d + "'", double18 == 0.45447932157420906d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getInitialDomain((double) 'a');
        double double10 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double14 = fDistributionImpl2.getDomainLowerBound((-0.2624723670828401d));
        java.lang.Class<?> wildcardClass15 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7103083879489903d + "'", double10 == 0.7103083879489903d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.inverseCumulativeProbability((double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3197986111596346d, 0.9999999999873902d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(1.7976931348623157E308d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(7.444493761760151E-4d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(2.3610123714643496E-5d, 0.07212597439971892d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-0.3504236660423056d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.49838122445596006d, 0.4546995573427486d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.cumulativeProbability(0.9205507147766241d, 2.3610123714643496E-5d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.189836249017317d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.5773773436195279d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 100);
        double double6 = fDistributionImpl2.getInitialDomain(1.418479831543378d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0204081632653061d + "'", double6 == 1.0204081632653061d);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass6 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999873902d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 100);
        java.lang.Class<?> wildcardClass12 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.14131937536292083d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5004087508678674d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.9967719789495215d);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 0L);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 100);
        double double15 = fDistributionImpl2.getDomainLowerBound(1.0d);
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 100L);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-0.33369676647384544d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (-1), 1.2214738003873964E-5d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5993164688934242d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.7976931348623157E308d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.inverseCumulativeProbability(32.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, (double) (byte) 1);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L), 0.5004087508678674d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double20 = fDistributionImpl2.getDomainUpperBound((double) (short) 1);
        double double22 = fDistributionImpl2.getInitialDomain(0.680275832290893d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double17 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(32.0d);
        java.lang.Class<?> wildcardClass20 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(97.0d);
        double double16 = fDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.41580691019689836d + "'", double12 == 0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, (double) (byte) 1);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L), 0.5004087508678674d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 10);
        double double21 = fDistributionImpl2.getDomainLowerBound(0.3919491786229663d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.06401548478113292d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.inverseCumulativeProbability(0.07908924131400807d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.4923052829221457d);
        double double13 = fDistributionImpl2.getInitialDomain(0.49838122445596006d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.680275844215834d);
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4479640982107486d + "'", double11 == 0.4479640982107486d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.inverseCumulativeProbability((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.37330737634742583d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3168052840864677d, 0.8609681162053344d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability((double) 100);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.680275844215834d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.05595719508517638d, 0.09487388796007479d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9999999999873902d, 0.1801856291181903d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(0.5366657182124845d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.09901319167563201 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, 0.24622186047072248d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double9 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999873902d);
        double double11 = fDistributionImpl2.getDomainLowerBound(0.3197986111586397d);
        double double13 = fDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.3951424744541511d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistributionImpl2.inverseCumulativeProbability(0.9898419264720365d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.9999999999747803 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9205507147766241d + "'", double13 == 0.9205507147766241d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass10 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistributionImpl2.inverseCumulativeProbability(1.2109603464415848d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3197986111586397d, 35.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6758256576139563d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(0.7835361335394757d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.5103751341354182 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.9999999999747803d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) ' ', 0.794431337232113d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(35.0d);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getInitialDomain((double) '#');
        double double10 = fDistributionImpl2.getDomainUpperBound(1.0606060606060606d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.049950031800927046d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainUpperBound(0.6554278909379809d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5949357068078883d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.cumulativeProbability(10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.cumulativeProbability(5.357258915695551E-11d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5949357068078883d + "'", double8 == 0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8284628704001276d + "'", double10 == 0.8284628704001276d);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double17 = fDistributionImpl2.cumulativeProbability(0.9898804402645663d, Double.NaN);
        double double19 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double20 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double22 = fDistributionImpl2.cumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = fDistributionImpl2.inverseCumulativeProbability((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999873902d);
        double double11 = fDistributionImpl2.getDomainLowerBound(0.3197986111586397d);
        double double13 = fDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.3951424744541511d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.491780299474472d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = fDistributionImpl2.cumulativeProbability((double) 100.0f, 0.4898628835849175d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9205507147766241d + "'", double13 == 0.9205507147766241d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5093634057790148d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), 0.3895023980863656d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.inverseCumulativeProbability(0.1201684622410103d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5093634057790148d + "'", double13 == 0.5093634057790148d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4892284600732909d + "'", double16 == 0.4892284600732909d);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (-1L), 0.5004087508678674d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        double double15 = fDistributionImpl2.cumulativeProbability(0.5004087508678674d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.43276459841306814d);
        double double19 = fDistributionImpl2.cumulativeProbability((double) '#');
        java.lang.Class<?> wildcardClass20 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5189833010988237d + "'", double15 == 0.5189833010988237d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999504708134d + "'", double19 == 0.9999999504708134d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.5093634057790148d);
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double14 = fDistributionImpl2.getDomainUpperBound((double) '#');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.2255061186409303d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistributionImpl2.cumulativeProbability(0.4898628835849175d, 0.06401548478113292d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain(0.23076288400994444d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8609681162053344d, 10.0d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getInitialDomain((double) 'a');
        double double10 = fDistributionImpl2.cumulativeProbability(1.25d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7103083879489903d + "'", double10 == 0.7103083879489903d);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.26465518129632637d, 0.3895023980863656d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.26465518129632637d + "'", double3 == 0.26465518129632637d);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.4892284600732909d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.1201684622410103d, 0.41580691019689836d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.334173577483257E-5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.11684554078643927d + "'", double5 == 0.11684554078643927d);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 100L);
        double double15 = fDistributionImpl2.getDomainLowerBound(Double.POSITIVE_INFINITY);
        double double17 = fDistributionImpl2.getInitialDomain(0.8284628704001276d);
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = fDistributionImpl2.inverseCumulativeProbability(0.49838122445596006d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double4 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(0.49395047433316885d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.05595719508517638d, 0.42370716420032145d);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.44582356363844317d);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.cumulativeProbability((-1.0d));
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        double double10 = fDistributionImpl2.cumulativeProbability(7.444493761760151E-4d);
        double double12 = fDistributionImpl2.getInitialDomain(0.0d);
        double double14 = fDistributionImpl2.getInitialDomain(0.11684554078643927d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7723000623308832d + "'", double10 == 0.7723000623308832d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0204081632653061d + "'", double12 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0204081632653061d + "'", double14 == 1.0204081632653061d);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9898804402645663d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111596346d);
        java.lang.Class<?> wildcardClass9 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.25d);
        java.lang.Class<?> wildcardClass9 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6554278909379809d + "'", double8 == 0.6554278909379809d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-0.49071513905979386d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain(0.5658786927337371d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.49838122445596006d, 0.3168052840864677d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(0.010367711397661706d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.18821665793700265 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.008610287160087353d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.23076288400994444d);
        double double12 = fDistributionImpl2.getDomainLowerBound(1.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.06401548478113292d + "'", double10 == 0.06401548478113292d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6591065015250168d, (double) 10L);
        double double4 = fDistributionImpl2.getInitialDomain(0.41406926397160465d);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.25d + "'", double4 == 1.25d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.1801856291181903d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.5220157123797441d);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1201684622410103d + "'", double4 == 0.1201684622410103d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.6758256576139563d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainUpperBound(33.20158064706674d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double17 = fDistributionImpl2.cumulativeProbability(0.9898804402645663d, Double.NaN);
        double double19 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double21 = fDistributionImpl2.getInitialDomain(0.42370716420032145d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0606060606060606d + "'", double21 == 1.0606060606060606d);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.2109603464415848d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.cumulativeProbability(0.0027198323247858195d, 0.0010722599132668223d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5996052885758513d, (-1.0416666666666667d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getInitialDomain((double) '#');
        double double10 = fDistributionImpl2.getDomainUpperBound(1.0606060606060606d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.049950031800927046d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainUpperBound(0.05350873685544799d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.3197986111596346d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.6401770331730183d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5949357068078883d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5949357068078883d + "'", double8 == 0.5949357068078883d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0606060606060606d);
        double double10 = fDistributionImpl2.getInitialDomain((double) 0);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(0.018345231285955332d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.cumulativeProbability(0.5949357068078883d, (-1.129032258064516d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.129032258064516d) + "'", double10 == (-1.129032258064516d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0606060606060606d + "'", double11 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.129032258064516d) + "'", double13 == (-1.129032258064516d));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass12 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100L);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistributionImpl2.cumulativeProbability(0.7043071535892672d, 9.838320889492336E-7d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7103083879489903d, 0.4898628835849175d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.cumulativeProbability(0.32764978063013356d, 0.3248137971311367d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9898804402645663d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.cumulativeProbability(0.23587424144892077d, 2.3610123714643496E-5d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.5004087508678674d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.6289333745278087d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        double double18 = fDistributionImpl2.getDomainLowerBound(0.02723373766299686d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4906940248809481d + "'", double11 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6591068676950343d + "'", double16 == 0.6591068676950343d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability(1.2109603464415848d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.794431337232113d + "'", double9 == 0.794431337232113d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.1801856291181903d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.5220157123797441d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 0L, 0.31979861116167463d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.cumulativeProbability((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1201684622410103d + "'", double4 == 0.1201684622410103d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08793604972328362d + "'", double7 == 0.08793604972328362d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.09901319167563201d) + "'", double9 == (-0.09901319167563201d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1801856291181903d + "'", double10 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.31683499876602816d + "'", double12 == 0.31683499876602816d);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.inverseCumulativeProbability(0.1345060112435601d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.NaN);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.06401548478113292d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(33.20158064706674d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, 0.7043071535892672d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound((double) (byte) -1);
        double double9 = fDistributionImpl2.getDomainLowerBound((double) 'a');
        double double11 = fDistributionImpl2.getDomainLowerBound((double) 0L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0606060606060606d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.049950031800927046d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0010665602861507125d + "'", double10 == 0.0010665602861507125d);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain((double) 100L);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (short) 100);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainLowerBound(0.3919491786229663d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.018345231285955332d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.357258915695551E-11d + "'", double12 == 5.357258915695551E-11d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double16 = fDistributionImpl2.cumulativeProbability(0.4906940248809481d, 1.7976931348623157E308d);
        double double18 = fDistributionImpl2.cumulativeProbability(1.25d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9967719789495215d);
        double double22 = fDistributionImpl2.getDomainUpperBound(0.08015071710935137d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0010722599132668223d);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = fDistributionImpl2.cumulativeProbability(0.43278329179761166d, 0.010367711397661706d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6289333745278087d + "'", double18 == 0.6289333745278087d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7976931348623157E308d + "'", double22 == 1.7976931348623157E308d);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (byte) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 100);
        double double12 = fDistributionImpl2.getInitialDomain(0.6289333745278087d);
        double double14 = fDistributionImpl2.inverseCumulativeProbability(0.333959227384966d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0204081632653061d + "'", double12 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7605286207286406d + "'", double14 == 0.7605286207286406d);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double10 = fDistributionImpl2.getDomainLowerBound((-0.3667417109622608d));
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.inverseCumulativeProbability(1228.3664773101177d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double13 = fDistributionImpl2.cumulativeProbability(0.0d, 0.14335493966332769d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.00963131349797714d + "'", double13 == 0.00963131349797714d);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getInitialDomain((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.inverseCumulativeProbability(0.680275832290893d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9967719789495215d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.inverseCumulativeProbability(0.5993164688934242d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, 0.8933186128357743d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 100L);
        double double15 = fDistributionImpl2.getDomainLowerBound(Double.POSITIVE_INFINITY);
        double double17 = fDistributionImpl2.getInitialDomain(0.8284628704001276d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 1.2109603464415848d);
        double double4 = fDistributionImpl2.getInitialDomain(0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.53472685559007d) + "'", double4 == (-1.53472685559007d));
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9466229816367563d, 0.5626720221012385d);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double16 = fDistributionImpl2.cumulativeProbability((double) (short) 1, 1.0d);
        double double18 = fDistributionImpl2.getDomainUpperBound((double) 100.0f);
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.29474933881663606d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double16 = fDistributionImpl2.cumulativeProbability(0.4906940248809481d, 1.7976931348623157E308d);
        double double18 = fDistributionImpl2.getInitialDomain(0.3895024214486992d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.25d + "'", double18 == 1.25d);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double10 = fDistributionImpl2.getInitialDomain(0.5093634057790148d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.6046935761651037d);
        double double14 = fDistributionImpl2.cumulativeProbability((-0.9999999999747803d));
        java.lang.Class<?> wildcardClass15 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.20196314831799295d + "'", double12 == 0.20196314831799295d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.6758256576139563d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(0.31979861116167463d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.5103751341354182 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.06965997645678441d, (double) 100.0f);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.794431337232113d);
        double double7 = fDistributionImpl2.cumulativeProbability(0.4546995573427486d, 0.4546995573427486d);
        java.lang.Class<?> wildcardClass8 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (byte) 0);
        double double10 = fDistributionImpl2.getDomainLowerBound(1.2500001488198675d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.cumulativeProbability(0.9898804402645663d, 1.25d);
        double double10 = fDistributionImpl2.getInitialDomain(0.541645126720792d);
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.05595719508517638d + "'", double8 == 0.05595719508517638d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.0d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5949357068038229d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, 0.5565294657256515d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.41406926397160465d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainLowerBound(0.3168052840864677d);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111596346d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.08793604972328362d, 0.7723000623308832d);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.1822843294541756d + "'", double13 == 0.1822843294541756d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, (double) (byte) 1);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L), 0.5004087508678674d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double19 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = fDistributionImpl2.cumulativeProbability(0.4239582314034682d, 0.41406926397160465d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        double double10 = fDistributionImpl2.cumulativeProbability(7.444493761760151E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.cumulativeProbability(0.33364776310664174d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7723000623308832d + "'", double10 == 0.7723000623308832d);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, 0.5117512873843995d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double17 = fDistributionImpl2.cumulativeProbability(0.9898804402645663d, Double.NaN);
        double double19 = fDistributionImpl2.inverseCumulativeProbability(0.794431337232113d);
        java.lang.Class<?> wildcardClass20 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.6636531716106877d + "'", double19 == 1.6636531716106877d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999873902d);
        double double11 = fDistributionImpl2.getDomainLowerBound(0.3197986111586397d);
        double double13 = fDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.3951424744541511d);
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9205507147766241d + "'", double13 == 0.9205507147766241d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainLowerBound(0.33409440091453685d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7681324865938718d);
        double double22 = fDistributionImpl2.inverseCumulativeProbability(0.5220157123797441d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.40011231498671923d + "'", double22 == 0.40011231498671923d);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.19845142031994614d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(2.3610123714643496E-5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6758256576139563d + "'", double17 == 0.6758256576139563d);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.8585643081732904d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.008036077048780232d);
        java.lang.Class<?> wildcardClass15 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.5491771371666263d + "'", double12 == 2.5491771371666263d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.8609681162053344d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6401770331730183d + "'", double10 == 0.6401770331730183d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.44582356363844317d, 0.049950031800927046d);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (-1L));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.43276459841306814d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.33409440091453685d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.5093634057790148d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.cumulativeProbability(0.1114353339521007d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5366657182124845d, 0.49838122445596006d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-1.53472685559007d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.08793604972328362d, 0.6583620521480608d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(0.6046935761651037d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.49071513905979386 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability((double) 100);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.6401770331730183d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistributionImpl2.cumulativeProbability((double) (byte) 10, 0.04860877630608049d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999999873902d);
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0204081632653061d, 0.4546995573427486d);
        double double4 = fDistributionImpl2.getInitialDomain(0.017857674930194845d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistributionImpl2.cumulativeProbability(0.1461266361314345d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.2942467010239518d) + "'", double4 == (-0.2942467010239518d));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.9999999999873902d);
        double double10 = fDistributionImpl2.getInitialDomain(0.0d);
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.6553251431808038d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0843738724222984d + "'", double12 == 1.0843738724222984d);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.08793604972328362d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.6037071022078223d);
        double double19 = fDistributionImpl2.getDomainLowerBound((double) 'a');
        double double21 = fDistributionImpl2.getDomainLowerBound(0.07212597439971892d);
        double double23 = fDistributionImpl2.inverseCumulativeProbability(7.444493761760151E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.3826603340484837E-4d + "'", double17 == 1.3826603340484837E-4d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-1.0d), 0.6554278909379809d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double17 = fDistributionImpl2.cumulativeProbability((double) 10.0f);
        double double19 = fDistributionImpl2.getDomainLowerBound(0.5996052325402953d);
        java.lang.Class<?> wildcardClass20 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9967719789495215d + "'", double17 == 0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.31979861116167463d);
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.5433539298660959d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.16510007084584888d);
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1801856291181903d + "'", double11 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5996052325396897d + "'", double13 == 0.5996052325396897d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 0, 0.28159241378169547d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.1829024488312228d, 0.0010722599132668223d);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9898804402645663d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        double double11 = fDistributionImpl2.getDomainLowerBound(0.010367711397661706d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        double double10 = fDistributionImpl2.cumulativeProbability(7.444493761760151E-4d);
        double double12 = fDistributionImpl2.getInitialDomain(0.3032299156718087d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7723000623308832d + "'", double10 == 0.7723000623308832d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0204081632653061d + "'", double12 == 1.0204081632653061d);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double13 = fDistributionImpl2.cumulativeProbability(1.2109603464415848d, (double) (short) 100);
        double double15 = fDistributionImpl2.getInitialDomain((-0.9999999999747803d));
        double double17 = fDistributionImpl2.getDomainUpperBound(0.49838122445596006d);
        java.lang.Class<?> wildcardClass18 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2969240624175721d + "'", double13 == 0.2969240624175721d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 10, 0.9898804402645663d);
        double double4 = fDistributionImpl2.cumulativeProbability((double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8609681162053344d + "'", double4 == 0.8609681162053344d);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6591065015250168d, (-0.33369676647384544d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.inverseCumulativeProbability(0.40011231498671923d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.inverseCumulativeProbability((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double14 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.43906017126509644d);
        java.lang.Class<?> wildcardClass17 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1345060112435601d + "'", double16 == 0.1345060112435601d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getInitialDomain((double) ' ');
        double double12 = fDistributionImpl2.getDomainLowerBound(0.4898628835849175d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.2671687285166097d);
        java.lang.Class<?> wildcardClass15 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0606060606060606d + "'", double10 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.39151156165974016d + "'", double14 == 0.39151156165974016d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double10 = fDistributionImpl2.getDomainLowerBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.inverseCumulativeProbability(0.6553251431808038d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.cumulativeProbability((double) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.49838122445596006d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.49838122445596006d + "'", double13 == 0.49838122445596006d);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.45447932157420906d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) '4');
        double double14 = fDistributionImpl2.cumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.inverseCumulativeProbability(0.0010722599132668223d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5189833010988237d, 0.9999999999999998d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) '4');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.inverseCumulativeProbability(0.3197986111586397d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double14 = fDistributionImpl2.getInitialDomain((double) '4');
        double double16 = fDistributionImpl2.getInitialDomain(97.0d);
        java.lang.Class<?> wildcardClass17 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0606060606060606d + "'", double14 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0606060606060606d + "'", double16 == 1.0606060606060606d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) (short) 0);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainUpperBound(0.14131937536292083d);
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.49838122445596006d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.29474933881663606d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.06965997645678441d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.06401548478113292d);
        double double12 = fDistributionImpl2.getInitialDomain(0.19788692492646354d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.cumulativeProbability(0.999852177434338d, 0.6401770331730183d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.25d + "'", double12 == 1.25d);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainUpperBound(0.4204984331337026d);
        double double20 = fDistributionImpl2.getDomainUpperBound(0.6276037379948466d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5004087508678674d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.9967719789495215d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.cumulativeProbability(32.0d, 0.24622186047072248d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.43276459841306814d);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.cumulativeProbability(0.0010665602861507125d, (-0.9799636396743291d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.097152841112099E-5d + "'", double8 == 2.097152841112099E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.09901319167563201d), 0.5658786927337371d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.25d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(5.357258915695551E-11d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double17 = fDistributionImpl2.cumulativeProbability((double) 10.0f);
        double double19 = fDistributionImpl2.getDomainLowerBound(0.5996052325402953d);
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = fDistributionImpl2.inverseCumulativeProbability((-0.09901319167563201d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9967719789495215d + "'", double17 == 0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 10, 0.9898804402645663d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.41580691019689836d, (double) (byte) 10);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6037071022078223d + "'", double5 == 0.6037071022078223d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9898804402645663d + "'", double6 == 0.9898804402645663d);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.2624723670828401d), 0.1825231602525817d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.008610287160087353d, 0.42370716420032145d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3981365332138079d + "'", double12 == 0.3981365332138079d);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain(0.5993164688934242d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double10 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double12 = fDistributionImpl2.getDomainLowerBound((-0.2624723670828401d));
        double double14 = fDistributionImpl2.getInitialDomain(2.5491771371666263d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.inverseCumulativeProbability(0.3197986111596346d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1);
        double double13 = fDistributionImpl2.getInitialDomain(0.05595719508517638d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.9999999999915219d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999981726526794d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.26465518129632637d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.31979861116167463d + "'", double9 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.3197986111596346d + "'", double15 == 0.3197986111596346d);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (byte) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5366657182124845d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5026637197270847d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.inverseCumulativeProbability(0.26166495153015507d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.3357052963649993 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5366657182124845d + "'", double11 == 0.5366657182124845d);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.9999999916299953d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.9999984104468244d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDomainLowerBound(0.37330737634742583d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.15231616998149738d);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.8195918816395871d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4906940248809481d + "'", double3 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999984104468244d + "'", double4 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4009893970905954d + "'", double8 == 0.4009893970905954d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.9999984104468244d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 1);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double20 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        java.lang.Class<?> wildcardClass21 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6591065015250168d + "'", double15 == 0.6591065015250168d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double10 = fDistributionImpl2.getDomainLowerBound(0.41406926397160465d);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.0666666666666667d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9322902587483378d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.inverseCumulativeProbability(1.315320556750493E-26d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L));
        double double19 = fDistributionImpl2.getDomainLowerBound(0.9205507147766241d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5949357068078883d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double12 = fDistributionImpl2.getInitialDomain(0.6583620521480608d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass15 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5949357068078883d + "'", double8 == 0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8284628704001276d + "'", double10 == 0.8284628704001276d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.9999984104468244d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistributionImpl2.cumulativeProbability(0.49838122445596006d, 0.3248137971311367d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4906940248809481d + "'", double3 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999984104468244d + "'", double4 == 0.9999984104468244d);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 10.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d);
        double double17 = fDistributionImpl2.getInitialDomain(0.0d);
        double double19 = fDistributionImpl2.getInitialDomain(0.794431337232113d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = fDistributionImpl2.cumulativeProbability(0.680275844215834d, 0.24622186047072248d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.08015071710935137d + "'", double15 == 0.08015071710935137d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4664502910454298d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.17235021937116024d);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.cumulativeProbability(0.41406926397160465d, 0.28159241378169547d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5093634057790148d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability(0.0d, 0.018345231285955332d);
        java.lang.Class<?> wildcardClass17 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5093634057790148d + "'", double13 == 0.5093634057790148d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23076288400994444d + "'", double16 == 0.23076288400994444d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.1801856291181903d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.5220157123797441d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 0L, 0.31979861116167463d);
        java.lang.Class<?> wildcardClass8 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1201684622410103d + "'", double4 == 0.1201684622410103d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08793604972328362d + "'", double7 == 0.08793604972328362d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double17 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double19 = fDistributionImpl2.getInitialDomain(0.4906940248809481d);
        java.lang.Class<?> wildcardClass20 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0606060606060606d + "'", double19 == 1.0606060606060606d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(97.0d);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.43199198024659174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.41580691019689836d + "'", double12 == 0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9797635432974363d + "'", double16 == 0.9797635432974363d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double16 = fDistributionImpl2.cumulativeProbability(0.4906940248809481d, 1.7976931348623157E308d);
        double double18 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double20 = fDistributionImpl2.getDomainUpperBound(0.46758643441315834d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6289333745278087d + "'", double18 == 0.6289333745278087d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound(1.0074491241240935E-9d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.cumulativeProbability(0.4898628835849175d, 9.838320889492336E-7d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getInitialDomain(0.6758256576139563d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5093634057790148d);
        java.lang.Class<?> wildcardClass12 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.25d + "'", double9 == 1.25d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainUpperBound(0.4204984331337026d);
        double double20 = fDistributionImpl2.getDomainLowerBound(0.9999999238243996d);
        double double21 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8284628704001276d, 0.9999999999915219d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.002393864708003338d, 0.44582356363844317d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35760002498487775d + "'", double5 == 0.35760002498487775d);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (short) 100);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainLowerBound(0.3919491786229663d);
        double double12 = fDistributionImpl2.cumulativeProbability((-0.2942467010239518d));
        double double14 = fDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double17 = fDistributionImpl2.cumulativeProbability(0.9898804402645663d, Double.NaN);
        double double19 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double20 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass21 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double9 = fDistributionImpl2.getInitialDomain((double) 1L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 10);
        double double13 = fDistributionImpl2.getInitialDomain((double) 100);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (-1L));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.43276459841306814d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.cumulativeProbability(0.6758256576139563d, (-1.0416666666666667d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999995770263d + "'", double8 == 0.9999999995770263d);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double17 = fDistributionImpl2.getInitialDomain((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistributionImpl2.inverseCumulativeProbability((-0.3667417109622608d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0606060606060606d + "'", double17 == 1.0606060606060606d);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.9999984104468244d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.999037593690436d);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4906940248809481d + "'", double3 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999984104468244d + "'", double4 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.680275844215834d, 0.5433539298660959d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5773773436195279d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.04818702750924919d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.41580691019689836d + "'", double9 == 0.41580691019689836d);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.7976931348623157E308d, 35.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5004087508678674d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(0.13759165633724676d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.33369676647384544 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.3991062373962743E-245d, 0.29474933881663606d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, (double) (byte) 1);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L), 0.5004087508678674d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double20 = fDistributionImpl2.getDomainUpperBound((-0.9999999916299953d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0074491241240935E-9d, 0.4664502910454298d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(0.1201684622410103d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.304163789619452 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.1801856291181903d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.5220157123797441d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 0L, 0.31979861116167463d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.4633919262405889d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability(0.4534659472302877d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.09901319167563201 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1201684622410103d + "'", double4 == 0.1201684622410103d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08793604972328362d + "'", double7 == 0.08793604972328362d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.11215527694889071d + "'", double9 == 0.11215527694889071d);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double11 = fDistributionImpl2.cumulativeProbability(10.0d, 10.0d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double9 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.432364228996943d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getDomainUpperBound(0.031135097668851475d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.08015071710935137d);
        double double12 = fDistributionImpl2.getInitialDomain(10.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.008009325319447534d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.25d + "'", double12 == 1.25d);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability((double) (byte) 10);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.inverseCumulativeProbability(0.680275844215834d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7583315357111738d + "'", double9 == 0.7583315357111738d);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9898804402645663d, 0.2969240624175721d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.cumulativeProbability(0.4419425715309202d, 0.9999999999915219d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9898804402645663d + "'", double3 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.07061643216723656d + "'", double6 == 0.07061643216723656d);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5658786927337371d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999995770263d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.06965997645678441d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.5996052325396897d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(100.0d, 0.13759165633724676d);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 1L);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass12 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 100L);
        double double15 = fDistributionImpl2.getDomainLowerBound(Double.POSITIVE_INFINITY);
        double double17 = fDistributionImpl2.getInitialDomain(0.8284628704001276d);
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double19 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double21 = fDistributionImpl2.getDomainUpperBound(0.5117512873843995d);
        double double23 = fDistributionImpl2.cumulativeProbability(0.6583620521480608d);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = fDistributionImpl2.inverseCumulativeProbability((-0.9999999999747803d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2207617383499606d + "'", double23 == 0.2207617383499606d);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.08793604972328362d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.6037071022078223d);
        double double19 = fDistributionImpl2.getDomainLowerBound((double) 'a');
        double double21 = fDistributionImpl2.getDomainLowerBound(0.07212597439971892d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.3826603340484837E-4d + "'", double17 == 1.3826603340484837E-4d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.5189833010988237d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability((-0.432364228996943d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5093634057790148d);
        double double14 = fDistributionImpl2.getDomainLowerBound((double) 10L);
        double double16 = fDistributionImpl2.getInitialDomain(0.06954427012843875d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass10 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getInitialDomain(0.031324798049849986d);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.9999999504708134d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.08015071710935137d);
        double double12 = fDistributionImpl2.getInitialDomain(10.0d);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.023813722351143395d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.inverseCumulativeProbability(1.0843738724222984d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.25d + "'", double12 == 1.25d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.189836249017317d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 10);
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.02887716934657425d, 0.1114353339521007d);
        double double4 = fDistributionImpl2.getInitialDomain(0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.05900530490454193d) + "'", double4 == (-0.05900530490454193d));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.19151374780859048d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.4892284600732909d);
        double double4 = fDistributionImpl2.getDomainLowerBound((-0.3504236660423056d));
        double double6 = fDistributionImpl2.getDomainLowerBound(0.08793604972328362d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.9999984104468244d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 1);
        double double19 = fDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5775256913939883d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6591065015250168d + "'", double15 == 0.6591065015250168d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.29474933881663606d, 0.3951424744541511d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(0.2207617383499606d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.24621654456195674 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (byte) -1, 1.418479831543378d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5189833010988237d);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.inverseCumulativeProbability(0.40011231498671923d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double10 = fDistributionImpl2.getInitialDomain(0.06401548478113292d);
        double double12 = fDistributionImpl2.getInitialDomain(0.6739693374503183d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.07061643216723656d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.25d + "'", double12 == 1.25d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.20416048310264287d + "'", double14 == 0.20416048310264287d);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.cumulativeProbability((double) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4906940248809481d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.1822843294541756d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.04199995021237534d + "'", double12 == 0.04199995021237534d);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double17 = fDistributionImpl2.cumulativeProbability((double) 10.0f);
        double double19 = fDistributionImpl2.getDomainLowerBound(0.5996052325402953d);
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double22 = fDistributionImpl2.getInitialDomain(0.4419425715309202d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9967719789495215d + "'", double17 == 0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0606060606060606d + "'", double22 == 1.0606060606060606d);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, (-0.9799636396743291d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.5004087508678674d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.cumulativeProbability(0.999037593690436d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4906940248809481d + "'", double11 == 0.4906940248809481d);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.06401548478113292d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.1855184662093986d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4664502910454298d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.17235021937116024d);
        double double13 = fDistributionImpl2.getInitialDomain(0.44582356363844317d);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.9999984104468244d);
        double double4 = fDistributionImpl2.cumulativeProbability(100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9466229816367563d + "'", double4 == 0.9466229816367563d);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3220459516792461d);
        double double11 = fDistributionImpl2.cumulativeProbability(0.19788692492646354d, (double) '4');
        double double14 = fDistributionImpl2.cumulativeProbability(0.0d, 0.44582356363844317d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 10.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d);
        double double17 = fDistributionImpl2.getInitialDomain(0.0d);
        double double19 = fDistributionImpl2.getDomainUpperBound(Double.NaN);
        double double20 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double23 = fDistributionImpl2.cumulativeProbability(0.04322441323500558d, 0.680275832290893d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.08015071710935137d + "'", double15 == 0.08015071710935137d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.22828618836637168d + "'", double23 == 0.22828618836637168d);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.9999999999915219d);
        double double19 = fDistributionImpl2.getDomainLowerBound(0.11684554078643927d);
        double double21 = fDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1228.3664773101177d + "'", double17 == 1228.3664773101177d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDomainUpperBound(0.0d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.6554278909379809d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, (double) (byte) 1);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L), 0.5004087508678674d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 10);
        double double22 = fDistributionImpl2.cumulativeProbability(0.049950031800927046d, 0.476758784114401d);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = fDistributionImpl2.cumulativeProbability(0.5004087508678674d, 0.1801856291181903d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3220459516792461d + "'", double22 == 0.3220459516792461d);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainLowerBound(0.33409440091453685d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7681324865938718d);
        java.lang.Class<?> wildcardClass21 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double14 = fDistributionImpl2.inverseCumulativeProbability(1.2241878759327988E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistributionImpl2.cumulativeProbability(0.06652843034939326d, 0.031324798049849986d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.cumulativeProbability(0.9205507147766241d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.31979861116167463d + "'", double9 == 0.31979861116167463d);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1);
        double double7 = fDistributionImpl2.getDomainLowerBound(0.4898628835849175d);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.cumulativeProbability(0.1855184662093986d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2589160113618819d + "'", double10 == 0.2589160113618819d);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.8284628704001276d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.0011893394730556636d, 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.4980478727936605d + "'", double19 == 0.4980478727936605d);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getInitialDomain((double) '#');
        double double10 = fDistributionImpl2.getDomainUpperBound(1.0606060606060606d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.049950031800927046d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.418479831543378d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.2579619500249368d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5093634057790148d);
        double double14 = fDistributionImpl2.getDomainLowerBound((double) 10L);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.6554278909379809d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.1801856291181903d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.5220157123797441d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 0L, 0.31979861116167463d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1201684622410103d + "'", double4 == 0.1201684622410103d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08793604972328362d + "'", double7 == 0.08793604972328362d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.09901319167563201d) + "'", double9 == (-0.09901319167563201d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.23076288400994444d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.cumulativeProbability((double) 100, 0.06652843034939326d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.06401548478113292d + "'", double10 == 0.06401548478113292d);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability((double) 100);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.6401770331730183d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5433539298660959d);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, 0.3919491786229663d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.9967719789495215d);
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02887716934657425d + "'", double11 == 0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3168052840864677d + "'", double13 == 0.3168052840864677d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.491780299474472d + "'", double15 == 0.491780299474472d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9898804402645663d, 0.2969240624175721d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(0.18506771891995114d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9898804402645663d + "'", double3 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.17434575632550214d) + "'", double5 == (-0.17434575632550214d));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getInitialDomain(0.49838122445596006d);
        double double12 = fDistributionImpl2.getDomainLowerBound(32.0d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        double double15 = fDistributionImpl2.cumulativeProbability(0.5004087508678674d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.43276459841306814d);
        double double19 = fDistributionImpl2.getDomainUpperBound(0.5093634057790148d);
        double double20 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double23 = fDistributionImpl2.cumulativeProbability(0.05350873685544799d, 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5189833010988237d + "'", double15 == 0.5189833010988237d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.8154639584090504d + "'", double23 == 0.8154639584090504d);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound((-1.0d));
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.018345231285955332d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability((-0.49071513905979386d), 0.47187845345795065d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.018345231285955332d + "'", double12 == 0.018345231285955332d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9453652605193021d + "'", double15 == 0.9453652605193021d);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain((double) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.8284628704001276d);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.9999999999999998d);
        java.lang.Class<?> wildcardClass18 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.5004087508678674d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.6289333745278087d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4906940248809481d + "'", double11 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6591068676950343d + "'", double16 == 0.6591068676950343d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.23076288400994444d);
        java.lang.Class<?> wildcardClass18 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.02723373766299686d, 0.6046935761651037d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.0d, 0.09487388796007479d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistributionImpl2.cumulativeProbability(0.9188056009222301d, 0.023813722351143395d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8933186128357743d + "'", double5 == 0.8933186128357743d);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double10 = fDistributionImpl2.getInitialDomain((double) 10L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0606060606060606d + "'", double10 == 1.0606060606060606d);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) (short) 100);
        double double12 = fDistributionImpl2.cumulativeProbability((double) 0L);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.06401548478113292d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double17 = fDistributionImpl2.cumulativeProbability(0.9898804402645663d, Double.NaN);
        double double19 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double20 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double22 = fDistributionImpl2.inverseCumulativeProbability(0.7583315357111738d);
        double double24 = fDistributionImpl2.getDomainLowerBound(0.14335493966332769d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.418479831543378d + "'", double22 == 1.418479831543378d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double14 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-0.09430155667562287d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5366657182124845d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, (double) (byte) 1);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L), 0.5004087508678674d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 10);
        double double21 = fDistributionImpl2.getDomainLowerBound(0.3919491786229663d);
        double double23 = fDistributionImpl2.getDomainUpperBound(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.32764978063013356d);
        java.lang.Class<?> wildcardClass26 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double9 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double11 = fDistributionImpl2.getDomainUpperBound(0.6591065015250168d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 10L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.cumulativeProbability(0.680275832290893d, 0.03273505326846579d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.cumulativeProbability(0.09487388796007479d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.4204984331337026d, 1.6636531716106877d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.008771073413552499d + "'", double6 == 0.008771073413552499d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.3020338789555518d + "'", double9 == 0.3020338789555518d);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double17 = fDistributionImpl2.cumulativeProbability(0.9898804402645663d, Double.NaN);
        double double19 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double20 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double21 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 10);
        double double24 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(6.481806365604883E-142d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5093634057790148d, 0.3895024214486992d);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.29474933881663606d, 0.44582356363844317d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.8609681162053344d);
        double double7 = fDistributionImpl2.cumulativeProbability(0.0d, 0.6037071022078223d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6270029939100311d + "'", double7 == 0.6270029939100311d);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.cumulativeProbability((-1.129032258064516d));
        double double14 = fDistributionImpl2.inverseCumulativeProbability(0.004569416631646944d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.447655051249668E-5d + "'", double14 == 3.447655051249668E-5d);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.1048724177104202d), 0.30255252296354923d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getInitialDomain((double) 1);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass12 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d, 0.03273505326846579d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistributionImpl2.inverseCumulativeProbability((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double15 = fDistributionImpl2.cumulativeProbability(52.0d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0606060606060606d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = fDistributionImpl2.inverseCumulativeProbability(2.5491771371666263d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9999999238243996d + "'", double15 == 0.9999999238243996d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double10 = fDistributionImpl2.getInitialDomain(0.5093634057790148d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.02723373766299686d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainUpperBound(0.0011893394730556636d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.02723373766299686d + "'", double13 == 0.02723373766299686d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getInitialDomain(0.5220157123797441d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999995770263d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6640218712845615d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5026637197270847d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.23076288400994444d);
        double double12 = fDistributionImpl2.getDomainLowerBound(1.0d);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.2671687285166097d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.06401548478113292d + "'", double10 == 0.06401548478113292d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double6 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 1);
        java.lang.Class<?> wildcardClass9 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3197986111586397d + "'", double6 == 0.3197986111586397d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.43278329179761166d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.49838122445596006d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.cumulativeProbability(0.39134009223677896d, 0.16593376295629791d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5004087508678674d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.9967719789495215d);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 0L);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5004087508678674d + "'", double11 == 0.5004087508678674d);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDomainUpperBound(0.6591065015250168d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound(0.7723000623308832d);
        double double11 = fDistributionImpl2.getDomainLowerBound(0.5469781396633547d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.8609681162053344d);
        double double12 = fDistributionImpl2.getInitialDomain(0.5996052325402953d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6401770331730183d + "'", double10 == 0.6401770331730183d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass12 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.1801856291181903d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.5220157123797441d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 0L, 0.31979861116167463d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.999037593690436d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.cumulativeProbability(0.9176064239260036d, 0.28159241378169547d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1201684622410103d + "'", double4 == 0.1201684622410103d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08793604972328362d + "'", double7 == 0.08793604972328362d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.09901319167563201d) + "'", double9 == (-0.09901319167563201d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double14 = fDistributionImpl2.getInitialDomain((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6591065015250168d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.39134009223677896d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0606060606060606d + "'", double14 == 1.0606060606060606d);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5949357068078883d, (double) (short) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double17 = fDistributionImpl2.cumulativeProbability(0.9898804402645663d, Double.NaN);
        double double19 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double20 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double21 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 10);
        double double24 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double26 = fDistributionImpl2.getInitialDomain(0.6276037379948466d);
        double double27 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double28 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.25d + "'", double26 == 1.25d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 10, 0.9898804402645663d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.41580691019689836d, (double) (byte) 10);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4898628835849175d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.cumulativeProbability(0.5565294657256515d, 0.16510007084584888d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6037071022078223d + "'", double5 == 0.6037071022078223d);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.14335493966332769d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.25d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain((-1.6666671958040784d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.6758256576139563d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.6037071022078223d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(0.5658786927337371d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.5103751341354182 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (short) 10);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.02887716934657425d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.25d, 100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.3951424744541511d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.9999981726526794d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d, 0.04366678567633304d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.47187845345795065d + "'", double8 == 0.47187845345795065d);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistributionImpl2.inverseCumulativeProbability(0.06965997645678441d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability(0.0d, 0.5996052325402953d);
        double double11 = fDistributionImpl2.getDomainLowerBound(0.19506275762925057d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.03273505326846579d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5433539298660959d + "'", double9 == 0.5433539298660959d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.7976931348623157E308d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.9205507147766241d);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.3040818357099405d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.8609681162053344d);
        double double12 = fDistributionImpl2.getInitialDomain(0.5996052325402953d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.cumulativeProbability(0.5062857921531189d, 0.07246070103630853d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6401770331730183d + "'", double10 == 0.6401770331730183d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (byte) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5366657182124845d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.08015071710935137d, 0.9999999995770263d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistributionImpl2.cumulativeProbability(1.315320556750493E-26d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5366657182124845d + "'", double11 == 0.5366657182124845d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2671687285166097d + "'", double14 == 0.2671687285166097d);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        double double6 = fDistributionImpl2.getInitialDomain(0.010367711397661706d);
        double double8 = fDistributionImpl2.inverseCumulativeProbability(0.8585643081732904d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0204081632653061d + "'", double6 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.2421802126086574d + "'", double8 == 1.2421802126086574d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.inverseCumulativeProbability((-0.33369676647384544d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double13 = fDistributionImpl2.cumulativeProbability(0.8609681162053344d, 0.9293804578921561d);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.inverseCumulativeProbability(0.4534659472302877d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.018345231285955332d + "'", double13 == 0.018345231285955332d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain(0.5996052325396897d);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.8597859255962592d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.35149728096692545d, 0.07212597439971892d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.35149728096692545d + "'", double3 == 0.35149728096692545d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.35149728096692545d + "'", double4 == 0.35149728096692545d);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.9999999999915219d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = fDistributionImpl2.cumulativeProbability(10.0d, 0.33409440091453685d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1228.3664773101177d + "'", double17 == 1228.3664773101177d);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getInitialDomain((-0.9999999916299953d));
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.cumulativeProbability(0.3895023980863656d, (-0.33369676647384544d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5949357068078883d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double12 = fDistributionImpl2.getInitialDomain(0.6583620521480608d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.inverseCumulativeProbability(0.0010722599132668223d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5949357068078883d + "'", double8 == 0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8284628704001276d + "'", double10 == 0.8284628704001276d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9999999999915219d, 2.097152841112099E-5d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.04860877630608049d);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound((double) (byte) 100);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) '#');
        java.lang.Class<?> wildcardClass12 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.cumulativeProbability(0.6739693374503183d, 1.334173577483257E-5d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.cumulativeProbability(0.18685162596174398d, 0.06401548478113292d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.25d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 10L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, 0.17235021937116024d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.23076288400994444d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.9898804402645663d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistributionImpl2.inverseCumulativeProbability(0.5957283306792327d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.09430155667562287 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.16593376295629791d + "'", double6 == 0.16593376295629791d);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3318389831356192d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.008036077048780232d, 0.5949357068078883d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.inverseCumulativeProbability(0.16510007084584888d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.4234224082773299 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5949357068078883d + "'", double3 == 0.5949357068078883d);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainLowerBound(0.45447932157420906d);
        double double7 = fDistributionImpl2.getDomainUpperBound(0.10751568684175394d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 9.838320889492336E-7d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.08015071710935137d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.05595719508517638d, 0.19845142031994614d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.15231616998149738d + "'", double13 == 0.15231616998149738d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, 0.3919491786229663d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.1801856291181903d);
        double double15 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02887716934657425d + "'", double11 == 0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.NaN);
        double double21 = fDistributionImpl2.getDomainLowerBound(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.6037071022078223d);
        double double25 = fDistributionImpl2.getDomainLowerBound(35.0d);
        double double27 = fDistributionImpl2.getDomainUpperBound(1.0606060606060606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4633919262405889d);
        double double30 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.25d);
        // The following exception was thrown during execution in test generation
        try {
            double double34 = fDistributionImpl2.inverseCumulativeProbability(0.10555964729310591d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.6666666666666667 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.7976931348623157E308d + "'", double27 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.4633919262405889d + "'", double30 == 0.4633919262405889d);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.14637555387850465d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.19506275762925057d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.008036077048780232d);
        double double17 = fDistributionImpl2.cumulativeProbability(0.08015071710935137d, 0.3318389831356192d);
        java.lang.Class<?> wildcardClass18 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.005549455097572098d + "'", double17 == 0.005549455097572098d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d, 1.25d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.08793604972328362d);
        double double17 = fDistributionImpl2.getInitialDomain(0.8585643081732904d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistributionImpl2.inverseCumulativeProbability(0.2207617383499606d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.05350873685544799d + "'", double13 == 0.05350873685544799d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0010722599132668223d + "'", double15 == 0.0010722599132668223d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.cumulativeProbability(0.33409440091453685d, 0.32764978063013356d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999873902d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999999873902d + "'", double10 == 0.9999999999873902d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.05350873685544799d, Double.NaN);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double16 = fDistributionImpl2.cumulativeProbability(0.4906940248809481d, 1.7976931348623157E308d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass18 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1);
        double double13 = fDistributionImpl2.getInitialDomain(0.05595719508517638d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.9999999999915219d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.27855365220112865d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.31979861116167463d + "'", double9 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.3197986111596346d + "'", double15 == 0.3197986111596346d);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double11 = fDistributionImpl2.getDomainLowerBound(0.5775256913939883d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (byte) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 100);
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.4164832330255014d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8485385657705871d + "'", double12 == 0.8485385657705871d);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.1801856291181903d);
        double double4 = fDistributionImpl2.getDomainLowerBound((-1.129032258064516d));
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(0.7723000623308832d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.09901319167563201 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.5004087508678674d);
        double double13 = fDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(0.5996052885758513d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4906940248809481d + "'", double11 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5433539503073836d + "'", double15 == 0.5433539503073836d);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1);
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41406926397160465d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.inverseCumulativeProbability(0.3080794728913734d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound(100.0d);
        double double13 = fDistributionImpl2.getInitialDomain(0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.4906940248809481d);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.05595719508517638d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.6289333745278087d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4633919262405889d, 0.32764978063013356d);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(Double.NaN);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-1.129032258064516d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 0.5949357068078883d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain((-0.49071513905979386d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.4234224082773299d) + "'", double5 == (-0.4234224082773299d));
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double8 = fDistributionImpl2.cumulativeProbability(0.476758784114401d, Double.POSITIVE_INFINITY);
        double double10 = fDistributionImpl2.cumulativeProbability(0.22828618836637168d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.03896274758465178d + "'", double10 == 0.03896274758465178d);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        java.lang.Class<?> wildcardClass9 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.27687764751802335d);
        java.lang.Class<?> wildcardClass9 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7103083879489903d, 0.4898628835849175d);
        double double4 = fDistributionImpl2.getInitialDomain(0.21150108457503464d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.32438304989669015d) + "'", double4 == (-0.32438304989669015d));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 100L);
        double double15 = fDistributionImpl2.getInitialDomain(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistributionImpl2.inverseCumulativeProbability(0.6640218712845615d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, (double) (byte) 10);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        double double6 = fDistributionImpl2.getInitialDomain(0.4892284600732909d);
        java.lang.Class<?> wildcardClass7 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0204081632653061d + "'", double6 == 1.0204081632653061d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) (short) 0);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainLowerBound(0.049950031800927046d);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.05468886506853487d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5189833010988237d, (double) (short) 10);
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.5949357068078883d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.1801856291181903d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4164832330255014d + "'", double4 == 0.4164832330255014d);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, 0.3919491786229663d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02887716934657425d + "'", double11 == 0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3168052840864677d + "'", double13 == 0.3168052840864677d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double19 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double21 = fDistributionImpl2.cumulativeProbability(0.5949357068078883d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9322888260560721d);
        java.lang.Class<?> wildcardClass24 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.541645126720792d + "'", double21 == 0.541645126720792d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(100.0d);
        double double12 = fDistributionImpl2.getInitialDomain((-0.33369676647384544d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.3991062373962743E-245d, 0.29474933881663606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.09487388796007479d);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double14 = fDistributionImpl2.getInitialDomain((double) '4');
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0606060606060606d + "'", double14 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0606060606060606d);
        double double21 = fDistributionImpl2.getDomainUpperBound((-1.129032258064516d));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.3826603340484837E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double16 = fDistributionImpl2.cumulativeProbability((double) (short) 1, 1.0d);
        double double18 = fDistributionImpl2.getDomainUpperBound((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double17 = fDistributionImpl2.cumulativeProbability(0.9898804402645663d, Double.NaN);
        double double19 = fDistributionImpl2.inverseCumulativeProbability(0.794431337232113d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = fDistributionImpl2.cumulativeProbability(0.37330737634742583d, 0.006071986281712238d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.6636531716106877d + "'", double19 == 1.6636531716106877d);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(0.04818702750924919d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getInitialDomain(0.004569416631646944d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.45447932157420906d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.9999999999747803d) + "'", double6 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14112703242567148d + "'", double8 == 0.14112703242567148d);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(2.097152841112099E-5d, 0.31683499876602816d);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 100L);
        double double15 = fDistributionImpl2.getInitialDomain(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.8585643081732904d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.25d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.cumulativeProbability(0.31683499876602816d, 0.2589160113618819d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0204081632653061d, 0.4546995573427486d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 10.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4923052829221457d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistributionImpl2.inverseCumulativeProbability((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.NaN);
        double double21 = fDistributionImpl2.getDomainLowerBound(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.6037071022078223d);
        double double24 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double26 = fDistributionImpl2.inverseCumulativeProbability((-0.13370602424775557d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6037071022078223d + "'", double24 == 0.6037071022078223d);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double16 = fDistributionImpl2.cumulativeProbability(0.4906940248809481d, 1.7976931348623157E308d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double19 = fDistributionImpl2.cumulativeProbability((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.44881727956051176d + "'", double19 == 0.44881727956051176d);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1.0f);
        double double9 = fDistributionImpl2.cumulativeProbability(0.4664502910454298d);
        double double11 = fDistributionImpl2.getDomainUpperBound(0.010551774397567139d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.inverseCumulativeProbability(0.4204984331337026d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14637555387850465d + "'", double9 == 0.14637555387850465d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L));
        double double19 = fDistributionImpl2.getDomainUpperBound(1.25d);
        double double21 = fDistributionImpl2.cumulativeProbability(0.6640218712845615d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.5658786927327883d + "'", double21 == 0.5658786927327883d);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.1829024488312228d, 1.6636531716106877d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainUpperBound(Double.NaN);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getInitialDomain(0.1822843294541756d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9293804578921561d);
        double double21 = fDistributionImpl2.getDomainUpperBound(0.6270029939100311d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7605286207286406d, 0.9999999958149977d);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.22828618836637168d, (-0.4234224082773299d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 10);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.08793604972328362d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.inverseCumulativeProbability(0.1825231602525817d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.04599011958285046 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.41580691019689836d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.476758784114401d + "'", double11 == 0.476758784114401d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.4892284600732909d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.5366657182124845d);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.7246966031342408d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9293804578921561d, (-1.6666671958040784d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.cumulativeProbability((double) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.013666728010437416d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0666666666666667d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.cumulativeProbability((-1.0d));
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.013443616381931207d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.680275844215834d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.03505821861061997d + "'", double16 == 0.03505821861061997d);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.31979861116167463d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.23076288400994444d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(8.292738272749505E-6d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-0.2624723670828401d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1801856291181903d + "'", double11 == 0.1801856291181903d);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double4 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.04366678567633304d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.inverseCumulativeProbability(1228.3664773101177d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double11 = fDistributionImpl2.cumulativeProbability(10.0d, 10.0d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.27687764751802335d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.cumulativeProbability(0.39770683156309267d, 0.0721470484493668d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistributionImpl2.cumulativeProbability(0.2589160113618819d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9898804402645663d);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 10L, (double) (byte) 10);
        double double12 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.7583315357111738d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5366657182124845d + "'", double12 == 0.5366657182124845d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(Double.POSITIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getInitialDomain(0.8609681162053344d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(97.0d);
        double double16 = fDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.06545795869712367d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.41580691019689836d + "'", double12 == 0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 10.0f);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getDomainLowerBound(0.7640246288297262d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability((double) (short) 10);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainUpperBound(0.018345231285955332d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9967719789495215d + "'", double15 == 0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double17 = fDistributionImpl2.cumulativeProbability(0.9898804402645663d, Double.NaN);
        double double19 = fDistributionImpl2.inverseCumulativeProbability(0.794431337232113d);
        double double20 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.6636531716106877d + "'", double19 == 1.6636531716106877d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100L);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) 10.0f);
        double double9 = fDistributionImpl2.cumulativeProbability(0.07609892745584163d, 0.9999999995770263d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.336242355358862d + "'", double9 == 0.336242355358862d);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5949357068078883d, (double) (short) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainLowerBound(0.7681324865938718d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.41580691019689836d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.1201684622410103d);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.476758784114401d + "'", double11 == 0.476758784114401d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8609681162053344d, 10.0d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.4633919262405889d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.cumulativeProbability((double) 100, (-0.19192775392242717d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double6 = fDistributionImpl2.getInitialDomain(0.05350873685544799d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.5658786927337371d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.cumulativeProbability(0.7723000623308832d, 0.5004087508678674d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.18685162596174398d + "'", double8 == 0.18685162596174398d);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9898804402645663d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.cumulativeProbability(0.5366064842062321d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.189836249017317d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double19 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double21 = fDistributionImpl2.getInitialDomain(0.41580691019689836d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(3.447655051249668E-5d);
        java.lang.Class<?> wildcardClass10 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound((double) (byte) 100);
        double double11 = fDistributionImpl2.getInitialDomain(0.5773773436195279d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.1801856291181903d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5093634057790148d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), 0.3895023980863656d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.inverseCumulativeProbability(0.0011893394730556636d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5093634057790148d + "'", double13 == 0.5093634057790148d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4892284600732909d + "'", double16 == 0.4892284600732909d);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 10.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.4664502910454298d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.08015071710935137d + "'", double15 == 0.08015071710935137d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.23076288400994444d);
        double double12 = fDistributionImpl2.cumulativeProbability(1.0666666666666667d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.inverseCumulativeProbability((double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8195918816395871d + "'", double12 == 0.8195918816395871d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9898804402645663d);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.23587424144892077d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4009893970905954d);
        double double15 = fDistributionImpl2.getDomainUpperBound(97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4898628835849175d);
        double double17 = fDistributionImpl2.cumulativeProbability(0.6046935761651037d);
        double double19 = fDistributionImpl2.getInitialDomain(0.44582356363844317d);
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5469781396633547d + "'", double17 == 0.5469781396633547d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.4898628835849175d + "'", double20 == 0.4898628835849175d);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4664502910454298d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4664502910454298d + "'", double10 == 0.4664502910454298d);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5773773436195279d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.23587424144892077d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.42666238729297296d + "'", double10 == 0.42666238729297296d);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.22828618836637168d, 0.7557224019288303d);
        double double4 = fDistributionImpl2.getInitialDomain(0.41406926397160465d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.6073583604658008d) + "'", double4 == (-0.6073583604658008d));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.cumulativeProbability(0.19845142031994614d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.2500001488198675d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.inverseCumulativeProbability(0.9898804402645663d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.04860877630608049d + "'", double12 == 0.04860877630608049d);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7043071535892672d, 0.3981365332138079d);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        double double15 = fDistributionImpl2.cumulativeProbability(0.5004087508678674d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.43276459841306814d);
        double double19 = fDistributionImpl2.cumulativeProbability((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-0.33369676647384544d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5189833010988237d + "'", double15 == 0.5189833010988237d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999504708134d + "'", double19 == 0.9999999504708134d);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double15 = fDistributionImpl2.cumulativeProbability(52.0d);
        double double17 = fDistributionImpl2.cumulativeProbability((-0.17434575632550214d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9999999238243996d + "'", double15 == 0.9999999238243996d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistributionImpl2.cumulativeProbability(0.476758784114401d, 0.2207617383499606d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability(0.5433539298660959d);
        double double11 = fDistributionImpl2.getInitialDomain(0.9466229816367563d);
        double double13 = fDistributionImpl2.getInitialDomain(0.08793604972328362d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5220157123797441d + "'", double9 == 0.5220157123797441d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0606060606060606d);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.43467479348140525d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.25d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.08793604972328362d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.37330737634742583d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.19151374780859048d + "'", double15 == 0.19151374780859048d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.1801856291181903d);
        double double18 = fDistributionImpl2.getInitialDomain((double) 1L);
        double double20 = fDistributionImpl2.cumulativeProbability((double) '#');
        double double21 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.05468886506853487d + "'", double16 == 0.05468886506853487d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.25d + "'", double18 == 1.25d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.999852177434338d + "'", double20 == 0.999852177434338d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.8609681162053344d);
        double double12 = fDistributionImpl2.getInitialDomain(0.5996052325402953d);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6401770331730183d + "'", double10 == 0.6401770331730183d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, (double) (byte) 1);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L), 0.5004087508678674d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 10);
        double double22 = fDistributionImpl2.cumulativeProbability(0.049950031800927046d, 0.476758784114401d);
        double double24 = fDistributionImpl2.getDomainUpperBound(0.5433539298660959d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double28 = fDistributionImpl2.getDomainLowerBound(0.7002018597835067d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3220459516792461d + "'", double22 == 0.3220459516792461d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.7976931348623157E308d + "'", double24 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getInitialDomain((double) 'a');
        double double10 = fDistributionImpl2.getInitialDomain((-1.0d));
        double double12 = fDistributionImpl2.getDomainLowerBound(1.2109603464415848d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8609681162053344d, 10.0d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.4633919262405889d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.18945773922771514d, 0.9961307247459887d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.cumulativeProbability(0.9999999999999998d, (-0.13370602424775557d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.3080794728913734d + "'", double9 == 0.3080794728913734d);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0606060606060606d);
        double double10 = fDistributionImpl2.getInitialDomain((double) 0);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(0.018345231285955332d);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.129032258064516d) + "'", double10 == (-1.129032258064516d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0606060606060606d + "'", double11 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.129032258064516d) + "'", double13 == (-1.129032258064516d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(97.0d);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.44582356363844317d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.004141886739706592d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.41580691019689836d + "'", double12 == 0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9961307247459887d + "'", double16 == 0.9961307247459887d);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.5433539298660959d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9188056009222301d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6037071022078223d, 0.6591065015250168d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6037071022078223d + "'", double3 == 0.6037071022078223d);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5004087508678674d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.9967719789495215d);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 0L);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass12 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.19192775392242717d), 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double16 = fDistributionImpl2.cumulativeProbability((double) (short) 1, 1.0d);
        double double18 = fDistributionImpl2.getDomainUpperBound((double) 100.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.23587424144892077d);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = fDistributionImpl2.inverseCumulativeProbability(0.03805921542661744d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.13370602424775557 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6583620521480608d, (double) ' ');
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.cumulativeProbability(0.680275844215834d, 0.11684554078643927d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability(0.0d, 0.5996052325402953d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(5.357258915695551E-11d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.inverseCumulativeProbability(1.418479831543378d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5433539298660959d + "'", double9 == 0.5433539298660959d);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5004087508678674d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.9967719789495215d);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 0L);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.04322441323500558d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.4204984331337026d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.10479689180895158d + "'", double15 == 0.10479689180895158d);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getDomainLowerBound(1.0d);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9898804402645663d);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 10L, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.cumulativeProbability(0.10751568684175394d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getDomainLowerBound(1.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.33364776310664174d);
        double double17 = fDistributionImpl2.cumulativeProbability(0.37330737634742583d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.43278329179761166d + "'", double15 == 0.43278329179761166d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.45484514927563435d + "'", double17 == 0.45484514927563435d);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.47077968881994314d), 0.26479899700216447d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999999873902d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.491780299474472d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4892284600732909d);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.7103085841908984d);
        double double18 = fDistributionImpl2.getDomainUpperBound(0.5366657182124845d);
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.1801856291181903d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.5220157123797441d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 0L, 0.31979861116167463d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.4633919262405889d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability(0.23076288400994444d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.09901319167563201 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1201684622410103d + "'", double4 == 0.1201684622410103d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08793604972328362d + "'", double7 == 0.08793604972328362d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.11215527694889071d + "'", double9 == 0.11215527694889071d);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3220459516792461d);
        double double11 = fDistributionImpl2.cumulativeProbability(0.19788692492646354d, (double) '4');
        double double13 = fDistributionImpl2.getDomainUpperBound(1.0210526315789474d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability(2.097152841112099E-5d, 0.008771073413552499d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.645964116627397E-18d + "'", double9 == 4.645964116627397E-18d);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 10.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d);
        double double17 = fDistributionImpl2.getInitialDomain(0.0d);
        double double19 = fDistributionImpl2.getInitialDomain(0.794431337232113d);
        java.lang.Class<?> wildcardClass20 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.08015071710935137d + "'", double15 == 0.08015071710935137d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getInitialDomain((double) ' ');
        double double12 = fDistributionImpl2.getDomainLowerBound(0.4898628835849175d);
        double double14 = fDistributionImpl2.inverseCumulativeProbability(5.357258915695551E-11d);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.333959227384966d);
        double double18 = fDistributionImpl2.getDomainLowerBound(3986.25d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0606060606060606d + "'", double10 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.18945773922771514d + "'", double16 == 0.18945773922771514d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 10, 0.9898804402645663d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.476758784114401d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.17379970502642506d, (-0.35319435852748904d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.29474933881663606d, 0.44582356363844317d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.7681324865938718d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(0.4633919262405889d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.6235512165346226 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 1, (double) 10);
        double double4 = fDistributionImpl2.cumulativeProbability((-0.1048724177104202d));
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.4234224082773299d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, (-0.2942467010239518d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

