package org.apache.commons.math.distribution;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0606060606060606d);
        double double10 = fDistributionImpl2.getInitialDomain((double) 0);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(0.018345231285955332d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getDomainLowerBound(0.033785291755995456d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.129032258064516d) + "'", double10 == (-1.129032258064516d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0606060606060606d + "'", double11 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.129032258064516d) + "'", double13 == (-1.129032258064516d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0606060606060606d + "'", double14 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.6559581390100542d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double11 = fDistributionImpl2.cumulativeProbability(10.0d, 10.0d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double16 = fDistributionImpl2.cumulativeProbability(6.396607245999892E-152d);
        double double18 = fDistributionImpl2.cumulativeProbability(2.491570302378676E-4d);
        double double21 = fDistributionImpl2.cumulativeProbability((-0.2726132353898473d), 10.03041485845025d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 9.928489799571806E-81d + "'", double18 == 9.928489799571806E-81d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.7528721827002165d + "'", double21 == 0.7528721827002165d);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0204081632653061d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.06401548478113292d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.050528120263875986d, 0.8026648265055725d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.32617406016227324d + "'", double15 == 0.32617406016227324d);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7557224019288303d, (double) 100.0f);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.6441096650238254d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7557224019288303d + "'", double3 == 0.7557224019288303d);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999984104468244d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.inverseCumulativeProbability(0.46758643441315834d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain(0.5658786927337371d);
        double double15 = fDistributionImpl2.cumulativeProbability(1.2622342631866731E-22d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 8.900376166804435E-12d + "'", double15 == 8.900376166804435E-12d);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainLowerBound(0.9898804402645663d);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.3220459516792461d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1829024488312228d + "'", double16 == 0.1829024488312228d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double16 = fDistributionImpl2.getDomainUpperBound(0.6591065015250168d);
        double double18 = fDistributionImpl2.getDomainLowerBound(0.07212597439971892d);
        double double19 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
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
        // The following exception was thrown during execution in test generation
        try {
            double double23 = fDistributionImpl2.cumulativeProbability(0.2969240624175721d, 0.09133102595050481d);
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
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getInitialDomain((-0.2624723670828401d));
        double double7 = fDistributionImpl2.cumulativeProbability(0.3919492048229929d, 1.04952177738101d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.cumulativeProbability(32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.25d + "'", double4 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.21553976421620918d + "'", double7 == 0.21553976421620918d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9997895478566928d + "'", double10 == 0.9997895478566928d);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.04939567395865742d, 0.10555964729310591d);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.25337560979679696d, 0.4566514703525203d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.21172790149929543d);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.06545795869712367d, 2.0606060606060606d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.009486956849729777d, 0.42370716420032145d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1013201016199986d + "'", double5 == 0.1013201016199986d);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain((double) 100.0f);
        double double17 = fDistributionImpl2.getInitialDomain(1.3826603340484837E-4d);
        double double20 = fDistributionImpl2.cumulativeProbability(1.6295001724897507E-4d, 0.4898628835849175d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.25d + "'", double17 == 1.25d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.4901200508636891d + "'", double20 == 0.4901200508636891d);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5004087508678674d, 52.0d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.06965997645678441d);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3919492048229929d);
        double double8 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.39770683156309267d + "'", double4 == 0.39770683156309267d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0011893394730556636d, 0.19771484410829757d);
        double double5 = fDistributionImpl2.cumulativeProbability((-0.9999999916299953d), 0.8597859255962592d);
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9910026160363924d + "'", double5 == 0.9910026160363924d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0011893394730556636d + "'", double6 == 0.0011893394730556636d);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(8.86681273925677E-5d, (-0.3504236660423056d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5773773436195279d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.cumulativeProbability(0.15284422013846283d, (-0.5103751341354182d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.NaN);
        double double21 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double24 = fDistributionImpl2.cumulativeProbability(0.0010722599132668223d, 0.7043071535892672d);
        double double26 = fDistributionImpl2.getDomainUpperBound(0.023813722351143395d);
        double double27 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.7976931348623157E308d + "'", double26 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double6 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 1);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.3168052840864677d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) 100);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.06954427012843875d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3197986111586397d + "'", double6 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.14958173588002702d, 0.08419329170293993d);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double13 = fDistributionImpl2.cumulativeProbability(0.9967719789495215d);
        double double15 = fDistributionImpl2.cumulativeProbability(5.357258915695551E-11d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainLowerBound(0.30714180896595983d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6583620521480608d + "'", double13 == 0.6583620521480608d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.696025203496104E-6d + "'", double15 == 5.696025203496104E-6d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) '4');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double17 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistributionImpl2.inverseCumulativeProbability(0.44208869850608057d);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double14 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-0.08031753719966103d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double11 = fDistributionImpl2.cumulativeProbability(10.0d, 10.0d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.4546995573427486d);
        double double19 = fDistributionImpl2.cumulativeProbability((double) 0L, 1.334173577483257E-5d);
        double double21 = fDistributionImpl2.getDomainUpperBound(0.6553251431808038d);
        double double22 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.481806365604883E-142d + "'", double19 == 6.481806365604883E-142d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.25d, 100.0d);
        double double4 = fDistributionImpl2.cumulativeProbability((double) (short) 10);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.9173511778371286d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.999037593690436d + "'", double4 == 0.999037593690436d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.9021531631756408d + "'", double6 == 2.9021531631756408d);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
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
        double double23 = fDistributionImpl2.getDomainLowerBound(0.33353342474782405d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.6037071022078223d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.4906940248809481d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.0d);
        double double11 = fDistributionImpl2.getInitialDomain(100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.6636531716106877d + "'", double5 == 1.6636531716106877d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.6636531716106877d + "'", double6 == 1.6636531716106877d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.6636531716106877d + "'", double7 == 1.6636531716106877d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.432364228996943d) + "'", double11 == (-0.432364228996943d));
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.8284628704001276d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100L);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2109603464415848d + "'", double6 == 1.2109603464415848d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.02723373766299686d, 0.6046935761651037d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100.0f);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        double double10 = fDistributionImpl2.getInitialDomain(0.3197986111596346d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3197986111586397d + "'", double11 == 0.3197986111586397d);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability(0.9176064239260036d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.22088345872093793d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3210963486747651d + "'", double13 == 0.3210963486747651d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.4898628835849175d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.inverseCumulativeProbability(0.08228766440042513d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.3197986111596346d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.49838122445596006d);
        double double14 = fDistributionImpl2.getInitialDomain(0.9967719789495215d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.41406926397160465d);
        java.lang.Class<?> wildcardClass17 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.19845142031994614d);
        double double9 = fDistributionImpl2.getDomainUpperBound(0.5626720221012385d);
        double double11 = fDistributionImpl2.getInitialDomain(0.9999763973332203d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.43101595040007795d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4521799531956898d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistributionImpl2.inverseCumulativeProbability((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.11015601941480264d) + "'", double11 == (-0.11015601941480264d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L));
        double double19 = fDistributionImpl2.getDomainUpperBound(1.25d);
        double double21 = fDistributionImpl2.getDomainUpperBound(0.08551944859056404d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.06954427012843875d);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.4664502910454298d);
        double double18 = fDistributionImpl2.getDomainUpperBound((-1.53472685559007d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainLowerBound(0.3197986111596346d);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainLowerBound(0.5626720221012385d);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double18 = fDistributionImpl2.cumulativeProbability((-0.35319435852748904d), 6.481806365604883E-142d);
        double double20 = fDistributionImpl2.cumulativeProbability(8.716198814666628E-7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.2379949517739024E-26d + "'", double20 == 1.2379949517739024E-26d);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getInitialDomain((double) 'a');
        double double10 = fDistributionImpl2.cumulativeProbability(1.25d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0210526315789474d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.1461266361314345d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.5709557931882584d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7103083879489903d + "'", double10 == 0.7103083879489903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.004178420904072746d + "'", double17 == 0.004178420904072746d);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.23076288400994444d);
        double double12 = fDistributionImpl2.getDomainLowerBound(1.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999915219d);
        double double16 = fDistributionImpl2.getInitialDomain(0.3919491786229663d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.8485385657705871d);
        double double20 = fDistributionImpl2.getInitialDomain(0.2436210779020391d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.06401548478113292d + "'", double10 == 0.06401548478113292d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.9999999999830438d) + "'", double16 == (-0.9999999999830438d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.7369231313756075d) + "'", double20 == (-0.7369231313756075d));
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.5189833010988237d);
        double double4 = fDistributionImpl2.getInitialDomain(0.4923052829221457d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7103083879489903d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double10 = fDistributionImpl2.cumulativeProbability(0.5949357068038229d);
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3504236660423056d) + "'", double4 == (-0.3504236660423056d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3936282244227155d + "'", double10 == 0.3936282244227155d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.5996052325396897d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.1829024488312228d);
        double double14 = fDistributionImpl2.cumulativeProbability((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5433539298658748d + "'", double10 == 0.5433539298658748d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9898804402645663d + "'", double14 == 0.9898804402645663d);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(97.0d);
        double double16 = fDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double18 = fDistributionImpl2.getDomainLowerBound(0.5949357068078883d);
        double double19 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass20 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.41580691019689836d + "'", double12 == 0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.cumulativeProbability((-1.0d));
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getDomainLowerBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistributionImpl2.cumulativeProbability(4.532161592670845E-117d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability((double) (byte) 10);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.inverseCumulativeProbability((-0.1618137286458573d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7583315357111738d + "'", double9 == 0.7583315357111738d);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9898804402645663d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111596346d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.2215131472835244d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.7681324865938718d);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.cumulativeProbability((double) 10.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.336242355358862d);
        double double10 = fDistributionImpl2.getInitialDomain(9.596869378549597E-7d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.20209815801110104d) + "'", double10 == (-0.20209815801110104d));
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5949357068078883d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double12 = fDistributionImpl2.getInitialDomain(0.6583620521480608d);
        double double14 = fDistributionImpl2.getInitialDomain(0.059278978129763016d);
        double double16 = fDistributionImpl2.getInitialDomain((-0.2726132353898473d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5949357068078883d + "'", double8 == 0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8284628704001276d + "'", double10 == 0.8284628704001276d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 10);
        double double9 = fDistributionImpl2.getInitialDomain(0.43276459841306814d);
        double double11 = fDistributionImpl2.getDomainUpperBound(0.5626720221012385d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.333959227384966d);
        double double15 = fDistributionImpl2.getInitialDomain(0.1461266361314345d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.25d + "'", double9 == 1.25d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.04920183084648444d + "'", double13 == 0.04920183084648444d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.21109370629708515d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.cumulativeProbability(0.43278329179761166d);
        java.lang.Class<?> wildcardClass9 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.13174537379287576d + "'", double8 == 0.13174537379287576d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.27687764751802335d);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.7551927476169364d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.369679655722036d);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.16548279892721904d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6942683376225791d + "'", double12 == 0.6942683376225791d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        double double11 = fDistributionImpl2.getDomainUpperBound((-0.33369676647384544d));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.031135097668851475d);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.031135097668851475d + "'", double14 == 0.031135097668851475d);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1L));
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getInitialDomain(0.5433539503073836d);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.2143698019432957d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.04366678567633304d, 0.07340177854841759d);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability(0.5433539298660959d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.42843061475207117d);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5220157123797441d + "'", double9 == 0.5220157123797441d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.34211877158633835d + "'", double12 == 0.34211877158633835d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) '4');
        double double14 = fDistributionImpl2.cumulativeProbability(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5495061904002759d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.1489318989174955d, 0.6932388123177048d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.166752096558032d + "'", double19 == 0.166752096558032d);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(3.326962510329631E-5d, 0.3252821340923737d);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, 0.3919491786229663d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.1801856291181903d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3897742347849355d);
        double double17 = fDistributionImpl2.getDomainUpperBound((-0.755877099187982d));
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistributionImpl2.inverseCumulativeProbability(0.7605286207286406d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.24206185443373315 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02887716934657425d + "'", double11 == 0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        double double15 = fDistributionImpl2.cumulativeProbability(0.5004087508678674d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.43276459841306814d);
        double double19 = fDistributionImpl2.getDomainUpperBound(0.5093634057790148d);
        double double22 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, 0.755683952741227d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5189833010988237d + "'", double15 == 0.5189833010988237d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.18620592257722834d + "'", double22 == 0.18620592257722834d);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.013666728010437416d, 0.2215131472835244d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(3.175450644109864E-5d);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass6 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
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
        double double24 = fDistributionImpl2.cumulativeProbability(0.9293804578921561d);
        double double26 = fDistributionImpl2.getInitialDomain(0.21109370629708515d);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = fDistributionImpl2.inverseCumulativeProbability((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5093634057790148d + "'", double17 == 0.5093634057790148d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.3563443766442773d + "'", double24 == 0.3563443766442773d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.13370602424775557d) + "'", double26 == (-0.13370602424775557d));
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.cumulativeProbability(0.4898628835849175d, (-0.432364228996943d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3563443766442773d, 0.40971224866107453d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(2.6014040918805166E-8d);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(9.126699443633689E-4d, 0.00370446747183093d);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.1801856291181903d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.5220157123797441d);
        double double6 = fDistributionImpl2.getDomainUpperBound((-0.02579088791105589d));
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.cumulativeProbability(0.46278740261225126d, 0.010043112374941786d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1201684622410103d + "'", double4 == 0.1201684622410103d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.cumulativeProbability(0.05350873685544799d, 0.17235021937116024d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.17805060620437185d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.017857674930194845d + "'", double8 == 0.017857674930194845d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.6591065015250168d);
        double double19 = fDistributionImpl2.getInitialDomain(9.838320889492336E-7d);
        double double21 = fDistributionImpl2.getDomainLowerBound((-0.49071513905979386d));
        double double23 = fDistributionImpl2.inverseCumulativeProbability(0.008036077048780232d);
        double double24 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9322888260560721d + "'", double17 == 0.9322888260560721d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0606060606060606d + "'", double19 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0290165297879137E-4d + "'", double23 == 1.0290165297879137E-4d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 35.0d + "'", double24 == 35.0d);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.46278740261225126d, 0.1345060112435601d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.cumulativeProbability(0.4855996867118336d, 0.29231441474827646d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.41580691019689836d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainLowerBound(0.22237893174108092d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.41580691019689836d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainUpperBound(0.4546995573427486d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.7976931348623157E308d, 35.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.26479899700216447d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.8195918816395871d);
        double double10 = fDistributionImpl2.getInitialDomain(0.06401548478113292d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.18018562911453778d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0606060606060606d + "'", double10 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.2215131472835244d, 0.1742528055671888d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.2215131472835244d + "'", double3 == 0.2215131472835244d);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.02723373766299686d, 0.6046935761651037d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.755683952741227d);
        double double6 = fDistributionImpl2.getInitialDomain(0.4419425715309202d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.19845142031994614d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9188056009222301d + "'", double4 == 0.9188056009222301d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.4333769026183856d) + "'", double6 == (-0.4333769026183856d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02723373766299686d + "'", double7 == 0.02723373766299686d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6046935761651037d + "'", double10 == 0.6046935761651037d);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (short) 100);
        java.lang.Class<?> wildcardClass10 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9999999958149977d + "'", double9 == 0.9999999958149977d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.6401770331730183d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2143698019432957d + "'", double10 == 0.2143698019432957d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.45447932157420906d, 6.094986186887868E-4d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5949357068078883d);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '#');
        double double14 = fDistributionImpl2.getDomainLowerBound(0.5220157123797441d);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.09487388796007479d);
        double double18 = fDistributionImpl2.getDomainUpperBound((double) 1L);
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.2109603464415848d, 0.6583620521480608d);
        double double4 = fDistributionImpl2.getInitialDomain(0.5658786927337371d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.7148233587794464d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getInitialDomain(52.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.cumulativeProbability(0.999992954379557d, 0.2969240624175721d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.49071513905979386d) + "'", double4 == (-0.49071513905979386d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.369679655722036d + "'", double6 == 0.369679655722036d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6583620521480608d + "'", double7 == 0.6583620521480608d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.49071513905979386d) + "'", double9 == (-0.49071513905979386d));
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.031053678956944965d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
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
        fDistributionImpl2.setNumeratorDegreesOfFreedom(10.000000133267429d);
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
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (byte) 10);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.680275844215834d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double10 = fDistributionImpl2.getDomainLowerBound(0.41406926397160465d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.08419329170293993d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(4.5302694602666893E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.30278624188592324d, 0.12464002300904951d);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.1801856291181903d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.5220157123797441d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 0L, 0.31979861116167463d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.02887716934657425d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-1.6666666666666667d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1201684622410103d + "'", double4 == 0.1201684622410103d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08793604972328362d + "'", double7 == 0.08793604972328362d);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 1.0f, 0.883955474884341d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.01806785311078775d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getInitialDomain(0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.009116282380880985d) + "'", double9 == (-0.009116282380880985d));
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getInitialDomain(0.07908924131400807d);
        double double18 = fDistributionImpl2.getInitialDomain(9.596869378549597E-7d);
        double double19 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double21 = fDistributionImpl2.getDomainUpperBound(0.2449890523218835d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound((-1.0d));
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.05028488401486397d);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.8142351560989445d);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.4142199650266395d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5004087508678674d, 52.0d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.06965997645678441d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.34777933225821744d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.40826190741378604d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.9999999958149977d);
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.9722761820576019d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.39770683156309267d + "'", double4 == 0.39770683156309267d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5865420894413496d + "'", double6 == 0.5865420894413496d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.864885594867752d + "'", double12 == 6.864885594867752d);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 10);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.1201684622410103d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainUpperBound(0.369679655722036d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.cumulativeProbability(0.46278740261225126d, 0.1829024488312228d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = fDistributionImpl2.getInitialDomain((-0.3929763913338056d));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3587171005858765d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.cumulativeProbability(0.19845142031994614d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.2500001488198675d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.04860877630608049d + "'", double12 == 0.04860877630608049d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.999852177434338d, 0.9088759711888426d);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 1, (double) 10);
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999873902d);
        double double11 = fDistributionImpl2.getDomainLowerBound(0.3197986111586397d);
        double double13 = fDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.9999763973332203d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.5690677053309194d);
        double double19 = fDistributionImpl2.getDomainUpperBound(0.0565931079423178d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9205507147766241d + "'", double13 == 0.9205507147766241d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 10.0f);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistributionImpl2.cumulativeProbability((double) (short) 10, 0.7723000623308832d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.NaN);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.06401548478113292d);
        double double18 = fDistributionImpl2.cumulativeProbability(0.5220157123797441d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 10, 0.9898804402645663d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.04952177738101d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(0.9176064239260036d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.104203917990999 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability((double) 0.0f, 0.5996052325402953d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5189833010988237d);
        double double19 = fDistributionImpl2.getDomainLowerBound(0.9021122018807471d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = fDistributionImpl2.cumulativeProbability(0.5980793709233622d, 0.5469781396633547d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5433539298660959d + "'", double15 == 0.5433539298660959d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound((double) (byte) 100);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) '#');
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.07908924131400807d);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getInitialDomain(0.39151156165974016d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.010367711397661706d + "'", double13 == 0.010367711397661706d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.25d + "'", double17 == 1.25d);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.41580691019689836d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.49838122445596006d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.49838122445596006d + "'", double15 == 0.49838122445596006d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.45484514927563435d, 0.6046935761651037d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.04253651331020525d + "'", double9 == 0.04253651331020525d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.2500001488198675d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.018345231285955332d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.334173577483257E-5d + "'", double12 == 1.334173577483257E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.25d, 100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double6 = fDistributionImpl2.cumulativeProbability(32.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.059278978129763016d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.883955474884341d + "'", double6 == 0.883955474884341d);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5906155824624583d, (-0.6073583604658008d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.283502211323599d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getInitialDomain((-0.2624723670828401d));
        double double7 = fDistributionImpl2.cumulativeProbability(0.3919492048229929d, 1.04952177738101d);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.41406926397160465d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.25d + "'", double4 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.21553976421620918d + "'", double7 == 0.21553976421620918d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3168050816845452d + "'", double10 == 0.3168050816845452d);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
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
        double double29 = fDistributionImpl2.getInitialDomain((double) 1L);
        double double31 = fDistributionImpl2.cumulativeProbability(2.1694881938782906d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.7976931348623157E308d + "'", double27 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double10 = fDistributionImpl2.cumulativeProbability(0.5658786927337371d);
        double double12 = fDistributionImpl2.inverseCumulativeProbability(5.696025203496104E-6d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.42843061475207117d);
        double double16 = fDistributionImpl2.getInitialDomain(0.5996052325396897d);
        double double18 = fDistributionImpl2.getDomainLowerBound(8.228997151648991E-7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.002393864708003338d + "'", double10 == 0.002393864708003338d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.4089329529483282d + "'", double12 == 0.4089329529483282d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.2726132353898473d) + "'", double16 == (-0.2726132353898473d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0666666666666667d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.39134009223677896d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0666666666666667d + "'", double13 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0666666666666667d + "'", double14 == 1.0666666666666667d);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.008771073413552499d, 0.6583620521480608d);
        double double4 = fDistributionImpl2.getInitialDomain(9.838320889492336E-7d);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.49071513905979386d) + "'", double4 == (-0.49071513905979386d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainUpperBound(0.008009325319447534d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.6740028456597981d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9923880315331826d + "'", double17 == 0.9923880315331826d);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.14637555387850465d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.19506275762925057d);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.002393864708003338d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 1L, (double) '#');
        double double4 = fDistributionImpl2.getDomainLowerBound(0.028005760216863906d);
        double double7 = fDistributionImpl2.cumulativeProbability(0.01847602750240651d, 1.0972868492113788d);
        java.lang.Class<?> wildcardClass8 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5906155824624583d + "'", double7 == 0.5906155824624583d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getInitialDomain(0.49838122445596006d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.31979822851015227d + "'", double12 == 0.31979822851015227d);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability(0.9176064239260036d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.03505821861061997d);
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3210963486747651d + "'", double13 == 0.3210963486747651d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability(0.0d, 0.5996052325402953d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 1);
        java.lang.Class<?> wildcardClass12 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5433539298660959d + "'", double9 == 0.5433539298660959d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getInitialDomain((double) 'a');
        double double10 = fDistributionImpl2.getInitialDomain((-1.0d));
        double double13 = fDistributionImpl2.cumulativeProbability(0.05595719508517638d, 0.1461266361314345d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.cumulativeProbability(0.5708847835416948d, 0.03584401406394102d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.10751568684175394d + "'", double13 == 0.10751568684175394d);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.5664273879258552d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainLowerBound(0.3220459516792461d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(2.3610123714643496E-5d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0721470484493668d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability((double) 100);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.680275844215834d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4479640982107486d);
        double double21 = fDistributionImpl2.cumulativeProbability(0.04503703868667216d, 0.21713262052211377d);
        double double23 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6361775410201435d, 0.19473572820174623d);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.25d, 100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.3951424744541511d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.9999981726526794d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.47187845345795065d + "'", double8 == 0.47187845345795065d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.25d + "'", double9 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double15 = fDistributionImpl2.cumulativeProbability(52.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3220459516792461d);
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double20 = fDistributionImpl2.getInitialDomain(0.3069371622276223d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9999999238243996d + "'", double15 == 0.9999999238243996d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.3220459516792461d + "'", double18 == 0.3220459516792461d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.19192775392242717d) + "'", double20 == (-0.19192775392242717d));
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getInitialDomain((double) ' ');
        double double12 = fDistributionImpl2.getDomainLowerBound(0.4898628835849175d);
        double double14 = fDistributionImpl2.inverseCumulativeProbability(5.357258915695551E-11d);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.6243639160256823d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0606060606060606d + "'", double10 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.8053308838440895d + "'", double17 == 0.8053308838440895d);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(52.0d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double10 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.cumulativeProbability(0.9999999238243996d, 0.42279266347743144d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100.0f);
        double double13 = fDistributionImpl2.getDomainLowerBound(0.4546995573427486d);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.06459868357469922d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.cumulativeProbability(0.04199995021237534d, 3.408167631624437E-4d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8609681162053344d, 10.0d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.5949357068078883d, 0.680275844215834d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound(0.40826190741378604d);
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.9999444591000356d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.02723373766299686d + "'", double5 == 0.02723373766299686d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 48.68777084361189d + "'", double10 == 48.68777084361189d);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7043071535892672d, 0.12496431835916927d);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.794431337232113d);
        double double7 = fDistributionImpl2.cumulativeProbability(0.4546995573427486d, 0.4546995573427486d);
        double double9 = fDistributionImpl2.getDomainLowerBound((-0.42787428821980134d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.7976931348623157E308d);
        double double12 = fDistributionImpl2.getInitialDomain(0.7043071535892672d);
        double double14 = fDistributionImpl2.getInitialDomain(0.001227638541478935d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.04818702750924919d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0666666666666667d + "'", double12 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0666666666666667d + "'", double14 == 1.0666666666666667d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0011893394730556636d, 0.19771484410829757d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.26465518129632637d, 0.002393864708003338d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.26465518129632637d + "'", double3 == 0.26465518129632637d);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
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
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '4');
        double double24 = fDistributionImpl2.cumulativeProbability(0.6221137160076774d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.34777933225821744d + "'", double18 == 0.34777933225821744d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.5661557333969475d + "'", double24 == 0.5661557333969475d);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double10 = fDistributionImpl2.getInitialDomain(0.5093634057790148d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.6046935761651037d);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.4980478727936605d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.20196314831799295d + "'", double12 == 0.20196314831799295d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability(0.5433539298660959d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5220157123797441d + "'", double9 == 0.5220157123797441d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
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
        double double19 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double21 = fDistributionImpl2.cumulativeProbability(0.0010665602861507125d);
        double double23 = fDistributionImpl2.getDomainLowerBound(0.22828618836637168d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9967719789495215d + "'", double15 == 0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.02586733482168741d + "'", double21 == 0.02586733482168741d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.6037071022078223d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.4906940248809481d);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.08793604972328362d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6037071022078223d + "'", double7 == 0.6037071022078223d);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9999999999915219d, 2.097152841112099E-5d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.04860877630608049d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5366064842062321d, 0.02887716934657425d);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 10);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.1201684622410103d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainUpperBound(0.369679655722036d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        double double13 = fDistributionImpl2.getInitialDomain(0.9999999999914339d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.3168052840864677d);
        double double17 = fDistributionImpl2.getInitialDomain(0.28159241378169547d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3408876950806238d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.41580691019689836d + "'", double11 == 0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.25d + "'", double17 == 1.25d);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9365489651388929d, 0.336242355358862d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.13896755257900706d);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4394515874848486d);
        double double18 = fDistributionImpl2.getInitialDomain(0.883955474884341d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.14869246204751185d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.28160073981721595d) + "'", double18 == (-0.28160073981721595d));
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) 1);
        double double14 = fDistributionImpl2.cumulativeProbability(0.755683952741227d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.14335493966332769d);
        double double18 = fDistributionImpl2.cumulativeProbability(0.30331061695050415d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5949357068038229d + "'", double14 == 0.5949357068038229d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2871174581456352d + "'", double16 == 0.2871174581456352d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.4060965215114523d + "'", double18 == 0.4060965215114523d);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.3248137971311367d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.09509450716293696d, 0.5974244174682043d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.17857439941260683d + "'", double16 == 0.17857439941260683d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.31487451784760545d + "'", double19 == 0.31487451784760545d);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.3515003513676351d, 1.418479831543378d);
        double double4 = fDistributionImpl2.cumulativeProbability(1.0210526315789474d);
        double double6 = fDistributionImpl2.cumulativeProbability(3986.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9978917646629611d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5096838504714735d + "'", double4 == 0.5096838504714735d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9978917646629611d + "'", double6 == 0.9978917646629611d);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.008036077048780232d, 0.5949357068078883d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(0.5842660434812024d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.4234224082773299 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5220157123797441d, 0.05595719508517638d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double11 = fDistributionImpl2.getInitialDomain(0.9999999999999998d);
        double double13 = fDistributionImpl2.cumulativeProbability(1.0666666666666667d);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6739693374503183d + "'", double13 == 0.6739693374503183d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
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
        double double22 = fDistributionImpl2.getDomainLowerBound(0.10980244711968297d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.12496431835916927d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.05468886506853487d + "'", double16 == 0.05468886506853487d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.25d + "'", double18 == 1.25d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.999852177434338d + "'", double20 == 0.999852177434338d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.41406926397160465d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainLowerBound(0.3168052840864677d);
        double double17 = fDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double19 = fDistributionImpl2.getInitialDomain(0.5565294657256515d);
        double double21 = fDistributionImpl2.getDomainLowerBound(1.0074491241240935E-9d);
        double double22 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = fDistributionImpl2.inverseCumulativeProbability(0.17637974128336592d);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.491780299474472d, 0.9999999995770263d);
        double double4 = fDistributionImpl2.getDomainLowerBound(2.5491771371666263d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5993164688934242d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.491780299474472d + "'", double5 == 0.491780299474472d);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5004087508678674d, 0.2969240624175721d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999873902d);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
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
        double double17 = fDistributionImpl2.getInitialDomain(0.09721305606657636d);
        java.lang.Class<?> wildcardClass18 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.35149728096692545d, 0.07212597439971892d);
        double double4 = fDistributionImpl2.getInitialDomain(0.5640080083627789d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.03741218224943982d) + "'", double4 == (-0.03741218224943982d));
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (byte) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5366657182124845d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5026637197270847d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.inverseCumulativeProbability(0.9747396948203215d);
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
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getInitialDomain(0.6758256576139563d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.25d + "'", double9 == 1.25d);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.cumulativeProbability(97.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.0d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.5117515140982648d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9217548157472832d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999999999998d + "'", double10 == 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5239514278808711d + "'", double14 == 0.5239514278808711d);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.inverseCumulativeProbability(0.9340132613430034d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6037071022078223d, 0.9797635432974363d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.10947967848914353d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.14335493966332769d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3423122472638395d + "'", double6 == 0.3423122472638395d);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '#');
        double double14 = fDistributionImpl2.getDomainLowerBound(0.5220157123797441d);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.09487388796007479d);
        double double18 = fDistributionImpl2.getDomainUpperBound((double) 1L);
        double double20 = fDistributionImpl2.getInitialDomain(0.04920183084648444d);
        double double22 = fDistributionImpl2.cumulativeProbability(0.4206811759669717d);
        double double23 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double24 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + Double.POSITIVE_INFINITY + "'", double23 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0666666666666667d, 1.418479831543378d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
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
        fDistributionImpl2.setDenominatorDegreesOfFreedom(7.393111826382582d);
        double double25 = fDistributionImpl2.cumulativeProbability(0.4857470664567221d, 0.8983246586727612d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.13397252657113934d + "'", double25 == 0.13397252657113934d);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.11280448783580999d, 0.03896274758465178d);
        double double4 = fDistributionImpl2.getDomainUpperBound((-0.3416095446941918d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound(1.0074491241240935E-9d);
        double double11 = fDistributionImpl2.getDomainLowerBound(1.3515003513676351d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
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
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.620141463769566d);
        java.lang.Class<?> wildcardClass22 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.44582356363844317d + "'", double15 == 0.44582356363844317d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getInitialDomain(0.4860815252407045d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.39134009223677896d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7681324865938718d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7681324865938718d + "'", double10 == 0.7681324865938718d);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getInitialDomain(0.14335493966332769d);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double8 = fDistributionImpl2.inverseCumulativeProbability(0.333959227384966d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.03273505326846579d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainUpperBound((-0.5103751341354182d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.19771484410829757d + "'", double8 == 0.19771484410829757d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.1461266361314345d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.03629268820197962d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.NaN);
        double double8 = fDistributionImpl2.getInitialDomain(1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain((double) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.8284628704001276d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.03805921542661744d);
        double double19 = fDistributionImpl2.getInitialDomain(0.6240380174885899d);
        double double21 = fDistributionImpl2.getInitialDomain(97.0d);
        double double24 = fDistributionImpl2.cumulativeProbability(0.01924619894552848d, 0.3210963486747651d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.04663458080884253d + "'", double24 == 0.04663458080884253d);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.7976931348623157E308d, 35.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.26479899700216447d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.8195918816395871d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.12778854537996234d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double15 = fDistributionImpl2.cumulativeProbability((double) (short) -1, 0.19788692492646354d);
        double double17 = fDistributionImpl2.cumulativeProbability(0.33096804704038296d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.33409440091453685d + "'", double15 == 0.33409440091453685d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.4221960238655337d + "'", double17 == 0.4221960238655337d);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double13 = fDistributionImpl2.cumulativeProbability(0.9967719789495215d);
        double double15 = fDistributionImpl2.getDomainUpperBound(2.1694881938782906d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.07442092466791964d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6583620521480608d + "'", double13 == 0.6583620521480608d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.6401770331730183d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.9173511778371286d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2143698019432957d + "'", double10 == 0.2143698019432957d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
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
        double double22 = fDistributionImpl2.inverseCumulativeProbability(0.1461266361314345d);
        double double24 = fDistributionImpl2.inverseCumulativeProbability(0.4855996867118336d);
        double double26 = fDistributionImpl2.getDomainLowerBound(2.4905128116056108E-8d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6289333745278087d + "'", double18 == 0.6289333745278087d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.6614349104552939d + "'", double22 == 0.6614349104552939d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0450263732598466d + "'", double24 == 1.0450263732598466d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double16 = fDistributionImpl2.cumulativeProbability(0.7103083879489903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999999915219d);
        double double20 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double22 = fDistributionImpl2.getDomainLowerBound(0.39770683156309267d);
        double double24 = fDistributionImpl2.getInitialDomain(0.369679655722036d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5949357068078883d + "'", double16 == 0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0606060606060606d + "'", double24 == 1.0606060606060606d);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5949357068078883d, (double) (short) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.23587424144892077d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass7 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.41580691019689836d, Double.NaN);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 0);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.cumulativeProbability(0.5658786927337371d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.41580691019689836d + "'", double8 == 0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.41580691019689836d + "'", double9 == 0.41580691019689836d);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, 0.17235021937116024d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.6740028456597981d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1405191912608803d + "'", double4 == 0.1405191912608803d);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(4.5302694602666893E-4d);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.9999984104468244d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 1);
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double20 = fDistributionImpl2.cumulativeProbability(0.02887716934657425d);
        double double22 = fDistributionImpl2.cumulativeProbability((-0.2624723670828401d));
        double double24 = fDistributionImpl2.getDomainUpperBound(0.2436210779020391d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6591065015250168d + "'", double15 == 0.6591065015250168d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.10715894720040464d + "'", double20 == 0.10715894720040464d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.7976931348623157E308d + "'", double24 == 1.7976931348623157E308d);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain(0.5996052325396897d);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
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
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0011053519540138276d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.44582356363844317d + "'", double15 == 0.44582356363844317d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.16285885278534568d, 0.30255252296354923d);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.5093634057790148d);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double19 = fDistributionImpl2.cumulativeProbability(0.01110261427619207d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.6900430993477209E-15d + "'", double19 == 1.6900430993477209E-15d);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6591065015250168d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6591065015250168d + "'", double9 == 0.6591065015250168d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double10 = fDistributionImpl2.getInitialDomain(0.5093634057790148d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(0.1345060112435601d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.25505610277866725d);
        double double17 = fDistributionImpl2.getInitialDomain(0.6065454203287214d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0666666666666667d + "'", double13 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0666666666666667d + "'", double17 == 1.0666666666666667d);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.31979861116167463d);
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.5433539298660959d);
        double double15 = fDistributionImpl2.getInitialDomain(0.49838122445596006d);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainUpperBound(0.14958173588002702d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1801856291181903d + "'", double11 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5996052325396897d + "'", double13 == 0.5996052325396897d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.5189833010988237d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.0d, Double.NaN);
        double double8 = fDistributionImpl2.cumulativeProbability(0.30278624188592324d, 0.9453652605193021d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.10609022031676985d + "'", double8 == 0.10609022031676985d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.4906940248809481d + "'", double9 == 0.4906940248809481d);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getInitialDomain(0.680275832290893d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (byte) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5366657182124845d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0210526315789474d);
        double double14 = fDistributionImpl2.getInitialDomain(0.2671687285166097d);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getInitialDomain(0.9999999999914339d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.3667417109622608d) + "'", double14 == (-0.3667417109622608d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0210526315789474d + "'", double15 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.3667417109622608d) + "'", double17 == (-0.3667417109622608d));
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) (short) 0);
        double double12 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double14 = fDistributionImpl2.inverseCumulativeProbability(0.5629685381054145d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6553897895273384d + "'", double14 == 0.6553897895273384d);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6772895678779969d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999504708134d);
        double double10 = fDistributionImpl2.getDomainLowerBound((-0.5435757058783689d));
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.inverseCumulativeProbability(0.9293804578921561d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.0011893394730556636d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.2015923832072666d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0500780269138917d + "'", double10 == 0.0500780269138917d);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.3197986111596346d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.49838122445596006d);
        double double14 = fDistributionImpl2.getInitialDomain(0.9967719789495215d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.41406926397160465d);
        double double18 = fDistributionImpl2.getInitialDomain(2.097152841112099E-5d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6289333745278087d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7002018597835067d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.883955474884341d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.017857674930194845d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.12778854537996234d);
        double double16 = fDistributionImpl2.getInitialDomain(0.2601891955685284d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9340132613430034d + "'", double14 == 0.9340132613430034d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.7920431980908056d) + "'", double16 == (-0.7920431980908056d));
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.018345231285955332d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.73376879544401d + "'", double15 == 0.73376879544401d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability(0.4664502910454298d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(0.5865420894413496d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.4898628835849175d + "'", double9 == 0.4898628835849175d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.cumulativeProbability(0.7611385915913281d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.254523743739696d + "'", double12 == 0.254523743739696d);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain(0.5996052325396897d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getInitialDomain(0.6240380174885899d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0606060606060606d + "'", double16 == 1.0606060606060606d);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.2893387565801086d), 0.7002018597835067d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6923011392979808d, 0.1822843294541756d);
        double double4 = fDistributionImpl2.getInitialDomain(0.5241672826982716d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.10028209164277006d) + "'", double4 == (-0.10028209164277006d));
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
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
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.18945773922771514d);
        double double25 = fDistributionImpl2.cumulativeProbability(0.028005760216863906d, 0.4204984331337026d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.171986371395909d + "'", double25 == 0.171986371395909d);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
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
        java.lang.Class<?> wildcardClass22 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6591065015250168d + "'", double15 == 0.6591065015250168d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainLowerBound(0.1801856291181903d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.2552268137755401d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.050603792842317426d + "'", double15 == 0.050603792842317426d);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4898628835849175d);
        double double17 = fDistributionImpl2.cumulativeProbability(0.6046935761651037d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3885952696717879d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5469781396633547d + "'", double17 == 0.5469781396633547d);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3040818357099405d, 0.26166495153015507d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5325727269896393d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.3903771725336764d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.30724114922027024d + "'", double6 == 0.30724114922027024d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
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
        double double24 = fDistributionImpl2.cumulativeProbability(0.0d, 0.6276037379948466d);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = fDistributionImpl2.cumulativeProbability(0.4419425715309202d, 0.30255252296354923d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.5664273879258552d + "'", double24 == 0.5664273879258552d);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
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
        double double24 = fDistributionImpl2.cumulativeProbability(0.013443616381931207d, 1.2109603464415848d);
        double double26 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double28 = fDistributionImpl2.getDomainUpperBound(0.2255061186409303d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + Double.POSITIVE_INFINITY + "'", double19 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + Double.POSITIVE_INFINITY + "'", double26 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.7976931348623157E308d + "'", double28 == 1.7976931348623157E308d);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.04174844235099085d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
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
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.794431337232113d);
        double double6 = fDistributionImpl2.getInitialDomain(0.189836249017317d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9898804402645663d, 0.2969240624175721d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.2671687285166097d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.07209820539217125d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.17815841044398562d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.20476397886382258d + "'", double4 == 0.20476397886382258d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11816688104897854d + "'", double6 == 0.11816688104897854d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double16 = fDistributionImpl2.cumulativeProbability(0.2552268137755401d, 0.3306859681104356d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.03442543564801526d + "'", double16 == 0.03442543564801526d);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainLowerBound(0.9898804402645663d);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.3220459516792461d);
        double double18 = fDistributionImpl2.getDomainLowerBound(0.883955474884341d);
        double double20 = fDistributionImpl2.getDomainLowerBound((double) '#');
        double double21 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1829024488312228d + "'", double16 == 0.1829024488312228d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.07328927994003721d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.653735533687078E-4d + "'", double9 == 3.653735533687078E-4d);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.25d);
        double double12 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.22237893174108092d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.17815841044398562d, 0.6289333745278087d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999763973332203d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.03224043183411629d);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5004087508678674d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.9967719789495215d);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 0L);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.6276037379948466d);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5010660068730725d + "'", double13 == 0.5010660068730725d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L));
        double double19 = fDistributionImpl2.cumulativeProbability(0.7583315357111738d);
        double double20 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double22 = fDistributionImpl2.getDomainUpperBound(0.5004087508678674d);
        double double24 = fDistributionImpl2.cumulativeProbability((-0.35319435852748904d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5957283306792327d + "'", double19 == 0.5957283306792327d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7976931348623157E308d + "'", double22 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
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
        double double21 = fDistributionImpl2.getInitialDomain(0.30278624188592324d);
        double double22 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double24 = fDistributionImpl2.getInitialDomain(0.021191376661121225d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.25d + "'", double21 == 1.25d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.25d + "'", double24 == 1.25d);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.952694185190773d, 0.36849964924523404d);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '#');
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainLowerBound(0.3951424744541511d);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (byte) 10);
        double double20 = fDistributionImpl2.cumulativeProbability(0.7640246288297262d, 0.9995028566629905d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.getInitialDomain(0.170796029094279d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0204081632653061d + "'", double10 == 1.0204081632653061d);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDomainUpperBound(0.0d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability(0.4947041238000625d);
        double double17 = fDistributionImpl2.getInitialDomain(0.17284703948349756d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.15830241663757016d + "'", double15 == 0.15830241663757016d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.9999999999873902d);
        double double10 = fDistributionImpl2.getInitialDomain(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7557224019288303d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.9999999504708134d);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.6932388123177048d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistributionImpl2.cumulativeProbability(0.7738591463975527d, 0.6748127314868525d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7043071535892672d + "'", double14 == 0.7043071535892672d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.getInitialDomain(0.8609681162053344d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.4162530885951957d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
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
        double double22 = fDistributionImpl2.getDomainUpperBound((-0.01489881398724135d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.34777933225821744d + "'", double18 == 0.34777933225821744d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7976931348623157E308d + "'", double22 == 1.7976931348623157E308d);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getInitialDomain(0.5189833010988237d);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.5239514278808711d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.5773773436195279d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.43906017126509644d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999984104468244d);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.05595719508517638d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.05595719508517638d);
        double double14 = fDistributionImpl2.getDomainLowerBound((-0.6073583604658008d));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.33825919314095565d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4906940248809481d + "'", double5 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4906940248809481d + "'", double6 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.2622342631866731E-22d, 0.4841779558913619d);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(2.5431238260076316E-4d, 0.5325727269896393d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.3423122472638395d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9984620360254088d + "'", double4 == 0.9984620360254088d);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.11699789269084165d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.41580691019689836d, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.cumulativeProbability(0.2208833932477629d, 0.050528120263875986d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1);
        double double7 = fDistributionImpl2.getDomainLowerBound(0.4898628835849175d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.6237377308573089d, 0.767238248039459d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.03239073293880107d + "'", double10 == 0.03239073293880107d);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3318389831356192d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.cumulativeProbability((-1.0d));
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getDomainLowerBound(0.0d);
        java.lang.Class<?> wildcardClass17 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double20 = fDistributionImpl2.getDomainUpperBound(2.461837621104517E-9d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.541645126720792d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9453652605193021d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.8142351560989445d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.0127618228740225d + "'", double17 == 2.0127618228740225d);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) ' ', 0.9999984104468244d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainLowerBound(0.4419425715309202d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.004178420904072746d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9999984104468244d + "'", double3 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.794431337232113d);
        double double7 = fDistributionImpl2.cumulativeProbability(0.4546995573427486d, 0.4546995573427486d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9176064239260036d);
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '#');
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (byte) 10);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.14131937536292083d);
        double double10 = fDistributionImpl2.cumulativeProbability(1.0074491241240935E-9d, 0.5093634057790148d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.35684906105252456d, 0.3903771725336764d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.16435907768387958d + "'", double10 == 0.16435907768387958d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.015387437741789856d + "'", double13 == 0.015387437741789856d);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getDomainUpperBound((-1.6666666666666667d));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(4.436811458740537E-9d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5093634057790148d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.2109603464415848d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.004569416631646944d);
        double double19 = fDistributionImpl2.getInitialDomain(0.45484514927563435d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.8983246586727612d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5093634057790148d + "'", double13 == 0.5093634057790148d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.002289940161152395d) + "'", double19 == (-0.002289940161152395d));
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
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
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.028005760216863906d);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = fDistributionImpl2.cumulativeProbability((double) 100, 0.3408876950806238d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
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
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.02723373766299686d, 0.6046935761651037d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.0d, 0.09487388796007479d);
        double double7 = fDistributionImpl2.cumulativeProbability(0.19506275762925057d);
        double double9 = fDistributionImpl2.getInitialDomain(0.3919491786229663d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.2654747243225105d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8933186128357743d + "'", double5 == 0.8933186128357743d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9021122018807471d + "'", double7 == 0.9021122018807471d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.4333769026183856d) + "'", double9 == (-0.4333769026183856d));
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain(0.008036077048780232d);
        double double10 = fDistributionImpl2.getInitialDomain((-0.30879641382307144d));
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0666666666666667d + "'", double8 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.04366678567633304d, 1.275072409157071d);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.18945773922771514d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3919492048229929d);
        double double13 = fDistributionImpl2.getDomainLowerBound(0.9332494813191807d);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability(0.4664502910454298d);
        double double11 = fDistributionImpl2.getInitialDomain(0.05595719508517638d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.cumulativeProbability(10.000000133267429d, 0.39134009223677896d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.4898628835849175d + "'", double9 == 0.4898628835849175d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.04939567395865742d, 0.9995028566629905d);
        double double4 = fDistributionImpl2.getInitialDomain(0.41580698164526403d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9990062073833588d) + "'", double4 == (-0.9990062073833588d));
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double13 = fDistributionImpl2.cumulativeProbability(0.8609681162053344d, 0.9293804578921561d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.0d, 0.6942683376225791d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.2449890523218835d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.018345231285955332d + "'", double13 == 0.018345231285955332d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23300318550049426d + "'", double16 == 0.23300318550049426d);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.680275832290893d, 0.36849964924523404d);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.45447932157420906d, 0.7723000623308832d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double6 = fDistributionImpl2.cumulativeProbability((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.915313858517923d + "'", double6 == 0.915313858517923d);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        double double13 = fDistributionImpl2.getInitialDomain(0.9999999999914339d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.3168052840864677d);
        double double17 = fDistributionImpl2.getInitialDomain(0.28159241378169547d);
        double double19 = fDistributionImpl2.getInitialDomain(0.47187845345795065d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.41580691019689836d + "'", double11 == 0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.25d + "'", double17 == 1.25d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.25d + "'", double19 == 1.25d);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double13 = fDistributionImpl2.cumulativeProbability(1.2109603464415848d, (double) (short) 100);
        double double15 = fDistributionImpl2.getInitialDomain((-0.9999999999747803d));
        double double17 = fDistributionImpl2.getDomainUpperBound(0.49838122445596006d);
        double double19 = fDistributionImpl2.inverseCumulativeProbability(0.06954427012843875d);
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double22 = fDistributionImpl2.cumulativeProbability(0.0010722599132668223d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.33825919314095565d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2969240624175721d + "'", double13 == 0.2969240624175721d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.008009325319447534d + "'", double19 == 0.008009325319447534d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.025477995384417838d + "'", double22 == 0.025477995384417838d);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.45447932157420906d, 6.094986186887868E-4d);
        double double4 = fDistributionImpl2.getDomainUpperBound((-0.2004508130138858d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double14 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double16 = fDistributionImpl2.cumulativeProbability(1.0210526315789474d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.43199198024659174d, 0.43276459841306814d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.20196314831799295d);
        double double23 = fDistributionImpl2.cumulativeProbability((-0.47077968881994314d));
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6237377308573089d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3248137971311367d + "'", double16 == 0.3248137971311367d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.408167631624437E-4d + "'", double19 == 3.408167631624437E-4d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.6758256576139563d);
        double double12 = fDistributionImpl2.getInitialDomain(0.13759165633724676d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.25d + "'", double12 == 1.25d);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
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
        java.lang.Class<?> wildcardClass22 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.7681324865938718d + "'", double21 == 0.7681324865938718d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0010722599132668223d, 1.2214738003873964E-5d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5949357068078883d);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0204081632653061d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.23076288400994444d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.07061643216723656d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.23076288400994444d + "'", double15 == 0.23076288400994444d);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.28685518143753963d), (-0.19125358886515564d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7002018597835067d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.883955474884341d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.017857674930194845d);
        double double14 = fDistributionImpl2.getDomainUpperBound(1.0606060606060606d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistributionImpl2.cumulativeProbability(0.5049994309192527d, 3.326962510329631E-5d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.1801856291181903d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3318389831356192d);
        java.lang.Class<?> wildcardClass22 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.2671687285166097d);
        double double10 = fDistributionImpl2.getInitialDomain(0.11215527694889071d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.15418046344921968d) + "'", double10 == (-0.15418046344921968d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5708847835416948d, (-0.19192775392242717d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double15 = fDistributionImpl2.cumulativeProbability(52.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3220459516792461d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.04092683534776831d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9999999238243996d + "'", double15 == 0.9999999238243996d);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1.0f);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDomainLowerBound(0.1825231602525817d);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.31979861116167463d + "'", double9 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double14 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double16 = fDistributionImpl2.getInitialDomain(0.033785291755995456d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999915219d + "'", double12 == 0.9999999999915219d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0606060606060606d + "'", double16 == 1.0606060606060606d);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
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
        double double20 = fDistributionImpl2.getDomainUpperBound(0.15231616998149738d);
        double double22 = fDistributionImpl2.getInitialDomain(0.2601891955685284d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02887716934657425d + "'", double11 == 0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.25d + "'", double22 == 1.25d);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        double double8 = fDistributionImpl2.getInitialDomain(0.35760002498487775d);
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.3981365332138079d);
        double double12 = fDistributionImpl2.getDomainLowerBound(8.292738272749505E-6d);
        double double14 = fDistributionImpl2.getInitialDomain(0.5690677053309194d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.25337560979623985d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0204081632653061d + "'", double8 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9332494813191807d + "'", double10 == 0.9332494813191807d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0204081632653061d + "'", double14 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.599074076160145E-7d + "'", double16 == 1.599074076160145E-7d);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double10 = fDistributionImpl2.getDomainLowerBound((-0.3667417109622608d));
        double double12 = fDistributionImpl2.getDomainUpperBound(0.9205507147766241d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double11 = fDistributionImpl2.cumulativeProbability(10.0d, 10.0d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.4546995573427486d);
        double double19 = fDistributionImpl2.cumulativeProbability((double) 0L, 1.334173577483257E-5d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0683847700784957d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6.481806365604883E-142d + "'", double19 == 6.481806365604883E-142d);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.cumulativeProbability((double) (-1));
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, 0.16285885278534568d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.2871174581456352d, 0.996771980364195d);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, 0.3919491786229663d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.1801856291181903d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3897742347849355d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.30255252296354923d);
        double double19 = fDistributionImpl2.getDomainLowerBound(0.05943926360562046d);
        java.lang.Class<?> wildcardClass20 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02887716934657425d + "'", double11 == 0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability(0.20416048310264287d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9999999999999998d, 0.9910026160363924d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.08380094507984907d, 0.39151156165974016d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1761220726449184d + "'", double5 == 0.1761220726449184d);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.19788692492646354d, 0.336242355358862d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.cumulativeProbability(0.4906940248809481d, 0.23300318550049426d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.6037071022078223d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.cumulativeProbability(0.3897742347849355d);
        java.lang.Class<?> wildcardClass9 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3197986111586397d + "'", double5 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6037071022078223d + "'", double6 == 0.6037071022078223d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5326685129511843d + "'", double8 == 0.5326685129511843d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double17 = fDistributionImpl2.cumulativeProbability((double) 10.0f);
        double double19 = fDistributionImpl2.getDomainLowerBound(33.20158064706674d);
        double double21 = fDistributionImpl2.getInitialDomain(0.4419425715309202d);
        double double22 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.32764978063013356d);
        double double26 = fDistributionImpl2.getDomainUpperBound(1.418479831543378d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9967719789495215d + "'", double17 == 0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0606060606060606d + "'", double21 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.7976931348623157E308d + "'", double26 == 1.7976931348623157E308d);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double16 = fDistributionImpl2.cumulativeProbability((double) (short) 1, 1.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6591065015250168d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 10.0f);
        double double21 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double23 = fDistributionImpl2.getDomainUpperBound(0.3032299156718087d);
        double double24 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double26 = fDistributionImpl2.inverseCumulativeProbability((double) 0L);
        double double27 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5213406041583359d, 1.2500001488198675d);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double11 = fDistributionImpl2.cumulativeProbability(8.292738272749505E-6d, 0.9999999995770263d);
        double double13 = fDistributionImpl2.getDomainLowerBound(0.15885654345209954d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.535927304604666d + "'", double11 == 0.535927304604666d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double15 = fDistributionImpl2.getInitialDomain(209.24627349950515d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.29474933881663606d, 0.3951424744541511d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.04818702750924919d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistributionImpl2.cumulativeProbability(0.8754146350390162d, 0.38797868490824095d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4394515874848486d, 0.7738591463975527d);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.6037071022078223d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.6758256576139563d);
        double double8 = fDistributionImpl2.getInitialDomain(0.18506771891995114d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.09536549259823585d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.432364228996943d) + "'", double8 == (-0.432364228996943d));
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double16 = fDistributionImpl2.cumulativeProbability((double) (short) 1, 1.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6591065015250168d);
        double double19 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double21 = fDistributionImpl2.cumulativeProbability(0.10985558899919723d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.18431715258018902d + "'", double21 == 0.18431715258018902d);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.cumulativeProbability((-1.129032258064516d));
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.20645201597141383d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(4.4355799878524796E-5d);
        double double18 = fDistributionImpl2.cumulativeProbability(0.011704464104499768d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.023813722351143395d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9995028566629905d + "'", double18 == 0.9995028566629905d);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double14 = fDistributionImpl2.getDomainLowerBound(7.381135323475757E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d, 1.25d);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass15 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.05350873685544799d + "'", double13 == 0.05350873685544799d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8699807630763419d, 0.07908924131400807d);
        double double4 = fDistributionImpl2.getInitialDomain(0.34211877158633835d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.04117278273151505d) + "'", double4 == (-0.04117278273151505d));
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (byte) 10);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.14131937536292083d);
        double double10 = fDistributionImpl2.cumulativeProbability(1.0074491241240935E-9d, 0.5093634057790148d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.cumulativeProbability(0.4221960238655337d, 0.0030883693754368224d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.16435907768387958d + "'", double10 == 0.16435907768387958d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double9 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double11 = fDistributionImpl2.getDomainUpperBound(0.6591065015250168d);
        double double13 = fDistributionImpl2.getDomainLowerBound(0.08793604972328362d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.30255252296354923d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.3201432667410897d + "'", double15 == 0.3201432667410897d);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, (double) (byte) 10);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(10.0d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getInitialDomain((double) 100L);
        double double9 = fDistributionImpl2.getDomainUpperBound(5.357258915695551E-11d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4906940248809481d + "'", double5 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.25d + "'", double7 == 1.25d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.9999999999873902d);
        double double10 = fDistributionImpl2.getInitialDomain(0.0d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.3197986111596346d);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.491780299474472d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.13174537379287576d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3210963486747651d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.9999999999873902d);
        double double10 = fDistributionImpl2.getInitialDomain(0.0d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.3197986111596346d);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.491780299474472d);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.04576376563200668d);
        double double18 = fDistributionImpl2.getDomainUpperBound(0.3032299156718087d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainUpperBound(0.03805921542661744d);
        double double20 = fDistributionImpl2.getInitialDomain((-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0606060606060606d + "'", double20 == 1.0606060606060606d);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.01847602750240651d, 0.0010665602861507125d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.445614258311395d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5004087508678674d, 52.0d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.06965997645678441d);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(4.716813751774474E-6d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.39770683156309267d + "'", double4 == 0.39770683156309267d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (-1L));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.43276459841306814d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.05350873685544799d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.39770683156309267d);
        double double12 = fDistributionImpl2.getInitialDomain(2.25d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8983246586727612d + "'", double10 == 0.8983246586727612d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0204081632653061d + "'", double12 == 1.0204081632653061d);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.cumulativeProbability((-1.129032258064516d), 3.408167631624437E-4d);
        double double9 = fDistributionImpl2.getDomainUpperBound(0.5775256913939883d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.600006698519661E-74d + "'", double7 == 2.600006698519661E-74d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6401770331730183d, 0.9898419264720365d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.3149311607087718d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.cumulativeProbability((double) (-1.0f));
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.0027198323247858195d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.040565343294303426d + "'", double14 == 0.040565343294303426d);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double17 = fDistributionImpl2.cumulativeProbability((double) 10.0f);
        double double19 = fDistributionImpl2.getDomainLowerBound(33.20158064706674d);
        double double21 = fDistributionImpl2.getInitialDomain(0.4419425715309202d);
        double double22 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.32764978063013356d);
        double double26 = fDistributionImpl2.cumulativeProbability(0.07061643216723656d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9967719789495215d + "'", double17 == 0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0606060606060606d + "'", double21 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.5157824391686243d + "'", double26 == 0.5157824391686243d);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
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
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.999037593690436d);
        double double21 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double23 = fDistributionImpl2.getDomainUpperBound(0.05247754500884303d);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = fDistributionImpl2.inverseCumulativeProbability(0.39134009223677896d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.9980770380515841 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double17 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double19 = fDistributionImpl2.getInitialDomain(0.31979861116167463d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(2.097152841112099E-5d);
        double double23 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double25 = fDistributionImpl2.getDomainUpperBound((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0606060606060606d + "'", double19 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.7976931348623157E308d + "'", double25 == 1.7976931348623157E308d);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.4892284600732909d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.1201684622410103d, 0.41580691019689836d);
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.11684554078643927d + "'", double5 == 0.11684554078643927d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
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
        double double23 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double24 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getInitialDomain(0.5996052325402953d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 100L);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainLowerBound(32.0d);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.7557224019288303d);
        double double18 = fDistributionImpl2.getDomainUpperBound((-0.8329721894028081d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.cumulativeProbability(8.292738272749505E-6d);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.396607245999892E-152d + "'", double11 == 6.396607245999892E-152d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.03273505326846579d, 0.2207617383499606d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03273505326846579d + "'", double3 == 0.03273505326846579d);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.23076288400994444d);
        double double12 = fDistributionImpl2.getDomainLowerBound(1.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999915219d);
        double double16 = fDistributionImpl2.getInitialDomain(0.3919491786229663d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.8485385657705871d);
        double double19 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.06401548478113292d + "'", double10 == 0.06401548478113292d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.9999999999830438d) + "'", double16 == (-0.9999999999830438d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double6 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3197986111586397d + "'", double6 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9453652605193021d, 0.17284703948349756d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(0.1761220726449184d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.0945991075835473 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability(0.37955994598365783d);
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
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound((double) '4');
        double double13 = fDistributionImpl2.getDomainUpperBound(0.7246966031342408d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.cumulativeProbability(0.19151374780859048d, (-0.32382689714754914d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (byte) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5366657182124845d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.08015071710935137d, 0.9999999995770263d);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.0d);
        double double18 = fDistributionImpl2.cumulativeProbability(0.3895024214486992d);
        double double20 = fDistributionImpl2.getInitialDomain(0.24622186047072248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5366657182124845d + "'", double11 == 0.5366657182124845d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2671687285166097d + "'", double14 == 0.2671687285166097d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.13887199034337472d + "'", double18 == 0.13887199034337472d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.3667417109622608d) + "'", double20 == (-0.3667417109622608d));
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double13 = fDistributionImpl2.cumulativeProbability(1.2109603464415848d, (double) (short) 100);
        double double15 = fDistributionImpl2.getInitialDomain((-0.9999999999747803d));
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2969240624175721d + "'", double13 == 0.2969240624175721d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.35149728096692545d, 0.05468886506853487d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.21578335101162535d);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.05468886506853487d + "'", double5 == 0.05468886506853487d);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.21150108457503464d, 1.2421802126086574d);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1L);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21150108457503464d + "'", double5 == 0.21150108457503464d);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(8.292738272749505E-6d, (-2.4392616257972284d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) (short) 0);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainLowerBound(1.0666666666666667d);
        double double15 = fDistributionImpl2.inverseCumulativeProbability(0.709336204157063d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.244673628309875d + "'", double15 == 1.244673628309875d);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
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
        double double21 = fDistributionImpl2.getDomainUpperBound(0.8142351560989445d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double10 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double12 = fDistributionImpl2.cumulativeProbability((-0.09430155667562287d));
        double double14 = fDistributionImpl2.getDomainUpperBound((-0.5435757058783689d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.8585643081732904d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.0989255426117557d);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.5491771371666263d + "'", double12 == 2.5491771371666263d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.24041303946096454d + "'", double14 == 0.24041303946096454d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.4892284600732909d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.1201684622410103d, 0.41580691019689836d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.3563443766442773d, 0.5865420894413496d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.11684554078643927d + "'", double5 == 0.11684554078643927d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.06610907006332722d + "'", double8 == 0.06610907006332722d);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        java.lang.Class<?> wildcardClass12 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
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
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.03505821861061997d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double15 = fDistributionImpl2.cumulativeProbability(52.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3220459516792461d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.7835361335394757d);
        double double20 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass21 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9999999238243996d + "'", double15 == 0.9999999238243996d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.7835361335394757d + "'", double20 == 0.7835361335394757d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 1L);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(0.43906017126509644d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.8860084106561458d);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.008036077048780232d, 0.5949357068078883d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.07988615102238397d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9615156523527999d + "'", double4 == 0.9615156523527999d);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9898804402645663d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.09988356017803013d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.cumulativeProbability(0.4060965215114523d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.08067034236646792d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.08793604972328362d);
        double double17 = fDistributionImpl2.getInitialDomain((-0.1618137286458573d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0210526315789474d + "'", double17 == 1.0210526315789474d);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(0.9967719789495215d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.inverseCumulativeProbability(0.43278329179761166d);
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.35005359532675084d + "'", double18 == 0.35005359532675084d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5189833010988237d, (double) (short) 10);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.NaN);
        double double21 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double24 = fDistributionImpl2.cumulativeProbability(0.0010722599132668223d, 0.7043071535892672d);
        double double26 = fDistributionImpl2.getDomainLowerBound(0.9797635432974363d);
        double double28 = fDistributionImpl2.getInitialDomain(0.6554278909379809d);
        double double29 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.2500001488198675d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.5993164688934242d);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.160888316925247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0027198323247858195d);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) 'a');
        double double12 = fDistributionImpl2.getInitialDomain(0.378096485231151d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.491780299474472d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.001361768052777312d) + "'", double12 == (-0.001361768052777312d));
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getInitialDomain((double) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.1822843294541756d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3197986111586397d, 35.0d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(0.6739693374503183d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.25d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3197986111586397d + "'", double3 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0606060606060606d + "'", double5 == 1.0606060606060606d);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.03273505326846579d, 0.2207617383499606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5773773436195279d);
        double double6 = fDistributionImpl2.getInitialDomain(0.9985908462600791d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.12407654618737202d) + "'", double6 == (-0.12407654618737202d));
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.13174537379287576d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.5117512873843995d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5178216626897553d + "'", double17 == 0.5178216626897553d);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.8585643081732904d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.008036077048780232d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.10658175907938988d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.5491771371666263d + "'", double12 == 2.5491771371666263d);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.7976931348623157E308d, 35.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.26479899700216447d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.39134009223677896d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainLowerBound(0.6553251431808038d);
        double double12 = fDistributionImpl2.getInitialDomain(0.4914636803260138d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9340132613430034d, 0.6289333745278087d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (short) 10);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.3919491786229663d);
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.755683952741227d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.48724821486889947d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.999037593690436d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.836989559568376d + "'", double11 == 0.836989559568376d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.56968361451335d + "'", double13 == 1.56968361451335d);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainLowerBound(0.9898804402645663d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4914636803260138d);
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double14 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double16 = fDistributionImpl2.cumulativeProbability(1.0210526315789474d);
        double double18 = fDistributionImpl2.getDomainLowerBound(Double.POSITIVE_INFINITY);
        double double20 = fDistributionImpl2.getDomainLowerBound(0.0138432086850232d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3248137971311367d + "'", double16 == 0.3248137971311367d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9365489651388929d, 0.00370446747183093d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(7.444493761760151E-4d);
        double double9 = fDistributionImpl2.getDomainUpperBound(0.5366064842062321d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.41406926397160465d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainLowerBound(0.3168052840864677d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4149883680161971d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.2500001488198675d);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.9999999958149977d);
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
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) (short) 0);
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.0027198323247858195d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.2601891955685284d);
        java.lang.Class<?> wildcardClass15 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.2214738003873964E-5d + "'", double12 == 1.2214738003873964E-5d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound((double) (byte) 100);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) '#');
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability(0.004569416631646944d, 0.9999999995770263d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.02609075569324349d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6065454203287214d + "'", double15 == 0.6065454203287214d);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7835361335394757d, 0.3220459516792461d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3220459516792461d + "'", double3 == 0.3220459516792461d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7835361335394757d + "'", double4 == 0.7835361335394757d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3423122472638395d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 0.11280448783580999d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.25d);
        double double12 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.9965956918620645d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.6158682675681332d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.491780299474472d, 0.9999999995770263d);
        double double4 = fDistributionImpl2.getDomainLowerBound(2.5491771371666263d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass6 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.491780299474472d + "'", double5 == 0.491780299474472d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double9 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability(0.13015490706162436d, 0.333959227384966d);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.3306859681104356d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.1131706584078894d + "'", double13 == 0.1131706584078894d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.08793604972328362d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.008610287911435281d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
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
        double double20 = fDistributionImpl2.getInitialDomain(0.6614349104552939d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.9999999999873902d);
        double double10 = fDistributionImpl2.getInitialDomain(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7557224019288303d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.9999999504708134d);
        double double16 = fDistributionImpl2.getDomainUpperBound((-0.2983274935364951d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7043071535892672d + "'", double14 == 0.7043071535892672d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.22237893174108092d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08019327059132804d + "'", double9 == 0.08019327059132804d);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999873902d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDomainLowerBound(0.9999999995770263d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999999873902d + "'", double10 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999999999873902d + "'", double13 == 0.9999999999873902d);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain(0.5996052325396897d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.cumulativeProbability(0.3895023980863656d, 33.20158064706674d);
        double double19 = fDistributionImpl2.getInitialDomain(0.20909172880811788d);
        double double22 = fDistributionImpl2.cumulativeProbability(0.0d, 0.03273505326846579d);
        double double24 = fDistributionImpl2.cumulativeProbability(1.8125673702109506E-6d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5366064842062321d + "'", double17 == 0.5366064842062321d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0606060606060606d + "'", double19 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.14253250210133003d + "'", double22 == 0.14253250210133003d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0010665600774650832d + "'", double24 == 0.0010665600774650832d);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.025477995384417838d, 0.4936605546990172d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.09536549259823585d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(0.018735014698028074d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.32772198606296105 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5949357068078883d, (double) (short) 1);
        double double4 = fDistributionImpl2.getInitialDomain(2.3610123714643496E-5d);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) 10);
        double double9 = fDistributionImpl2.cumulativeProbability(0.11684554078643927d, 0.24622186047072248d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.22828618836637168d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.07609892745584163d + "'", double9 == 0.07609892745584163d);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-1.6666666666666667d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5949357068078883d, (double) (short) 1);
        double double4 = fDistributionImpl2.getInitialDomain(0.30714180896595983d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) 1);
        double double12 = fDistributionImpl2.cumulativeProbability(0.675421985387411d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.42900614432031264d + "'", double12 == 0.42900614432031264d);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(0.17235021937116024d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.inverseCumulativeProbability(10.000000133267429d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double14 = fDistributionImpl2.getInitialDomain(0.6739693374503183d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.25d + "'", double14 == 1.25d);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4892284600732909d);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.4997825736017098d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double10 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.7681324865938718d);
        double double14 = fDistributionImpl2.getDomainUpperBound(8.716198814666628E-7d);
        double double16 = fDistributionImpl2.getInitialDomain(0.04366678567633304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getInitialDomain((double) 'a');
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound(1.04952177738101d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.018345231285955332d, 0.4479640982107486d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.006071986281712238d);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.22828618836637168d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.cumulativeProbability(0.5241672826982716d, 0.7528721827002165d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.018345231285955332d + "'", double7 == 0.018345231285955332d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.200911920145382E-4d + "'", double10 == 8.200911920145382E-4d);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getInitialDomain((double) ' ');
        double double12 = fDistributionImpl2.getDomainLowerBound(0.4898628835849175d);
        double double14 = fDistributionImpl2.inverseCumulativeProbability(5.357258915695551E-11d);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0606060606060606d + "'", double10 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double4 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 1, (double) 'a');
        double double9 = fDistributionImpl2.getDomainLowerBound((-0.2004508130138858d));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5996052325402953d + "'", double7 == 0.5996052325402953d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.28618363577756856d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.33160760298119973d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06459868357469922d + "'", double14 == 0.06459868357469922d);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.35552458334754683d, 0.04322441323500558d);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getInitialDomain(0.160888316925247d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.08793604972328362d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.2449890523218835d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.27612724732985866d, 0.004456918279453936d);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5433539298660959d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.31979822851015227d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.27567576310190556d + "'", double15 == 0.27567576310190556d);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3318389831356192d);
        double double21 = fDistributionImpl2.getDomainUpperBound(9.131517924063271E-7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
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
            double double20 = fDistributionImpl2.cumulativeProbability(0.023813722351143395d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
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
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.getDomainUpperBound(Double.NaN);
        double double17 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double19 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double21 = fDistributionImpl2.getDomainUpperBound(0.37330737634742583d);
        double double23 = fDistributionImpl2.getDomainLowerBound(0.45447932157420906d);
        double double25 = fDistributionImpl2.cumulativeProbability(0.43101595040007795d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.47369066291072565d + "'", double25 == 0.47369066291072565d);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0030883693754368224d, 1.6636531716106877d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.21109370629708515d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.cumulativeProbability(0.05350873685544799d, 0.17235021937116024d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.1201684622410103d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.017857674930194845d + "'", double8 == 0.017857674930194845d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.5004087508678674d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.6289333745278087d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.333959227384966d);
        double double20 = fDistributionImpl2.cumulativeProbability(0.45447932157420906d);
        double double21 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4906940248809481d + "'", double11 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6591068676950343d + "'", double16 == 0.6591068676950343d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2601891955685284d + "'", double20 == 0.2601891955685284d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.9999984104468244d);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.26479899700216447d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.03505821861061997d);
        double double22 = fDistributionImpl2.cumulativeProbability(0.2208833932477629d);
        double double23 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6591065015250168d + "'", double15 == 0.6591065015250168d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9145405985604257d + "'", double22 == 0.9145405985604257d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 1L, (double) '#');
        double double4 = fDistributionImpl2.getDomainLowerBound(0.5996052325402953d);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.9322888260560721d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, 0.3919491786229663d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.9967719789495215d);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.1829024488312228d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02887716934657425d + "'", double11 == 0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3168052840864677d + "'", double13 == 0.3168052840864677d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.491780299474472d + "'", double15 == 0.491780299474472d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
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
        double double21 = fDistributionImpl2.getInitialDomain(0.5083593629238333d);
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
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double16 = fDistributionImpl2.cumulativeProbability(0.4906940248809481d, 1.7976931348623157E308d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double19 = fDistributionImpl2.inverseCumulativeProbability(0.33364776310664174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.8695313726606203d + "'", double19 == 0.8695313726606203d);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.03505821861061997d, (-0.3667417109622608d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5004087508678674d, 52.0d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.06965997645678441d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.34777933225821744d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.40826190741378604d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.2437417856528475d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.39770683156309267d + "'", double4 == 0.39770683156309267d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5865420894413496d + "'", double6 == 0.5865420894413496d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
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
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7103083879489903d);
        double double25 = fDistributionImpl2.getInitialDomain(0.541645126720792d);
        double double27 = fDistributionImpl2.getInitialDomain(0.18685162596174398d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.129032258064516d) + "'", double25 == (-1.129032258064516d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.129032258064516d) + "'", double27 == (-1.129032258064516d));
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, 100.0d);
        double double4 = fDistributionImpl2.getInitialDomain((double) 0);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getInitialDomain(0.16510007084584888d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0204081632653061d + "'", double4 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0204081632653061d + "'", double7 == 1.0204081632653061d);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (short) 10);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.3919491786229663d);
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.755683952741227d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.836989559568376d + "'", double11 == 0.836989559568376d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.56968361451335d + "'", double13 == 1.56968361451335d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0204081632653061d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.23076288400994444d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.07061643216723656d);
        double double16 = fDistributionImpl2.getInitialDomain(0.9999999999914339d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.13043072741598616d) + "'", double16 == (-0.13043072741598616d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.07061643216723656d + "'", double17 == 0.07061643216723656d);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.cumulativeProbability((double) 10.0f);
        double double9 = fDistributionImpl2.cumulativeProbability(0.33353342474782405d, 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double4 = fDistributionImpl2.getInitialDomain(3986.25d);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double10 = fDistributionImpl2.getInitialDomain(0.06401548478113292d);
        double double12 = fDistributionImpl2.getInitialDomain(0.6739693374503183d);
        double double14 = fDistributionImpl2.inverseCumulativeProbability(0.025477995384417838d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.25d + "'", double12 == 1.25d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0010723392300970788d + "'", double14 == 0.0010723392300970788d);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9088367397897852d, 0.999852177434338d);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainLowerBound(0.33409440091453685d);
        double double20 = fDistributionImpl2.getDomainLowerBound(0.7467867639772824d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7002018597835067d, 1.2500001488198675d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.19788692492646354d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.17379970502642506d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.20196314831799295d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.20645201597141383d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6464662756085405d + "'", double6 == 0.6464662756085405d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6559581390100542d + "'", double8 == 0.6559581390100542d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6591065015250168d, (double) 10L);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass4 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5220157123797441d + "'", double14 == 0.5220157123797441d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double10 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double12 = fDistributionImpl2.cumulativeProbability((-0.09430155667562287d));
        double double14 = fDistributionImpl2.inverseCumulativeProbability(0.28532431475965714d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.8924955537626895d + "'", double14 == 0.8924955537626895d);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5241672826982716d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double17 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double19 = fDistributionImpl2.getInitialDomain(0.31979861116167463d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(2.097152841112099E-5d);
        double double24 = fDistributionImpl2.cumulativeProbability((-0.30879641382307144d), 9.596869378549597E-7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0606060606060606d + "'", double19 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9997402616507489d + "'", double24 == 0.9997402616507489d);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6553251431808038d, 0.4164832330255014d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.11215527694889071d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.6037071022078223d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.008036077048780232d);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.cumulativeProbability(0.08228766440042513d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6037071022078223d + "'", double5 == 0.6037071022078223d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9617789242833569d + "'", double7 == 0.9617789242833569d);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7002018597835067d, 1.2500001488198675d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.1801856291181903d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.999852177434338d);
        java.lang.Class<?> wildcardClass7 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5775256913939883d + "'", double6 == 0.5775256913939883d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.4892284600732909d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1L);
        double double7 = fDistributionImpl2.getDomainUpperBound(0.5189833010988237d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.03896274758465178d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.cumulativeProbability(0.1941800855070006d, (-0.293214330727583d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.3040818357099405d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.025789138102653757d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass6 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03235452503050362d + "'", double4 == 0.03235452503050362d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.6636531716106877d + "'", double5 == 1.6636531716106877d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(7.393111826382582d, 0.4277491431148682d);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double5 = fDistributionImpl2.cumulativeProbability(0.9967719789495215d, 0.9999984104468244d);
        double double7 = fDistributionImpl2.getDomainLowerBound(0.02887716934657425d);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.cumulativeProbability(0.9999763973332203d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.444493761760151E-4d + "'", double5 == 7.444493761760151E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3408876950806238d + "'", double10 == 0.3408876950806238d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.cumulativeProbability((double) ' ');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.04860877630608049d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5326685129511843d);
        double double18 = fDistributionImpl2.getInitialDomain(0.5234420640177013d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.024909805740576035d) + "'", double18 == (-0.024909805740576035d));
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getInitialDomain(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.cumulativeProbability(0.509253301074358d, 0.20416048310264287d);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double19 = fDistributionImpl2.inverseCumulativeProbability(0.05350873685544799d);
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double21 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.004569416631646944d + "'", double19 == 0.004569416631646944d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getInitialDomain((double) 'a');
        double double10 = fDistributionImpl2.cumulativeProbability(1.25d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0210526315789474d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.inverseCumulativeProbability(0.025477995384417838d);
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7103083879489903d + "'", double10 == 0.7103083879489903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.001227638541478935d + "'", double15 == 0.001227638541478935d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getDomainUpperBound(1.04952177738101d);
        double double19 = fDistributionImpl2.getInitialDomain(0.3318389831356192d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double15 = fDistributionImpl2.cumulativeProbability((double) (short) -1, 0.19788692492646354d);
        double double17 = fDistributionImpl2.getInitialDomain(0.011704464104499768d);
        double double20 = fDistributionImpl2.cumulativeProbability(0.6583483451931957d, 2.0127618228740225d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.33409440091453685d + "'", double15 == 0.33409440091453685d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.25d + "'", double17 == 1.25d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.24964292374434738d + "'", double20 == 0.24964292374434738d);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.794431337232113d, (double) 10);
        double double4 = fDistributionImpl2.cumulativeProbability(0.5093634057790148d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.4333769026183856d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5494834255419397d + "'", double4 == 0.5494834255419397d);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainLowerBound(0.5773773436195279d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.031053678956944965d);
        double double18 = fDistributionImpl2.cumulativeProbability(0.01212991729006993d, 0.5865420894413496d);
        double double19 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.053643030346452236d + "'", double18 == 0.053643030346452236d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5641578772655828d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1);
        double double7 = fDistributionImpl2.getDomainLowerBound(0.4898628835849175d);
        double double9 = fDistributionImpl2.getDomainLowerBound(0.16593376295629791d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
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
        java.lang.Class<?> wildcardClass30 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.7976931348623157E308d + "'", double27 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.25d, 100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double6 = fDistributionImpl2.cumulativeProbability(32.0d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-0.28160073981721595d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.883955474884341d + "'", double6 == 0.883955474884341d);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9898804402645663d, 0.2969240624175721d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.2671687285166097d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.07209820539217125d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.20476397886382258d + "'", double4 == 0.20476397886382258d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11816688104897854d + "'", double6 == 0.11816688104897854d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9898804402645663d + "'", double7 == 0.9898804402645663d);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.19845142031994614d);
        double double9 = fDistributionImpl2.getDomainUpperBound(0.5626720221012385d);
        double double11 = fDistributionImpl2.getInitialDomain(0.9999763973332203d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.inverseCumulativeProbability((-0.2983274935364951d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.11015601941480264d) + "'", double11 == (-0.11015601941480264d));
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9898804402645663d, 0.2969240624175721d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9898804402645663d + "'", double3 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.2969240624175721d + "'", double4 == 0.2969240624175721d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9898804402645663d + "'", double5 == 0.9898804402645663d);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(97.0d);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.44582356363844317d);
        double double18 = fDistributionImpl2.getDomainUpperBound(52.0d);
        double double21 = fDistributionImpl2.cumulativeProbability(0.19788692039593597d, 0.40450728918264073d);
        double double23 = fDistributionImpl2.inverseCumulativeProbability(0.25337560979623985d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.41580691019689836d + "'", double12 == 0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9961307247459887d + "'", double16 == 0.9961307247459887d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.01110261427619207d + "'", double21 == 0.01110261427619207d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.7822630030631615d + "'", double23 == 0.7822630030631615d);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.00370446747183093d, 0.1114353339521007d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1114353339521007d + "'", double3 == 0.1114353339521007d);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.cumulativeProbability((-1.129032258064516d));
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.1742528055671888d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.inverseCumulativeProbability(0.40833699687231667d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.09544191337033514 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L), 0.7246966031342408d);
        double double19 = fDistributionImpl2.getDomainUpperBound((-0.9999999999747803d));
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.07348577195844175d);
        double double25 = fDistributionImpl2.cumulativeProbability((-0.4915427677698697d), 0.4566514703525203d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5996052885758513d + "'", double17 == 0.5996052885758513d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.8766146290853194d + "'", double25 == 0.8766146290853194d);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, 0.3919491786229663d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.7640246288297262d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.10715894720040464d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02887716934657425d + "'", double11 == 0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.17865877711653697d + "'", double15 == 0.17865877711653697d);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.491780299474472d, 0.9999999995770263d);
        double double4 = fDistributionImpl2.getDomainLowerBound(2.5491771371666263d);
        double double6 = fDistributionImpl2.getInitialDomain(0.6769703376757946d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.9999999991540527d) + "'", double6 == (-0.9999999991540527d));
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.25d);
        double double10 = fDistributionImpl2.getInitialDomain(0.33409440091453685d);
        double double12 = fDistributionImpl2.getDomainLowerBound(2.097152841112099E-5d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.inverseCumulativeProbability(0.021921852781864093d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.6666666666666667 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.6666666666666667d) + "'", double10 == (-1.6666666666666667d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) '4');
        double double6 = fDistributionImpl2.cumulativeProbability((double) (-1));
        double double8 = fDistributionImpl2.getDomainLowerBound(0.2143698019432957d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double4 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-0.15418046344921968d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain(0.5996052325396897d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.cumulativeProbability(0.3895023980863656d, 33.20158064706674d);
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double19 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double21 = fDistributionImpl2.getInitialDomain(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5366064842062321d + "'", double17 == 0.5366064842062321d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0606060606060606d + "'", double21 == 1.0606060606060606d);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) 1);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain((double) 100);
        double double18 = fDistributionImpl2.cumulativeProbability(0.16511429118720633d, 0.37955994598365783d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.14144663721011858d + "'", double18 == 0.14144663721011858d);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.4892284600732909d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4892284600732909d + "'", double5 == 0.4892284600732909d);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5949357068078883d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.cumulativeProbability(0.9088367397897852d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999995770263d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5949357068078883d + "'", double8 == 0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5627670153714905d + "'", double10 == 0.5627670153714905d);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.1801856291181903d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.5220157123797441d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 0L, 0.31979861116167463d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        double double11 = fDistributionImpl2.getDomainUpperBound(1.0d);
        double double13 = fDistributionImpl2.getInitialDomain(0.1825231602525817d);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1201684622410103d + "'", double4 == 0.1201684622410103d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08793604972328362d + "'", double7 == 0.08793604972328362d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.09901319167563201d) + "'", double9 == (-0.09901319167563201d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.09901319167563201d) + "'", double13 == (-0.09901319167563201d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9205507147766241d);
        double double11 = fDistributionImpl2.getDomainUpperBound(0.7640246288297262d);
        java.lang.Class<?> wildcardClass12 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0204081632653061d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.39602761100391914d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.6748127314868525d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4400340292305161d + "'", double14 == 0.4400340292305161d);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.3040818357099405d);
        double double4 = fDistributionImpl2.cumulativeProbability((-1.6666666666666667d));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.6591065015250168d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.32439517111325245d, 1.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.952694185190773d);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.8284628704001276d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999999915219d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.4892284600732909d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3919492048229929d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getDomainLowerBound(0.8154639584090504d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2109603464415848d + "'", double6 == 1.2109603464415848d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.3919492048229929d + "'", double15 == 0.3919492048229929d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        double double6 = fDistributionImpl2.getInitialDomain(0.4892284600732909d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.33719612012563593d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0204081632653061d + "'", double6 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
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
        double double23 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = fDistributionImpl2.inverseCumulativeProbability(1.855712728135081E-4d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.05900530490454193 upperBound=1.7976931348623157E308");
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.1114353339521007d + "'", double23 == 0.1114353339521007d);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 100L);
        double double16 = fDistributionImpl2.cumulativeProbability(0.3895023980863656d, 0.9293804578921561d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.19506275762925057d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(9.838320889492336E-7d);
        double double22 = fDistributionImpl2.getInitialDomain(0.7551927476169364d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.189836249017317d + "'", double16 == 0.189836249017317d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.5949357068078883d);
        double double11 = fDistributionImpl2.getInitialDomain(0.4479640982107486d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4175939490091192d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.19788692492646354d + "'", double9 == 0.19788692492646354d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double14 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.17235021937116024d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass18 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4664502910454298d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.17235021937116024d);
        double double13 = fDistributionImpl2.getInitialDomain(0.44582356363844317d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.9999999999914339d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.14112703242567148d);
        double double19 = fDistributionImpl2.getDomainUpperBound(0.00638827009754162d);
        double double21 = fDistributionImpl2.cumulativeProbability(0.39770683156309267d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 7.396970722943259E-7d + "'", double17 == 7.396970722943259E-7d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.7728617779639596d + "'", double21 == 0.7728617779639596d);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound(100.0d);
        double double13 = fDistributionImpl2.getInitialDomain(0.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.008610287160087353d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.07209820539217125d + "'", double15 == 0.07209820539217125d);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5641578772655828d, 0.35506433208541105d);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double17 = fDistributionImpl2.cumulativeProbability(0.9898804402645663d, Double.NaN);
        double double19 = fDistributionImpl2.inverseCumulativeProbability(0.794431337232113d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.024636592435883866d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.6636531716106877d + "'", double19 == 1.6636531716106877d);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double20 = fDistributionImpl2.getDomainLowerBound(0.01806785311078775d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double14 = fDistributionImpl2.inverseCumulativeProbability(1.2241878759327988E-4d);
        double double16 = fDistributionImpl2.getInitialDomain(0.1678203749167313d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0606060606060606d + "'", double16 == 1.0606060606060606d);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
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
        double double23 = fDistributionImpl2.getDomainUpperBound(0.053643030346452236d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5189833010988237d + "'", double15 == 0.5189833010988237d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999504708134d + "'", double19 == 0.9999999504708134d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getInitialDomain(0.07908924131400807d);
        double double13 = fDistributionImpl2.getDomainLowerBound(1.2421802126086574d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.28532431475965714d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.4892284600732909d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.1201684622410103d, 0.41580691019689836d);
        double double7 = fDistributionImpl2.cumulativeProbability(0.170796029094279d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4906940248809481d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability(0.4546995573427486d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.32511235824282936 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.11684554078643927d + "'", double5 == 0.11684554078643927d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.051706511785307246d + "'", double7 == 0.051706511785307246d);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double14 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double16 = fDistributionImpl2.cumulativeProbability(1.0210526315789474d);
        double double18 = fDistributionImpl2.cumulativeProbability(0.4142199650266395d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3248137971311367d + "'", double16 == 0.3248137971311367d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.12349798885014796d + "'", double18 == 0.12349798885014796d);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (byte) 10);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.5366657182124845d);
        double double8 = fDistributionImpl2.getInitialDomain(0.22828618836637168d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.5996052325396897d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.19962723736775667d + "'", double10 == 0.19962723736775667d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (byte) 10);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistributionImpl2.inverseCumulativeProbability(0.8754146350390162d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.10298412615657737d, (-0.3667417109622608d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-5.529815966511098E-4d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 100);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.5996052325402953d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.5949357068038229d);
        double double19 = fDistributionImpl2.getDomainUpperBound(0.07212597439971892d);
        double double21 = fDistributionImpl2.inverseCumulativeProbability(0.17284703948349756d);
        double double23 = fDistributionImpl2.getDomainUpperBound(0.3252821340923737d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9453652605193021d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.04952177738101d + "'", double17 == 1.04952177738101d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.8261540218772179d + "'", double21 == 0.8261540218772179d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999873902d);
        double double11 = fDistributionImpl2.getDomainLowerBound(0.3197986111586397d);
        double double13 = fDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.3951424744541511d);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getInitialDomain(0.31672086845579883d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9205507147766241d + "'", double13 == 0.9205507147766241d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9999999999873902d + "'", double16 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.9999999999747803d) + "'", double18 == (-0.9999999999747803d));
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getInitialDomain(7.444493761760151E-4d);
        double double9 = fDistributionImpl2.getDomainLowerBound(0.006071986281712238d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9961307247459887d, (double) 1L);
        double double5 = fDistributionImpl2.cumulativeProbability(0.09509450716293696d, 0.3318389831356192d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1422323555792509d + "'", double5 == 0.1422323555792509d);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L));
        double double19 = fDistributionImpl2.getDomainUpperBound(1.25d);
        double double22 = fDistributionImpl2.cumulativeProbability(0.15830241663757016d, 0.5686677504565198d);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = fDistributionImpl2.inverseCumulativeProbability(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.23091141575454027d + "'", double22 == 0.23091141575454027d);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.28685518143753963d), 0.12464002300904951d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

