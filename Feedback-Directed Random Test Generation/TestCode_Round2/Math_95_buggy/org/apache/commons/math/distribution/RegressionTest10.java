package org.apache.commons.math.distribution;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.5949357068078883d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.6441096650238254d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.19788692492646354d + "'", double9 == 0.19788692492646354d);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.4906940248809481d);
        double double10 = fDistributionImpl2.getInitialDomain(0.7179263404305193d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.49838122445596006d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.29474933881663606d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0606060606060606d + "'", double9 == 1.0606060606060606d);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.491780299474472d, 0.8195918816395871d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.5082607487781732d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8195918816395871d + "'", double3 == 0.8195918816395871d);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.05595719508517638d, 0.09487388796007479d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.19845142031994614d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.029360195877475227d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getInitialDomain(0.5157824391686243d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.029360195877475227d + "'", double9 == 0.029360195877475227d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.04979926911950622d) + "'", double11 == (-0.04979926911950622d));
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double16 = fDistributionImpl2.getInitialDomain((double) 100L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9978662659508416d);
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
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4923052829221457d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability(1.3826603340484837E-4d);
        double double18 = fDistributionImpl2.cumulativeProbability(0.8401372405603859d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4142199650266395d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = fDistributionImpl2.inverseCumulativeProbability(1.25d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.07212597439971892d + "'", double16 == 0.07212597439971892d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5842660434812024d + "'", double18 == 0.5842660434812024d);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.516893766967757d, 0.6716114244165197d);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.491780299474472d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.013076967791032157d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.18893581015230954d, (-0.7920431980908056d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getInitialDomain(0.3306859681104356d);
        double double13 = fDistributionImpl2.getInitialDomain((double) 100L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0204081632653061d + "'", double11 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0204081632653061d + "'", double13 == 1.0204081632653061d);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getInitialDomain((double) ' ');
        double double12 = fDistributionImpl2.cumulativeProbability((double) 100L);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.8195918816395871d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-1.180520121845237E-5d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0606060606060606d + "'", double10 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999915219d + "'", double12 == 0.9999999999915219d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.2579619500249368d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.2208833932477629d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5117515140982648d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.017857674930194845d, 0.17815841044398562d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.inverseCumulativeProbability(0.23494224136497754d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.0977902861946428 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.17815841044398562d + "'", double3 == 0.17815841044398562d);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0016814193820303626d, 0.15830241663757016d);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (short) 100);
        double double6 = fDistributionImpl2.getInitialDomain(0.013443616381931207d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistributionImpl2.inverseCumulativeProbability(0.3168050816845452d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.06401548478113292d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainUpperBound(0.10751568684175394d);
        double double17 = fDistributionImpl2.getInitialDomain(0.10609022031676985d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.16543675376089823d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0204081632653061d + "'", double17 == 1.0204081632653061d);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
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
        double double20 = fDistributionImpl2.getDomainLowerBound(0.2807609622032742d);
        double double22 = fDistributionImpl2.getInitialDomain(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound((-1.0d));
        double double10 = fDistributionImpl2.cumulativeProbability((-0.3667417109622608d));
        double double12 = fDistributionImpl2.getDomainLowerBound(0.18685162596174398d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.41580691019689836d, Double.NaN);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.11215527694889071d);
        double double8 = fDistributionImpl2.getInitialDomain(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.755877099187982d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getInitialDomain((double) ' ');
        double double12 = fDistributionImpl2.getDomainLowerBound(0.4898628835849175d);
        double double14 = fDistributionImpl2.inverseCumulativeProbability(0.16128506917215066d);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.993299316909869d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.9544400645768935d, Double.NaN);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0606060606060606d + "'", double10 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.042048682708840046d + "'", double14 == 0.042048682708840046d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.308889377353925d + "'", double16 == 8.308889377353925d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.25d, 100.0d);
        double double4 = fDistributionImpl2.cumulativeProbability((double) (short) 10);
        double double7 = fDistributionImpl2.cumulativeProbability(0.14335493966332769d, 0.6401770331730183d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.999037593690436d + "'", double4 == 0.999037593690436d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3032299156718087d + "'", double7 == 0.3032299156718087d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 1.2109603464415848d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.049950031800927046d);
        double double6 = fDistributionImpl2.getInitialDomain(7.396970722943259E-7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.02561474455296001d) + "'", double6 == (-0.02561474455296001d));
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L));
        double double19 = fDistributionImpl2.getInitialDomain(0.0010722599132668223d);
        double double21 = fDistributionImpl2.cumulativeProbability(0.1345060112435601d);
        double double23 = fDistributionImpl2.getInitialDomain((double) 100L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.25d + "'", double19 == 1.25d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.27855365220112865d + "'", double21 == 0.27855365220112865d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.25d + "'", double23 == 1.25d);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 1, Double.POSITIVE_INFINITY);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 100);
        double double6 = fDistributionImpl2.getDomainUpperBound(35.0d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getInitialDomain(0.6158682675681332d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9961307247459887d, (double) 1L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5642254869194474d);
        double double6 = fDistributionImpl2.getInitialDomain(6.158359761090735E-184d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.3929763913338056d) + "'", double6 == (-0.3929763913338056d));
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6591068676979391d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.10479689180895158d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.8026648265055725d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
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
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-1.180520121845237E-5d));
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.07908924131400807d + "'", double20 == 0.07908924131400807d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5366657182124845d, 0.49838122445596006d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.inverseCumulativeProbability(0.09393831846416734d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.3318959729145604 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.49838122445596006d + "'", double3 == 0.49838122445596006d);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) '4');
        double double6 = fDistributionImpl2.getDomainUpperBound(1.334173577483257E-5d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.04253651331020525d);
        double double11 = fDistributionImpl2.cumulativeProbability((-3.4415641784349265E-6d));
        double double13 = fDistributionImpl2.cumulativeProbability(0.5658786927337371d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8973734399573436d + "'", double13 == 0.8973734399573436d);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability((double) (short) 10);
        double double17 = fDistributionImpl2.getInitialDomain(100.0d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.7577135881093972d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9967719789495215d + "'", double15 == 0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0606060606060606d + "'", double17 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6100237015351849d + "'", double19 == 0.6100237015351849d);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double9 = fDistributionImpl2.getInitialDomain((double) 1L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 10);
        double double13 = fDistributionImpl2.getInitialDomain((double) 100);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability(0.004141886739706592d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.inverseCumulativeProbability((-0.6441096650238254d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.4905128116056108E-8d + "'", double16 == 2.4905128116056108E-8d);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double20 = fDistributionImpl2.cumulativeProbability(0.02838644361959202d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.13282661622930325d + "'", double20 == 0.13282661622930325d);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 9.838320889492336E-7d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.06954427012843875d);
        double double6 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.39151156165974016d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.975797618213875E-6d + "'", double6 == 6.975797618213875E-6d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6.4047445061943264E-6d + "'", double8 == 6.4047445061943264E-6d);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.028994518071016717d, 5.80168652720234E-4d);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.cumulativeProbability(0.05350873685544799d, 0.17235021937116024d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.1201684622410103d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.41580691019689836d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.cumulativeProbability(0.6171780722261304d, 0.6065454203287214d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.017857674930194845d + "'", double8 == 0.017857674930194845d);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9898804402645663d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111596346d);
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.45447932157420906d);
        double double12 = fDistributionImpl2.getInitialDomain(0.0d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.7835361335394757d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.031324798049849986d + "'", double10 == 0.031324798049849986d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.25d + "'", double12 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3168050816845452d, 0.05595719508517638d);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.5004087508678674d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.6289333745278087d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.27687764751802335d);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4906940248809481d + "'", double11 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.3897742347849355d + "'", double15 == 0.3897742347849355d);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4936605546990172d, 2.0606060606060606d);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double10 = fDistributionImpl2.getInitialDomain(0.5093634057790148d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.02723373766299686d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability(0.09487388796007479d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.02723373766299686d + "'", double13 == 0.02723373766299686d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.021726824519613053d + "'", double15 == 0.021726824519613053d);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.029360195877475227d);
        double double17 = fDistributionImpl2.getInitialDomain((-0.2624723670828401d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0606060606060606d + "'", double17 == 1.0606060606060606d);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) 10.0f);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability((-1.0416666666666667d), 0.3020338789555518d);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.11325382736064116d);
        double double18 = fDistributionImpl2.getDomainUpperBound(0.345456265936167d);
        double double20 = fDistributionImpl2.cumulativeProbability(0.9999999999915219d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.024636592435883866d + "'", double14 == 0.024636592435883866d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5359273049216952d + "'", double20 == 0.5359273049216952d);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
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
        double double21 = fDistributionImpl2.getDomainLowerBound(0.09988356017803013d);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = fDistributionImpl2.cumulativeProbability(0.31976302338338025d, 0.15830241663757016d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double14 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double16 = fDistributionImpl2.cumulativeProbability(1.0210526315789474d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.43199198024659174d, 0.43276459841306814d);
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(7.444493761760151E-4d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.024636592435883866d);
        double double26 = fDistributionImpl2.getDomainUpperBound(0.5658786927327883d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3248137971311367d + "'", double16 == 0.3248137971311367d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.408167631624437E-4d + "'", double19 == 3.408167631624437E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.7976931348623157E308d + "'", double26 == 1.7976931348623157E308d);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(2.3610123714643496E-5d, 0.07212597439971892d);
        double double4 = fDistributionImpl2.getInitialDomain(0.6554278909379809d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.03741218224943982d) + "'", double4 == (-0.03741218224943982d));
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double14 = fDistributionImpl2.cumulativeProbability(0.4664502910454298d);
        double double16 = fDistributionImpl2.getInitialDomain(0.9967719789495215d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4898628835849175d + "'", double14 == 0.4898628835849175d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.25d + "'", double16 == 1.25d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = fDistributionImpl2.cumulativeProbability((double) (short) 1);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability(0.20196314831799295d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6772895678779969d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistributionImpl2.inverseCumulativeProbability(0.481650468954031d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.5120467423783995 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.02838644361959202d + "'", double13 == 0.02838644361959202d);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double16 = fDistributionImpl2.getInitialDomain(0.05468886506853487d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.43199198024659174d);
        double double19 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.25d + "'", double16 == 1.25d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.6037071022078223d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.008036077048780232d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 1.0f, 0.883955474884341d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.01806785311078775d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(0.39770683156309267d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.40826190741378604d);
        double double11 = fDistributionImpl2.getDomainUpperBound(0.5857462352308387d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.03993600820713539d + "'", double9 == 0.03993600820713539d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.1911550227361217d, 0.10426004742398015d);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.31979861116167463d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.008036077048780232d);
        double double15 = fDistributionImpl2.getInitialDomain(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.315320556750493E-26d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.6942683376225791d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1801856291181903d + "'", double11 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.06965997645678441d + "'", double13 == 0.06965997645678441d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.06699575007425973d, 0.03505821861061997d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(0.1201684622410103d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.017841861241217463 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.14112703242567148d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14112703242567148d + "'", double12 == 0.14112703242567148d);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(Double.POSITIVE_INFINITY, 97.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(2.097152841112099E-5d);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainLowerBound(0.9922790709763858d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6464662756085405d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.02838644361959202d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0962131787283358d + "'", double9 == 0.0962131787283358d);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
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
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.004625531999995152d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.04952177738101d, 0.14869246204751185d);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double13 = fDistributionImpl2.getDomainLowerBound(0.9999999238243996d);
        double double15 = fDistributionImpl2.inverseCumulativeProbability(0.002399087173802834d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.50367732847834E-6d + "'", double15 == 9.50367732847834E-6d);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.6037071022078223d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.008036077048780232d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.05468886506853487d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.02838644361959202d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.43276459841306814d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.06699575007425973d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9088759711888426d + "'", double10 == 0.9088759711888426d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 0.5949357068078883d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4239582314034682d);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.06610907006332722d, 0.04503703868667216d);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.25d);
        double double12 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.9965956918620645d);
        double double16 = fDistributionImpl2.getDomainUpperBound((-0.009116282380880985d));
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.033785291755995456d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = fDistributionImpl2.cumulativeProbability(1.0192812158854847d, 0.6171780722261304d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (short) 10);
        double double9 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double11 = fDistributionImpl2.cumulativeProbability(0.5626720221012385d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.inverseCumulativeProbability((-0.034684337134819186d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.43276459841306814d + "'", double7 == 0.43276459841306814d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.9999999999747803d) + "'", double9 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1855184662093986d + "'", double11 == 0.1855184662093986d);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999984104468244d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.4892284600732909d, (double) (short) 1);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.3318389831356192d);
        double double19 = fDistributionImpl2.getDomainLowerBound(1.25d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.1114353339521007d + "'", double15 == 0.1114353339521007d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.003252146656602481d, 0.6276037379948466d);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
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
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.27687764751802335d);
        double double28 = fDistributionImpl2.getDomainUpperBound(0.9922790709763858d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5189833010988237d + "'", double15 == 0.5189833010988237d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999504708134d + "'", double19 == 0.9999999504708134d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.44208869850608057d + "'", double22 == 0.44208869850608057d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.007681534962120051d + "'", double24 == 0.007681534962120051d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.7976931348623157E308d + "'", double28 == 1.7976931348623157E308d);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound((-1.0d));
        double double10 = fDistributionImpl2.getDomainUpperBound(0.4534659472302877d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.2639273029648429d);
        double double14 = fDistributionImpl2.getInitialDomain(0.025789138102653757d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.08793604972328362d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.6037071022078223d);
        double double19 = fDistributionImpl2.getDomainLowerBound(0.010367711397661706d);
        double double21 = fDistributionImpl2.getInitialDomain((-0.17434575632550214d));
        double double22 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.3826603340484837E-4d + "'", double17 == 1.3826603340484837E-4d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0210526315789474d + "'", double21 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8597859255962592d, 0.6464662756085405d);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7002018597835067d, 1.2500001488198675d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.19788692492646354d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.17379970502642506d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.20196314831799295d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6464662756085405d + "'", double6 == 0.6464662756085405d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6559581390100542d + "'", double8 == 0.6559581390100542d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.2500001488198675d + "'", double9 == 1.2500001488198675d);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.061665697479154d, 0.33059992956874545d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.18620592257722834d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
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
        double double27 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.18506771891995114d);
        double double32 = fDistributionImpl2.cumulativeProbability(0.008610287911435281d, 0.9947550599124061d);
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.2898669402748961d + "'", double32 == 0.2898669402748961d);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, (-0.47077968881994314d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound((-1.0d));
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound(0.5641578772655828d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.3617173715955563d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.25d);
        double double10 = fDistributionImpl2.getInitialDomain(0.33409440091453685d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.inverseCumulativeProbability((-0.24327086809847961d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.6666666666666667d) + "'", double10 == (-1.6666666666666667d));
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.33059992956874545d, 0.8226235604098047d);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5093634057790148d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), 0.3895023980863656d);
        double double18 = fDistributionImpl2.getDomainLowerBound(0.0025999058639148286d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5093634057790148d + "'", double13 == 0.5093634057790148d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4892284600732909d + "'", double16 == 0.4892284600732909d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4892284600732909d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getInitialDomain(3.653735533687078E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(8.900376166804435E-12d, 0.055996798032908884d);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 100);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.5996052325402953d);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
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
        double double22 = fDistributionImpl2.getDomainLowerBound((-0.2624723670828401d));
        double double24 = fDistributionImpl2.cumulativeProbability(0.3168052840864677d);
        double double26 = fDistributionImpl2.getDomainLowerBound(0.07340177854841759d);
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.07875957442888142d + "'", double24 == 0.07875957442888142d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        double double6 = fDistributionImpl2.getInitialDomain(0.010367711397661706d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.836989559568376d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5523306409467954d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0204081632653061d + "'", double6 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.05350873685544799d, Double.NaN);
        double double15 = fDistributionImpl2.getDomainUpperBound(1.2214738003873964E-5d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3210963486747651d);
        double double20 = fDistributionImpl2.cumulativeProbability((-0.35319435852748904d), 0.17637974128336592d);
        double double21 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double22 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.059278978129763016d + "'", double20 == 0.059278978129763016d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.008610287160087353d, 0.7729700281146208d);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.31979861116167463d);
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.5433539298660959d);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.26479899700216447d);
        double double17 = fDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1801856291181903d + "'", double11 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5996052325396897d + "'", double13 == 0.5996052325396897d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 1.0f, 0.883955474884341d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.21578335101162535d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.2449890523218835d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.17022468012464517d + "'", double6 == 0.17022468012464517d);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.cumulativeProbability(0.19845142031994614d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.6640218712845615d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.04860877630608049d + "'", double12 == 0.04860877630608049d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2478605520303111d + "'", double14 == 0.2478605520303111d);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
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
        // The following exception was thrown during execution in test generation
        try {
            double double21 = fDistributionImpl2.inverseCumulativeProbability(0.445614258311395d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.24206185443373315 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02887716934657425d + "'", double11 == 0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain(0.5996052325396897d);
        double double15 = fDistributionImpl2.getDomainUpperBound((-0.2004508130138858d));
        double double17 = fDistributionImpl2.getInitialDomain(0.05595719508517638d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.23587424144892077d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0606060606060606d + "'", double17 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.36977137965269913d + "'", double19 == 0.36977137965269913d);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainUpperBound(Double.NaN);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.26465518129632637d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.inverseCumulativeProbability(0.07209820539217125d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainLowerBound(0.33409440091453685d);
        double double20 = fDistributionImpl2.getDomainUpperBound(4.436811458740537E-9d);
        double double22 = fDistributionImpl2.getInitialDomain(0.915313858517923d);
        double double23 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0606060606060606d + "'", double22 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainLowerBound(0.33409440091453685d);
        double double20 = fDistributionImpl2.getDomainUpperBound(4.436811458740537E-9d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.19788692039593597d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8609681162053344d, 10.0d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.4633919262405889d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.11821926384459756d);
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8609681162053344d + "'", double7 == 0.8609681162053344d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.013076967791032157d + "'", double10 == 0.013076967791032157d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 1L);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.15885654345209954d, 209.24627349950515d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9152817923562132d + "'", double14 == 0.9152817923562132d);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.05595719508517638d, 0.09487388796007479d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.19845142031994614d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.5193402098261183d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.031053678956944965d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.5996052325402953d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.049950031800927046d + "'", double13 == 0.049950031800927046d);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.14958173588002702d, 0.7611385915913281d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainLowerBound(0.22570132078226077d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14958173588002702d + "'", double3 == 0.14958173588002702d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.04199995021237534d, 0.018735014698028074d);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.3248137971311367d);
        double double18 = fDistributionImpl2.getInitialDomain(0.4534659472302877d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.17857439941260683d + "'", double16 == 0.17857439941260683d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0606060606060606d + "'", double18 == 1.0606060606060606d);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass8 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double14 = fDistributionImpl2.getDomainUpperBound((double) '#');
        double double16 = fDistributionImpl2.cumulativeProbability(0.1855184662093986d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.018735014698028074d);
        double double20 = fDistributionImpl2.getInitialDomain(1.8984496419708186E-6d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3306859681104356d + "'", double16 == 0.3306859681104356d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.009456087316443743d) + "'", double20 == (-0.009456087316443743d));
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 100L);
        double double16 = fDistributionImpl2.cumulativeProbability(0.3895023980863656d, 0.9293804578921561d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.19506275762925057d);
        double double20 = fDistributionImpl2.getDomainLowerBound((-0.15418046344921968d));
        double double22 = fDistributionImpl2.getDomainUpperBound(0.3210963486747651d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.189836249017317d + "'", double16 == 0.189836249017317d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7976931348623157E308d + "'", double22 == 1.7976931348623157E308d);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(0.2579619500249368d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.01806785311078775d, 0.33096804704038296d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.31793596484675873d + "'", double16 == 0.31793596484675873d);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.28159241378169547d);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.32439517111325245d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability((-0.18815706944887178d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.28159241378169547d + "'", double11 == 0.28159241378169547d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8609681162053344d, 10.0d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5957283306792327d);
        double double8 = fDistributionImpl2.getDomainUpperBound((-0.13043072741598616d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
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
        double double29 = fDistributionImpl2.cumulativeProbability(1.2241878759327988E-4d, 0.883955474884341d);
        double double31 = fDistributionImpl2.getDomainUpperBound(0.001227638541478935d);
        double double33 = fDistributionImpl2.getDomainLowerBound(0.09393831846416734d);
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.6221137160076774d + "'", double29 == 0.6221137160076774d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.7976931348623157E308d + "'", double31 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
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
        double double24 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7002018597835067d, 7.396970722943259E-7d);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9898804402645663d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.9898419264720365d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.03041485845025d + "'", double9 == 10.03041485845025d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDomainUpperBound(0.06545795869712367d);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
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
        double double23 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass24 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6289333745278087d + "'", double18 == 0.6289333745278087d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7976931348623157E308d + "'", double22 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6421475738304312d, 0.01324439801565569d);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound((-1.0d));
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability(0.38797868490824095d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.05036522785553632d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.11164626798106347d + "'", double13 == 0.11164626798106347d);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) 1);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain((double) 100);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.008009325319447534d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L));
        double double19 = fDistributionImpl2.getInitialDomain(0.0010722599132668223d);
        double double21 = fDistributionImpl2.cumulativeProbability(0.1345060112435601d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9947550599124061d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.25d + "'", double19 == 1.25d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.27855365220112865d + "'", double21 == 0.27855365220112865d);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, 0.8026648265055725d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.8933186128357743d);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, 0.17235021937116024d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.39770683156309267d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistributionImpl2.cumulativeProbability(0.1941800855070006d, 1.3826603340484837E-4d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.17235021937116024d + "'", double3 == 0.17235021937116024d);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain((double) 100);
        double double15 = fDistributionImpl2.getDomainUpperBound(1.0d);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.cumulativeProbability(0.6553897895273384d);
        double double20 = fDistributionImpl2.getDomainUpperBound((-0.9999999999999996d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.21972596879282602d + "'", double18 == 0.21972596879282602d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.1801856291181903d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double21 = fDistributionImpl2.cumulativeProbability(7.570242640199276E-4d, 0.35760002498487775d);
        double double23 = fDistributionImpl2.inverseCumulativeProbability(0.35149728096692545d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.05468886506853487d + "'", double16 == 0.05468886506853487d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.4154516245596553d + "'", double21 == 0.4154516245596553d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.22081059522433147d + "'", double23 == 0.22081059522433147d);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getInitialDomain(0.031324798049849986d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(8.292738272749505E-6d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5004087508678674d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1);
        double double20 = fDistributionImpl2.cumulativeProbability(0.6046935761651037d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.031135097668851475d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.4207707438356478d + "'", double20 == 0.4207707438356478d);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
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
        fDistributionImpl2.setDenominatorDegreesOfFreedom(6.88310466822339E-6d);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = fDistributionImpl2.inverseCumulativeProbability(3.653735533687078E-4d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-3.4415641784349265E-6 upperBound=1.7976931348623157E308");
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
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.2579619500249368d, 0.2572779724487226d);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.9999999999873902d);
        double double10 = fDistributionImpl2.getInitialDomain(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3197986111586397d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.008009325319447534d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5004087508678674d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.9967719789495215d);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 0L);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain(0.10980244711968297d);
        double double18 = fDistributionImpl2.cumulativeProbability(0.019226808913269746d, 0.2197378803455035d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5004087508678674d + "'", double13 == 0.5004087508678674d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.23343707467996933d + "'", double18 == 0.23343707467996933d);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double10 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.794431337232113d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.04663458080884253d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0962131787283358d, 0.09616185890761472d);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.5004087508678674d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.6289333745278087d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        double double18 = fDistributionImpl2.getDomainLowerBound(0.6553251431808038d);
        double double20 = fDistributionImpl2.cumulativeProbability(0.9999999999999998d);
        double double22 = fDistributionImpl2.getDomainUpperBound(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9453652605193021d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4906940248809481d + "'", double11 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6591068676950343d + "'", double16 == 0.6591068676950343d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6591068676979397d + "'", double20 == 0.6591068676979397d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7976931348623157E308d + "'", double22 == 1.7976931348623157E308d);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double11 = fDistributionImpl2.cumulativeProbability(0.07209820539217125d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9183731134433936d + "'", double11 == 0.9183731134433936d);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.07212597439971892d, 0.0716656184434663d);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.41580691019689836d, (double) (short) 100);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainLowerBound(0.025410217212689466d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.1825231602525817d, 0.1422323555792509d);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability((-1.0416666666666667d), 0.3020338789555518d);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.11325382736064116d);
        double double18 = fDistributionImpl2.getDomainUpperBound(0.345456265936167d);
        double double19 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.024636592435883866d + "'", double14 == 0.024636592435883866d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
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
        double double24 = fDistributionImpl2.getInitialDomain(0.9747396948203215d);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = fDistributionImpl2.cumulativeProbability(0.3885952696717879d, 0.33720669517494845d);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.21150108457503464d, 1.2421802126086574d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.05028488401486397d);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.049950031800927046d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4394515874848486d);
        double double18 = fDistributionImpl2.getDomainLowerBound(0.40833699687231667d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5686677504565198d, 0.04860877630608049d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.14777248244329366d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8284628704001276d, 0.6171780722261304d);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) 1);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain((double) 100);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass17 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9898804402645663d);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.23587424144892077d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4009893970905954d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999958149977d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.42370716420032145d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8609681162053344d, 10.0d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double6 = fDistributionImpl2.cumulativeProbability(2.461837621104517E-9d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.5079066809145213E-4d + "'", double6 == 1.5079066809145213E-4d);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.41580691019689836d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.20272463477570307d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.07609892745584163d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.19788692492646354d, 0.11215527694889071d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(0.2215131472835244d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.05940916410096846 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.11215527694889071d + "'", double3 == 0.11215527694889071d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.19788692492646354d + "'", double4 == 0.19788692492646354d);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5366657182124845d, 0.025789138102653757d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.00370446747183093d);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double8 = fDistributionImpl2.cumulativeProbability(0.018345231285955332d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-0.9799636396743291d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.3610123714643496E-5d + "'", double8 == 2.3610123714643496E-5d);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.6591065015250168d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.13759165633724676d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.cumulativeProbability(0.516893766967757d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.2449890523218835d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999999999873902d + "'", double5 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.13759165633724676d + "'", double10 == 0.13759165633724676d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.7613354516717058d + "'", double12 == 0.7613354516717058d);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.5189833010988237d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.0d, Double.NaN);
        double double8 = fDistributionImpl2.cumulativeProbability(0.30278624188592324d, 0.9453652605193021d);
        double double10 = fDistributionImpl2.cumulativeProbability((-0.42787428821980134d));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.10609022031676985d + "'", double8 == 0.10609022031676985d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getDomainLowerBound(1.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9293804578921561d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 10);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4892284600732909d);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.1674348870196004d);
        double double8 = fDistributionImpl2.getInitialDomain(0.4914636803260138d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
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
        double double22 = fDistributionImpl2.getDomainLowerBound((-0.2624723670828401d));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.26166495153015507d);
        double double26 = fDistributionImpl2.getDomainUpperBound(0.3220459516792461d);
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.7976931348623157E308d + "'", double26 == 1.7976931348623157E308d);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double4 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.04366678567633304d);
        double double10 = fDistributionImpl2.getInitialDomain((double) '#');
        double double12 = fDistributionImpl2.getDomainLowerBound(0.0500780269138917d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
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
        double double20 = fDistributionImpl2.getDomainLowerBound(0.14112703242567148d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9999999238243996d + "'", double15 == 0.9999999238243996d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.8284628704001276d);
        double double18 = fDistributionImpl2.inverseCumulativeProbability(0.7557224019288303d);
        double double20 = fDistributionImpl2.getDomainUpperBound(0.16510007084584888d);
        double double22 = fDistributionImpl2.getDomainLowerBound(0.02586733482168741d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.3515003513676351d + "'", double18 == 1.3515003513676351d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6758256576139563d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.7976931348623157E308d);
        double double12 = fDistributionImpl2.getInitialDomain(0.7043071535892672d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.7103083879489903d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.021921852781864093d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistributionImpl2.cumulativeProbability(0.5985467289981988d, 0.32764978063013356d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0666666666666667d + "'", double12 == 1.0666666666666667d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound((double) (byte) 100);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) '#');
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainUpperBound(0.3040818357099405d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.13896755257900706d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (byte) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5366657182124845d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0210526315789474d);
        double double14 = fDistributionImpl2.getInitialDomain((double) (short) 100);
        double double16 = fDistributionImpl2.cumulativeProbability((-0.3667417109622608d));
        double double18 = fDistributionImpl2.getInitialDomain(0.13255964541702003d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.3667417109622608d) + "'", double14 == (-0.3667417109622608d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.3667417109622608d) + "'", double18 == (-0.3667417109622608d));
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4664502910454298d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.17235021937116024d);
        double double13 = fDistributionImpl2.getInitialDomain(0.44582356363844317d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.cumulativeProbability(0.5433539298658748d, 0.1742528055671888d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.31979861116167463d);
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.5433539298660959d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.16510007084584888d);
        double double17 = fDistributionImpl2.getInitialDomain(0.36957316110237126d);
        double double19 = fDistributionImpl2.getInitialDomain(0.13273752547112472d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1801856291181903d + "'", double11 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5996052325396897d + "'", double13 == 0.5996052325396897d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.25d + "'", double17 == 1.25d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.25d + "'", double19 == 1.25d);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability(32.0d, 35.0d);
        double double13 = fDistributionImpl2.getDomainUpperBound(2.6014040918805166E-8d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getInitialDomain(0.39602761100391914d);
        double double18 = fDistributionImpl2.cumulativeProbability(0.10426004742398015d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.006071986281712238d + "'", double11 == 0.006071986281712238d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0025565728520377893d + "'", double18 == 0.0025565728520377893d);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
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
        java.lang.Class<?> wildcardClass27 = fDistributionImpl2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.5004087508678674d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.6289333745278087d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        double double18 = fDistributionImpl2.getDomainLowerBound(0.6553251431808038d);
        double double20 = fDistributionImpl2.cumulativeProbability(0.9999999999999998d);
        double double22 = fDistributionImpl2.getDomainUpperBound(0.0d);
        double double23 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4906940248809481d + "'", double11 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6591068676950343d + "'", double16 == 0.6591068676950343d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6591068676979397d + "'", double20 == 0.6591068676979397d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7976931348623157E308d + "'", double22 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability(1.2109603464415848d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(10.0d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.13887199034337472d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.33825919314095565d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.794431337232113d + "'", double9 == 0.794431337232113d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.338602975074204E-7d + "'", double13 == 5.338602975074204E-7d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.005144678448339782d + "'", double15 == 0.005144678448339782d);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) ' ', 0.794431337232113d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.06954427012843875d);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.06954427012843875d + "'", double5 == 0.06954427012843875d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9898804402645663d, 0.2969240624175721d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.32386298675112735d);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.22000253883901427d + "'", double4 == 0.22000253883901427d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.189836249017317d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double19 = fDistributionImpl2.getDomainLowerBound(0.0010665602861507125d);
        double double21 = fDistributionImpl2.getDomainLowerBound(0.34211877158633835d);
        double double22 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.794431337232113d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.2197378803455035d);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.23076288400994444d);
        double double12 = fDistributionImpl2.getDomainLowerBound(1.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999915219d);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.9999999999915219d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.inverseCumulativeProbability(0.999852177434338d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.9999999999830438 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.06401548478113292d + "'", double10 == 0.06401548478113292d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, 0.03896274758465178d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9205507147766241d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.13759165633724676d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.inverseCumulativeProbability(0.4221960238655337d);
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
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = fDistributionImpl2.cumulativeProbability((double) (short) 1);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580698164526403d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(2.0606060606060606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.04366678567633304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) (short) 100);
        double double12 = fDistributionImpl2.cumulativeProbability((double) 0L);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.24734127840988748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3895024214486992d, 1.2622342631866731E-22d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(0.8401372405603859d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-6.311171315933366E-23 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain(0.5996052325396897d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.cumulativeProbability(0.3895023980863656d, 33.20158064706674d);
        double double19 = fDistributionImpl2.getInitialDomain(0.20909172880811788d);
        double double21 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double23 = fDistributionImpl2.cumulativeProbability(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.2081468676999531d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5366064842062321d + "'", double17 == 0.5366064842062321d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0606060606060606d + "'", double19 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainLowerBound(0.3197986111596346d);
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.33369676647384544d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.07212597439971892d, 0.09487388796007479d);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double9 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double11 = fDistributionImpl2.getDomainLowerBound(0.3168052840864677d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.inverseCumulativeProbability(0.5162782139719305d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.02723373766299686d, 0.6046935761651037d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.755683952741227d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.37955994598365783d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9188056009222301d + "'", double4 == 0.9188056009222301d);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999873902d);
        double double11 = fDistributionImpl2.getInitialDomain(0.0027198323247858195d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.018345231285955332d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.9999999999747803d) + "'", double11 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double20 = fDistributionImpl2.getDomainLowerBound(0.7103085841908984d);
        double double21 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double23 = fDistributionImpl2.inverseCumulativeProbability(0.8284628704001276d);
        double double25 = fDistributionImpl2.inverseCumulativeProbability(0.5857462352308387d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.356197670595518d + "'", double23 == 1.356197670595518d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0766347745437355d + "'", double25 == 1.0766347745437355d);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L));
        double double19 = fDistributionImpl2.getInitialDomain(1.6636531716106877d);
        double double20 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double22 = fDistributionImpl2.getDomainUpperBound(0.9617879654471545d);
        double double24 = fDistributionImpl2.getDomainUpperBound(0.13255964541702003d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.25d + "'", double19 == 1.25d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7976931348623157E308d + "'", double22 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.7976931348623157E308d + "'", double24 == 1.7976931348623157E308d);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = fDistributionImpl2.inverseCumulativeProbability(0.4947041238000625d);
        double double16 = fDistributionImpl2.getInitialDomain(0.45484514927563435d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3703355715042395d, 0.009486956849729777d);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.05874195300682197d, 0.569673563164277d);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1);
        double double7 = fDistributionImpl2.getDomainLowerBound(0.4898628835849175d);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999238243996d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.08419329170293993d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.08928857059019835d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7697802070976306d + "'", double14 == 0.7697802070976306d);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5949357068078883d, (double) (short) 1);
        double double4 = fDistributionImpl2.getInitialDomain(2.3610123714643496E-5d);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistributionImpl2.inverseCumulativeProbability(6.864885594867752d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.07968601740827608d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.010525370129759506d + "'", double13 == 0.010525370129759506d);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.43276459841306814d);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double12 = fDistributionImpl2.getInitialDomain(1.3515003513676351d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.097152841112099E-5d + "'", double8 == 2.097152841112099E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0210526315789474d + "'", double12 == 1.0210526315789474d);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (short) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3895024214486992d);
        double double21 = fDistributionImpl2.getDomainLowerBound(0.17637974128336592d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6758256576139563d + "'", double17 == 0.6758256576139563d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8585643081732904d, 0.43906017126509644d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(0.5062857921531189d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.28127936976337004 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.cumulativeProbability(0.05350873685544799d, 0.17235021937116024d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.1201684622410103d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1L);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.3210963486747651d);
        double double16 = fDistributionImpl2.getDomainUpperBound(8.411646958960975E-7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.017857674930194845d + "'", double8 == 0.017857674930194845d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain(0.008036077048780232d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.2589160113618819d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0666666666666667d + "'", double8 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double10 = fDistributionImpl2.getInitialDomain(0.5093634057790148d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(0.1345060112435601d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.06308506927156177d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0666666666666667d + "'", double13 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.2845958724151535E-5d + "'", double15 == 3.2845958724151535E-5d);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
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
        double double22 = fDistributionImpl2.getInitialDomain(0.11215527694889071d);
        double double24 = fDistributionImpl2.getInitialDomain(0.03805921542661744d);
        java.lang.Class<?> wildcardClass25 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4906940248809481d + "'", double11 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6591068676950343d + "'", double16 == 0.6591068676950343d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2601891955685284d + "'", double20 == 0.2601891955685284d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.2004508130138858d) + "'", double22 == (-0.2004508130138858d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.2004508130138858d) + "'", double24 == (-0.2004508130138858d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
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
        double double22 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double23 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.002393864708003338d);
        double double27 = fDistributionImpl2.cumulativeProbability(0.17637974128336592d);
        double double28 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double30 = fDistributionImpl2.getInitialDomain(0.14405562398547067d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9967719789495215d + "'", double17 == 0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9999999999915219d + "'", double22 == 0.9999999999915219d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.006788379530718425d + "'", double27 == 0.006788379530718425d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.002393864708003338d + "'", double28 == 0.002393864708003338d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-0.0011983667178982803d) + "'", double30 == (-0.0011983667178982803d));
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.9999984104468244d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainLowerBound(0.7822630030631615d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4906940248809481d + "'", double3 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.05595719508517638d, 0.09487388796007479d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.19845142031994614d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.5193402098261183d);
        double double10 = fDistributionImpl2.getDomainLowerBound((-0.8329721894028081d));
        double double12 = fDistributionImpl2.cumulativeProbability(0.14637555387850465d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.24734127840988748d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.615533656743387d + "'", double12 == 0.615533656743387d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.62359584062285d + "'", double14 == 0.62359584062285d);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double10 = fDistributionImpl2.getDomainUpperBound((-0.9799636396743291d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.5189833010988237d);
        double double4 = fDistributionImpl2.getInitialDomain(0.4923052829221457d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7103083879489903d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getInitialDomain((double) ' ');
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3504236660423056d) + "'", double4 == (-0.3504236660423056d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7103083879489903d + "'", double9 == 0.7103083879489903d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.3504236660423056d) + "'", double11 == (-0.3504236660423056d));
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4898628835849175d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6739693374503183d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.10426004742398015d, 0.44582356363844317d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.4364574949518336d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, 0.0028230287369841434d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.680275844215834d, 0.5433539298660959d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.30328776666520557d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.02838644361959202d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.2421802126086574d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.33719612012563593d + "'", double4 == 0.33719612012563593d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.07950247471523997d + "'", double8 == 0.07950247471523997d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.680275844215834d + "'", double9 == 0.680275844215834d);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.05350873685544799d, Double.NaN);
        double double15 = fDistributionImpl2.getDomainUpperBound(1.2214738003873964E-5d);
        double double17 = fDistributionImpl2.getInitialDomain(0.32764978063013356d);
        double double20 = fDistributionImpl2.cumulativeProbability((-0.283649731682333d), 3.326962510329631E-5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0015623511994471E-18d + "'", double20 == 1.0015623511994471E-18d);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double10 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.794431337232113d);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.0010665602861507125d);
        double double8 = fDistributionImpl2.getInitialDomain(0.7036870834181062d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass10 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.658968138246198d) + "'", double8 == (-0.658968138246198d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) 10.0f);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.004141886739706592d);
        double double10 = fDistributionImpl2.getInitialDomain(0.06699575007425973d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.39770683156309267d, (double) (byte) 10);
        double double5 = fDistributionImpl2.cumulativeProbability(0.33096804704038296d, 0.6270029939100311d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.07679735199350513d + "'", double5 == 0.07679735199350513d);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.25d, 100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(3.408167631624437E-4d);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 1, (double) 10);
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.30114392512561017d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.30114392512561017d + "'", double7 == 0.30114392512561017d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.30114392512561017d + "'", double8 == 0.30114392512561017d);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.41580691019689836d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5004087508678674d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5004087508678674d + "'", double17 == 0.5004087508678674d);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        double double13 = fDistributionImpl2.getInitialDomain(0.9999999999914339d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.3168052840864677d);
        double double17 = fDistributionImpl2.getInitialDomain(0.28159241378169547d);
        double double19 = fDistributionImpl2.inverseCumulativeProbability(6.481806365604883E-142d);
        double double21 = fDistributionImpl2.getInitialDomain(0.345456265936167d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.41580691019689836d + "'", double11 == 0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.25d + "'", double17 == 1.25d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.25d + "'", double21 == 1.25d);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.40950022079209614d, 0.050603792842317426d);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, (double) (byte) 10);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.cumulativeProbability(0.4892284600732909d);
        double double7 = fDistributionImpl2.cumulativeProbability(0.30255252296354923d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.05036522785553632d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6276037379948466d + "'", double5 == 0.6276037379948466d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5628627979004943d + "'", double7 == 0.5628627979004943d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.5409109021321448E-5d + "'", double9 == 1.5409109021321448E-5d);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double8 = fDistributionImpl2.cumulativeProbability(0.018345231285955332d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.17235021937116024d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.541645126720792d);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.3610123714643496E-5d + "'", double8 == 2.3610123714643496E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0027198323247858195d);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) 'a');
        double double12 = fDistributionImpl2.getDomainLowerBound(0.5523306409467954d);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(0.9967719789495215d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getInitialDomain(0.15231616998149738d);
        double double18 = fDistributionImpl2.getInitialDomain(2.097152841112099E-5d);
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.25d + "'", double16 == 1.25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.25d + "'", double18 == 1.25d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.31979861116167463d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.008036077048780232d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1801856291181903d + "'", double11 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.06965997645678441d + "'", double13 == 0.06965997645678441d);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability((double) 100);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.6401770331730183d);
        double double18 = fDistributionImpl2.getDomainUpperBound((double) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.09410879297943431d, 0.2207617383499606d);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double15 = fDistributionImpl2.getInitialDomain(0.6591065015250168d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.17235021937116024d);
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double20 = fDistributionImpl2.cumulativeProbability((double) 10);
        double double22 = fDistributionImpl2.getDomainLowerBound(0.12349798885014796d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.9722761820576019d + "'", double20 == 0.9722761820576019d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double6 = fDistributionImpl2.getInitialDomain(0.05350873685544799d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.028005760216863906d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.028005760216863906d + "'", double10 == 0.028005760216863906d);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L));
        double double19 = fDistributionImpl2.getInitialDomain(0.0d);
        double double21 = fDistributionImpl2.getDomainUpperBound(0.09487388796007479d);
        double double23 = fDistributionImpl2.cumulativeProbability(0.675421985387411d);
        double double24 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.25d + "'", double19 == 1.25d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.569673563164277d + "'", double23 == 0.569673563164277d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5004087508678674d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.9967719789495215d);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 0L);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 100);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.31672086845579883d);
        double double17 = fDistributionImpl2.getInitialDomain(0.03505821861061997d);
        double double19 = fDistributionImpl2.getInitialDomain(0.26479899700216447d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.00638827009754162d);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = fDistributionImpl2.cumulativeProbability(0.7551927476169364d, 0.4860815252407045d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0204081632653061d + "'", double17 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0204081632653061d + "'", double19 == 1.0204081632653061d);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.08793604972328362d, 0.6583620521480608d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.9999999238243996d);
        double double6 = fDistributionImpl2.getInitialDomain(0.04576376563200668d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.49071513905979386d) + "'", double6 == (-0.49071513905979386d));
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.2589160113618819d);
        double double19 = fDistributionImpl2.getDomainUpperBound(0.5641578772655828d);
        double double20 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass21 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0606060606060606d);
        double double21 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double23 = fDistributionImpl2.getDomainUpperBound(0.1345060112435601d);
        double double25 = fDistributionImpl2.getInitialDomain(0.9999999988502378d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.8125673702109506E-6d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.129032258064516d) + "'", double21 == (-1.129032258064516d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.129032258064516d) + "'", double25 == (-1.129032258064516d));
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5093634057790148d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), 0.3895023980863656d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5093634057790148d + "'", double13 == 0.5093634057790148d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4892284600732909d + "'", double16 == 0.4892284600732909d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '#');
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainLowerBound(0.3951424744541511d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainLowerBound(0.4089329529483282d);
        double double20 = fDistributionImpl2.inverseCumulativeProbability(0.22088345872093793d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.14637555387850465d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.19506275762925057d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.008036077048780232d);
        double double16 = fDistributionImpl2.getInitialDomain(0.0d);
        java.lang.Class<?> wildcardClass17 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.25d + "'", double16 == 1.25d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5004087508678674d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.1114353339521007d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9961307247459887d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability(0.5842660434812024d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4394515874848486d + "'", double8 == 0.4394515874848486d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9961307247459887d + "'", double11 == 0.9961307247459887d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5383374436117837d + "'", double13 == 0.5383374436117837d);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5004087508678674d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.9967719789495215d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.cumulativeProbability(1.2622342631866731E-22d, 0.13759165633724676d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.46262734439245795d + "'", double12 == 0.46262734439245795d);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3168052840864677d, 0.8609681162053344d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.999037593690436d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4898628835849175d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.4239582314034682d, 0.6640218712845615d);
        double double11 = fDistributionImpl2.getInitialDomain(0.2589160113618819d);
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.03396738004348632d + "'", double9 == 0.03396738004348632d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.32438304989669015d) + "'", double11 == (-0.32438304989669015d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.7976931348623157E308d, 0.14637555387850465d);
        double double4 = fDistributionImpl2.getDomainLowerBound(1.0074491241240935E-9d);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14637555387850465d + "'", double5 == 0.14637555387850465d);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.08015071710935137d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.9021122018807471d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.2436210779020391d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getInitialDomain(0.5193402098261183d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2436210779020391d + "'", double15 == 0.2436210779020391d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.13870644587959322d) + "'", double17 == (-0.13870644587959322d));
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.11215527694889071d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability(0.9322902587483378d);
        double double18 = fDistributionImpl2.inverseCumulativeProbability(0.9985908462600791d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.7835361335394757d + "'", double12 == 0.7835361335394757d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.36330279543481414d + "'", double16 == 0.36330279543481414d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.828226478425148d + "'", double18 == 1.828226478425148d);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.6591065015250168d);
        double double9 = fDistributionImpl2.getDomainUpperBound(0.017857674930194845d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability(0.3197986114922772d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.9999999999747803 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999999999873902d + "'", double5 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double14 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double16 = fDistributionImpl2.cumulativeProbability(1.0210526315789474d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.43199198024659174d, 0.43276459841306814d);
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(7.444493761760151E-4d);
        double double24 = fDistributionImpl2.cumulativeProbability(0.5640080083627789d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(2.5491771371666263d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3248137971311367d + "'", double16 == 0.3248137971311367d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.408167631624437E-4d + "'", double19 == 3.408167631624437E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9965956918620645d + "'", double24 == 0.9965956918620645d);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5366657182124845d, 0.49838122445596006d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.cumulativeProbability((-0.19192775392242717d));
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.3991062373962743E-245d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.49838122445596006d + "'", double3 == 0.49838122445596006d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.49838122445596006d + "'", double4 == 0.49838122445596006d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.49838122445596006d + "'", double7 == 0.49838122445596006d);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.061665697479154d, 0.8226235604098047d);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) '4');
        double double7 = fDistributionImpl2.cumulativeProbability(0.23076288400994444d, 0.9999999999873902d);
        double double10 = fDistributionImpl2.cumulativeProbability((-0.5435757058783689d), 0.9999444591000356d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.27687764751802335d + "'", double7 == 0.27687764751802335d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.34088033743454127d + "'", double10 == 0.34088033743454127d);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.4892284600732909d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainUpperBound(0.05468886506853487d);
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
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
        double double24 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double26 = fDistributionImpl2.getDomainLowerBound(5.67926089784425E-7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.06965997645678441d, 0.378096485231151d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.14131937536292083d);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double13 = fDistributionImpl2.cumulativeProbability(0.9967719789495215d);
        double double15 = fDistributionImpl2.cumulativeProbability(5.357258915695551E-11d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double19 = fDistributionImpl2.cumulativeProbability(6.148733173394483E-6d, 0.3197986111586397d);
        double double21 = fDistributionImpl2.cumulativeProbability(0.8622837629850415d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6583620521480608d + "'", double13 == 0.6583620521480608d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.696025203496104E-6d + "'", double15 == 5.696025203496104E-6d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.41387719632636d + "'", double19 == 0.41387719632636d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.6250289333564812d + "'", double21 == 0.6250289333564812d);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.4892284600732909d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.12776318365972827d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12776318365972827d + "'", double7 == 0.12776318365972827d);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.getDomainUpperBound(Double.NaN);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.5996052325396897d);
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5433539298658748d + "'", double19 == 0.5433539298658748d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getInitialDomain((double) ' ');
        double double12 = fDistributionImpl2.cumulativeProbability((double) 100L);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.cumulativeProbability(0.3919492048229929d, 0.3168052840864677d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0606060606060606d + "'", double10 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999915219d + "'", double12 == 0.9999999999915219d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(0.9967719789495215d);
        double double15 = fDistributionImpl2.getDomainUpperBound(1.3515003513676351d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.10426004742398015d);
        double double20 = fDistributionImpl2.cumulativeProbability(0.4394515874848486d, 0.535927304604666d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.01806785311078775d + "'", double17 == 0.01806785311078775d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.04144262938715343d + "'", double20 == 0.04144262938715343d);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain((double) 100);
        double double15 = fDistributionImpl2.getDomainUpperBound(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistributionImpl2.inverseCumulativeProbability(0.42843061475207117d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
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
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.5093634057790148d);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.cumulativeProbability(0.1674348870196004d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.016337614024967452d + "'", double18 == 0.016337614024967452d);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.018345231285955332d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.6037071022078223d);
        java.lang.Class<?> wildcardClass15 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.007327898373003804d);
        double double19 = fDistributionImpl2.getInitialDomain(0.013076967791032157d);
        double double21 = fDistributionImpl2.getDomainUpperBound(0.4901200508636891d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 1L);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.23587424144892077d);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.6422425773232939d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.794431337232113d);
        double double7 = fDistributionImpl2.cumulativeProbability(0.4546995573427486d, 0.4546995573427486d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9176064239260036d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.0716656184434663d);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3423122472638395d, 0.3623327674363605d);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double17 = fDistributionImpl2.cumulativeProbability((double) 10.0f);
        double double19 = fDistributionImpl2.getDomainUpperBound(0.5004087508678674d);
        double double21 = fDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double23 = fDistributionImpl2.getInitialDomain(0.33409440091453685d);
        double double25 = fDistributionImpl2.getDomainLowerBound(0.07212597439971892d);
        double double27 = fDistributionImpl2.getDomainLowerBound(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6716114244165197d);
        double double31 = fDistributionImpl2.getDomainLowerBound(0.5709557931882584d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9967719789495215d + "'", double17 == 0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.9999999999915219d + "'", double21 == 0.9999999999915219d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0606060606060606d + "'", double23 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.1801856291181903d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.39134009223677896d);
        double double21 = fDistributionImpl2.getInitialDomain(0.541645126720792d);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = fDistributionImpl2.cumulativeProbability(0.004625531999995152d, 0.004456918279453936d);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.24327086809847961d) + "'", double21 == (-0.24327086809847961d));
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.44582356363844317d);
        double double6 = fDistributionImpl2.getInitialDomain(1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.999037593690436d, 0.189836249017317d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.5949357068038229d);
        double double6 = fDistributionImpl2.getInitialDomain((-0.19192775392242717d));
        double double8 = fDistributionImpl2.getDomainLowerBound(0.49395047433316885d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.16435907768387958d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.1048724177104202d) + "'", double6 == (-0.1048724177104202d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.13743947754093283d + "'", double10 == 0.13743947754093283d);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999873902d);
        double double11 = fDistributionImpl2.getInitialDomain(0.8585643081732904d);
        double double13 = fDistributionImpl2.getDomainLowerBound(0.05028488401486397d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.620141463769566d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.9999999999747803d) + "'", double11 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0027198323247858195d);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) 'a');
        double double12 = fDistributionImpl2.getDomainLowerBound(0.5523306409467954d);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.20318364817802356d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9453652605193021d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9453652605193021d + "'", double17 == 0.9453652605193021d);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7835361335394757d, 0.3220459516792461d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass4 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3220459516792461d + "'", double3 == 0.3220459516792461d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3168052840864677d, 0.8609681162053344d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.999037593690436d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4898628835849175d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.4239582314034682d, 0.6640218712845615d);
        double double11 = fDistributionImpl2.getDomainLowerBound(0.8195918816395871d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.055996798032908884d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.inverseCumulativeProbability(0.3548514493860769d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.32438304989669015 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.03396738004348632d + "'", double9 == 0.03396738004348632d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.14637555387850465d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.19506275762925057d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.008036077048780232d);
        double double16 = fDistributionImpl2.getInitialDomain(0.059278978129763016d);
        double double18 = fDistributionImpl2.inverseCumulativeProbability(0.4980478727936605d);
        double double20 = fDistributionImpl2.getDomainUpperBound(0.02675245408774854d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.25d + "'", double16 == 1.25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.67926089784425E-7d + "'", double18 == 5.67926089784425E-7d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0027198323247858195d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.6900430993477209E-15d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.9841561338846472d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.008771073413552499d, 0.6583620521480608d);
        double double4 = fDistributionImpl2.getInitialDomain((double) '#');
        double double6 = fDistributionImpl2.getDomainLowerBound(0.5366657182124845d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.08419329170293993d, (double) '4');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.49071513905979386d) + "'", double4 == (-0.49071513905979386d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.026608556202348033d + "'", double9 == 0.026608556202348033d);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        double double10 = fDistributionImpl2.cumulativeProbability(7.444493761760151E-4d);
        double double12 = fDistributionImpl2.getInitialDomain(0.0d);
        double double14 = fDistributionImpl2.cumulativeProbability(33.20158064706674d);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.2412410159431918d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7723000623308832d + "'", double10 == 0.7723000623308832d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0204081632653061d + "'", double12 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9922790709763858d + "'", double14 == 0.9922790709763858d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.cumulativeProbability((-1.129032258064516d));
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.1742528055671888d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.1742528055671888d + "'", double15 == 0.1742528055671888d);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0666666666666667d);
        double double12 = fDistributionImpl2.cumulativeProbability(5.357258915695551E-11d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.716813751774474E-6d + "'", double12 == 4.716813751774474E-6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double17 = fDistributionImpl2.cumulativeProbability((double) 10.0f);
        double double19 = fDistributionImpl2.getDomainUpperBound(0.5004087508678674d);
        double double21 = fDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double23 = fDistributionImpl2.getInitialDomain(0.33409440091453685d);
        double double25 = fDistributionImpl2.getDomainLowerBound(0.07212597439971892d);
        double double27 = fDistributionImpl2.getInitialDomain(0.0d);
        java.lang.Class<?> wildcardClass28 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9967719789495215d + "'", double17 == 0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.9999999999915219d + "'", double21 == 0.9999999999915219d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0606060606060606d + "'", double23 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0606060606060606d + "'", double27 == 1.0606060606060606d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, 0.9898419264720365d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.06401548478113292d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1228.3664773101177d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9999444591000356d, 0.35005359532675084d);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.getInitialDomain(0.7103085841908984d);
        double double17 = fDistributionImpl2.getInitialDomain(1.6636531716106877d);
        double double19 = fDistributionImpl2.getDomainLowerBound((-0.0789672116079281d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.25d + "'", double17 == 1.25d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999984104468244d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.008610287911435281d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDomainLowerBound((-0.001361768052777312d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0028230287369841434d, 0.17246803129533633d);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound((double) (byte) 100);
        double double11 = fDistributionImpl2.getInitialDomain(0.018345231285955332d);
        double double13 = fDistributionImpl2.getInitialDomain((-1.6666666666666667d));
        double double15 = fDistributionImpl2.cumulativeProbability(0.09410879297943431d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.23469015512447813d + "'", double15 == 0.23469015512447813d);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9999999999873902d, 0.1801856291181903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.27687764751802335d);
        double double6 = fDistributionImpl2.getInitialDomain(0.19788692492646354d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability(0.8609681162053344d);
        double double11 = fDistributionImpl2.cumulativeProbability((-0.0789672116079281d));
        double double14 = fDistributionImpl2.cumulativeProbability(0.4204984331337026d, 0.9722761820576019d);
        double double17 = fDistributionImpl2.cumulativeProbability(0.8420052596651586d, 0.8824039962632032d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.09901319167563201d) + "'", double6 == (-0.09901319167563201d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.27687764751802335d + "'", double7 == 0.27687764751802335d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.4058646174193964d + "'", double9 == 0.4058646174193964d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.03965513949742383d + "'", double14 == 0.03965513949742383d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0022318461210470986d + "'", double17 == 0.0022318461210470986d);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.1801856291181903d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double19 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double21 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double23 = fDistributionImpl2.inverseCumulativeProbability(0.02586733482168741d);
        double double26 = fDistributionImpl2.cumulativeProbability(0.16435907768387958d, 0.4980478727936605d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.05468886506853487d + "'", double16 == 0.05468886506853487d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0011053519540138276d + "'", double23 == 0.0011053519540138276d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.1972420536074163d + "'", double26 == 0.1972420536074163d);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5641578772655828d, 0.170796029094279d);
        double double4 = fDistributionImpl2.getInitialDomain(0.4857470664567221d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.09337177909673475d) + "'", double4 == (-0.09337177909673475d));
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.NaN);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.06401548478113292d);
        double double18 = fDistributionImpl2.getDomainLowerBound(0.2255061186409303d);
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.08793604972328362d, 0.6583620521480608d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.42823103497166215d);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double10 = fDistributionImpl2.getInitialDomain(0.5093634057790148d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability(0.35760002498487775d);
        double double15 = fDistributionImpl2.cumulativeProbability((-0.28685518143753963d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.04400498167913181d + "'", double13 == 0.04400498167913181d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getInitialDomain(0.5220157123797441d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999995770263d);
        double double11 = fDistributionImpl2.getInitialDomain((-0.47077968881994314d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4595566142158559d, 0.4947041238000625d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistributionImpl2.cumulativeProbability(0.9999444591000356d, 0.2215131472835244d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0204081632653061d);
        double double12 = fDistributionImpl2.getInitialDomain(0.08793604972328362d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(9.928489799571806E-81d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0416666666666667d) + "'", double12 == (-1.0416666666666667d));
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(0.8261540218772179d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.18506771891995114d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999999999873902d + "'", double5 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.17815841044398562d, 0.6289333745278087d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999763973332203d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.5921193670526308d);
        double double8 = fDistributionImpl2.getDomainUpperBound(1.04952177738101d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.002393864708003338d, 1.2500001488198675d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.2500001488198675d);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.23587424144892077d);
        double double19 = fDistributionImpl2.getInitialDomain(0.4164832330255014d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = fDistributionImpl2.inverseCumulativeProbability(0.05299963579535849d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getInitialDomain((double) 'a');
        double double10 = fDistributionImpl2.cumulativeProbability(1.25d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0210526315789474d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7103083879489903d + "'", double10 == 0.7103083879489903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0210526315789474d + "'", double13 == 1.0210526315789474d);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double16 = fDistributionImpl2.getInitialDomain((double) 100L);
        double double18 = fDistributionImpl2.cumulativeProbability(0.31672086845579883d);
        double double21 = fDistributionImpl2.cumulativeProbability(0.01212991729006993d, 0.32410684370557247d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double10 = fDistributionImpl2.getInitialDomain(0.5093634057790148d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability(0.35760002498487775d);
        double double15 = fDistributionImpl2.cumulativeProbability((-0.4915427677698697d));
        double double17 = fDistributionImpl2.getDomainLowerBound(0.049950031800927046d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.04400498167913181d + "'", double13 == 0.04400498167913181d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.41580691019689836d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainUpperBound(0.4546995573427486d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.41580691019689836d + "'", double15 == 0.41580691019689836d);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 100L);
        double double15 = fDistributionImpl2.getInitialDomain(0.0d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.4595566142158559d);
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double14 = fDistributionImpl2.cumulativeProbability(0.4664502910454298d);
        double double16 = fDistributionImpl2.getInitialDomain(0.9967719789495215d);
        double double18 = fDistributionImpl2.getInitialDomain(0.5004087508678674d);
        double double20 = fDistributionImpl2.getDomainLowerBound(0.01806785311078775d);
        java.lang.Class<?> wildcardClass21 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4898628835849175d + "'", double14 == 0.4898628835849175d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.25d + "'", double16 == 1.25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.25d + "'", double18 == 1.25d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double14 = fDistributionImpl2.getInitialDomain((double) 1L);
        double double16 = fDistributionImpl2.getInitialDomain(0.541645126720792d);
        java.lang.Class<?> wildcardClass17 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.25d + "'", double14 == 1.25d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.25d + "'", double16 == 1.25d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0204081632653061d, 0.4546995573427486d);
        double double4 = fDistributionImpl2.getInitialDomain(0.017857674930194845d);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.4009893970905954d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.9965956918620645d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.2942467010239518d) + "'", double4 == (-0.2942467010239518d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.8585643081732904d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.5491771371666263d + "'", double12 == 2.5491771371666263d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3994338801958984d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.04400498167913181d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6591065015250168d, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability((-0.9999999916299953d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4239582314034682d, 1.3826603340484837E-4d);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1L));
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(97.0d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double17 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double19 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        double double10 = fDistributionImpl2.cumulativeProbability(7.444493761760151E-4d);
        double double12 = fDistributionImpl2.getInitialDomain(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.14038325387155903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.12349798885014796d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7723000623308832d + "'", double10 == 0.7723000623308832d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0204081632653061d + "'", double12 == 1.0204081632653061d);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.37930533786692333d, 0.5325727269896393d);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.0d, 0.32439517111325245d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.08228766440042513d + "'", double15 == 0.08228766440042513d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8609681162053344d, 10.0d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.5949357068078883d, 0.680275844215834d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainUpperBound(0.37330737634742583d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.03396738004348632d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.02723373766299686d + "'", double5 == 0.02723373766299686d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double6 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 1);
        double double10 = fDistributionImpl2.getInitialDomain(0.4860815252407045d);
        double double12 = fDistributionImpl2.getDomainLowerBound(209.24627349950515d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3197986111586397d + "'", double6 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.02723373766299686d, 0.6046935761651037d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(10.0d);
        double double8 = fDistributionImpl2.inverseCumulativeProbability(0.07968601740827608d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.44538825317206326d + "'", double8 == 0.44538825317206326d);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainLowerBound(0.9999999995770263d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0666666666666667d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.inverseCumulativeProbability(0.5980793709233622d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability(0.4664502910454298d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(Double.NaN);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.4898628835849175d + "'", double9 == 0.4898628835849175d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.06954427012843875d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability(32.0d, 35.0d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainUpperBound(1.0843738724222984d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.7948501959290467d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.006071986281712238d + "'", double11 == 0.006071986281712238d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.26478029237283285d + "'", double16 == 0.26478029237283285d);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double15 = fDistributionImpl2.getInitialDomain(0.6591065015250168d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.31979861116167463d);
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.5433539298660959d);
        double double15 = fDistributionImpl2.getInitialDomain(0.49838122445596006d);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7752805259881776d);
        double double20 = fDistributionImpl2.getDomainLowerBound(0.3032299156718087d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1801856291181903d + "'", double11 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5996052325396897d + "'", double13 == 0.5996052325396897d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
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
        double double27 = fDistributionImpl2.inverseCumulativeProbability(0.20476397886382258d);
        double double29 = fDistributionImpl2.cumulativeProbability(0.3936282244227155d);
        double double31 = fDistributionImpl2.getInitialDomain(0.9217548157472832d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.042048682708840046d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.5949357068078883d);
        double double11 = fDistributionImpl2.cumulativeProbability(0.32091645181623313d);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.19788692492646354d + "'", double9 == 0.19788692492646354d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08067034236646792d + "'", double11 == 0.08067034236646792d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double15 = fDistributionImpl2.cumulativeProbability((double) (short) -1, 0.19788692492646354d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getInitialDomain(0.5016243832747727d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.33409440091453685d + "'", double15 == 0.33409440091453685d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.25d + "'", double18 == 1.25d);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.02723373766299686d, 0.6046935761651037d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.0d, 0.09487388796007479d);
        double double7 = fDistributionImpl2.cumulativeProbability(0.19506275762925057d);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.cumulativeProbability(2.6014040918805166E-8d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8933186128357743d + "'", double5 == 0.8933186128357743d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9021122018807471d + "'", double7 == 0.9021122018807471d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6046935761651037d + "'", double8 == 0.6046935761651037d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.7272122524617245d + "'", double12 == 0.7272122524617245d);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(0.09509397652602902d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability(0.7002018597835067d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.23497873404664116d + "'", double16 == 0.23497873404664116d);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
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
        double double24 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double26 = fDistributionImpl2.cumulativeProbability(4.4355799878524796E-5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.005182893205523626d + "'", double26 == 0.005182893205523626d);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double10 = fDistributionImpl2.getInitialDomain(0.5093634057790148d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.6046935761651037d);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.509253301074358d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.20196314831799295d + "'", double12 == 0.20196314831799295d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.3515003513676351d, 1.418479831543378d);
        double double4 = fDistributionImpl2.cumulativeProbability(1.0210526315789474d);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5096838504714735d + "'", double4 == 0.5096838504714735d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.418479831543378d + "'", double5 == 1.418479831543378d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.418479831543378d + "'", double6 == 1.418479831543378d);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9898804402645663d, 0.2969240624175721d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.cumulativeProbability(3.175450644109864E-5d, 8.86681273925677E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9898804402645663d + "'", double3 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0017900870887482215d + "'", double6 == 0.0017900870887482215d);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.23076288400994444d);
        double double12 = fDistributionImpl2.getDomainLowerBound(1.0d);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.2671687285166097d);
        double double16 = fDistributionImpl2.getDomainUpperBound((double) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9967719789495215d);
        double double21 = fDistributionImpl2.cumulativeProbability(0.029360195877475227d, 0.7148233587794464d);
        double double22 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double24 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.08015071710935137d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.031053678956944965d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.06401548478113292d + "'", double10 == 0.06401548478113292d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2639273029648429d + "'", double21 == 0.2639273029648429d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.5658786927337371d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.189836249017317d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.3306859681104356d, 3.72605569395207d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6640218712845615d + "'", double10 == 0.6640218712845615d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.15434527646780172d + "'", double15 == 0.15434527646780172d);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999873902d);
        double double11 = fDistributionImpl2.getDomainLowerBound(0.3197986111586397d);
        double double13 = fDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(0.0011893394730556636d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.3032299156718087d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9205507147766241d + "'", double13 == 0.9205507147766241d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.3856651727462481E-49d + "'", double15 == 1.3856651727462481E-49d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, 0.17235021937116024d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999999873902d);
        double double6 = fDistributionImpl2.getInitialDomain(0.9293804578921561d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.38985887237520006d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.09430155667562287d) + "'", double6 == (-0.09430155667562287d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.31979861116167463d);
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.5433539298660959d);
        double double15 = fDistributionImpl2.getInitialDomain(0.49838122445596006d);
        double double17 = fDistributionImpl2.cumulativeProbability(0.5366064842062321d);
        double double19 = fDistributionImpl2.getDomainUpperBound(0.03993600820713539d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1801856291181903d + "'", double11 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5996052325396897d + "'", double13 == 0.5996052325396897d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5193402098261183d + "'", double17 == 0.5193402098261183d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double10 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double12 = fDistributionImpl2.getDomainLowerBound((-0.2624723670828401d));
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(2.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.3515003513676351d, 1.418479831543378d);
        double double4 = fDistributionImpl2.cumulativeProbability(1.0210526315789474d);
        double double6 = fDistributionImpl2.getInitialDomain(0.9322902587483378d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5096838504714735d + "'", double4 == 0.5096838504714735d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.4392616257972284d) + "'", double6 == (-2.4392616257972284d));
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) '4');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability(0.028005760216863906d);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.1941800855070006d);
        double double19 = fDistributionImpl2.cumulativeProbability((-0.19033350006880287d));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.01806785311078775d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.10555964729310591d + "'", double15 == 0.10555964729310591d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, 0.5292825574398908d);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(0.0d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.10479689180895158d);
        double double8 = fDistributionImpl2.getInitialDomain(0.05028488401486397d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0025999058639148286d + "'", double6 == 0.0025999058639148286d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.9999999999747803d) + "'", double8 == (-0.9999999999747803d));
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, (double) (byte) 10);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.cumulativeProbability(0.12364027545394483d, 0.40833699687231667d);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14679817051310956d + "'", double7 == 0.14679817051310956d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (short) 100);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainLowerBound(0.3919491786229663d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.4479640982107486d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-5.364175461491655E-4d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double16 = fDistributionImpl2.cumulativeProbability((double) (short) 1, 1.0d);
        double double18 = fDistributionImpl2.cumulativeProbability(0.7662332068765298d);
        double double20 = fDistributionImpl2.inverseCumulativeProbability(0.5325727269896393d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5980793709233622d + "'", double18 == 0.5980793709233622d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5706324087356369d + "'", double20 == 0.5706324087356369d);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0027198323247858195d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.44582356363844317d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.28159241378169547d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.08539437619553925d + "'", double12 == 0.08539437619553925d);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.7976931348623157E308d, 0.14637555387850465d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.1829024488312228d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.04117278273151505d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.cumulativeProbability((double) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.49838122445596006d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3895023980863656d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.2807609622032742d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getInitialDomain((double) 'a');
        double double10 = fDistributionImpl2.cumulativeProbability(1.25d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0210526315789474d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.inverseCumulativeProbability(0.025477995384417838d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.08419329170293993d);
        double double19 = fDistributionImpl2.getDomainUpperBound(0.04939567395865742d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7103083879489903d + "'", double10 == 0.7103083879489903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.001227638541478935d + "'", double15 == 0.001227638541478935d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.012816249063397827d + "'", double17 == 0.012816249063397827d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
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
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.02579088791105589d));
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
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.9999999999873902d);
        double double10 = fDistributionImpl2.getInitialDomain(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3197986111586397d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.3220459516792461d, 0.5326685129511843d);
        double double17 = fDistributionImpl2.cumulativeProbability(0.36849964924523404d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.05028488401486397d + "'", double15 == 0.05028488401486397d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.11051912150741439d + "'", double17 == 0.11051912150741439d);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6037071022078223d, (-0.3286424493827249d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.44582356363844317d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.476758784114401d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(9.131517924063271E-7d);
        java.lang.Class<?> wildcardClass9 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.17815841044398562d + "'", double6 == 0.17815841044398562d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.2208833932477629d, 0.15231616998149738d);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.cumulativeProbability((double) 10.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.336242355358862d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound((-0.28160073981721595d));
        double double13 = fDistributionImpl2.getDomainLowerBound(0.07328927994003721d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.3197986111596346d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.49838122445596006d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.6401770331730183d);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.09487388796007479d);
        double double18 = fDistributionImpl2.inverseCumulativeProbability(0.4857470664567221d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.03273505326846579d, 0.09487388796007479d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7179263404305193d + "'", double4 == 0.7179263404305193d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getInitialDomain(0.4860815252407045d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7723000623308832d, 0.22182890933593535d);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain((double) 100.0f);
        double double17 = fDistributionImpl2.getInitialDomain(0.43199198024659174d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.13759165633724676d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.25d + "'", double17 == 1.25d);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.getDomainUpperBound(Double.NaN);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double19 = fDistributionImpl2.getDomainUpperBound(0.04576376563200668d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(8.925167759399662E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getInitialDomain(0.5220157123797441d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.189836249017317d, 0.5383374436117837d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.15818425127464436d + "'", double12 == 0.15818425127464436d);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.013666728010437416d, (double) (short) 1);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.059278978129763016d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.22182890933593535d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability(0.20272463477570307d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
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
        fDistributionImpl2.setDenominatorDegreesOfFreedom(6.88310466822339E-6d);
        double double26 = fDistributionImpl2.getInitialDomain(0.1829024488312228d);
        double double28 = fDistributionImpl2.getInitialDomain((-0.13370602424775557d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.05468886506853487d + "'", double16 == 0.05468886506853487d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.25d + "'", double18 == 1.25d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.999852177434338d + "'", double20 == 0.999852177434338d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-3.4415641784349265E-6d) + "'", double26 == (-3.4415641784349265E-6d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-3.4415641784349265E-6d) + "'", double28 == (-3.4415641784349265E-6d));
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.2437417856528475d), 0.8973734399573436d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.02723373766299686d, 0.6046935761651037d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100.0f);
        double double6 = fDistributionImpl2.getDomainUpperBound(8.292738272749505E-6d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7577135881093972d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.06401548478113292d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8609681162053344d, 10.0d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(7.444493761760151E-4d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.855712728135081E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.341071201811682E-4d + "'", double8 == 4.341071201811682E-4d);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7002018597835067d, 1.2500001488198675d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.19788692492646354d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.17379970502642506d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.20196314831799295d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6464662756085405d + "'", double6 == 0.6464662756085405d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6559581390100542d + "'", double8 == 0.6559581390100542d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.cumulativeProbability(0.05350873685544799d, 0.17235021937116024d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.1201684622410103d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.049950031800927046d);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.017857674930194845d + "'", double8 == 0.017857674930194845d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.010551774397567139d + "'", double12 == 0.010551774397567139d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) (short) 0);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.01921301566541162d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.9999999999915219d);
        double double19 = fDistributionImpl2.getDomainLowerBound(0.11684554078643927d);
        double double21 = fDistributionImpl2.getDomainLowerBound(0.4199876486181704d);
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
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L));
        double double19 = fDistributionImpl2.getInitialDomain(1.6636531716106877d);
        double double20 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double22 = fDistributionImpl2.getInitialDomain(0.025410217212689466d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.25d + "'", double19 == 1.25d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.25d + "'", double22 == 1.25d);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 100L);
        double double15 = fDistributionImpl2.getDomainLowerBound(Double.POSITIVE_INFINITY);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.6401770331730183d);
        double double19 = fDistributionImpl2.getDomainLowerBound(0.33609977298818094d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.02723373766299686d, 0.6046935761651037d);
        double double4 = fDistributionImpl2.getDomainLowerBound(Double.NaN);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.3149311607087718d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.13012738224566756d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.inverseCumulativeProbability(0.7662332068765298d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.4333769026183856 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound(0.23076288400994444d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3220459516792461d);
        double double12 = fDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double14 = fDistributionImpl2.getDomainUpperBound(7.444493761760151E-4d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.013666728010437416d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
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
        double double29 = fDistributionImpl2.getInitialDomain(0.476758784114401d);
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.25d + "'", double29 == 1.25d);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability((-1.0416666666666667d), 0.3020338789555518d);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.11325382736064116d);
        double double18 = fDistributionImpl2.getInitialDomain(0.9340132613430034d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.024636592435883866d + "'", double14 == 0.024636592435883866d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0666666666666667d + "'", double18 == 1.0666666666666667d);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.7103083879489903d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(2.5491771371666263d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2500001488198675d + "'", double4 == 1.2500001488198675d);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.31979861116167463d);
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.5433539298660959d);
        double double15 = fDistributionImpl2.getInitialDomain(0.49838122445596006d);
        double double18 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), (double) 'a');
        double double20 = fDistributionImpl2.cumulativeProbability((-0.06392512298430059d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1801856291181903d + "'", double11 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5996052325396897d + "'", double13 == 0.5996052325396897d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9999981726526794d + "'", double18 == 0.9999981726526794d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainLowerBound(0.3197986111596346d);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainLowerBound(0.5626720221012385d);
        double double17 = fDistributionImpl2.cumulativeProbability(0.0022318461210470986d, 0.05369583895064541d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0015238849960605445d + "'", double17 == 0.0015238849960605445d);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double10 = fDistributionImpl2.getInitialDomain(0.5093634057790148d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability(0.35760002498487775d);
        double double15 = fDistributionImpl2.cumulativeProbability((-0.4915427677698697d));
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.cumulativeProbability(0.31793596484675873d, 7.570242640199276E-4d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.04400498167913181d + "'", double13 == 0.04400498167913181d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.44208869850608057d, 0.28844232843664186d);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getInitialDomain((double) 'a');
        double double10 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainLowerBound(0.30114392512561017d);
        double double15 = fDistributionImpl2.getDomainUpperBound((-0.009456087316443743d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7103083879489903d + "'", double10 == 0.7103083879489903d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        double double10 = fDistributionImpl2.getInitialDomain(0.3197986111596346d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.9453652605193021d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double14 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double16 = fDistributionImpl2.cumulativeProbability(1.0210526315789474d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.43199198024659174d, 0.43276459841306814d);
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double22 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double24 = fDistributionImpl2.getDomainUpperBound(0.029360195877475227d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.002289940161152395d));
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3248137971311367d + "'", double16 == 0.3248137971311367d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.408167631624437E-4d + "'", double19 == 3.408167631624437E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.7976931348623157E308d + "'", double24 == 1.7976931348623157E308d);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double6 = fDistributionImpl2.cumulativeProbability(0.9978917646629611d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.31929056266684186d + "'", double6 == 0.31929056266684186d);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.4923052829221457d);
        double double13 = fDistributionImpl2.getInitialDomain(0.49838122445596006d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.680275844215834d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4479640982107486d + "'", double11 == 0.4479640982107486d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.2983274935364951d), 0.016938823495096372d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10.0f, 0.0011053519540138276d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.8284628704001276d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.6243639160256823d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0036173926187070826d + "'", double6 == 0.0036173926187070826d);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(10.0d);
        double double17 = fDistributionImpl2.getInitialDomain(0.013443616381931207d);
        double double19 = fDistributionImpl2.getDomainLowerBound(0.04920183084648444d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound(0.3069371622276223d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.3515003513676351d, 0.7002018597835067d);
        double double4 = fDistributionImpl2.getInitialDomain(0.013076967791032157d);
        double double7 = fDistributionImpl2.cumulativeProbability(0.14958173588002702d, 0.1911550227361217d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.5387004628787064d) + "'", double4 == (-0.5387004628787064d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02492491953793885d + "'", double7 == 0.02492491953793885d);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.31979861116167463d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.23076288400994444d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3981365332138079d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double21 = fDistributionImpl2.cumulativeProbability(0.003252146656602481d, 0.9188056009222301d);
        double double23 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1801856291181903d + "'", double11 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.3981365332138079d + "'", double18 == 0.3981365332138079d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.25668541620713203d + "'", double21 == 0.25668541620713203d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
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
        double double23 = fDistributionImpl2.getInitialDomain((-0.05900530490454193d));
        fDistributionImpl2.setDenominatorDegreesOfFreedom(4.645964116627397E-18d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.21150108457503464d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0606060606060606d + "'", double23 == 1.0606060606060606d);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9999999238243996d, 0.9205507147766241d);
        double double4 = fDistributionImpl2.cumulativeProbability(2.2390145884173505d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6103282544318314d + "'", double4 == 0.6103282544318314d);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
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
        double double24 = fDistributionImpl2.cumulativeProbability(0.14131937536292083d, (double) (short) 100);
        double double26 = fDistributionImpl2.getInitialDomain(0.22570132078226077d);
        double double28 = fDistributionImpl2.getDomainLowerBound(0.4089329529483282d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.7148233587794464d + "'", double24 == 0.7148233587794464d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.25d + "'", double26 == 1.25d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
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
        double double27 = fDistributionImpl2.cumulativeProbability(0.1855184662093986d);
        double double28 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.6037071022078223d + "'", double28 == 0.6037071022078223d);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability(0.0d, 0.5996052325402953d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.016938823495096372d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5433539298660959d + "'", double9 == 0.5433539298660959d);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.05350873685544799d, Double.NaN);
        double double15 = fDistributionImpl2.getDomainUpperBound(1.2214738003873964E-5d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3210963486747651d);
        double double20 = fDistributionImpl2.cumulativeProbability((-0.35319435852748904d), 0.17637974128336592d);
        double double21 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double22 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.059278978129763016d + "'", double20 == 0.059278978129763016d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3210963486747651d + "'", double22 == 0.3210963486747651d);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.23076288400994444d);
        double double19 = fDistributionImpl2.getDomainUpperBound(0.9797635432974363d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.23494224136497754d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
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
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.1855184662093986d);
        double double23 = fDistributionImpl2.getInitialDomain(0.16285885278534568d);
        double double24 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5093634057790148d + "'", double17 == 0.5093634057790148d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.1022432373956627d) + "'", double23 == (-0.1022432373956627d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.1855184662093986d + "'", double24 == 0.1855184662093986d);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
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
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5096838504714735d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2969240624175721d + "'", double13 == 0.2969240624175721d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.008009325319447534d + "'", double19 == 0.008009325319447534d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7729700281146208d, 0.6758256576139563d);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9999999999873902d, 0.1801856291181903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.27687764751802335d);
        double double7 = fDistributionImpl2.cumulativeProbability(0.0010722599132668223d, 0.35149728096692545d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(7.444493761760151E-4d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.cumulativeProbability((double) 10L);
        double double14 = fDistributionImpl2.getInitialDomain(7.381135323475757E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.19845142031994614d + "'", double7 == 0.19845142031994614d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1801856291181903d + "'", double10 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9947550599124061d + "'", double12 == 0.9947550599124061d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.09901319167563201d) + "'", double14 == (-0.09901319167563201d));
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
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
        double double24 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0606060606060606d + "'", double24 == 1.0606060606060606d);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (byte) 1, 0.11155256899978572d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5117512873843995d);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.25d);
        double double12 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.9965956918620645d);
        double double16 = fDistributionImpl2.getDomainUpperBound((-0.009116282380880985d));
        double double18 = fDistributionImpl2.cumulativeProbability(0.2143698019432957d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.23446890649387955d + "'", double18 == 0.23446890649387955d);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain(0.5996052325396897d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.cumulativeProbability(0.3895023980863656d, 33.20158064706674d);
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double20 = fDistributionImpl2.getDomainLowerBound(0.10715894720040464d);
        double double22 = fDistributionImpl2.inverseCumulativeProbability(0.9999999504708134d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5366064842062321d + "'", double17 == 0.5366064842062321d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 47.785865132306576d + "'", double22 == 47.785865132306576d);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double14 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double16 = fDistributionImpl2.cumulativeProbability(1.0210526315789474d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.43199198024659174d, 0.43276459841306814d);
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(7.444493761760151E-4d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.024636592435883866d);
        double double25 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3248137971311367d + "'", double16 == 0.3248137971311367d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.408167631624437E-4d + "'", double19 == 3.408167631624437E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
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
        double double25 = fDistributionImpl2.cumulativeProbability(0.0d, 10.0d);
        double double27 = fDistributionImpl2.getDomainUpperBound(8.228997151648991E-7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6289333745278087d + "'", double18 == 0.6289333745278087d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7976931348623157E308d + "'", double22 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9898419264720365d + "'", double25 == 0.9898419264720365d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.7976931348623157E308d + "'", double27 == 1.7976931348623157E308d);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.28159241378169547d);
        double double15 = fDistributionImpl2.getInitialDomain(0.9999999999937926d);
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.41580691019689836d + "'", double11 == 0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.23494224136497754d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
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
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.005549455097572098d);
        double double31 = fDistributionImpl2.getDomainUpperBound(0.37330737634742583d);
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.7976931348623157E308d + "'", double31 == 1.7976931348623157E308d);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (byte) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5366657182124845d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0210526315789474d);
        double double14 = fDistributionImpl2.getInitialDomain((double) (short) 100);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.3667417109622608d) + "'", double14 == (-0.3667417109622608d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5366657182124845d + "'", double15 == 0.5366657182124845d);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getInitialDomain(0.6678823074927777d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain((double) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.8284628704001276d);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.9999999999999998d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.33059992956874545d);
        double double21 = fDistributionImpl2.getDomainUpperBound(0.3549574434113415d);
        double double23 = fDistributionImpl2.cumulativeProbability(0.8154639584090504d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.35760002498487775d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.335170791081812d + "'", double23 == 0.335170791081812d);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.05595719508517638d, 0.09487388796007479d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.19845142031994614d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5326685129511843d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainLowerBound(0.23766969007294547d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5326685129511843d + "'", double7 == 0.5326685129511843d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5326685129511843d + "'", double8 == 0.5326685129511843d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7557224019288303d, (double) 100.0f);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.cumulativeProbability(0.7002018597835067d, 0.13896755257900706d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7557224019288303d + "'", double3 == 0.7557224019288303d);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0606060606060606d);
        double double10 = fDistributionImpl2.getInitialDomain((double) 0);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(0.018345231285955332d);
        double double15 = fDistributionImpl2.getDomainUpperBound((double) 100.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4089329529483282d);
        double double19 = fDistributionImpl2.getDomainUpperBound((-0.2983274935364951d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.129032258064516d) + "'", double10 == (-1.129032258064516d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0606060606060606d + "'", double11 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.129032258064516d) + "'", double13 == (-1.129032258064516d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8585643081732904d, 0.43906017126509644d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.043642094005512666d);
        double double6 = fDistributionImpl2.getDomainUpperBound(1.0963147804802118d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.345456265936167d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.05015619738166899d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(10.0d);
        double double17 = fDistributionImpl2.cumulativeProbability(0.8933186128357743d);
        double double20 = fDistributionImpl2.cumulativeProbability(0.0011893394730556636d, 0.535927304604666d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4419425715309202d);
        double double25 = fDistributionImpl2.cumulativeProbability(0.378096485231151d, 0.9999984104468244d);
        double double27 = fDistributionImpl2.getInitialDomain(0.6591068676979397d);
        double double28 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3149311607087718d + "'", double17 == 0.3149311607087718d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.20187406926536886d + "'", double20 == 0.20187406926536886d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.10554440949505994d + "'", double25 == 0.10554440949505994d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7822630030631615d, 0.44881727956051176d);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.18945773922771514d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3919492048229929d);
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.3032299156718087d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.008185273709933832d + "'", double13 == 0.008185273709933832d);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double14 = fDistributionImpl2.getDomainLowerBound(0.9466229816367563d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.3515003513676351d, 1.418479831543378d);
        double double4 = fDistributionImpl2.cumulativeProbability(1.0210526315789474d);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.021191376661121225d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5096838504714735d + "'", double4 == 0.5096838504714735d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.418479831543378d + "'", double5 == 1.418479831543378d);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.011462387906238268d, 0.23587424144892077d);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.cumulativeProbability((-1.0d));
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getDomainUpperBound(0.6678823074927777d);
        double double18 = fDistributionImpl2.inverseCumulativeProbability(9.126699443633689E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.237328524987217E-6d + "'", double18 == 1.237328524987217E-6d);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainUpperBound(0.5949357068038229d);
        double double16 = fDistributionImpl2.getDomainUpperBound(0.7551927476169364d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.031053678956944965d, 0.14869246204751185d);
        double double4 = fDistributionImpl2.getInitialDomain(0.35552458334754683d);
        double double6 = fDistributionImpl2.cumulativeProbability(0.021726824519613053d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.08031753719966103d) + "'", double4 == (-0.08031753719966103d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.762111945157641d + "'", double6 == 0.762111945157641d);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.cumulativeProbability(0.43278329179761166d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.30255252296354923d);
        double double12 = fDistributionImpl2.getInitialDomain(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.13174537379287576d + "'", double8 == 0.13174537379287576d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
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
        double double23 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double25 = fDistributionImpl2.getDomainLowerBound(0.01110261427619207d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5957283306792327d + "'", double19 == 0.5957283306792327d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7976931348623157E308d + "'", double22 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (-1L));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.43276459841306814d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.40950022079209614d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999995770263d + "'", double8 == 0.9999999995770263d);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3197986111596346d, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.004569416631646944d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3197986111596346d + "'", double5 == 0.3197986111596346d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3197986111596346d + "'", double6 == 0.3197986111596346d);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
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
        double double27 = fDistributionImpl2.getDomainLowerBound(0.14335493966332769d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-0.3015680668050055d));
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(9.126699443633689E-4d, 0.043642094005512666d);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability(97.0d);
        double double11 = fDistributionImpl2.cumulativeProbability(3.175450644109864E-5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.649320452783196E-105d + "'", double11 == 4.649320452783196E-105d);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.6037071022078223d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.008036077048780232d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.05468886506853487d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.02838644361959202d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.44881727956051176d);
        double double12 = fDistributionImpl2.getInitialDomain(1.3312911938531305E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.432364228996943d) + "'", double12 == (-0.432364228996943d));
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainLowerBound(0.6559581390100542d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9898804402645663d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.23587424144892077d, 0.9898804402645663d);
        java.lang.Class<?> wildcardClass15 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.031135097668851475d + "'", double14 == 0.031135097668851475d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.43276459841306814d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.41406926397160465d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3549574434113415d);
        double double15 = fDistributionImpl2.getInitialDomain(0.357736007038372d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.097152841112099E-5d + "'", double8 == 2.097152841112099E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.292738272749505E-6d + "'", double10 == 8.292738272749505E-6d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0210526315789474d + "'", double15 == 1.0210526315789474d);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9999999999915219d, 2.097152841112099E-5d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.6553251431808038d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.16593376295629791d, 6.405835667466775E-7d);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.31929056266684186d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.17957481262839944d + "'", double12 == 0.17957481262839944d);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
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
        double double22 = fDistributionImpl2.getInitialDomain(0.14777248244329366d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5189833010988237d + "'", double15 == 0.5189833010988237d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999504708134d + "'", double19 == 0.9999999504708134d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0210526315789474d + "'", double22 == 1.0210526315789474d);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (-1));
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.cumulativeProbability(0.7662332068765298d, 0.680275844215834d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100L);
        double double6 = fDistributionImpl2.getInitialDomain(0.4207707438356478d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.25d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getInitialDomain(0.32386298675112735d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '#');
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainLowerBound(0.3951424744541511d);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (byte) 10);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 10);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.43467479348140525d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6046935761651037d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = fDistributionImpl2.cumulativeProbability((double) (short) 1);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainUpperBound(1.3991062373962743E-245d);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.35760002498487775d, 2.600006698519661E-74d);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 100);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.17637974128336592d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.9999999999873902d);
        double double10 = fDistributionImpl2.getInitialDomain(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.cumulativeProbability(1.418479831543378d, 0.18018562911453778d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double10 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.cumulativeProbability(0.4154516245596553d, 0.2927096698785512d);
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
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.21713262052211377d, 0.37330737634742583d);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.1801856291181903d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.05468886506853487d + "'", double16 == 0.05468886506853487d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.009116282380880985d), 0.004178420904072746d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 1L);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(0.43906017126509644d);
        double double15 = fDistributionImpl2.getInitialDomain(1.2214738003873964E-5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double13 = fDistributionImpl2.cumulativeProbability(1.2109603464415848d, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.004456918279453936d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2969240624175721d + "'", double13 == 0.2969240624175721d);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        double double15 = fDistributionImpl2.getInitialDomain((-1.0485874157964405E-5d));
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5220157123797441d + "'", double16 == 0.5220157123797441d);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain(0.5996052325396897d);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getDomainUpperBound(0.32581211750500494d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(47.785865132306576d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.39134009223677896d);
        double double9 = fDistributionImpl2.getDomainLowerBound(0.4595566142158559d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability(0.04400498167913181d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5773773436195279d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getInitialDomain(0.7148233587794464d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.009150552718303446d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.41580691019689836d + "'", double9 == 0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.40585417435184695d) + "'", double11 == (-0.40585417435184695d));
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain((double) 100);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 1);
        double double18 = fDistributionImpl2.cumulativeProbability(0.00963131349797714d, 0.2207617383499606d);
        double double19 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.03584401406394102d + "'", double18 == 0.03584401406394102d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0027198323247858195d);
        double double10 = fDistributionImpl2.getInitialDomain(0.41580698164526403d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.7662332068765298d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.001361768052777312d) + "'", double10 == (-0.001361768052777312d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.00782824186641684d + "'", double12 == 0.00782824186641684d);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.cumulativeProbability((double) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.49838122445596006d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double17 = fDistributionImpl2.cumulativeProbability(0.08419329170293993d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.019921911132668304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3442203542891035d + "'", double17 == 0.3442203542891035d);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.5773773436195279d);
        double double4 = fDistributionImpl2.getInitialDomain(0.7583315357111738d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5661557333969475d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.40585417435184695d) + "'", double4 == (-0.40585417435184695d));
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.7976931348623157E308d, 35.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5004087508678674d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.22829171913907675d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.5865420894413496d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.7246966031342408d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability(0.7551927476169364d, 0.8284628704001276d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.021079886744518106d + "'", double16 == 0.021079886744518106d);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.32439517111325245d, 0.36849964924523404d);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9898804402645663d, 0.6401770331730183d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.32091645181623313d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistributionImpl2.cumulativeProbability(0.48854863105828306d, 0.07679735199350513d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.2927096698785512d + "'", double4 == 0.2927096698785512d);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5093634057790148d);
        double double14 = fDistributionImpl2.getDomainLowerBound((double) 10L);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.cumulativeProbability(0.1201684622410103d);
        double double19 = fDistributionImpl2.getDomainUpperBound(0.9188056009222301d);
        double double21 = fDistributionImpl2.cumulativeProbability(0.9999999504708134d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.36957316110237126d + "'", double17 == 0.36957316110237126d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.5993164629783437d + "'", double21 == 0.5993164629783437d);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5974244174682043d, 1.2379949517739024E-26d);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain(0.008036077048780232d);
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.7835361335394757d);
        double double12 = fDistributionImpl2.getInitialDomain(0.011266907817500001d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0666666666666667d + "'", double8 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.419429701166036d + "'", double10 == 1.419429701166036d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0666666666666667d + "'", double12 == 1.0666666666666667d);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5902583570154509d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.1801856291181903d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.5220157123797441d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 0L, 0.31979861116167463d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        double double11 = fDistributionImpl2.getDomainUpperBound(1.0d);
        double double13 = fDistributionImpl2.getDomainLowerBound(0.13527912972413358d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1201684622410103d + "'", double4 == 0.1201684622410103d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08793604972328362d + "'", double7 == 0.08793604972328362d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.09901319167563201d) + "'", double9 == (-0.09901319167563201d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain((double) 100.0f);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.680275832290893d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.14144663721011858d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0963147804802118d + "'", double17 == 1.0963147804802118d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2852969606482075d + "'", double19 == 0.2852969606482075d);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.5949357068078883d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 10L);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.28618363577756856d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5494834255419397d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.755683952741227d + "'", double6 == 0.755683952741227d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
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
        double double23 = fDistributionImpl2.cumulativeProbability(0.006071986281712238d, 0.44582356363844317d);
        double double25 = fDistributionImpl2.getDomainLowerBound(1.04952177738101d);
        double double28 = fDistributionImpl2.cumulativeProbability((-5.529815966511098E-4d), 0.05595719508517638d);
        double double31 = fDistributionImpl2.cumulativeProbability(0.0015238849960605445d, 0.02838644361959202d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.3252821340923737d + "'", double23 == 0.3252821340923737d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.1478759002236058d + "'", double28 == 0.1478759002236058d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.08142240575636189d + "'", double31 == 0.08142240575636189d);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
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
            double double21 = fDistributionImpl2.inverseCumulativeProbability((-1.53472685559007d));
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
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.4892284600732909d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4595566142158559d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.09358541172044971d, 0.09509450716293696d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.10751568684175394d, 0.3408876950806238d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.001345097586669175d + "'", double10 == 0.001345097586669175d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.11056541122915386d + "'", double13 == 0.11056541122915386d);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.794431337232113d);
        double double7 = fDistributionImpl2.cumulativeProbability(0.4546995573427486d, 0.4546995573427486d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9176064239260036d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.0716656184434663d);
        double double14 = fDistributionImpl2.getInitialDomain(0.5865420894413496d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.8477567164194557d) + "'", double14 == (-0.8477567164194557d));
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.19788692492646354d, 0.11215527694889071d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass4 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.11215527694889071d + "'", double3 == 0.11215527694889071d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double15 = fDistributionImpl2.getInitialDomain(0.6591065015250168d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.17235021937116024d);
        double double19 = fDistributionImpl2.getDomainLowerBound(0.4521799531956898d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8695313726606203d, 0.10715894720040464d);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) (short) 0);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainLowerBound(0.049950031800927046d);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.18685162596174398d);
        double double17 = fDistributionImpl2.getInitialDomain(0.6554278909379809d);
        double double19 = fDistributionImpl2.getDomainUpperBound((double) 1L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.615533656743387d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.25d + "'", double17 == 1.25d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        double double10 = fDistributionImpl2.cumulativeProbability(7.444493761760151E-4d);
        double double12 = fDistributionImpl2.getInitialDomain(0.0d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4162530885951957d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7723000623308832d + "'", double10 == 0.7723000623308832d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0204081632653061d + "'", double12 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double14 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double16 = fDistributionImpl2.cumulativeProbability(1.0210526315789474d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.43199198024659174d, 0.43276459841306814d);
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double22 = fDistributionImpl2.cumulativeProbability(0.9188056009222301d);
        double double24 = fDistributionImpl2.getDomainLowerBound(2.0893234516287156d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3248137971311367d + "'", double16 == 0.3248137971311367d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.408167631624437E-4d + "'", double19 == 3.408167631624437E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.29942583004565904d + "'", double22 == 0.29942583004565904d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDomainLowerBound(0.41406926397160465d);
        double double14 = fDistributionImpl2.inverseCumulativeProbability(0.5775256913939883d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6995395582618824d + "'", double14 == 0.6995395582618824d);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5004087508678674d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.9967719789495215d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability(0.9999999238243996d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5004087508678674d + "'", double9 == 0.5004087508678674d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.7283629723674102d + "'", double11 == 0.7283629723674102d);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.39134009223677896d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7681324865938718d);
        double double11 = fDistributionImpl2.getDomainLowerBound(0.39134009223677896d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.0d, 0.16511429118720633d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.3018485890286655d + "'", double14 == 0.3018485890286655d);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-0.6181552210917562d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.4892284600732909d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.12776318365972827d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistributionImpl2.inverseCumulativeProbability(0.01290872187165748d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.06824093113897393 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.31979861116167463d);
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.5433539298660959d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.002393864708003338d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.9910026160363924d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double20 = fDistributionImpl2.getDomainLowerBound((-0.17434575632550214d));
        double double22 = fDistributionImpl2.cumulativeProbability((-1.0485874157964405E-5d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1801856291181903d + "'", double11 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5996052325396897d + "'", double13 == 0.5996052325396897d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.03805921542661744d + "'", double15 == 0.03805921542661744d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '4');
        double double14 = fDistributionImpl2.getDomainUpperBound(0.018345231285955332d);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.9322888260560721d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5865420894413496d, 0.011912325204771257d);
        double double5 = fDistributionImpl2.cumulativeProbability((-0.432364228996943d), 0.2829646865406194d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.032988032024781955d + "'", double5 == 0.032988032024781955d);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) '4');
        double double7 = fDistributionImpl2.cumulativeProbability(0.23076288400994444d, 0.9999999999873902d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.09487388796007479d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6584621695601948d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.1241102223039432d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.inverseCumulativeProbability((-0.024909805740576035d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.27687764751802335d + "'", double7 == 0.27687764751802335d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.008771073413552499d + "'", double9 == 0.008771073413552499d);
    }
}

