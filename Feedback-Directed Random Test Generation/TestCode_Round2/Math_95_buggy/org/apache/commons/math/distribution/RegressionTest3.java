package org.apache.commons.math.distribution;

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
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainUpperBound(Double.NaN);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4164832330255014d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.inverseCumulativeProbability(0.999037593690436d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.26301157127704006 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double16 = fDistributionImpl2.cumulativeProbability((double) (short) 1, 1.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6591065015250168d);
        double double20 = fDistributionImpl2.cumulativeProbability((-0.33369676647384544d));
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.021191376661121225d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.5996052325396897d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.1829024488312228d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.7723000623308832d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5433539298658748d + "'", double10 == 0.5433539298658748d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.41580691019689836d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.3895023980863656d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.cumulativeProbability(1.0204081632653061d, 1.25d);
        double double19 = fDistributionImpl2.getDomainUpperBound(0.26465518129632637d);
        double double21 = fDistributionImpl2.cumulativeProbability((-0.11015601941480264d));
        double double22 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.476758784114401d + "'", double11 == 0.476758784114401d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.4633919262405889d + "'", double13 == 0.4633919262405889d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.04818702750924919d + "'", double17 == 0.04818702750924919d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double16 = fDistributionImpl2.cumulativeProbability(0.7103083879489903d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5949357068078883d + "'", double16 == 0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double11 = fDistributionImpl2.cumulativeProbability(10.0d, 10.0d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.4546995573427486d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.29474933881663606d, 0.3951424744541511d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.18506771891995114d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(0.24041303946096454d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.24621654456195674 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4419425715309202d + "'", double4 == 0.4419425715309202d);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) (byte) 1);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (short) 1);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.6037071022078223d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.4906940248809481d);
        double double6 = fDistributionImpl2.getDomainLowerBound(7.444493761760151E-4d);
        double double8 = fDistributionImpl2.getInitialDomain(0.009486956849729777d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.432364228996943d) + "'", double8 == (-0.432364228996943d));
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, 0.3919491786229663d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 10);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.1201684622410103d);
        double double19 = fDistributionImpl2.getInitialDomain(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02887716934657425d + "'", double11 == 0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.029360195877475227d + "'", double17 == 0.029360195877475227d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.25d + "'", double19 == 1.25d);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.8284628704001276d);
        double double18 = fDistributionImpl2.inverseCumulativeProbability(0.7557224019288303d);
        double double20 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0721470484493668d);
        java.lang.Class<?> wildcardClass23 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.3515003513676351d + "'", double18 == 1.3515003513676351d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.43199198024659174d, 0.0010722599132668223d);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double17 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.27855365220112865d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
            double double19 = fDistributionImpl2.inverseCumulativeProbability(0.30278624188592324d);
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
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDomainLowerBound(0.41406926397160465d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.2241878759327988E-4d, 1.04952177738101d);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.39134009223677896d);
        double double9 = fDistributionImpl2.getDomainLowerBound(0.4595566142158559d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability((-0.293214330727583d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.cumulativeProbability(0.007681534962120051d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.06811040554474385d + "'", double12 == 0.06811040554474385d);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double19 = fDistributionImpl2.getDomainLowerBound(35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.19845142031994614d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        double double8 = fDistributionImpl2.getDomainLowerBound(0.5658786927337371d);
        double double10 = fDistributionImpl2.getInitialDomain(0.008009325319447534d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0204081632653061d + "'", double10 == 1.0204081632653061d);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.08793604972328362d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.getDomainUpperBound(Double.NaN);
        double double17 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double19 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double22 = fDistributionImpl2.getInitialDomain(0.05028488401486397d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.25d + "'", double22 == 1.25d);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistributionImpl2.inverseCumulativeProbability(0.06811040554474385d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.00963131349797714d, 0.14405562398547067d);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound((double) '4');
        double double13 = fDistributionImpl2.getDomainUpperBound(0.7246966031342408d);
        double double15 = fDistributionImpl2.inverseCumulativeProbability(0.008610287160087353d);
        double double17 = fDistributionImpl2.getInitialDomain((-0.2004508130138858d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.2241878759327988E-4d + "'", double15 == 1.2241878759327988E-4d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.25d + "'", double17 == 1.25d);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3168052840864677d, 0.8609681162053344d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.999037593690436d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound((-0.9999999999999996d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3168052840864677d + "'", double5 == 0.3168052840864677d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8609681162053344d + "'", double6 == 0.8609681162053344d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double6 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.inverseCumulativeProbability((-0.3667417109622608d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3197986111586397d + "'", double6 == 0.3197986111586397d);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double11 = fDistributionImpl2.getInitialDomain(0.9999999999999998d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.33364776310664174d);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.42370716420032145d + "'", double13 == 0.42370716420032145d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        java.lang.Class<?> wildcardClass7 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5004087508678674d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.9967719789495215d);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 0L);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainLowerBound(0.023813722351143395d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5004087508678674d + "'", double11 == 0.5004087508678674d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9322902587483378d, 0.7103083879489903d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.cumulativeProbability((double) 'a', 0.19788692492646354d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) 1);
        double double12 = fDistributionImpl2.cumulativeProbability((double) (short) -1);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.06652843034939326d);
        double double16 = fDistributionImpl2.cumulativeProbability((double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.inverseCumulativeProbability(0.28159241378169547d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.8026648265055725d + "'", double16 == 0.8026648265055725d);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double14 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double16 = fDistributionImpl2.cumulativeProbability(1.0210526315789474d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.inverseCumulativeProbability(0.3587171005858765d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3248137971311367d + "'", double16 == 0.3248137971311367d);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.189836249017317d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 10);
        double double20 = fDistributionImpl2.getDomainUpperBound(100.0d);
        double double22 = fDistributionImpl2.cumulativeProbability(0.5433539298660959d);
        double double24 = fDistributionImpl2.getDomainUpperBound(0.018345231285955332d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.7976931348623157E308d + "'", double24 == 1.7976931348623157E308d);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.inverseCumulativeProbability(0.2215131472835244d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.1801856291181903d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.5220157123797441d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 0L, 0.31979861116167463d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.02887716934657425d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability(0.369679655722036d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.014650111549365743 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1201684622410103d + "'", double4 == 0.1201684622410103d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08793604972328362d + "'", double7 == 0.08793604972328362d);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.9999999999873902d);
        double double10 = fDistributionImpl2.getInitialDomain(0.0d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.3197986111596346d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.49071513905979386d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.2871174581456352d, 0.14112703242567148d);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double9 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double11 = fDistributionImpl2.getDomainUpperBound(0.6591065015250168d);
        double double13 = fDistributionImpl2.getInitialDomain(0.2969240624175721d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainUpperBound(0.680275844215834d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.2109603464415848d, 0.6583620521480608d);
        double double4 = fDistributionImpl2.getInitialDomain(0.5658786927337371d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.42843061475207117d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.49071513905979386d) + "'", double4 == (-0.49071513905979386d));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 1, (double) 10);
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(97.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.2969240624175721d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.9797635432974363d);
        double double12 = fDistributionImpl2.getInitialDomain((-0.293214330727583d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.25d + "'", double12 == 1.25d);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.31979861116167463d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.23076288400994444d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5626720221012385d);
        double double19 = fDistributionImpl2.getDomainUpperBound(0.028005760216863906d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1801856291181903d + "'", double11 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.03805921542661744d, 0.999852177434338d);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability(0.40826190741378604d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.46278740261225126d + "'", double13 == 0.46278740261225126d);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.41580691019689836d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.3895023980863656d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.cumulativeProbability(1.0204081632653061d, 1.25d);
        double double19 = fDistributionImpl2.getDomainUpperBound(0.26465518129632637d);
        double double21 = fDistributionImpl2.cumulativeProbability((-0.11015601941480264d));
        double double22 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.476758784114401d + "'", double11 == 0.476758784114401d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.4633919262405889d + "'", double13 == 0.4633919262405889d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.04818702750924919d + "'", double17 == 0.04818702750924919d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double17 = fDistributionImpl2.getInitialDomain((double) (byte) 10);
        double double19 = fDistributionImpl2.inverseCumulativeProbability(0.6591068676950343d);
        double double21 = fDistributionImpl2.cumulativeProbability(0.2654747243225105d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0606060606060606d + "'", double17 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9322902587483378d + "'", double19 == 0.9322902587483378d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.3903771725336764d + "'", double21 == 0.3903771725336764d);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.26465518129632637d, 0.002393864708003338d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.0027198323247858195d);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.002393864708003338d + "'", double5 == 0.002393864708003338d);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5993164688934242d);
        double double16 = fDistributionImpl2.getDomainLowerBound(1.0210526315789474d);
        double double18 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.20645201597141383d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + Double.POSITIVE_INFINITY + "'", double18 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.cumulativeProbability(0.05350873685544799d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5949357068078883d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.cumulativeProbability(10.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3897742347849355d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5949357068078883d + "'", double8 == 0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8284628704001276d + "'", double10 == 0.8284628704001276d);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.4892284600732909d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.333959227384966d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getInitialDomain((double) 'a');
        double double10 = fDistributionImpl2.cumulativeProbability(1.25d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0210526315789474d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7103083879489903d + "'", double10 == 0.7103083879489903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0210526315789474d + "'", double14 == 1.0210526315789474d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double14 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.17235021937116024d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = fDistributionImpl2.cumulativeProbability(0.010367711397661706d, 1.2241878759327988E-4d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getInitialDomain(0.5366064842062321d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0666666666666667d + "'", double11 == 1.0666666666666667d);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 100);
        double double18 = fDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double20 = fDistributionImpl2.getDomainUpperBound(0.2601891955685284d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((double) 100L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999984104468244d + "'", double11 == 0.9999984104468244d);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (-1L));
        double double6 = fDistributionImpl2.getDomainLowerBound(0.04322441323500558d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.cumulativeProbability(1228.3664773101177d, 0.01806785311078775d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.5949357068078883d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 10L);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.30217627350924703d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.755683952741227d + "'", double6 == 0.755683952741227d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.0d);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.41580691019689836d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.3895023980863656d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.cumulativeProbability(1.0204081632653061d, 1.25d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3895023980863656d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.476758784114401d + "'", double11 == 0.476758784114401d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.4633919262405889d + "'", double13 == 0.4633919262405889d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.04818702750924919d + "'", double17 == 0.04818702750924919d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound((double) '4');
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.cumulativeProbability(1.6636531716106877d, 0.14038325387155903d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(9.838320889492336E-7d, 0.4239582314034682d);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double11 = fDistributionImpl2.getInitialDomain(0.9999999999999998d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.06965997645678441d, 0.6739693374503183d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(0.03896274758465178d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.5082607487781732 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.17434575632550214d), 32.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5004087508678674d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.05595719508517638d, 0.09487388796007479d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(5.357258915695551E-11d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.535927304604666d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999988502378d + "'", double6 == 0.9999999988502378d);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        double double15 = fDistributionImpl2.cumulativeProbability(0.5004087508678674d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.43276459841306814d);
        double double19 = fDistributionImpl2.cumulativeProbability((double) '#');
        double double21 = fDistributionImpl2.inverseCumulativeProbability(0.5565294657256515d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5189833010988237d + "'", double15 == 0.5189833010988237d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999504708134d + "'", double19 == 0.9999999504708134d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.5921193670526308d + "'", double21 == 0.5921193670526308d);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 100L);
        double double16 = fDistributionImpl2.cumulativeProbability(0.3895023980863656d, 0.9293804578921561d);
        double double18 = fDistributionImpl2.getInitialDomain(0.9999999999999998d);
        double double19 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double22 = fDistributionImpl2.cumulativeProbability(8.292738272749505E-6d, 0.1855184662093986d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.189836249017317d + "'", double16 == 0.189836249017317d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.02234129550612769d + "'", double22 == 0.02234129550612769d);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0666666666666667d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.inverseCumulativeProbability(0.3919491786229663d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.1428571428571428 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.19845142031994614d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.inverseCumulativeProbability(0.010551774397567139d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.11015601941480264 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, (double) (byte) 1);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getInitialDomain(0.5949357068038229d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.14637555387850465d);
        double double21 = fDistributionImpl2.getDomainLowerBound(0.47187845345795065d);
        double double23 = fDistributionImpl2.getDomainLowerBound(0.06401548478113292d);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = fDistributionImpl2.cumulativeProbability(0.4039902804002893d, 0.378096485231151d);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, (double) (byte) 10);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(10.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.40971224866107453d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.40971224866107453d + "'", double7 == 0.40971224866107453d);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-1.53472685559007d), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4664502910454298d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.17235021937116024d);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(4.074129922315706E-11d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.6758256576139563d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getInitialDomain(0.9293804578921561d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.04818702750924919d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double6 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 1);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.3168052840864677d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4394515874848486d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.inverseCumulativeProbability(0.013443616381931207d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3197986111586397d + "'", double6 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8597859255962592d, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.getDomainUpperBound(Double.NaN);
        double double17 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double19 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double21 = fDistributionImpl2.getDomainUpperBound(3.408167631624437E-4d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.2241878759327988E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.1114353339521007d);
        double double23 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = fDistributionImpl2.inverseCumulativeProbability(10.03041485845025d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.05468886506853487d + "'", double16 == 0.05468886506853487d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.25d + "'", double18 == 1.25d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.999852177434338d + "'", double20 == 0.999852177434338d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.418479831543378d, 3.72605569395207d);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1);
        java.lang.Class<?> wildcardClass6 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3197986111586397d, 35.0d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100.0f);
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4860815252407045d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3197986111586397d + "'", double3 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3197986111586397d + "'", double6 == 0.3197986111586397d);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.20196314831799295d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.11280448783580999d, 0.22828618836637168d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.10479689180895158d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3077850834112132d, 0.4239582314034682d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4239582314034682d + "'", double3 == 0.4239582314034682d);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain(0.1201684622410103d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1);
        double double7 = fDistributionImpl2.getDomainLowerBound(6.396607245999892E-152d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDomainLowerBound(0.10555964729310591d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, 0.1201684622410103d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5189833010988237d, 0.4898628835849175d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (short) 0);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.getDomainLowerBound((double) (short) 1);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1);
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.44881727956051176d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.40826190741378604d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.6037071022078223d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.4906940248809481d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.049950031800927046d);
        java.lang.Class<?> wildcardClass10 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.6636531716106877d + "'", double5 == 1.6636531716106877d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.6636531716106877d + "'", double6 == 1.6636531716106877d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.6636531716106877d + "'", double7 == 1.6636531716106877d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        double double17 = fDistributionImpl2.getInitialDomain(0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 100);
        double double18 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double20 = fDistributionImpl2.cumulativeProbability(0.9999999504708134d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.491780299474472d);
        double double25 = fDistributionImpl2.cumulativeProbability(0.03396738004348632d, 0.5093634057790148d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.680275844215834d + "'", double18 == 0.680275844215834d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.680275832290893d + "'", double20 == 0.680275832290893d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.2197378803455035d + "'", double25 == 0.2197378803455035d);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.23587424144892077d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.41580691019689836d + "'", double12 == 0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5093634057790148d);
        double double14 = fDistributionImpl2.getDomainLowerBound((double) 10L);
        double double16 = fDistributionImpl2.getInitialDomain(1.25d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double20 = fDistributionImpl2.cumulativeProbability(0.4479640982107486d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5093634057790148d + "'", double17 == 0.5093634057790148d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5049994309192527d + "'", double20 == 0.5049994309192527d);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9898804402645663d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 100);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.5996052325402953d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.5949357068038229d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.04952177738101d + "'", double17 == 1.04952177738101d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.getDomainUpperBound(Double.NaN);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6276037379948466d, 0.27855365220112865d);
        double double4 = fDistributionImpl2.getInitialDomain(0.6583620521480608d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0030883693754368224d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.1618137286458573 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.1618137286458573d) + "'", double4 == (-0.1618137286458573d));
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        double double15 = fDistributionImpl2.cumulativeProbability(0.5004087508678674d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.43276459841306814d);
        double double19 = fDistributionImpl2.cumulativeProbability((double) '#');
        double double21 = fDistributionImpl2.getDomainUpperBound(0.11821926384459756d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5189833010988237d + "'", double15 == 0.5189833010988237d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999504708134d + "'", double19 == 0.9999999504708134d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainUpperBound(0.04920183084648444d);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.05350873685544799d, Double.NaN);
        double double15 = fDistributionImpl2.getDomainUpperBound(1.2214738003873964E-5d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3210963486747651d);
        double double20 = fDistributionImpl2.cumulativeProbability((-0.35319435852748904d), 0.17637974128336592d);
        double double22 = fDistributionImpl2.getInitialDomain(0.1825231602525817d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.059278978129763016d + "'", double20 == 0.059278978129763016d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.19125358886515564d) + "'", double22 == (-0.19125358886515564d));
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.3895023980863656d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.cumulativeProbability(0.46758643441315834d, 0.3919491786229663d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5189833010988237d);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.cumulativeProbability(0.5993164688934242d, 0.10555964729310591d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (-1L));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.43276459841306814d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 100);
        double double10 = fDistributionImpl2.cumulativeProbability(0.9999999999915219d);
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.7583315357111738d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999995770263d + "'", double8 == 0.9999999995770263d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7557224019288303d + "'", double10 == 0.7557224019288303d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0192812158854847d + "'", double12 == 1.0192812158854847d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.43276459841306814d + "'", double13 == 0.43276459841306814d);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDomainUpperBound(0.0d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double17 = fDistributionImpl2.getInitialDomain(0.08793604972328362d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getInitialDomain(0.1822843294541756d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.9999984104468244d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 1);
        double double19 = fDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.13370602424775557d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6591065015250168d + "'", double15 == 0.6591065015250168d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6464662756085405d, (-0.47077968881994314d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.getDomainUpperBound(Double.NaN);
        double double17 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double19 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double21 = fDistributionImpl2.getDomainUpperBound(3.408167631624437E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = fDistributionImpl2.inverseCumulativeProbability(1.0204081632653061d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5220157123797441d, 0.05595719508517638d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.26166495153015507d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.03629268820197962d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11280448783580999d + "'", double4 == 0.11280448783580999d);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double6 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass9 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3197986111586397d + "'", double6 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (short) 10);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4595566142158559d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.007327898373003804d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
            double double18 = fDistributionImpl2.cumulativeProbability(0.9176064239260036d, 0.0d);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (-1L));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.43276459841306814d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-1.129032258064516d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound((double) (byte) 100);
        double double11 = fDistributionImpl2.getInitialDomain(0.5773773436195279d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.cumulativeProbability(0.4206811759669717d, 0.0721470484493668d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5993164688934242d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass17 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5993164688934242d + "'", double15 == 0.5993164688934242d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5993164688934242d + "'", double16 == 0.5993164688934242d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double15 = fDistributionImpl2.getDomainUpperBound(1.0606060606060606d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.47187845345795065d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100L);
        double double6 = fDistributionImpl2.getInitialDomain(0.2969240624175721d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.8026648265055725d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) '4');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain((-0.3667417109622608d));
        double double17 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double20 = fDistributionImpl2.getDomainUpperBound(0.5598475038519922d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) '4');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability(0.7103083879489903d);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double19 = fDistributionImpl2.cumulativeProbability(0.4664502910454298d, 0.4923052829221457d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.2255061186409303d);
        double double23 = fDistributionImpl2.cumulativeProbability(0.3895023980863656d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.44582356363844317d + "'", double15 == 0.44582356363844317d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.008036077048780232d + "'", double19 == 0.008036077048780232d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6584621695601948d + "'", double23 == 0.6584621695601948d);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        double double15 = fDistributionImpl2.cumulativeProbability(0.5004087508678674d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.43276459841306814d);
        double double19 = fDistributionImpl2.cumulativeProbability((double) '#');
        double double20 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double21 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.7681324865938718d);
        double double25 = fDistributionImpl2.getDomainUpperBound(0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5189833010988237d + "'", double15 == 0.5189833010988237d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999504708134d + "'", double19 == 0.9999999504708134d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.7976931348623157E308d + "'", double25 == 1.7976931348623157E308d);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double14 = fDistributionImpl2.cumulativeProbability(0.4664502910454298d);
        double double16 = fDistributionImpl2.getInitialDomain(0.9967719789495215d);
        double double18 = fDistributionImpl2.cumulativeProbability((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9967719789495215d);
        double double21 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double23 = fDistributionImpl2.inverseCumulativeProbability(7.444493761760151E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4898628835849175d + "'", double14 == 0.4898628835849175d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.25d + "'", double16 == 1.25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9999981726526794d + "'", double18 == 0.9999981726526794d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 9.131517924063271E-7d + "'", double23 == 9.131517924063271E-7d);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5093634057790148d);
        double double14 = fDistributionImpl2.getDomainLowerBound((double) 10L);
        double double16 = fDistributionImpl2.getInitialDomain(1.25d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.23587424144892077d);
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5093634057790148d + "'", double17 == 0.5093634057790148d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5093634057790148d + "'", double20 == 0.5093634057790148d);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.9999984104468244d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.06954427012843875d);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass9 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4906940248809481d + "'", double3 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999984104468244d + "'", double4 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4906940248809481d + "'", double5 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.06954427012843875d + "'", double8 == 0.06954427012843875d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.06965997645678441d, 0.6739693374503183d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.inverseCumulativeProbability(0.3919491786229663d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.5082607487781732 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.06965997645678441d + "'", double3 == 0.06965997645678441d);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.9999984104468244d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.07609892745584163d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4906940248809481d + "'", double3 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999984104468244d + "'", double4 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4906940248809481d + "'", double5 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999984104468244d + "'", double6 == 0.9999984104468244d);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.32386298675112735d, 0.755683952741227d);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        java.lang.Class<?> wildcardClass24 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        // The following exception was thrown during execution in test generation
        try {
            double double24 = fDistributionImpl2.cumulativeProbability(0.14869246204751185d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0606060606060606d);
        double double21 = fDistributionImpl2.cumulativeProbability((double) (byte) 10);
        double double23 = fDistributionImpl2.getDomainLowerBound(5.357258915695551E-11d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-1.6666671958040784d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.7681324865938718d + "'", double21 == 0.7681324865938718d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.cumulativeProbability(0.35149728096692545d);
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.013666728010437416d);
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.10426004742398015d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (-1L));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.43276459841306814d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 100);
        double double10 = fDistributionImpl2.cumulativeProbability(0.9999999999915219d);
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.7583315357111738d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainUpperBound(0.6221137160076774d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999995770263d + "'", double8 == 0.9999999995770263d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7557224019288303d + "'", double10 == 0.7557224019288303d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0192812158854847d + "'", double12 == 1.0192812158854847d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.43276459841306814d + "'", double13 == 0.43276459841306814d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound(0.5433539298660959d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.6584621695601948d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.794431337232113d, (double) 10);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.06965997645678441d);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.008771073413552499d, 0.6583620521480608d);
        double double4 = fDistributionImpl2.getInitialDomain(9.838320889492336E-7d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability((-0.3667417109622608d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.49071513905979386d) + "'", double4 == (-0.49071513905979386d));
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound(0.4860815252407045d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7835361335394757d, 0.3220459516792461d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        double double20 = fDistributionImpl2.getDomainLowerBound(52.0d);
        double double23 = fDistributionImpl2.cumulativeProbability((-0.2507734447545213d), 0.3903771725336764d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.35552458334754683d + "'", double23 == 0.35552458334754683d);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.9999999999873902d);
        double double10 = fDistributionImpl2.getInitialDomain(0.0d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.3197986111596346d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5658786927327883d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getInitialDomain(0.5996052325402953d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 100L);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainLowerBound(0.07209820539217125d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double15 = fDistributionImpl2.getDomainUpperBound((double) 0.0f);
        double double18 = fDistributionImpl2.cumulativeProbability(1.3991062373962743E-245d, 0.369679655722036d);
        double double20 = fDistributionImpl2.getDomainUpperBound(0.9898804402645663d);
        double double22 = fDistributionImpl2.getDomainLowerBound(0.7640246288297262d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.34777933225821744d + "'", double18 == 0.34777933225821744d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound((double) (byte) 100);
        double double11 = fDistributionImpl2.getInitialDomain(0.5773773436195279d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.6591065015250168d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.cumulativeProbability(0.509253301074358d, 0.26479899700216447d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5642254869194474d + "'", double13 == 0.5642254869194474d);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        double double25 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double27 = fDistributionImpl2.getInitialDomain(0.1114353339521007d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.25d + "'", double27 == 1.25d);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.NaN);
        double double21 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.06652843034939326d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.6037071022078223d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.4906940248809481d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.cumulativeProbability(0.4566514703525203d, 3.408167631624437E-4d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.6636531716106877d + "'", double5 == 1.6636531716106877d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.6636531716106877d + "'", double6 == 1.6636531716106877d);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (-1L));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.43276459841306814d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 100);
        double double10 = fDistributionImpl2.cumulativeProbability(0.9999999999915219d);
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.7583315357111738d);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999995770263d + "'", double8 == 0.9999999995770263d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7557224019288303d + "'", double10 == 0.7557224019288303d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0192812158854847d + "'", double12 == 1.0192812158854847d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5004087508678674d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.9967719789495215d);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 0L);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainLowerBound(0.023813722351143395d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.inverseCumulativeProbability(1.0606060606060606d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5004087508678674d + "'", double11 == 0.5004087508678674d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        double double31 = fDistributionImpl2.getInitialDomain(0.49838122445596006d);
        java.lang.Class<?> wildcardClass32 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.7976931348623157E308d + "'", double27 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.4898628835849175d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.04322441323500558d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.getInitialDomain((-1.0d));
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0210526315789474d + "'", double6 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.6037071022078223d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.09487388796007479d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainLowerBound(0.9898804402645663d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100L);
        double double18 = fDistributionImpl2.getDomainUpperBound(0.3951424744541511d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability(0.4664502910454298d);
        double double11 = fDistributionImpl2.getInitialDomain(0.05595719508517638d);
        double double13 = fDistributionImpl2.getDomainLowerBound(0.7583315357111738d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.9205507147766241d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.4898628835849175d + "'", double9 == 0.4898628835849175d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8609681162053344d, 10.0d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(7.444493761760151E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.cumulativeProbability(0.029360195877475227d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3220459516792461d);
        double double11 = fDistributionImpl2.cumulativeProbability(0.19788692492646354d, (double) '4');
        double double13 = fDistributionImpl2.getDomainLowerBound(0.43906017126509644d);
        double double15 = fDistributionImpl2.getInitialDomain(0.5220157123797441d);
        double double17 = fDistributionImpl2.cumulativeProbability(0.7605286207286406d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        double double24 = fDistributionImpl2.getInitialDomain(0.26479899700216447d);
        double double26 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double28 = fDistributionImpl2.getInitialDomain(52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3220459516792461d + "'", double22 == 0.3220459516792461d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.25d + "'", double24 == 1.25d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.25d + "'", double28 == 1.25d);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability((double) 100);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.680275844215834d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4479640982107486d);
        double double19 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double21 = fDistributionImpl2.getDomainLowerBound(2.3610123714643496E-5d);
        double double22 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + Double.POSITIVE_INFINITY + "'", double19 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.4479640982107486d + "'", double22 == 0.4479640982107486d);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.cumulativeProbability((double) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.49838122445596006d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.cumulativeProbability(0.39134009223677896d, 0.06652843034939326d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound((double) (byte) 100);
        double double11 = fDistributionImpl2.getInitialDomain(0.5773773436195279d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.6591065015250168d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5642254869194474d + "'", double13 == 0.5642254869194474d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.NaN);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.06401548478113292d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.06401548478113292d + "'", double17 == 0.06401548478113292d);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getDomainUpperBound(0.6421003339612105d);
        double double15 = fDistributionImpl2.getInitialDomain(0.10493558659304991d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9188056009222301d, 0.9088759711888426d);
        double double4 = fDistributionImpl2.getInitialDomain(0.35760002498487775d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.8329721894028081d) + "'", double4 == (-0.8329721894028081d));
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, (double) (byte) 1);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double17 = fDistributionImpl2.cumulativeProbability(0.5626720221012385d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.40971224866107453d + "'", double17 == 0.40971224866107453d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getInitialDomain(0.6758256576139563d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass12 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) ' ', 0.794431337232113d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.06954427012843875d);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.6046935761651037d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.6589061351369964d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getInitialDomain(0.031324798049849986d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(8.292738272749505E-6d);
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.cumulativeProbability(0.41580698164526403d, 0.04199995021237534d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) '4');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability(0.7103083879489903d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.680275844215834d);
        double double19 = fDistributionImpl2.getDomainLowerBound(0.006071986281712238d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.26479899700216447d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.44582356363844317d + "'", double15 == 0.44582356363844317d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (short) 100);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.cumulativeProbability(0.32764978063013356d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08380094507984907d + "'", double10 == 0.08380094507984907d);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double9 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.6553251431808038d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5093634057790148d + "'", double9 == 0.5093634057790148d);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.cumulativeProbability((-0.3504236660423056d));
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, 0.6559581390100542d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5004087508678674d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5949357068078883d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5949357068078883d + "'", double8 == 0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5949357068078883d + "'", double11 == 0.5949357068078883d);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.35149728096692545d, 0.07212597439971892d);
        double double4 = fDistributionImpl2.getDomainLowerBound((-0.9999999999999996d));
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35149728096692545d + "'", double5 == 0.35149728096692545d);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) '4');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability(0.7103083879489903d);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainLowerBound(0.5220157123797441d);
        double double20 = fDistributionImpl2.cumulativeProbability(0.680275844215834d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3981365332138079d);
        double double25 = fDistributionImpl2.cumulativeProbability((double) (-1L), 0.30255252296354923d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5949357068078883d);
        double double29 = fDistributionImpl2.getDomainUpperBound(0.04366678567633304d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.44582356363844317d + "'", double15 == 0.44582356363844317d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.43906017126509644d + "'", double20 == 0.43906017126509644d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.516893766967757d + "'", double25 == 0.516893766967757d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.7976931348623157E308d + "'", double29 == 1.7976931348623157E308d);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.07212597439971892d, (-0.11015601941480264d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1);
        double double13 = fDistributionImpl2.getInitialDomain(0.05595719508517638d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.9999999999915219d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistributionImpl2.inverseCumulativeProbability(0.345456265936167d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.31979861116167463d + "'", double9 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.3197986111596346d + "'", double15 == 0.3197986111596346d);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain(0.6583483451931957d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3895023980863656d);
        double double18 = fDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double20 = fDistributionImpl2.getDomainUpperBound(0.5949357068038229d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9999763973332203d + "'", double18 == 0.9999763973332203d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound((double) (byte) 100);
        double double11 = fDistributionImpl2.getInitialDomain(0.5773773436195279d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.16510007084584888d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.24041303946096454d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3069371622276223d + "'", double13 == 0.3069371622276223d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 1L, 2.097152841112099E-5d);
        double double4 = fDistributionImpl2.getInitialDomain(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0485874157964405E-5d) + "'", double4 == (-1.0485874157964405E-5d));
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8284628704001276d, 0.9999999999915219d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.49838122445596006d, 0.7835361335394757d);
        java.lang.Class<?> wildcardClass6 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.06545795869712367d + "'", double5 == 0.06545795869712367d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double9 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double11 = fDistributionImpl2.getDomainUpperBound(0.6591065015250168d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.inverseCumulativeProbability(0.9967719789495215d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getInitialDomain(0.5996052325402953d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.cumulativeProbability(0.30255252296354923d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.3826603340484837E-4d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.73376879544401d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0721470484493668d + "'", double12 == 0.0721470484493668d);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double4 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double7 = fDistributionImpl2.cumulativeProbability(0.44582356363844317d, 1.25d);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.23587424144892077d + "'", double7 == 0.23587424144892077d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.02723373766299686d, 0.6046935761651037d);
        double double4 = fDistributionImpl2.getDomainLowerBound(Double.NaN);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.02723373766299686d + "'", double5 == 0.02723373766299686d);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.9999999999915219d);
        double double19 = fDistributionImpl2.getDomainLowerBound(0.11684554078643927d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9898419264720365d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1228.3664773101177d + "'", double17 == 1228.3664773101177d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double19 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double21 = fDistributionImpl2.inverseCumulativeProbability(7.444493761760151E-4d);
        double double23 = fDistributionImpl2.cumulativeProbability(0.001227638541478935d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 9.838320889492336E-7d + "'", double21 == 9.838320889492336E-7d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.027260769360201945d + "'", double23 == 0.027260769360201945d);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.008036077048780232d, 0.73376879544401d);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double14 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.009486956849729777d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.029360195877475227d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.09487388796007479d, 0.4906940248809481d);
        double double14 = fDistributionImpl2.inverseCumulativeProbability(0.06652843034939326d);
        java.lang.Class<?> wildcardClass15 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.26479899700216447d + "'", double12 == 0.26479899700216447d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.007327898373003804d + "'", double14 == 0.007327898373003804d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.6758256576139563d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.inverseCumulativeProbability((-0.2624723670828401d));
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
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) 1L);
        double double15 = fDistributionImpl2.cumulativeProbability(0.22088345872093793d);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.3587171005858765d + "'", double15 == 0.3587171005858765d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass8 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6583620521480608d, 0.23587424144892077d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.3318389831356192d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.24936183798340816d + "'", double4 == 0.24936183798340816d);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.1801856291181903d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.5220157123797441d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 0L, 0.31979861116167463d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.999037593690436d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.11684554078643927d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.inverseCumulativeProbability((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1201684622410103d + "'", double4 == 0.1201684622410103d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08793604972328362d + "'", double7 == 0.08793604972328362d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.09901319167563201d) + "'", double9 == (-0.09901319167563201d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.25d);
        double double10 = fDistributionImpl2.getInitialDomain(0.33409440091453685d);
        double double12 = fDistributionImpl2.getDomainLowerBound(2.097152841112099E-5d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.6666666666666667d) + "'", double10 == (-1.6666666666666667d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5220157123797441d + "'", double13 == 0.5220157123797441d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.25d + "'", double14 == 1.25d);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.6065454203287214d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0972868492113788d + "'", double13 == 1.0972868492113788d);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0606060606060606d);
        double double10 = fDistributionImpl2.getInitialDomain((double) 0);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(0.018345231285955332d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.129032258064516d) + "'", double10 == (-1.129032258064516d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0606060606060606d + "'", double11 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.129032258064516d) + "'", double13 == (-1.129032258064516d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0606060606060606d + "'", double14 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9898804402645663d);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.23587424144892077d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4009893970905954d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999958149977d);
        double double17 = fDistributionImpl2.getInitialDomain(0.06965997645678441d);
        java.lang.Class<?> wildcardClass18 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.2507734447545213d) + "'", double17 == (-0.2507734447545213d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double11 = fDistributionImpl2.cumulativeProbability(10.0d, 10.0d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double16 = fDistributionImpl2.cumulativeProbability(0.35149728096692545d);
        double double18 = fDistributionImpl2.getDomainUpperBound(0.05350873685544799d);
        double double20 = fDistributionImpl2.cumulativeProbability(0.20645201597141383d);
        double double21 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.09487388796007479d + "'", double16 == 0.09487388796007479d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.030119091070951756d + "'", double20 == 0.030119091070951756d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '#');
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainLowerBound(0.3951424744541511d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass17 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.794431337232113d, 0.049950031800927046d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.cumulativeProbability(0.029360195877475227d, 0.05468886506853487d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.794431337232113d + "'", double3 == 0.794431337232113d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.010043112374941786d + "'", double6 == 0.010043112374941786d);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.41406926397160465d);
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.7148233587794464d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.275072409157071d + "'", double10 == 1.275072409157071d);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.5773773436195279d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.43906017126509644d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999984104468244d);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.05595719508517638d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.05595719508517638d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.46278740261225126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4906940248809481d + "'", double5 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4906940248809481d + "'", double6 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5162782139719305d + "'", double14 == 0.5162782139719305d);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 100L);
        double double16 = fDistributionImpl2.cumulativeProbability(0.3895023980863656d, 0.9293804578921561d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.19506275762925057d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5026637197270847d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.189836249017317d + "'", double16 == 0.189836249017317d);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.4892284600732909d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1L);
        double double7 = fDistributionImpl2.getDomainUpperBound(0.5189833010988237d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.03896274758465178d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.03896274758465178d + "'", double10 == 0.03896274758465178d);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        double double15 = fDistributionImpl2.cumulativeProbability(0.5004087508678674d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.43276459841306814d);
        double double19 = fDistributionImpl2.cumulativeProbability((double) '#');
        double double22 = fDistributionImpl2.cumulativeProbability(0.5957283306792327d, 32.0d);
        double double24 = fDistributionImpl2.inverseCumulativeProbability(0.06965997645678441d);
        double double26 = fDistributionImpl2.cumulativeProbability(0.26166495153015507d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5189833010988237d + "'", double15 == 0.5189833010988237d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999504708134d + "'", double19 == 0.9999999504708134d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.44208869850608057d + "'", double22 == 0.44208869850608057d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.007681534962120051d + "'", double24 == 0.007681534962120051d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.38985887237520006d + "'", double26 == 0.38985887237520006d);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, (double) (byte) 1);
        double double17 = fDistributionImpl2.cumulativeProbability(0.0d, 1.0606060606060606d);
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5093634057790148d + "'", double17 == 0.5093634057790148d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        double double15 = fDistributionImpl2.cumulativeProbability(0.5004087508678674d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.43276459841306814d);
        double double19 = fDistributionImpl2.getDomainUpperBound(0.5093634057790148d);
        double double21 = fDistributionImpl2.getDomainLowerBound(0.013666728010437416d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5189833010988237d + "'", double15 == 0.5189833010988237d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound((double) (byte) -1);
        double double9 = fDistributionImpl2.getInitialDomain(0.5773773436195279d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainLowerBound(1.0074491241240935E-9d);
        double double19 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3197986111586397d, 35.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.17235021937116024d);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(97.0d);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.41580691019689836d + "'", double12 == 0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.41406926397160465d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainLowerBound(0.3168052840864677d);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistributionImpl2.inverseCumulativeProbability(0.8154639584090504d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.23076288400994444d);
        double double12 = fDistributionImpl2.getDomainLowerBound(1.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999915219d);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.9999999999915219d);
        java.lang.Class<?> wildcardClass17 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.06401548478113292d + "'", double10 == 0.06401548478113292d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.2500001488198675d);
        double double17 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.06954427012843875d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getInitialDomain(0.04818702750924919d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0606060606060606d);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.008771073413552499d, 0.6583620521480608d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.011912325204771257d, 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.018735014698028074d + "'", double5 == 0.018735014698028074d);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double10 = fDistributionImpl2.getDomainLowerBound(0.41406926397160465d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.08419329170293993d);
        double double14 = fDistributionImpl2.getDomainUpperBound(9.131517924063271E-7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, 0.1822843294541756d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain((double) 100);
        double double15 = fDistributionImpl2.getInitialDomain((double) (-1));
        double double17 = fDistributionImpl2.getDomainUpperBound((double) (short) 1);
        double double19 = fDistributionImpl2.getInitialDomain(0.0010665602861507125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass10 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getInitialDomain(0.6037071022078223d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getInitialDomain(0.43467479348140525d);
        double double12 = fDistributionImpl2.cumulativeProbability((-0.47077968881994314d), 0.6589061351369964d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.10555964729310591d);
        java.lang.Class<?> wildcardClass15 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.25d + "'", double9 == 1.25d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5641578772655828d + "'", double12 == 0.5641578772655828d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4923052829221457d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.06954427012843875d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistributionImpl2.inverseCumulativeProbability(0.0010665602861507125d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.3318389831356192d + "'", double15 == 0.3318389831356192d);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6276037379948466d, 0.27855365220112865d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability((-1.53472685559007d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 10);
        double double9 = fDistributionImpl2.getInitialDomain(0.43276459841306814d);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.043642094005512666d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.25d + "'", double9 == 1.25d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.32091645181623313d + "'", double11 == 0.32091645181623313d);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9961307247459887d);
        java.lang.Class<?> wildcardClass10 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9999999999873902d, 0.1801856291181903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.27687764751802335d);
        double double7 = fDistributionImpl2.cumulativeProbability(0.0010722599132668223d, 0.35149728096692545d);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.19845142031994614d + "'", double7 == 0.19845142031994614d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.1801856291181903d + "'", double8 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.27687764751802335d + "'", double9 == 0.27687764751802335d);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 100);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass9 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.17815841044398562d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 1.0606060606060606d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.7246966031342408d, 0.8485385657705871d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.037026969498757056d + "'", double5 == 0.037026969498757056d);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainLowerBound(0.9999999995770263d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.39151156165974016d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11325382736064116d + "'", double12 == 0.11325382736064116d);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 100);
        double double18 = fDistributionImpl2.inverseCumulativeProbability(0.2969240624175721d);
        double double20 = fDistributionImpl2.getDomainLowerBound(9.838320889492336E-7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.1461266361314345d + "'", double18 == 0.1461266361314345d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.19845142031994614d);
        double double11 = fDistributionImpl2.getDomainLowerBound((-0.2624723670828401d));
        double double13 = fDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.08793604972328362d);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.43276459841306814d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        java.lang.Class<?> wildcardClass22 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainUpperBound(0.3895024214486992d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4892284600732909d);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.7103085841908984d);
        java.lang.Class<?> wildcardClass17 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6640218712845615d, 0.5709557931882584d);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (byte) 0);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double14 = fDistributionImpl2.cumulativeProbability(0.4664502910454298d);
        double double16 = fDistributionImpl2.getInitialDomain(0.9967719789495215d);
        double double18 = fDistributionImpl2.getInitialDomain(0.5004087508678674d);
        double double20 = fDistributionImpl2.getDomainLowerBound((double) (-1L));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4898628835849175d + "'", double14 == 0.4898628835849175d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.25d + "'", double16 == 1.25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.25d + "'", double18 == 1.25d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.cumulativeProbability(0.9365489651388929d, 0.4566514703525203d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double14 = fDistributionImpl2.cumulativeProbability(0.4664502910454298d);
        double double16 = fDistributionImpl2.getInitialDomain(0.9967719789495215d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double20 = fDistributionImpl2.cumulativeProbability(0.1201684622410103d, 0.9999999999999998d);
        double double22 = fDistributionImpl2.cumulativeProbability(0.030119091070951756d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4898628835849175d + "'", double14 == 0.4898628835849175d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.25d + "'", double16 == 1.25d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.3951424744541511d + "'", double20 == 0.3951424744541511d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.13431696021741657d + "'", double22 == 0.13431696021741657d);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) '4');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain((-0.3667417109622608d));
        double double17 = fDistributionImpl2.getInitialDomain(0.3040818357099405d);
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double19 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound((-1.0d));
        double double10 = fDistributionImpl2.getDomainUpperBound(0.4534659472302877d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.2639273029648429d);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound(0.23076288400994444d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3220459516792461d);
        double double12 = fDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double14 = fDistributionImpl2.getDomainUpperBound(7.444493761760151E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.inverseCumulativeProbability(0.4479640982107486d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.19192775392242717 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.cumulativeProbability(0.5957283306792327d);
        java.lang.Class<?> wildcardClass8 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.541935949229157d + "'", double7 == 0.541935949229157d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.10980244711968297d, 33.20158064706674d);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.06545795869712367d, 2.0606060606060606d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.7557224019288303d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.3129896822265393d), 0.9999999999999998d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7148233587794464d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.42787428821980134d), 0.476758784114401d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) 1);
        double double14 = fDistributionImpl2.cumulativeProbability(0.755683952741227d);
        double double16 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double18 = fDistributionImpl2.getInitialDomain(0.05595719508517638d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5949357068038229d + "'", double14 == 0.5949357068038229d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.25d + "'", double16 == 1.25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.25d + "'", double18 == 1.25d);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.999037593690436d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.345456265936167d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) '4');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability(0.028005760216863906d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.9466229816367563d);
        double double19 = fDistributionImpl2.getDomainLowerBound(0.5366064842062321d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.10555964729310591d + "'", double15 == 0.10555964729310591d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4633919262405889d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.43278329179761166d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.29231441474827646d + "'", double10 == 0.29231441474827646d);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (-1L));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.43276459841306814d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 100);
        double double11 = fDistributionImpl2.cumulativeProbability(0.41580691019689836d, 1.2109603464415848d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.5775256913939883d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999995770263d + "'", double8 == 0.9999999995770263d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.14335493966332769d + "'", double11 == 0.14335493966332769d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability((double) 100);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.680275844215834d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5993164688934242d);
        double double16 = fDistributionImpl2.getDomainLowerBound((-0.1048724177104202d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, (double) (byte) 1);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L), 0.5004087508678674d);
        double double19 = fDistributionImpl2.getDomainLowerBound((-1.0d));
        double double20 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double21 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4664502910454298d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.17235021937116024d);
        double double13 = fDistributionImpl2.getInitialDomain(0.44582356363844317d);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getInitialDomain(0.5220157123797441d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        double double11 = fDistributionImpl2.getDomainUpperBound(2.0606060606060606d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1);
        double double13 = fDistributionImpl2.getInitialDomain(0.05595719508517638d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.9999999958149977d, (double) 1);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.31979861116167463d + "'", double9 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0074491241240935E-9d + "'", double16 == 1.0074491241240935E-9d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.5004087508678674d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5004087508678674d + "'", double4 == 0.5004087508678674d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0204081632653061d, 0.4546995573427486d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.4633919262405889d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0010722599132668223d);
        double double8 = fDistributionImpl2.getDomainLowerBound((-0.2507734447545213d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.29474933881663606d + "'", double4 == 0.29474933881663606d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        double double6 = fDistributionImpl2.getInitialDomain(0.010367711397661706d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.1048724177104202d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0204081632653061d + "'", double6 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 10, 0.9898804402645663d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.41580691019689836d, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistributionImpl2.cumulativeProbability(0.6554278909379809d, 0.20196314831799295d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6037071022078223d + "'", double5 == 0.6037071022078223d);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainLowerBound((-0.6073583604658008d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(5.80168652720234E-4d, 0.73376879544401d);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        double double10 = fDistributionImpl2.cumulativeProbability(7.444493761760151E-4d);
        double double12 = fDistributionImpl2.getInitialDomain(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.14038325387155903d);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.8154639584090504d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7723000623308832d + "'", double10 == 0.7723000623308832d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0204081632653061d + "'", double12 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.05595719508517638d, 0.09487388796007479d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.19845142031994614d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.5193402098261183d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.09487388796007479d + "'", double9 == 0.09487388796007479d);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9365489651388929d, 0.336242355358862d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.336242355358862d + "'", double3 == 0.336242355358862d);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, 0.3919491786229663d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 10);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02887716934657425d + "'", double11 == 0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) '4');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double17 = fDistributionImpl2.getDomainLowerBound((double) (short) 1);
        double double19 = fDistributionImpl2.getInitialDomain(0.3032299156718087d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.6474232392991752d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, (double) (byte) 1);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.2207617383499606d);
        double double19 = fDistributionImpl2.getInitialDomain((-0.19125358886515564d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 100);
        double double18 = fDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double20 = fDistributionImpl2.getDomainLowerBound(0.6289333745278087d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1);
        double double20 = fDistributionImpl2.getDomainUpperBound(4.4355799878524796E-5d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4009893970905954d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double11 = fDistributionImpl2.cumulativeProbability(10.0d, 10.0d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.4546995573427486d);
        double double19 = fDistributionImpl2.cumulativeProbability((double) 0L, 1.334173577483257E-5d);
        double double21 = fDistributionImpl2.getInitialDomain((-0.9799636396743291d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.481806365604883E-142d + "'", double19 == 6.481806365604883E-142d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double13 = fDistributionImpl2.cumulativeProbability(1.2109603464415848d, (double) (short) 100);
        double double15 = fDistributionImpl2.getInitialDomain((-0.9999999999747803d));
        double double17 = fDistributionImpl2.inverseCumulativeProbability(2.097152841112099E-5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2969240624175721d + "'", double13 == 0.2969240624175721d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1);
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.44881727956051176d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.0030883693754368224d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0204081632653061d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.06401548478113292d);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability((double) (byte) 10);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7583315357111738d + "'", double9 == 0.7583315357111738d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 1.0f, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double17 = fDistributionImpl2.cumulativeProbability(0.9898804402645663d, Double.NaN);
        double double19 = fDistributionImpl2.inverseCumulativeProbability(0.794431337232113d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.19845142031994614d);
        double double24 = fDistributionImpl2.cumulativeProbability((double) (byte) 0, 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.6636531716106877d + "'", double19 == 1.6636531716106877d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.999992954379557d + "'", double24 == 0.999992954379557d);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain((double) 100);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 1);
        double double17 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability((double) (short) 10);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double19 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9967719789495215d + "'", double15 == 0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.42787428821980134d), 0.9898419264720365d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound(0.45447932157420906d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3197986111586397d + "'", double12 == 0.3197986111586397d);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9898804402645663d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111596346d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.3197986111596346d + "'", double9 == 0.3197986111596346d);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.cumulativeProbability((-1.0d));
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.inverseCumulativeProbability(0.5004087508678674d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass17 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.4906940248809481d + "'", double15 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (short) 10);
        double double9 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double11 = fDistributionImpl2.cumulativeProbability((double) (byte) 0);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.008610287160087353d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.43276459841306814d + "'", double7 == 0.43276459841306814d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.9999999999747803d) + "'", double9 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999873902d + "'", double12 == 0.9999999999873902d);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass8 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) '4');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability(0.7103083879489903d);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainLowerBound(0.5220157123797441d);
        double double20 = fDistributionImpl2.cumulativeProbability(0.680275844215834d);
        double double22 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        double double23 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double24 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.44582356363844317d + "'", double15 == 0.44582356363844317d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.43906017126509644d + "'", double20 == 0.43906017126509644d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.32764978063013356d + "'", double22 == 0.32764978063013356d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.002393864708003338d, 1.2500001488198675d);
        double double4 = fDistributionImpl2.getInitialDomain(2.5491771371666263d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-1.0416666666666667d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.6666671958040784d) + "'", double4 == (-1.6666671958040784d));
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) 1);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability(0.6584621695601948d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5640080083627789d + "'", double15 == 0.5640080083627789d);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double16 = fDistributionImpl2.getDomainUpperBound(0.6591065015250168d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.05595719508517638d, 0.09487388796007479d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.19845142031994614d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5326685129511843d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass8 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5326685129511843d + "'", double7 == 0.5326685129511843d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5949357068078883d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.32764978063013356d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5949357068078883d + "'", double8 == 0.5949357068078883d);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.4915427677698697d), (-0.17434575632550214d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.3197986111596346d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.49838122445596006d);
        double double14 = fDistributionImpl2.getInitialDomain(0.9967719789495215d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.41406926397160465d);
        double double18 = fDistributionImpl2.getInitialDomain(2.097152841112099E-5d);
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (short) 10);
        double double10 = fDistributionImpl2.cumulativeProbability(0.1825231602525817d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.612370398300838d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.00638827009754162d + "'", double10 == 0.00638827009754162d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain(0.008036077048780232d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.2589160113618819d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.345456265936167d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0666666666666667d + "'", double8 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.inverseCumulativeProbability(0.29474933881663606d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double14 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.17235021937116024d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double19 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double21 = fDistributionImpl2.getDomainLowerBound((-0.33369676647384544d));
        double double23 = fDistributionImpl2.getDomainLowerBound(0.5117512873843995d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.21109370629708515d);
        double double27 = fDistributionImpl2.getDomainUpperBound(1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.7976931348623157E308d + "'", double27 == 1.7976931348623157E308d);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0027198323247858195d);
        double double10 = fDistributionImpl2.getInitialDomain(0.41580698164526403d);
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.001361768052777312d) + "'", double10 == (-0.001361768052777312d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDomainUpperBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.inverseCumulativeProbability(0.8195918816395871d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
        double double21 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.28159241378169547d);
        java.lang.Class<?> wildcardClass24 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9967719789495215d + "'", double17 == 0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5010660068730725d, 0.6553251431808038d);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.cumulativeProbability(32.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double4 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999914339d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999999915219d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.inverseCumulativeProbability(0.04860877630608049d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.9999999999828678 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.2241878759327988E-4d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        double double15 = fDistributionImpl2.cumulativeProbability(0.5004087508678674d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.43276459841306814d);
        double double19 = fDistributionImpl2.cumulativeProbability((double) '#');
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double22 = fDistributionImpl2.getDomainUpperBound(0.5626720221012385d);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = fDistributionImpl2.cumulativeProbability(0.17235021937116024d, 1.3991062373962743E-245d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5189833010988237d + "'", double15 == 0.5189833010988237d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999504708134d + "'", double19 == 0.9999999504708134d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7976931348623157E308d + "'", double22 == 1.7976931348623157E308d);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain(0.5626720221012385d);
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5093634057790148d);
        double double14 = fDistributionImpl2.getDomainLowerBound((double) 10L);
        double double16 = fDistributionImpl2.getInitialDomain(1.25d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.23587424144892077d);
        double double22 = fDistributionImpl2.cumulativeProbability(0.0d, 0.0d);
        double double24 = fDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5093634057790148d + "'", double17 == 0.5093634057790148d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9898804402645663d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.14038325387155903d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.cumulativeProbability(0.19506275762925057d, 1.334173577483257E-5d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4566514703525203d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability(0.8284628704001276d);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6158682675681332d + "'", double13 == 0.6158682675681332d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.4906940248809481d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5366657182124845d, 0.4936605546990172d);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4923052829221457d);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getDomainUpperBound(0.6553251431808038d);
        java.lang.Class<?> wildcardClass17 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4923052829221457d + "'", double14 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5773773436195279d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7103083879489903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.03805921542661744d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(5.696025203496104E-6d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability(0.049950031800927046d);
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0011893394730556636d + "'", double11 == 0.0011893394730556636d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.9999984104468244d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5433539298660959d);
        double double21 = fDistributionImpl2.getInitialDomain(0.41406926397160465d);
        double double22 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double24 = fDistributionImpl2.getDomainLowerBound(0.7583315357111738d);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = fDistributionImpl2.cumulativeProbability(0.00638827009754162d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6591065015250168d + "'", double15 == 0.6591065015250168d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.5433539298660959d + "'", double22 == 0.5433539298660959d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.34211877158633835d, 0.04322441323500558d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5117512873843995d);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double15 = fDistributionImpl2.cumulativeProbability(52.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3220459516792461d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9999999238243996d + "'", double15 == 0.9999999238243996d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.cumulativeProbability(0.5292825574398908d, 4.716813751774474E-6d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (short) 10);
        double double9 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double11 = fDistributionImpl2.cumulativeProbability((double) (byte) 0);
        double double13 = fDistributionImpl2.inverseCumulativeProbability((double) 0L);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.43276459841306814d + "'", double7 == 0.43276459841306814d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.9999999999747803d) + "'", double9 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.25d);
        double double12 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainLowerBound(8.292738272749505E-6d);
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, (double) (byte) 1);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L), 0.5004087508678674d);
        double double19 = fDistributionImpl2.getDomainLowerBound((-1.0d));
        double double21 = fDistributionImpl2.getDomainLowerBound(0.9999999999999998d);
        java.lang.Class<?> wildcardClass22 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0606060606060606d);
        double double21 = fDistributionImpl2.cumulativeProbability((double) (byte) 10);
        double double23 = fDistributionImpl2.getDomainLowerBound(5.357258915695551E-11d);
        double double25 = fDistributionImpl2.cumulativeProbability(7.396970722943259E-7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.7681324865938718d + "'", double21 == 0.7681324865938718d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.532161592670845E-117d + "'", double25 == 4.532161592670845E-117d);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.NaN);
        double double21 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double22 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass23 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.cumulativeProbability(0.09487388796007479d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.008771073413552499d + "'", double6 == 0.008771073413552499d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9205507147766241d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.cumulativeProbability(10.0d, 0.6464662756085405d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability((double) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.009150552718303446d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, 1.25d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5093634057790148d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability(0.0d, 0.018345231285955332d);
        double double18 = fDistributionImpl2.getDomainUpperBound(0.26166495153015507d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5093634057790148d + "'", double13 == 0.5093634057790148d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23076288400994444d + "'", double16 == 0.23076288400994444d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double11 = fDistributionImpl2.getInitialDomain(0.9999999999999998d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.33364776310664174d);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.04818702750924919d);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.42370716420032145d + "'", double13 == 0.42370716420032145d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5949357068078883d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.cumulativeProbability(0.025789138102653757d);
        double double12 = fDistributionImpl2.getInitialDomain(0.3895023980863656d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5949357068078883d + "'", double8 == 0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.21109370629708515d + "'", double10 == 0.21109370629708515d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.9217548157472832d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7729700281146208d + "'", double10 == 0.7729700281146208d);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(2.1694881938782906d, 1.25d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double11 = fDistributionImpl2.cumulativeProbability(10.0d, 10.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6591065015250168d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.004394700866783798d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3197986111586397d, 35.0d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100.0f);
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.491780299474472d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3197986111586397d + "'", double3 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3197986111586397d + "'", double6 == 0.3197986111586397d);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double15 = fDistributionImpl2.getDomainUpperBound(1.0606060606060606d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistributionImpl2.inverseCumulativeProbability(0.02723373766299686d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.8284628704001276d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999999915219d);
        double double12 = fDistributionImpl2.getInitialDomain(0.33096804704038296d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2109603464415848d + "'", double6 == 1.2109603464415848d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0204081632653061d + "'", double12 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.25d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.08793604972328362d);
        double double17 = fDistributionImpl2.getInitialDomain(0.7605286207286406d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.19151374780859048d + "'", double15 == 0.19151374780859048d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.6666666666666667d) + "'", double17 == (-1.6666666666666667d));
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.4915427677698697d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.999037593690436d, 0.189836249017317d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.5949357068038229d);
        double double6 = fDistributionImpl2.getDomainLowerBound((-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9898804402645663d, 0.2969240624175721d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(0.27687764751802335d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.17434575632550214 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(35.0d, 0.07212597439971892d);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (short) 10);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.3919491786229663d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.836989559568376d + "'", double11 == 0.836989559568376d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.1801856291181903d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double10 = fDistributionImpl2.getInitialDomain(0.5093634057790148d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.6046935761651037d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.14038325387155903d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.20196314831799295d + "'", double12 == 0.20196314831799295d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        double double6 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.345456265936167d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5004087508678674d + "'", double6 == 0.5004087508678674d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.6591065015250168d);
        double double19 = fDistributionImpl2.getInitialDomain(9.838320889492336E-7d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.38985887237520006d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9322888260560721d + "'", double17 == 0.9322888260560721d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0606060606060606d + "'", double19 == 1.0606060606060606d);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.9999984104468244d);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.26479899700216447d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double20 = fDistributionImpl2.getDomainLowerBound(1.2622342631866731E-22d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6591065015250168d + "'", double15 == 0.6591065015250168d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        // The following exception was thrown during execution in test generation
        try {
            double double23 = fDistributionImpl2.inverseCumulativeProbability(0.32091645181623313d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.129032258064516 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(100.0d);
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        double double10 = fDistributionImpl2.cumulativeProbability(7.444493761760151E-4d);
        double double12 = fDistributionImpl2.getInitialDomain(0.0d);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7723000623308832d + "'", double10 == 0.7723000623308832d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0204081632653061d + "'", double12 == 1.0204081632653061d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.4333769026183856d), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        double double20 = fDistributionImpl2.getDomainLowerBound(0.8485385657705871d);
        double double22 = fDistributionImpl2.getDomainLowerBound(0.33364776310664174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (short) 0);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(7.396970722943259E-7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(0.1825231602525817d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.31979861116167463d);
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.5433539298660959d);
        double double15 = fDistributionImpl2.getInitialDomain(0.49838122445596006d);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1801856291181903d + "'", double11 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5996052325396897d + "'", double13 == 0.5996052325396897d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double11 = fDistributionImpl2.cumulativeProbability(10.0d, 10.0d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.18506771891995114d);
        double double18 = fDistributionImpl2.getDomainLowerBound(0.3168052840864677d);
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3197986111596346d, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.004569416631646944d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(0.9999999999873902d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.9999999999747803 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.8284628704001276d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2109603464415848d + "'", double6 == 1.2109603464415848d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8585643081732904d, 0.43906017126509644d);
        double double5 = fDistributionImpl2.cumulativeProbability(5.357258915695551E-11d, 0.9999999999914339d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.39602761100391914d + "'", double5 == 0.39602761100391914d);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.5773773436195279d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.43906017126509644d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.3895023980863656d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.6591068676979391d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.43467479348140525d + "'", double6 == 0.43467479348140525d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4855996867118336d + "'", double8 == 0.4855996867118336d);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistributionImpl2.cumulativeProbability(1.25d, 0.7103083879489903d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0606060606060606d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.755683952741227d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.inverseCumulativeProbability(1.8125673702109506E-6d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.6073086933227279 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (byte) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5366657182124845d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.08015071710935137d, 0.9999999995770263d);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.0d);
        double double18 = fDistributionImpl2.getDomainLowerBound(0.39134009223677896d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.06811040554474385d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5366657182124845d + "'", double11 == 0.5366657182124845d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2671687285166097d + "'", double14 == 0.2671687285166097d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.inverseCumulativeProbability(0.10298412615657737d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5949357068078883d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        double double12 = fDistributionImpl2.cumulativeProbability(1.2500001488198675d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.cumulativeProbability(0.3306859681104356d, 0.04322441323500558d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5949357068078883d + "'", double8 == 0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.7640246288297262d + "'", double12 == 0.7640246288297262d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.cumulativeProbability(0.08015071710935137d, 0.02838644361959202d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getInitialDomain(0.07908924131400807d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass18 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass15 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.29474933881663606d, 0.3951424744541511d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.18506771891995114d);
        double double6 = fDistributionImpl2.cumulativeProbability((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4419425715309202d + "'", double4 == 0.4419425715309202d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7036870834181062d + "'", double6 == 0.7036870834181062d);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8485385657705871d, 0.7835361335394757d);
        double double4 = fDistributionImpl2.getInitialDomain(0.8485385657705871d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.6441096650238254d) + "'", double4 == (-0.6441096650238254d));
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.12496431835916927d, (double) (byte) 100);
        double double5 = fDistributionImpl2.cumulativeProbability(0.10609022031676985d, 0.8585643081732904d);
        double double7 = fDistributionImpl2.cumulativeProbability(1.275072409157071d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.10298412615657737d + "'", double5 == 0.10298412615657737d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8778181256181357d + "'", double7 == 0.8778181256181357d);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 10.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.1801856291181903d);
        double double18 = fDistributionImpl2.cumulativeProbability(0.008610287160087353d, 0.680275844215834d);
        double double20 = fDistributionImpl2.getDomainLowerBound(0.5366064842062321d);
        java.lang.Class<?> wildcardClass21 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.13759165633724676d + "'", double18 == 0.13759165633724676d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability(32.0d, 35.0d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.006071986281712238d + "'", double11 == 0.006071986281712238d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.getInitialDomain(0.8609681162053344d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.cumulativeProbability(0.3408876950806238d, 0.29231441474827646d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1);
        double double20 = fDistributionImpl2.getDomainUpperBound(4.4355799878524796E-5d);
        double double21 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        double double31 = fDistributionImpl2.getInitialDomain(0.49838122445596006d);
        // The following exception was thrown during execution in test generation
        try {
            double double34 = fDistributionImpl2.cumulativeProbability(0.8609681162053344d, 0.3919492048229929d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
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
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, (double) (byte) 1);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getInitialDomain(0.5949357068038229d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.14637555387850465d);
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3408876950806238d, 1.2241878759327988E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.cumulativeProbability(1.2421802126086574d, 0.9999999999999998d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        java.lang.Class<?> wildcardClass9 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.33409440091453685d);
        double double27 = fDistributionImpl2.getInitialDomain(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.25d + "'", double27 == 1.25d);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100L);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.cumulativeProbability((-0.024909805740576035d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double20 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.999037593690436d, 0.189836249017317d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.5949357068038229d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.26465518129632637d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.004569416631646944d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.02609075569324349d + "'", double8 == 0.02609075569324349d);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double13 = fDistributionImpl2.cumulativeProbability(1.2109603464415848d, (double) (short) 100);
        double double15 = fDistributionImpl2.getInitialDomain((-0.9999999999747803d));
        double double17 = fDistributionImpl2.getInitialDomain(0.06545795869712367d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2969240624175721d + "'", double13 == 0.2969240624175721d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.25d + "'", double17 == 1.25d);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double13 = fDistributionImpl2.cumulativeProbability(1.2109603464415848d, (double) (short) 100);
        double double15 = fDistributionImpl2.getInitialDomain((-0.9999999999747803d));
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistributionImpl2.inverseCumulativeProbability(2.0606060606060606d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2969240624175721d + "'", double13 == 0.2969240624175721d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1.0f);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass12 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.31979861116167463d + "'", double9 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 1.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3951424744541511d, 0.2207617383499606d);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.3991062373962743E-245d, 0.29474933881663606d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.cumulativeProbability(0.6591068676950343d, 0.1829024488312228d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getInitialDomain((double) 'a');
        double double10 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-0.9799636396743291d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7103083879489903d + "'", double10 == 0.7103083879489903d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, 0.3919491786229663d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 10);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4204984331337026d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = fDistributionImpl2.cumulativeProbability(0.9999999238243996d, 0.5980793709233622d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02887716934657425d + "'", double11 == 0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double16 = fDistributionImpl2.cumulativeProbability(0.4906940248809481d, 1.7976931348623157E308d);
        double double18 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double20 = fDistributionImpl2.cumulativeProbability(9.838320889492336E-7d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.2421802126086574d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6289333745278087d + "'", double18 == 0.6289333745278087d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.3991062373962743E-245d + "'", double20 == 1.3991062373962743E-245d);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double15 = fDistributionImpl2.cumulativeProbability(52.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5598475038519922d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9999999238243996d + "'", double15 == 0.9999999238243996d);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5366657182124845d, 0.49838122445596006d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9466229816367563d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.2004508130138858d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double15 = fDistributionImpl2.getInitialDomain(0.6591065015250168d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.17235021937116024d);
        double double19 = fDistributionImpl2.inverseCumulativeProbability(0.13759165633724676d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.411646958960975E-7d + "'", double19 == 8.411646958960975E-7d);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.06401548478113292d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.26479899700216447d);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.14112703242567148d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.cumulativeProbability(0.1114353339521007d);
        double double9 = fDistributionImpl2.getDomainLowerBound((-0.4915427677698697d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.013443616381931207d + "'", double7 == 0.013443616381931207d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.004394700866783798d, 0.22182890933593535d);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.9999984104468244d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDomainLowerBound(0.37330737634742583d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.cumulativeProbability(0.8142351560989445d, 0.04366678567633304d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4906940248809481d + "'", double3 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999984104468244d + "'", double4 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainLowerBound(0.3197986111596346d);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainLowerBound(0.5626720221012385d);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double14 = fDistributionImpl2.getInitialDomain((double) '4');
        double double16 = fDistributionImpl2.getInitialDomain(97.0d);
        double double18 = fDistributionImpl2.cumulativeProbability(0.30255252296354923d);
        double double20 = fDistributionImpl2.getDomainLowerBound(0.021191376661121225d);
        double double21 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0606060606060606d + "'", double14 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0606060606060606d + "'", double16 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.4142199650266395d + "'", double18 == 0.4142199650266395d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.9999984104468244d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.03805921542661744d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.inverseCumulativeProbability((-0.30879641382307144d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4906940248809481d + "'", double3 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999984104468244d + "'", double4 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4906940248809481d + "'", double5 == 0.4906940248809481d);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.33409440091453685d, 0.6401770331730183d);
        double double4 = fDistributionImpl2.getInitialDomain(0.4546995573427486d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) (-1L));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.47077968881994314d) + "'", double4 == (-0.47077968881994314d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5949357068078883d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        double double12 = fDistributionImpl2.getDomainUpperBound(0.1801856291181903d);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.43906017126509644d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5949357068078883d + "'", double8 == 0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5773773436195279d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.49838122445596006d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.05350873685544799d);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.31672086845579883d + "'", double12 == 0.31672086845579883d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5093634057790148d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), 0.3895023980863656d);
        double double18 = fDistributionImpl2.getDomainLowerBound(0.5949357068038229d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5093634057790148d + "'", double13 == 0.5093634057790148d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4892284600732909d + "'", double16 == 0.4892284600732909d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.004141886739706592d, 0.025477995384417838d);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability(0.0d, 0.5996052325402953d);
        double double11 = fDistributionImpl2.getInitialDomain(0.20196314831799295d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.008009325319447534d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.0011893394730556636d, (double) '4');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5433539298660959d + "'", double9 == 0.5433539298660959d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.04092683534776831d + "'", double16 == 0.04092683534776831d);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double20 = fDistributionImpl2.cumulativeProbability(0.4595566142158559d, 0.6640218712845615d);
        double double21 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double23 = fDistributionImpl2.inverseCumulativeProbability(0.6583620521480608d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.07908924131400807d + "'", double20 == 0.07908924131400807d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.996771980364195d + "'", double23 == 0.996771980364195d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double9 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double11 = fDistributionImpl2.getDomainUpperBound(0.6591065015250168d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.43199198024659174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.5189833010988237d);
        double double4 = fDistributionImpl2.getInitialDomain(0.4923052829221457d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7103083879489903d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3504236660423056d) + "'", double4 == (-0.3504236660423056d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5189833010988237d + "'", double7 == 0.5189833010988237d);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.29231441474827646d, 0.22828618836637168d);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.999037593690436d, 0.189836249017317d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.5949357068038229d);
        double double6 = fDistributionImpl2.getInitialDomain((-0.19192775392242717d));
        double double8 = fDistributionImpl2.getInitialDomain((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.1048724177104202d) + "'", double6 == (-0.1048724177104202d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.1048724177104202d) + "'", double8 == (-0.1048724177104202d));
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.002393864708003338d, 0.049950031800927046d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.2214738003873964E-5d);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) '4');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability(0.7103083879489903d);
        double double17 = fDistributionImpl2.getInitialDomain(0.40971224866107453d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.44582356363844317d + "'", double15 == 0.44582356363844317d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.9999999999873902d);
        double double10 = fDistributionImpl2.getInitialDomain(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3197986111586397d);
        double double14 = fDistributionImpl2.getDomainUpperBound(1.418479831543378d);
        java.lang.Class<?> wildcardClass15 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double14 = fDistributionImpl2.getDomainUpperBound(100.0d);
        double double16 = fDistributionImpl2.getInitialDomain(0.3248137971311367d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999915219d + "'", double12 == 0.9999999999915219d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0606060606060606d + "'", double16 == 1.0606060606060606d);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999999873902d);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.29231441474827646d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.42666238729297296d, 0.3149311607087718d);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.006788379530718425d, 0.7557224019288303d);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double13 = fDistributionImpl2.cumulativeProbability(0.9967719789495215d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.0138432086850232d, 0.5234420640177013d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6583620521480608d + "'", double13 == 0.6583620521480608d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4227128498025451d + "'", double16 == 0.4227128498025451d);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getInitialDomain(0.6037071022078223d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getInitialDomain(0.43467479348140525d);
        double double12 = fDistributionImpl2.cumulativeProbability((-0.47077968881994314d), 0.6589061351369964d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.23766969007294547d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.25d + "'", double9 == 1.25d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5641578772655828d + "'", double12 == 0.5641578772655828d);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.5189833010988237d);
        double double4 = fDistributionImpl2.getInitialDomain(0.9293804578921561d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3504236660423056d) + "'", double4 == (-0.3504236660423056d));
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.25d, 100.0d);
        double double4 = fDistributionImpl2.cumulativeProbability((double) (short) 10);
        double double7 = fDistributionImpl2.cumulativeProbability(0.14335493966332769d, 0.6401770331730183d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3040818357099405d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0290165297879137E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.999037593690436d + "'", double4 == 0.999037593690436d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3032299156718087d + "'", double7 == 0.3032299156718087d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5949357068078883d, (double) (short) 1);
        double double4 = fDistributionImpl2.getInitialDomain(2.3610123714643496E-5d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(8.228997151648991E-7d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(97.0d);
        double double16 = fDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double19 = fDistributionImpl2.cumulativeProbability(0.8142351560989445d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.41580691019689836d + "'", double12 == 0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2829646865406194d + "'", double19 == 0.2829646865406194d);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.8284628704001276d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999999915219d);
        double double12 = fDistributionImpl2.getInitialDomain(0.33096804704038296d);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.01847602750240651d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2109603464415848d + "'", double6 == 1.2109603464415848d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0204081632653061d + "'", double12 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass4 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999984104468244d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.4892284600732909d, (double) (short) 1);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.3318389831356192d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistributionImpl2.inverseCumulativeProbability(0.491780299474472d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.1114353339521007d + "'", double15 == 0.1114353339521007d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.9999984104468244d);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.26479899700216447d);
        double double19 = fDistributionImpl2.getInitialDomain(0.01806785311078775d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6591065015250168d + "'", double15 == 0.6591065015250168d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.25d + "'", double19 == 1.25d);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0204081632653061d, 0.4546995573427486d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 10.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.06954427012843875d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.04366678567633304d, 0.5996052325396897d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04366678567633304d + "'", double3 == 0.04366678567633304d);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        double double8 = fDistributionImpl2.inverseCumulativeProbability(0.0011893394730556636d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.335665474161353E-6d + "'", double8 == 2.335665474161353E-6d);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double16 = fDistributionImpl2.cumulativeProbability((double) (short) 1, 1.0d);
        double double18 = fDistributionImpl2.getDomainUpperBound((double) 100.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.7976931348623157E308d);
        double double22 = fDistributionImpl2.getDomainLowerBound(0.5220157123797441d);
        java.lang.Class<?> wildcardClass23 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4664502910454298d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.17235021937116024d);
        double double13 = fDistributionImpl2.getInitialDomain(0.44582356363844317d);
        double double15 = fDistributionImpl2.inverseCumulativeProbability(0.9999999999873902d);
        double double17 = fDistributionImpl2.cumulativeProbability(0.02838644361959202d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3986.25d + "'", double15 == 3986.25d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6171780722261304d + "'", double17 == 0.6171780722261304d);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double6 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 1);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.3168052840864677d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4394515874848486d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.inverseCumulativeProbability(0.9453652605193021d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3197986111586397d + "'", double6 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.6065454203287214d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.cumulativeProbability(0.08793604972328362d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.10555964729310591d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0010722599132668223d + "'", double8 == 0.0010722599132668223d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getInitialDomain(0.5220157123797441d);
        java.lang.Class<?> wildcardClass8 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.008610287160087353d, 0.4546995573427486d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.04952177738101d);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.06401548478113292d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 1L);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.cumulativeProbability(0.6276037379948466d, 0.10479689180895158d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.2500001488198675d);
        double double17 = fDistributionImpl2.getInitialDomain(0.19788692492646354d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9961307247459887d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.18685162596174398d);
        double double23 = fDistributionImpl2.cumulativeProbability(0.20476397886382258d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.13015490706162436d + "'", double23 == 0.13015490706162436d);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        double double30 = fDistributionImpl2.cumulativeProbability((-0.09901319167563201d), (double) 10L);
        double double31 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.6553251431808038d);
        double double35 = fDistributionImpl2.cumulativeProbability(0.06954427012843875d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-0.432364228996943d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
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
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.6037071022078223d + "'", double31 == 0.6037071022078223d);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8195918816395871d, 0.189836249017317d);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5366657182124845d, 0.49838122445596006d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability((-0.6441096650238254d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain((double) (short) 100);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.11325382736064116d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.44582356363844317d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.476758784114401d);
        double double8 = fDistributionImpl2.getInitialDomain(52.0d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.17815841044398562d + "'", double6 == 0.17815841044398562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.inverseCumulativeProbability(0.41580691019689836d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3220459516792461d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.3220459516792461d + "'", double9 == 0.3220459516792461d);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) '4');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain((-0.3667417109622608d));
        double double17 = fDistributionImpl2.cumulativeProbability(0.26479899700216447d);
        java.lang.Class<?> wildcardClass18 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.30255252296354923d + "'", double17 == 0.30255252296354923d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double14 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double17 = fDistributionImpl2.cumulativeProbability(0.08015071710935137d, 1.0210526315789474d);
        double double19 = fDistributionImpl2.getInitialDomain(0.680275844215834d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999915219d + "'", double12 == 0.9999999999915219d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.4595566142158559d + "'", double17 == 0.4595566142158559d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0606060606060606d + "'", double19 == 1.0606060606060606d);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.5387004628787064d), (-0.47077968881994314d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double11 = fDistributionImpl2.cumulativeProbability(10.0d, 10.0d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double16 = fDistributionImpl2.cumulativeProbability(6.396607245999892E-152d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.09509397652602902d, 0.39134009223677896d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = fDistributionImpl2.inverseCumulativeProbability(0.0010722599132668223d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.11155256899978572d + "'", double19 == 0.11155256899978572d);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L));
        double double19 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999999998d);
        double double23 = fDistributionImpl2.getInitialDomain((double) (-1));
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.03273505326846579d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.9999999999999996d) + "'", double23 == (-0.9999999999999996d));
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 10, 0.9898804402645663d);
        double double4 = fDistributionImpl2.cumulativeProbability((double) ' ');
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.009150552718303446d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8609681162053344d + "'", double4 == 0.8609681162053344d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9898804402645663d + "'", double5 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.031053678956944965d, 0.14869246204751185d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(0.4394515874848486d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.08031753719966103 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.9999999999873902d);
        java.lang.Class<?> wildcardClass9 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(1.8125673702109506E-6d, 0.6276037379948466d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5523306409467954d + "'", double14 == 0.5523306409467954d);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.3040818357099405d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.1825231602525817d, 0.24041303946096454d);
        java.lang.Class<?> wildcardClass6 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.021191376661121225d + "'", double5 == 0.021191376661121225d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(0.3895023980863656d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.5220157123797441d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 100);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainUpperBound(1.04952177738101d);
        java.lang.Class<?> wildcardClass9 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((-0.09901319167563201d));
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double9 = fDistributionImpl2.getInitialDomain((double) 1L);
        double double12 = fDistributionImpl2.cumulativeProbability((double) (byte) -1, 0.013443616381931207d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.07348577195844175d + "'", double12 == 0.07348577195844175d);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.41580691019689836d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.3895023980863656d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.cumulativeProbability(1.0204081632653061d, 1.25d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double20 = fDistributionImpl2.inverseCumulativeProbability(0.20476397886382258d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.476758784114401d + "'", double11 == 0.476758784114401d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.4633919262405889d + "'", double13 == 0.4633919262405889d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.04818702750924919d + "'", double17 == 0.04818702750924919d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0683847700784957d + "'", double20 == 0.0683847700784957d);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double16 = fDistributionImpl2.getDomainUpperBound(0.6591065015250168d);
        double double18 = fDistributionImpl2.getDomainLowerBound(0.07212597439971892d);
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.NaN);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistributionImpl2.cumulativeProbability(0.31683499876602816d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getInitialDomain(0.6758256576139563d);
        double double11 = fDistributionImpl2.cumulativeProbability(0.025477995384417838d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.25d + "'", double9 == 1.25d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.12364027545394483d + "'", double11 == 0.12364027545394483d);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability(0.0d, 0.5996052325402953d);
        double double11 = fDistributionImpl2.getDomainLowerBound((-0.9999999999747803d));
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5495061904002759d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5433539298660959d + "'", double9 == 0.5433539298660959d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        double double20 = fDistributionImpl2.getDomainUpperBound(0.42666238729297296d);
        double double23 = fDistributionImpl2.cumulativeProbability(0.06652843034939326d, 0.1201684622410103d);
        double double24 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.06704332111736572d + "'", double23 == 0.06704332111736572d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }
}

