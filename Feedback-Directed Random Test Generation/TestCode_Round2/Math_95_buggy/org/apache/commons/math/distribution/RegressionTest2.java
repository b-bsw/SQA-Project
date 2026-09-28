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
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain((double) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.8284628704001276d);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.9999999999999998d);
        double double19 = fDistributionImpl2.getInitialDomain(0.1825231602525817d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = fDistributionImpl2.cumulativeProbability(0.1829024488312228d, 0.07061643216723656d);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability(32.0d, 35.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.1822843294541756d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.006071986281712238d + "'", double11 == 0.006071986281712238d);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.25d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3032299156718087d);
        java.lang.Class<?> wildcardClass10 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) '4');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability(0.7103083879489903d);
        double double17 = fDistributionImpl2.getInitialDomain((double) 100.0f);
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
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        double double34 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.6553251431808038d + "'", double34 == 0.6553251431808038d);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        double double24 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.11684554078643927d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.7103083879489903d + "'", double24 == 0.7103083879489903d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.4892284600732909d);
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getInitialDomain(1.418479831543378d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.6553251431808038d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.25d + "'", double12 == 1.25d);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '#');
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9898804402645663d, 0.6401770331730183d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.02723373766299686d, 0.6046935761651037d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(10.0d);
        java.lang.Class<?> wildcardClass7 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainLowerBound((-0.32438304989669015d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.2109603464415848d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.11015601941480264d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.cumulativeProbability((-1.0d));
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.inverseCumulativeProbability(0.5004087508678674d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.cumulativeProbability(1.0192812158854847d, 0.755683952741227d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.4906940248809481d + "'", double15 == 0.4906940248809481d);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3197986111586397d, 35.0d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3197986111586397d + "'", double3 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3197986111586397d + "'", double4 == 0.3197986111586397d);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(Double.NaN);
        double double15 = fDistributionImpl2.cumulativeProbability(0.5949357068038229d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistributionImpl2.inverseCumulativeProbability(0.02887716934657425d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-1.6666671958040784d), 0.42370716420032145d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) (short) 0);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.02723373766299686d, 0.04322441323500558d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.03273505326846579d + "'", double14 == 0.03273505326846579d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double16 = fDistributionImpl2.getInitialDomain(0.9205507147766241d);
        double double18 = fDistributionImpl2.cumulativeProbability(0.17379970502642506d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, (double) (byte) 10);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.inverseCumulativeProbability(1.334173577483257E-5d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistributionImpl2.cumulativeProbability(0.23587424144892077d, (-0.293214330727583d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        double double23 = fDistributionImpl2.getInitialDomain(0.07212597439971892d);
        java.lang.Class<?> wildcardClass24 = fDistributionImpl2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double9 = fDistributionImpl2.getInitialDomain((double) 1L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 10);
        double double13 = fDistributionImpl2.getInitialDomain((double) 100);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability((-0.2624723670828401d));
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.inverseCumulativeProbability(0.5026637197270847d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double8 = fDistributionImpl2.cumulativeProbability(0.018345231285955332d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.17235021937116024d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.1829024488312228d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.inverseCumulativeProbability(8.228997151648991E-7d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.3610123714643496E-5d + "'", double8 == 2.3610123714643496E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double15 = fDistributionImpl2.getInitialDomain(0.4164832330255014d);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.cumulativeProbability((double) 0L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.NaN);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.5773773436195279d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.43906017126509644d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainUpperBound(0.5996052325396897d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4906940248809481d + "'", double5 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4906940248809481d + "'", double6 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.getDomainUpperBound(0.4164832330255014d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.cumulativeProbability(0.02723373766299686d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.inverseCumulativeProbability(0.03896274758465178d);
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
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDomainUpperBound(0.6591065015250168d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainUpperBound(0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (byte) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5366657182124845d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.inverseCumulativeProbability(1.04952177738101d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5993164688934242d);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        double double18 = fDistributionImpl2.getInitialDomain(0.5093634057790148d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41406926397160465d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.42787428821980134d) + "'", double18 == (-0.42787428821980134d));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5220157123797441d);
        double double18 = fDistributionImpl2.getInitialDomain(0.011912325204771257d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = fDistributionImpl2.inverseCumulativeProbability(0.2589160113618819d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.35319435852748904 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.35319435852748904d) + "'", double18 == (-0.35319435852748904d));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0204081632653061d, 0.4546995573427486d);
        double double4 = fDistributionImpl2.getInitialDomain(0.017857674930194845d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(1.2109603464415848d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.2942467010239518d) + "'", double4 == (-0.2942467010239518d));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getInitialDomain((double) 100.0f);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9999999958149977d, 0.3197986111596346d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6591065015250168d, (double) 10L);
        double double4 = fDistributionImpl2.getInitialDomain(0.5193402098261183d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.25d + "'", double4 == 1.25d);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.369679655722036d, 0.0030883693754368224d);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8609681162053344d, 10.0d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double8 = fDistributionImpl2.cumulativeProbability(0.9453652605193021d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8609681162053344d + "'", double5 == 0.8609681162053344d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.33825919314095565d + "'", double8 == 0.33825919314095565d);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, 0.6583620521480608d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.cumulativeProbability((double) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.49838122445596006d);
        double double14 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.39134009223677896d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass9 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.002393864708003338d, 1.2500001488198675d);
        double double4 = fDistributionImpl2.getInitialDomain(2.5491771371666263d);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.6666671958040784d) + "'", double4 == (-1.6666671958040784d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3197986111586397d, 35.0d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.cumulativeProbability(0.07908924131400807d, 2.3610123714643496E-5d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3197986111586397d + "'", double3 == 0.3197986111586397d);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0204081632653061d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.06401548478113292d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.inverseCumulativeProbability(0.680275832290893d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0416666666666667 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound((-1.0d));
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.31979861116167463d + "'", double12 == 0.31979861116167463d);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5189833010988237d, 0.4898628835849175d);
        double double4 = fDistributionImpl2.cumulativeProbability(1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.492156888551156d + "'", double4 == 0.492156888551156d);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(0.6591065015250168d);
        double double8 = fDistributionImpl2.getInitialDomain((-0.47077968881994314d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.3248137971311367d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        double double24 = fDistributionImpl2.cumulativeProbability(0.05350873685544799d, 0.07212597439971892d);
        double double26 = fDistributionImpl2.cumulativeProbability(0.008610287160087353d);
        double double28 = fDistributionImpl2.getDomainUpperBound(0.44582356363844317d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 9.838320889492336E-7d + "'", double21 == 9.838320889492336E-7d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.028005760216863906d + "'", double24 == 0.028005760216863906d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.07209820539217125d + "'", double26 == 0.07209820539217125d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.7976931348623157E308d + "'", double28 == 1.7976931348623157E308d);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability(0.0d, 0.1345060112435601d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.cumulativeProbability(0.6553251431808038d, (-0.1048724177104202d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.27855365220112865d + "'", double13 == 0.27855365220112865d);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.23076288400994444d);
        double double12 = fDistributionImpl2.getDomainLowerBound(1.0d);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.2671687285166097d);
        double double16 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double18 = fDistributionImpl2.getDomainLowerBound((-0.47077968881994314d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.06401548478113292d + "'", double10 == 0.06401548478113292d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getInitialDomain((double) 'a');
        double double10 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double14 = fDistributionImpl2.getDomainLowerBound((-0.2624723670828401d));
        double double16 = fDistributionImpl2.getDomainUpperBound(0.0d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7103083879489903d + "'", double10 == 0.7103083879489903d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double14 = fDistributionImpl2.getDomainUpperBound((double) '#');
        double double17 = fDistributionImpl2.cumulativeProbability(0.0d, 0.6401770331730183d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5709557931882584d + "'", double17 == 0.5709557931882584d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.06965997645678441d, 0.6739693374503183d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double11 = fDistributionImpl2.getInitialDomain(0.9999999999999998d);
        double double13 = fDistributionImpl2.cumulativeProbability(1.0666666666666667d);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.189836249017317d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9021122018807471d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6739693374503183d + "'", double13 == 0.6739693374503183d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.06965997645678441d, 0.6739693374503183d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.4234224082773299d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.06965997645678441d + "'", double3 == 0.06965997645678441d);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5366657182124845d, 0.49838122445596006d);
        double double4 = fDistributionImpl2.getDomainUpperBound((-0.09901319167563201d));
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistributionImpl2.cumulativeProbability(0.20909172880811788d, 0.008009325319447534d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(97.0d);
        double double16 = fDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double19 = fDistributionImpl2.cumulativeProbability((double) (byte) -1);
        java.lang.Class<?> wildcardClass20 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.41580691019689836d + "'", double12 == 0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.05595719508517638d, 0.09487388796007479d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.19845142031994614d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.37330737634742583d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.31979861116167463d);
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.5433539298660959d);
        double double15 = fDistributionImpl2.getInitialDomain(0.794431337232113d);
        double double17 = fDistributionImpl2.getInitialDomain(0.14038325387155903d);
        java.lang.Class<?> wildcardClass18 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1801856291181903d + "'", double11 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5996052325396897d + "'", double13 == 0.5996052325396897d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.25d + "'", double17 == 1.25d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.4906940248809481d);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.05595719508517638d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.9999981726526794d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) '4');
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.46758643441315834d, 0.23076288400994444d);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.cumulativeProbability(0.9898804402645663d, 1.25d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass10 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.05595719508517638d + "'", double8 == 0.05595719508517638d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.6037071022078223d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.4906940248809481d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistributionImpl2.cumulativeProbability(0.6758256576139563d, 0.03396738004348632d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.6636531716106877d + "'", double5 == 1.6636531716106877d);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.03805921542661744d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double10 = fDistributionImpl2.getInitialDomain(0.5093634057790148d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.023813722351143395d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.cumulativeProbability(0.05350873685544799d, 0.17235021937116024d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.1201684622410103d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.049950031800927046d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5117512873843995d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.017857674930194845d + "'", double8 == 0.017857674930194845d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.010551774397567139d + "'", double12 == 0.010551774397567139d);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainLowerBound(0.5773773436195279d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.43276459841306814d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound((double) (byte) 100);
        double double11 = fDistributionImpl2.getInitialDomain(0.5773773436195279d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.cumulativeProbability(0.7605286207286406d, 0.02723373766299686d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, 0.3919491786229663d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 10);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02887716934657425d + "'", double11 == 0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (short) 0);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability((-0.47077968881994314d), 0.47187845345795065d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.9322902587483378d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14869246204751185d + "'", double13 == 0.14869246204751185d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) (short) 0);
        double double12 = fDistributionImpl2.cumulativeProbability(0.02723373766299686d);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12778854537996234d + "'", double12 == 0.12778854537996234d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.05900530490454193d), 0.7246966031342408d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.33409440091453685d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.5996052325396897d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.7640246288297262d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5433539298658748d + "'", double10 == 0.5433539298658748d);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 1.2109603464415848d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.cumulativeProbability(0.004569416631646944d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.cumulativeProbability(0.6583620521480608d, 0.07246070103630853d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.315320556750493E-26d + "'", double12 == 1.315320556750493E-26d);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        java.lang.Class<?> wildcardClass22 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0192812158854847d, 0.41406926397160465d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.2500001488198675d);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.23587424144892077d);
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
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 100);
        java.lang.Class<?> wildcardClass17 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3197986111586397d, 35.0d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.cumulativeProbability((-0.9999999999999996d), 0.27855365220112865d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3197986111586397d + "'", double3 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6474232392991752d + "'", double6 == 0.6474232392991752d);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.cumulativeProbability(0.9999999999914339d, 0.008036077048780232d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        double double14 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.5189833010988237d);
        double double4 = fDistributionImpl2.getInitialDomain(0.4923052829221457d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.07212597439971892d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.inverseCumulativeProbability(0.31683499876602816d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.3504236660423056 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3504236660423056d) + "'", double4 == (-0.3504236660423056d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4906940248809481d + "'", double5 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability(0.755683952741227d);
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
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.4892284600732909d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.1201684622410103d, 0.41580691019689836d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistributionImpl2.inverseCumulativeProbability(0.2871174581456352d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.32382689714754914 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.11684554078643927d + "'", double5 == 0.11684554078643927d);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        double double10 = fDistributionImpl2.cumulativeProbability(7.444493761760151E-4d);
        double double12 = fDistributionImpl2.getInitialDomain(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.14038325387155903d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7723000623308832d + "'", double10 == 0.7723000623308832d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0204081632653061d + "'", double12 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14038325387155903d + "'", double15 == 0.14038325387155903d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double15 = fDistributionImpl2.getDomainUpperBound(1.0606060606060606d);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        double double23 = fDistributionImpl2.getDomainLowerBound(0.26166495153015507d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9961307247459887d, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(0.9999999238243996d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.41580691019689836d);
        double double13 = fDistributionImpl2.getInitialDomain(0.4546995573427486d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.inverseCumulativeProbability(0.23587424144892077d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.2624723670828401 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.2624723670828401d) + "'", double13 == (-0.2624723670828401d));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, 0.44881727956051176d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3895023980863656d, 0.23076288400994444d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.42370716420032145d, 0.31672086845579883d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.008009325319447534d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.170796029094279d + "'", double4 == 0.170796029094279d);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double10 = fDistributionImpl2.getInitialDomain(0.06401548478113292d);
        double double12 = fDistributionImpl2.getInitialDomain(0.6739693374503183d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.25d + "'", double12 == 1.25d);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, 0.47187845345795065d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5773773436195279d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7103083879489903d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.1829024488312228d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.28618363577756856d + "'", double12 == 0.28618363577756856d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) 1);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainUpperBound((-0.3504236660423056d));
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.04322441323500558d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double20 = fDistributionImpl2.getInitialDomain(0.13759165633724676d);
        double double23 = fDistributionImpl2.cumulativeProbability(2.3610123714643496E-5d, 0.4664502910454298d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0030883693754368224d + "'", double17 == 0.0030883693754368224d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.25d + "'", double20 == 1.25d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.4860815252407045d + "'", double23 == 0.4860815252407045d);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double9 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.43276459841306814d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) (short) 100);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 1, (double) 10);
        double double4 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(97.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double13 = fDistributionImpl2.cumulativeProbability(1.2109603464415848d, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999995770263d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.432364228996943d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2969240624175721d + "'", double13 == 0.2969240624175721d);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double9 = fDistributionImpl2.getInitialDomain((double) 1L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 10);
        double double13 = fDistributionImpl2.getInitialDomain((double) 100);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass15 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (byte) 0);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.7640246288297262d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999873902d);
        double double11 = fDistributionImpl2.getDomainLowerBound(0.3197986111586397d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.inverseCumulativeProbability(0.170796029094279d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.9999999999747803 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.4923052829221457d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4479640982107486d + "'", double11 == 0.4479640982107486d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        double double26 = fDistributionImpl2.cumulativeProbability(1.418479831543378d);
        double double28 = fDistributionImpl2.getDomainLowerBound(0.5949357068038229d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + Double.POSITIVE_INFINITY + "'", double19 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        double double23 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.129032258064516d) + "'", double21 == (-1.129032258064516d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.25d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.08793604972328362d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5433539298660959d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.19151374780859048d + "'", double15 == 0.19151374780859048d);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5993164688934242d);
        double double16 = fDistributionImpl2.getDomainLowerBound(1.0210526315789474d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double16 = fDistributionImpl2.cumulativeProbability(0.7103083879489903d);
        double double18 = fDistributionImpl2.cumulativeProbability(0.6583620521480608d);
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5949357068078883d + "'", double16 == 0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5773773436195279d + "'", double18 == 0.5773773436195279d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability((double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.cumulativeProbability(0.30278624188592324d, 0.24622186047072248d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9967719789495215d + "'", double15 == 0.9967719789495215d);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability(0.3168052840864677d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6758256576139563d);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.41406926397160465d + "'", double11 == 0.41406926397160465d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.6037071022078223d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.6758256576139563d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6037071022078223d + "'", double7 == 0.6037071022078223d);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999995770263d);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double6 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 1);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.3168052840864677d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.1114353339521007d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3197986111586397d + "'", double6 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (-1L));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.43276459841306814d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 100);
        double double10 = fDistributionImpl2.cumulativeProbability(0.9999999999915219d);
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.7583315357111738d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.9961307247459887d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999995770263d + "'", double8 == 0.9999999995770263d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7557224019288303d + "'", double10 == 0.7557224019288303d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0192812158854847d + "'", double12 == 1.0192812158854847d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7551927476169364d + "'", double14 == 0.7551927476169364d);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain((double) 100);
        double double15 = fDistributionImpl2.getDomainUpperBound(1.0d);
        double double17 = fDistributionImpl2.cumulativeProbability(0.19506275762925057d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.025789138102653757d + "'", double17 == 0.025789138102653757d);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.29474933881663606d, 0.3951424744541511d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.18506771891995114d);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.509253301074358d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4419425715309202d + "'", double4 == 0.4419425715309202d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3951424744541511d + "'", double5 == 0.3951424744541511d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound((-1.0d));
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.018345231285955332d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double14 = fDistributionImpl2.cumulativeProbability(0.4664502910454298d);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.8284628704001276d);
        double double18 = fDistributionImpl2.inverseCumulativeProbability(0.34777933225821744d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4898628835849175d + "'", double14 == 0.4898628835849175d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.21578335101162535d + "'", double18 == 0.21578335101162535d);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.6591065015250168d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = fDistributionImpl2.cumulativeProbability(0.541645126720792d, 0.2671687285166097d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9322888260560721d + "'", double17 == 0.9322888260560721d);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainUpperBound(Double.NaN);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, (double) (byte) 10);
        double double4 = fDistributionImpl2.getDomainUpperBound(33.20158064706674d);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.7976931348623157E308d, 35.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.26479899700216447d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.8195918816395871d);
        double double10 = fDistributionImpl2.getInitialDomain(0.06401548478113292d);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) 1L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0606060606060606d + "'", double10 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(5.357258915695551E-11d, 0.2579619500249368d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.031324798049849986d, 0.14335493966332769d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.074129922315706E-11d + "'", double5 == 4.074129922315706E-11d);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0204081632653061d, 0.4546995573427486d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.4633919262405889d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(0.47187845345795065d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.2942467010239518 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.29474933881663606d + "'", double4 == 0.29474933881663606d);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.9999999999873902d);
        double double10 = fDistributionImpl2.getInitialDomain(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3197986111586397d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.3220459516792461d, 0.5326685129511843d);
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0210526315789474d + "'", double10 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.05028488401486397d + "'", double15 == 0.05028488401486397d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3197986111586397d + "'", double16 == 0.3197986111586397d);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.40011231498671923d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999958149977d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.5004087508678674d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.cumulativeProbability(0.20476397886382258d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.05247754500884303d + "'", double5 == 0.05247754500884303d);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4892284600732909d);
        java.lang.Class<?> wildcardClass9 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getInitialDomain(2.1694881938782906d);
        double double14 = fDistributionImpl2.getDomainLowerBound(2.5491771371666263d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.25d + "'", double12 == 1.25d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7723000623308832d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability((double) (byte) 10);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.17637974128336592d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7583315357111738d + "'", double9 == 0.7583315357111738d);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.9999984104468244d);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.26479899700216447d);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6591065015250168d + "'", double15 == 0.6591065015250168d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3197986111586397d, 35.0d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.cumulativeProbability(0.5004087508678674d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3197986111586397d + "'", double3 == 0.3197986111586397d);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double14 = fDistributionImpl2.getDomainLowerBound(1.25d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.31979861116167463d);
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.5433539298660959d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.002393864708003338d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.509253301074358d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1801856291181903d + "'", double11 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5996052325396897d + "'", double13 == 0.5996052325396897d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.03805921542661744d + "'", double15 == 0.03805921542661744d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.9999984104468244d);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.26479899700216447d);
        java.lang.Class<?> wildcardClass18 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6591065015250168d + "'", double15 == 0.6591065015250168d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4394515874848486d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999995770263d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.1048724177104202d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        java.lang.Class<?> wildcardClass20 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + Double.POSITIVE_INFINITY + "'", double19 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDomainUpperBound(0.0d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.19506275762925057d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.26465518129632637d, 0.002393864708003338d);
        double double5 = fDistributionImpl2.cumulativeProbability((double) (-1), 0.680275844215834d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0138432086850232d + "'", double5 == 0.0138432086850232d);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.2421802126086574d);
        double double26 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double28 = fDistributionImpl2.inverseCumulativeProbability(9.838320889492336E-7d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.129032258064516 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.7681324865938718d + "'", double21 == 0.7681324865938718d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0606060606060606d + "'", double26 == 1.0606060606060606d);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(5.357258915695551E-11d, 0.2579619500249368d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.cumulativeProbability(0.8609681162053344d, 0.680275844215834d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.5949357068078883d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (short) 100);
        java.lang.Class<?> wildcardClass12 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.19788692492646354d + "'", double9 == 0.19788692492646354d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        double double23 = fDistributionImpl2.getDomainUpperBound(0.9205507147766241d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3919491786229663d + "'", double17 == 0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.6591065015250168d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.13759165633724676d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability(0.005549455097572098d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.9999999999747803 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999999999873902d + "'", double5 == 0.9999999999873902d);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '#');
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainLowerBound(0.3951424744541511d);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d, 0.7681324865938718d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        double double27 = fDistributionImpl2.getDomainUpperBound(0.21578335101162535d);
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.7976931348623157E308d + "'", double27 == 1.7976931348623157E308d);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistributionImpl2.inverseCumulativeProbability((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.43199198024659174d);
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
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        double double15 = fDistributionImpl2.cumulativeProbability(0.5004087508678674d);
        double double17 = fDistributionImpl2.getDomainUpperBound(0.43276459841306814d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double20 = fDistributionImpl2.inverseCumulativeProbability(0.03896274758465178d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5189833010988237d + "'", double15 == 0.5189833010988237d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.002399087173802834d + "'", double20 == 0.002399087173802834d);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.cumulativeProbability(0.9176064239260036d);
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3210963486747651d + "'", double13 == 0.3210963486747651d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.476758784114401d, 0.4892284600732909d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double4 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 1, (double) 'a');
        double double9 = fDistributionImpl2.getDomainUpperBound(0.5193402098261183d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5996052325402953d + "'", double7 == 0.5996052325402953d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double11 = fDistributionImpl2.getInitialDomain(0.9999999999999998d);
        double double13 = fDistributionImpl2.cumulativeProbability(1.0666666666666667d);
        double double15 = fDistributionImpl2.inverseCumulativeProbability(0.4664502910454298d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6739693374503183d + "'", double13 == 0.6739693374503183d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.41580698164526403d + "'", double15 == 0.41580698164526403d);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10L, 0.17235021937116024d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.23076288400994444d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5658786927327883d, (-0.17434575632550214d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.3197986111596346d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.49838122445596006d);
        double double14 = fDistributionImpl2.getInitialDomain(0.9967719789495215d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainUpperBound(0.29474933881663606d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = fDistributionImpl2.cumulativeProbability(0.9999984104468244d, 0.5117512873843995d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0d, 0.1461266361314345d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, (-0.13370602424775557d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.25d, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.cumulativeProbability(0.9999999999915219d, 1.2214738003873964E-5d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(8.292738272749505E-6d, 1.0606060606060606d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.292738272749505E-6d + "'", double3 == 8.292738272749505E-6d);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double14 = fDistributionImpl2.getInitialDomain((double) (byte) 10);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.9999984104468244d);
        java.lang.Class<?> wildcardClass17 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999915219d + "'", double12 == 0.9999999999915219d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0606060606060606d + "'", double14 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 33.20158064706674d + "'", double16 == 33.20158064706674d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.17379970502642506d, (-0.432364228996943d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double16 = fDistributionImpl2.cumulativeProbability((double) (short) 1, 1.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6591065015250168d);
        double double20 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass21 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.1801856291181903d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.5220157123797441d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 0L, 0.31979861116167463d);
        double double9 = fDistributionImpl2.getDomainUpperBound(0.680275844215834d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1201684622410103d + "'", double4 == 0.1201684622410103d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08793604972328362d + "'", double7 == 0.08793604972328362d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        // The following exception was thrown during execution in test generation
        try {
            double double23 = fDistributionImpl2.inverseCumulativeProbability(0.19506275762925057d);
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
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 1.0606060606060606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3951424744541511d);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (short) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5189833010988237d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = fDistributionImpl2.inverseCumulativeProbability(0.28618363577756856d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.3504236660423056 upperBound=1.7976931348623157E308");
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
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5004087508678674d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.9967719789495215d);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 0L);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainLowerBound(0.023813722351143395d);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.4479640982107486d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5004087508678674d + "'", double11 == 0.5004087508678674d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3197986111586397d, 35.0d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound((-1.0d));
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.018345231285955332d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.17815841044398562d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.inverseCumulativeProbability(0.34777933225821744d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.0977902861946428 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.41580691019689836d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 1L, (double) '#');
        double double4 = fDistributionImpl2.getDomainLowerBound(0.5996052325402953d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.27687764751802335d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.009486956849729777d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.cumulativeProbability(0.14869246204751185d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double13 = fDistributionImpl2.getInitialDomain(0.4852908410635329d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.NaN);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistributionImpl2.cumulativeProbability((double) (short) 100, 0.2215131472835244d);
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
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double16 = fDistributionImpl2.cumulativeProbability(0.7103083879489903d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.inverseCumulativeProbability((-1.53472685559007d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5949357068078883d + "'", double16 == 0.5949357068078883d);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(0.9999984104468244d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5433539298660959d);
        double double21 = fDistributionImpl2.getDomainUpperBound(0.6583620521480608d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6591065015250168d + "'", double15 == 0.6591065015250168d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        double double10 = fDistributionImpl2.cumulativeProbability(7.444493761760151E-4d);
        double double12 = fDistributionImpl2.getInitialDomain(0.0d);
        double double14 = fDistributionImpl2.cumulativeProbability(33.20158064706674d);
        java.lang.Class<?> wildcardClass15 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7723000623308832d + "'", double10 == 0.7723000623308832d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0204081632653061d + "'", double12 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9922790709763858d + "'", double14 == 0.9922790709763858d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (byte) 0);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999915219d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.05350873685544799d);
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.19771484410829757d);
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
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-1.6666671958040784d), 0.189836249017317d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.3040818357099405d);
        double double4 = fDistributionImpl2.cumulativeProbability((-1.6666666666666667d));
        double double6 = fDistributionImpl2.getDomainUpperBound(0.8754146350390162d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.41580691019689836d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5773773436195279d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.41580691019689836d + "'", double9 == 0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5773773436195279d + "'", double10 == 0.5773773436195279d);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 10);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4892284600732909d);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        double double21 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + Double.POSITIVE_INFINITY + "'", double21 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.5773773436195279d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (byte) 100);
        double double6 = fDistributionImpl2.cumulativeProbability(0.5004087508678674d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6421003339612105d + "'", double6 == 0.6421003339612105d);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.25d);
        double double12 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double14 = fDistributionImpl2.getInitialDomain(0.2671687285166097d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 9.838320889492336E-7d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.06954427012843875d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(0.17815841044398562d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-4.919162864561306E-7 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double14 = fDistributionImpl2.getInitialDomain((double) '4');
        double double16 = fDistributionImpl2.getInitialDomain(97.0d);
        double double18 = fDistributionImpl2.cumulativeProbability(0.30255252296354923d);
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0606060606060606d + "'", double14 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0606060606060606d + "'", double16 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.4142199650266395d + "'", double18 == 0.4142199650266395d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        // The following exception was thrown during execution in test generation
        try {
            double double28 = fDistributionImpl2.cumulativeProbability(0.9021122018807471d, (-0.47077968881994314d));
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.43276459841306814d);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double12 = fDistributionImpl2.getDomainUpperBound(0.4204984331337026d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.097152841112099E-5d + "'", double8 == 2.097152841112099E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        double double24 = fDistributionImpl2.cumulativeProbability((double) (short) -1, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.541645126720792d + "'", double21 == 0.541645126720792d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) ' ', 0.9999984104468244d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.cumulativeProbability(0.5957283306792327d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9999984104468244d + "'", double3 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5495061904002759d + "'", double6 == 0.5495061904002759d);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        double double22 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.6636531716106877d + "'", double19 == 1.6636531716106877d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double10 = fDistributionImpl2.getInitialDomain(0.5093634057790148d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4239582314034682d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getInitialDomain((double) 'a');
        double double10 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainLowerBound(0.33825919314095565d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7103083879489903d + "'", double10 == 0.7103083879489903d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainLowerBound(0.45447932157420906d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.008771073413552499d);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.008771073413552499d + "'", double8 == 0.008771073413552499d);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double17 = fDistributionImpl2.cumulativeProbability((double) 10.0f);
        double double19 = fDistributionImpl2.getInitialDomain(0.05350873685544799d);
        double double21 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double23 = fDistributionImpl2.getDomainLowerBound(0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9967719789495215d + "'", double17 == 0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0606060606060606d + "'", double19 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.cumulativeProbability(0.02887716934657425d, (-0.49071513905979386d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double13 = fDistributionImpl2.getInitialDomain(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9205507147766241d);
        java.lang.Class<?> wildcardClass10 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        double double8 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double10 = fDistributionImpl2.inverseCumulativeProbability(0.5658786927337371d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.189836249017317d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6640218712845615d + "'", double10 == 0.6640218712845615d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.6758256576139563d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.cumulativeProbability((-0.2942467010239518d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-1.0d), (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.47077968881994314d), 0.013076967791032157d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.315320556750493E-26d);
        double double10 = fDistributionImpl2.inverseCumulativeProbability(4.645964116627397E-18d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.925167759399662E-14d + "'", double8 == 8.925167759399662E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.999037593690436d, 0.189836249017317d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.5949357068038229d);
        double double6 = fDistributionImpl2.getInitialDomain((-0.19192775392242717d));
        java.lang.Class<?> wildcardClass7 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.1048724177104202d) + "'", double6 == (-0.1048724177104202d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double10 = fDistributionImpl2.getDomainLowerBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.inverseCumulativeProbability(0.17379970502642506d);
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
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability(0.5433539298660959d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.42843061475207117d);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5220157123797441d + "'", double9 == 0.5220157123797441d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.34211877158633835d + "'", double12 == 0.34211877158633835d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 100L);
        double double15 = fDistributionImpl2.getInitialDomain((-0.9999999999999996d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double14 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.17235021937116024d);
        double double18 = fDistributionImpl2.getDomainUpperBound(0.14869246204751185d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = fDistributionImpl2.cumulativeProbability(0.3895023980863656d, 0.2579619500249368d);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double13 = fDistributionImpl2.getInitialDomain(0.9205507147766241d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.inverseCumulativeProbability(0.45447932157420906d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.1801856291181903d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.5220157123797441d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 0L, 0.31979861116167463d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.4633919262405889d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6289333745278087d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1201684622410103d + "'", double4 == 0.1201684622410103d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08793604972328362d + "'", double7 == 0.08793604972328362d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.11215527694889071d + "'", double9 == 0.11215527694889071d);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double12 = fDistributionImpl2.getInitialDomain((double) '4');
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.20416048310264287d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double10 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.05350873685544799d, Double.NaN);
        double double15 = fDistributionImpl2.getDomainUpperBound(1.2214738003873964E-5d);
        double double17 = fDistributionImpl2.getInitialDomain(0.32764978063013356d);
        double double19 = fDistributionImpl2.getInitialDomain(1.0210526315789474d);
        double double22 = fDistributionImpl2.cumulativeProbability(0.45484514927563435d, 0.6289333745278087d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.06699575007425973d + "'", double22 == 0.06699575007425973d);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.49838122445596006d, 0.4546995573427486d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.12496431835916927d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3077850834112132d + "'", double4 == 0.3077850834112132d);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double11 = fDistributionImpl2.cumulativeProbability(0.3032299156718087d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6589061351369964d + "'", double11 == 0.6589061351369964d);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.inverseCumulativeProbability(0.39134009223677896d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
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
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.41580691019689836d);
        double double13 = fDistributionImpl2.cumulativeProbability((-0.35319435852748904d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.476758784114401d + "'", double11 == 0.476758784114401d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.6037071022078223d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.02723373766299686d, 0.6046935761651037d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100.0f);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistributionImpl2.cumulativeProbability(0.9176064239260036d, 0.4142199650266395d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.02723373766299686d + "'", double5 == 0.02723373766299686d);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainLowerBound(8.292738272749505E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound(0.04818702750924919d);
        java.lang.Class<?> wildcardClass12 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.031324798049849986d, 1.0606060606060606d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.0721470484493668d, 1.0074491241240935E-9d);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getInitialDomain(0.5996052325402953d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5366657182124845d);
        double double13 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double15 = fDistributionImpl2.getInitialDomain(1.25d);
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDomainLowerBound(0.3168052840864677d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5366657182124845d + "'", double16 == 0.5366657182124845d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(0.33409440091453685d);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.476758784114401d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.04952177738101d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4239582314034682d + "'", double14 == 0.4239582314034682d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, 0.3919491786229663d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 10);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double18 = fDistributionImpl2.cumulativeProbability(0.21578335101162535d);
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02887716934657425d + "'", double11 == 0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0606060606060606d + "'", double15 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0606060606060606d + "'", double16 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.33353342474782405d + "'", double18 == 0.33353342474782405d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.018345231285955332d, 0.4479640982107486d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5189833010988237d);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        double double22 = fDistributionImpl2.cumulativeProbability(0.0d, 32.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = fDistributionImpl2.inverseCumulativeProbability(8.925167759399662E-14d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.8680772406436601 upperBound=1.7976931348623157E308");
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.8754146350390162d + "'", double22 == 0.8754146350390162d);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.17235021937116024d);
        double double14 = fDistributionImpl2.getDomainLowerBound((double) '#');
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.43199198024659174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.049950031800927046d + "'", double12 == 0.049950031800927046d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.cumulativeProbability(0.11684554078643927d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2654747243225105d + "'", double16 == 0.2654747243225105d);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.7246966031342408d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.cumulativeProbability(0.18506771891995114d, 0.11215527694889071d);
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
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double14 = fDistributionImpl2.getInitialDomain((double) 1L);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.5949357068038229d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.25d + "'", double14 == 1.25d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.293214330727583d), 0.05595719508517638d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.794431337232113d, (double) 10);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0074491241240935E-9d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.2109603464415848d);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0606060606060606d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.049950031800927046d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.14869246204751185d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.inverseCumulativeProbability(0.33096804704038296d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.129032258064516 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0010665602861507125d + "'", double10 == 0.0010665602861507125d);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound(0.1855184662093986d);
        java.lang.Class<?> wildcardClass10 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.26479899700216447d, 2.097152841112099E-5d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.336242355358862d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.8933186128357743d);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.22828618836637168d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double9 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound(0.4479640982107486d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9365489651388929d + "'", double9 == 0.9365489651388929d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.9999999999999996d));
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.541645126720792d + "'", double21 == 0.541645126720792d);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound((double) '4');
        double double13 = fDistributionImpl2.getDomainUpperBound(0.7246966031342408d);
        double double15 = fDistributionImpl2.getDomainLowerBound(0.516893766967757d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.cumulativeProbability(0.11215527694889071d, 0.009486956849729777d);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double19 = fDistributionImpl2.cumulativeProbability(1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02887716934657425d + "'", double11 == 0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6583483451931957d + "'", double19 == 0.6583483451931957d);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double14 = fDistributionImpl2.getInitialDomain((double) 1L);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.08419329170293993d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + Double.POSITIVE_INFINITY + "'", double12 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.25d + "'", double14 == 1.25d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.4234224082773299d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.08793604972328362d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.7640246288297262d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14405562398547067d + "'", double10 == 0.14405562398547067d);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability(0.5433539298660959d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5220157123797441d + "'", double9 == 0.5220157123797441d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5996052325402953d, 0.20909172880811788d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.cumulativeProbability(0.9999763973332203d, 0.13759165633724676d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double14 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.17235021937116024d);
        double double18 = fDistributionImpl2.getDomainUpperBound(0.14869246204751185d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.8026648265055725d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.19151374780859048d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double11 = fDistributionImpl2.cumulativeProbability(10.0d, 10.0d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.27687764751802335d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = fDistributionImpl2.cumulativeProbability(0.6553251431808038d, 0.1461266361314345d);
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
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistributionImpl2.inverseCumulativeProbability(0.9999999958149977d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.06965997645678441d);
        double double12 = fDistributionImpl2.getInitialDomain(0.20909172880811788d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.13174537379287576d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0204081632653061d + "'", double12 == 1.0204081632653061d);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double12 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double14 = fDistributionImpl2.getInitialDomain(1.2109603464415848d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.43906017126509644d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.inverseCumulativeProbability(0.29474933881663606d);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1345060112435601d + "'", double16 == 0.1345060112435601d);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        double double20 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass21 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.05595719508517638d, 0.11215527694889071d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.cumulativeProbability(2.1694881938782906d, (-1.129032258064516d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.3991062373962743E-245d, 0.29474933881663606d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5993164688934242d);
        double double16 = fDistributionImpl2.getDomainLowerBound(1.0210526315789474d);
        double double18 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        java.lang.Class<?> wildcardClass19 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + Double.POSITIVE_INFINITY + "'", double18 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double16 = fDistributionImpl2.cumulativeProbability(0.7103083879489903d);
        double double18 = fDistributionImpl2.getDomainLowerBound(1.0606060606060606d);
        double double19 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5949357068078883d + "'", double16 == 0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.19845142031994614d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.cumulativeProbability(0.8597859255962592d, 0.1345060112435601d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.inverseCumulativeProbability((-0.13370602424775557d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.189836249017317d);
        double double18 = fDistributionImpl2.getDomainLowerBound(0.491780299474472d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3197986111586397d, 35.0d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3197986111586397d + "'", double3 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(0.2207617383499606d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainLowerBound(0.5773773436195279d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.31979861116167463d);
        double double18 = fDistributionImpl2.cumulativeProbability(0.45484514927563435d, 0.7557224019288303d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.04576376563200668d + "'", double18 == 0.04576376563200668d);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain(0.9967719789495215d);
        double double15 = fDistributionImpl2.getDomainUpperBound(1.3515003513676351d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.07212597439971892d, 0.26166495153015507d);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.29474933881663606d, 0.3951424744541511d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.315320556750493E-26d);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.06965997645678441d, 0.4906940248809481d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.7976931348623157E308d);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.6037071022078223d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.4906940248809481d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.cumulativeProbability(0.011266907817500001d, (-0.9999999999830438d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.6636531716106877d + "'", double5 == 1.6636531716106877d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.6636531716106877d + "'", double6 == 1.6636531716106877d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.6636531716106877d + "'", double7 == 1.6636531716106877d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9999999999873902d, 0.1801856291181903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.27687764751802335d);
        double double6 = fDistributionImpl2.getInitialDomain(0.20196314831799295d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.09901319167563201d) + "'", double6 == (-0.09901319167563201d));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.inverseCumulativeProbability((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
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
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.08015071710935137d);
        double double12 = fDistributionImpl2.getInitialDomain(10.0d);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.023813722351143395d);
        java.lang.Class<?> wildcardClass15 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.25d + "'", double12 == 1.25d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double15 = fDistributionImpl2.getDomainUpperBound(1.0606060606060606d);
        double double17 = fDistributionImpl2.getDomainLowerBound(0.1829024488312228d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999873902d);
        double double11 = fDistributionImpl2.cumulativeProbability(0.7723000623308832d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.inverseCumulativeProbability(0.8485385657705871d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.9999999999747803 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2579619500249368d + "'", double11 == 0.2579619500249368d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.6636531716106877d, 0.6640218712845615d);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7246966031342408d, 0.3220459516792461d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(0.9999999999915219d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.19192775392242717 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(10.0d);
        double double17 = fDistributionImpl2.getInitialDomain(0.013443616381931207d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistributionImpl2.inverseCumulativeProbability((-0.4915427677698697d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5189833010988237d, 0.7103083879489903d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0192812158854847d);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) '4');
        double double6 = fDistributionImpl2.getDomainUpperBound(1.334173577483257E-5d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound((-0.35319435852748904d));
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability((-0.09901319167563201d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound(0.23076288400994444d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.3220459516792461d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.6758256576139563d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(7.444493761760151E-4d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.8609681162053344d, 10.0d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.20645201597141383d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8609681162053344d + "'", double5 == 0.8609681162053344d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.1801856291181903d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = fDistributionImpl2.cumulativeProbability(0.535927304604666d, 0.004141886739706592d);
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
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.41580691019689836d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.3895023980863656d);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.476758784114401d + "'", double11 == 0.476758784114401d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.4633919262405889d + "'", double13 == 0.4633919262405889d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3197986111586397d, 35.0d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDomainUpperBound(0.5565294657256515d);
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass7 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.3197986111586397d + "'", double3 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (byte) 10);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound(0.14131937536292083d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.cumulativeProbability(0.46758643441315834d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4664502910454298d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.17235021937116024d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.19845142031994614d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-0.35319435852748904d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 10);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.1201684622410103d);
        double double14 = fDistributionImpl2.getDomainLowerBound((-0.2624723670828401d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6591065015250168d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability(0.9999999958149977d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.4915427677698697 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1.0f), Double.POSITIVE_INFINITY);
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.31979861116167463d);
        double double13 = fDistributionImpl2.inverseCumulativeProbability(0.5433539298660959d);
        double double15 = fDistributionImpl2.getDomainUpperBound((-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1801856291181903d + "'", double11 == 0.1801856291181903d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5996052325396897d + "'", double13 == 0.5996052325396897d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double17 = fDistributionImpl2.cumulativeProbability(0.9898804402645663d, Double.NaN);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.334173577483257E-5d);
        double double21 = fDistributionImpl2.inverseCumulativeProbability((double) 0L);
        double double22 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = fDistributionImpl2.inverseCumulativeProbability(0.7103085841908984d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-6.670912388191515E-6 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.334173577483257E-5d + "'", double22 == 1.334173577483257E-5d);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6591065015250168d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.5993164688934242d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability(0.03896274758465178d, 0.8585643081732904d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.4841779558913619d + "'", double9 == 0.4841779558913619d);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.23076288400994444d);
        double double12 = fDistributionImpl2.getDomainLowerBound(1.0d);
        double double14 = fDistributionImpl2.getDomainLowerBound(0.2671687285166097d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistributionImpl2.cumulativeProbability(0.19506275762925057d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
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
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(0.6591065015250168d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.4892284600732909d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.1201684622410103d, 0.41580691019689836d);
        java.lang.Class<?> wildcardClass6 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.11684554078643927d + "'", double5 == 0.11684554078643927d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getInitialDomain(0.9293804578921561d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.cumulativeProbability(0.10555964729310591d, 0.0138432086850232d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass9 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 10.0f);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(2.1694881938782906d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double19 = fDistributionImpl2.cumulativeProbability(0.03896274758465178d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.031053678956944965d + "'", double19 == 0.031053678956944965d);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.6758256576139563d);
        double double12 = fDistributionImpl2.cumulativeProbability((double) 10.0f);
        double double14 = fDistributionImpl2.cumulativeProbability(0.42666238729297296d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9898804402645663d + "'", double12 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4716372688168128d + "'", double14 == 0.4716372688168128d);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.7976931348623157E308d, 0.32764978063013356d);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.14637555387850465d);
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.getDomainUpperBound(Double.NaN);
        double double17 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9453652605193021d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.4664502910454298d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.17235021937116024d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.19845142031994614d);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getInitialDomain((-0.33369676647384544d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.17235021937116024d + "'", double14 == 0.17235021937116024d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.25d + "'", double16 == 1.25d);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        double double4 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.028005760216863906d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double6 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 1);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.3168052840864677d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) 100);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3197986111586397d + "'", double6 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((-0.09901319167563201d));
        double double13 = fDistributionImpl2.getInitialDomain(0.45484514927563435d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0606060606060606d + "'", double13 == 1.0606060606060606d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.24622186047072248d);
        double double9 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.9799636396743291d), 0.9176064239260036d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '4');
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.NaN);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double17 = fDistributionImpl2.cumulativeProbability((double) 10.0f);
        double double19 = fDistributionImpl2.getInitialDomain(0.05350873685544799d);
        double double21 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        java.lang.Class<?> wildcardClass22 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9967719789495215d + "'", double17 == 0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0606060606060606d + "'", double19 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.05595719508517638d, 0.09487388796007479d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(5.357258915695551E-11d);
        double double6 = fDistributionImpl2.getDomainLowerBound((-0.6073583604658008d));
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.09901319167563201d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        double double23 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.4892284600732909d);
        double double4 = fDistributionImpl2.cumulativeProbability((double) (byte) -1);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, 0.3919491786229663d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 10);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getDomainLowerBound(0.3197986111586397d);
        double double19 = fDistributionImpl2.getDomainLowerBound(0.029360195877475227d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02887716934657425d + "'", double11 == 0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.cumulativeProbability(0.31979861116167463d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(97.0d);
        double double16 = fDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.41580691019689836d + "'", double12 == 0.41580691019689836d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        double double23 = fDistributionImpl2.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + Double.POSITIVE_INFINITY + "'", double19 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double13 = fDistributionImpl2.getDomainLowerBound(0.9999999238243996d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.1801856291181903d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.5220157123797441d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 0L, 0.31979861116167463d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        double double11 = fDistributionImpl2.getInitialDomain(0.1114353339521007d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1201684622410103d + "'", double4 == 0.1201684622410103d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08793604972328362d + "'", double7 == 0.08793604972328362d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.09901319167563201d) + "'", double9 == (-0.09901319167563201d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.09901319167563201d) + "'", double11 == (-0.09901319167563201d));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound(0.5004087508678674d);
        double double11 = fDistributionImpl2.getInitialDomain(0.19506275762925057d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass8 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + Double.POSITIVE_INFINITY + "'", double7 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = fDistributionImpl2.inverseCumulativeProbability(0.45447932157420906d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, 0.9999984104468244d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.cumulativeProbability(0.5193402098261183d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4906940248809481d + "'", double3 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5292825574398908d + "'", double5 == 0.5292825574398908d);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 0.4892284600732909d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 1L);
        java.lang.Class<?> wildcardClass6 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double5 = fDistributionImpl2.cumulativeProbability(0.9967719789495215d, 0.9999984104468244d);
        double double7 = fDistributionImpl2.getDomainLowerBound(0.02887716934657425d);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.cumulativeProbability(0.9999763973332203d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.inverseCumulativeProbability(0.21109370629708515d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.444493761760151E-4d + "'", double5 == 7.444493761760151E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3408876950806238d + "'", double10 == 0.3408876950806238d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainUpperBound((-0.3504236660423056d));
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.39134009223677896d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.345456265936167d + "'", double10 == 0.345456265936167d);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.1461266361314345d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.28973685369839197d + "'", double8 == 0.28973685369839197d);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5949357068078883d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.8609681162053344d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5949357068078883d + "'", double8 == 0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8284628704001276d + "'", double10 == 0.8284628704001276d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5292825574398908d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        double double23 = fDistributionImpl2.cumulativeProbability(0.6591065015250168d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.5642254869194474d + "'", double23 == 0.5642254869194474d);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.cumulativeProbability(0.9898804402645663d, 1.25d);
        double double10 = fDistributionImpl2.getInitialDomain(0.541645126720792d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.2639273029648429d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.05595719508517638d + "'", double8 == 0.05595719508517638d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(0.7103083879489903d);
        double double10 = fDistributionImpl2.getInitialDomain(0.5093634057790148d);
        double double12 = fDistributionImpl2.cumulativeProbability(0.6046935761651037d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.27855365220112865d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0666666666666667d + "'", double10 == 1.0666666666666667d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.20196314831799295d + "'", double12 == 0.20196314831799295d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability((double) 100);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.680275844215834d);
        double double17 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = fDistributionImpl2.cumulativeProbability(0.5193402098261183d, 0.345456265936167d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability(1228.3664773101177d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9999999958149977d + "'", double9 == 0.9999999958149977d);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.cumulativeProbability((-1.129032258064516d));
        double double14 = fDistributionImpl2.inverseCumulativeProbability(0.8284628704001276d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.8597859255962592d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.1694881938782906d + "'", double14 == 2.1694881938782906d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6243639160256823d + "'", double16 == 0.6243639160256823d);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        double double8 = fDistributionImpl2.getDomainLowerBound(0.4906940248809481d);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.05595719508517638d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.04322441323500558d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.23076288400994444d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) '4', 0.5004087508678674d);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(0.3919491786229663d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.33369676647384544d) + "'", double5 == (-0.33369676647384544d));
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.05595719508517638d, 0.09487388796007479d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.19845142031994614d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.cumulativeProbability(0.3040818357099405d, 0.17815841044398562d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound((double) (byte) 100);
        double double11 = fDistributionImpl2.getInitialDomain(0.5773773436195279d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3077850834112132d, 0.4239582314034682d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.33364776310664174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        // The following exception was thrown during execution in test generation
        try {
            double double24 = fDistributionImpl2.inverseCumulativeProbability((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
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
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) '4');
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.cumulativeProbability(97.0d);
        double double11 = fDistributionImpl2.getDomainUpperBound(0.999037593690436d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.7976931348623157E308d);
        double double12 = fDistributionImpl2.getInitialDomain(0.7043071535892672d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.7103083879489903d);
        java.lang.Class<?> wildcardClass15 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0666666666666667d + "'", double12 == 1.0666666666666667d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (-1L));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.43276459841306814d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound(0.2255061186409303d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double12 = fDistributionImpl2.inverseCumulativeProbability(0.11215527694889071d);
        double double14 = fDistributionImpl2.cumulativeProbability((double) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.7835361335394757d + "'", double12 == 0.7835361335394757d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getInitialDomain((double) 'a');
        double double10 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double14 = fDistributionImpl2.getDomainLowerBound((-0.2624723670828401d));
        // The following exception was thrown during execution in test generation
        try {
            double double17 = fDistributionImpl2.cumulativeProbability(0.31672086845579883d, (-0.9999999999999996d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7103083879489903d + "'", double10 == 0.7103083879489903d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double10 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double12 = fDistributionImpl2.cumulativeProbability((-0.09430155667562287d));
        // The following exception was thrown during execution in test generation
        try {
            double double15 = fDistributionImpl2.cumulativeProbability(0.3919492048229929d, 0.03805921542661744d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
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
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double15 = fDistributionImpl2.cumulativeProbability((double) (short) -1, 0.19788692492646354d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.492156888551156d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.33409440091453685d + "'", double15 == 0.33409440091453685d);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.5949357068078883d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability(0.35760002498487775d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.19788692492646354d + "'", double9 == 0.19788692492646354d);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9961307247459887d, 0.6591068676979391d);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0204081632653061d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.06401548478113292d);
        double double14 = fDistributionImpl2.cumulativeProbability(0.9453652605193021d);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4936605546990172d + "'", double14 == 0.4936605546990172d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double14 = fDistributionImpl2.getDomainUpperBound(100.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.05595719508517638d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6046935761651037d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999915219d + "'", double12 == 0.9999999999915219d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4394515874848486d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.inverseCumulativeProbability(2.1694881938782906d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
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
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.013666728010437416d, (double) (short) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.8125673702109506E-6d, 0.04366678567633304d);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainLowerBound((double) (short) 100);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.getDomainLowerBound(0.3919491786229663d);
        double double12 = fDistributionImpl2.cumulativeProbability((-0.2942467010239518d));
        double double15 = fDistributionImpl2.cumulativeProbability(0.43276459841306814d, 0.45447932157420906d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.43278329179761166d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.009486956849729777d + "'", double15 == 0.009486956849729777d);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) (byte) 1);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = fDistributionImpl2.inverseCumulativeProbability(0.4936605546990172d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.7723000623308832d, (-0.9999999916299953d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9898804402645663d);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1));
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.23587424144892077d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4009893970905954d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999958149977d);
        double double17 = fDistributionImpl2.getInitialDomain(0.06965997645678441d);
        double double19 = fDistributionImpl2.getInitialDomain(0.017857674930194845d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.2507734447545213d) + "'", double17 == (-0.2507734447545213d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.2507734447545213d) + "'", double19 == (-0.2507734447545213d));
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (short) 10);
        double double9 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double11 = fDistributionImpl2.cumulativeProbability((double) (byte) 0);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-0.49071513905979386d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.43276459841306814d + "'", double7 == 0.43276459841306814d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.9999999999747803d) + "'", double9 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999873902d + "'", double12 == 0.9999999999873902d);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        double double23 = fDistributionImpl2.cumulativeProbability(0.16510007084584888d);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = fDistributionImpl2.cumulativeProbability((double) (short) 1, 0.19151374780859048d);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.11821926384459756d + "'", double23 == 0.11821926384459756d);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.011266907817500001d, 0.509253301074358d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.6421003339612105d);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3197986111586397d, 35.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.17235021937116024d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.20196314831799295d);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double6 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) (short) 1);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.6591065015250168d);
        double double14 = fDistributionImpl2.getInitialDomain(0.008610287160087353d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3197986111586397d + "'", double6 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.4915427677698697d) + "'", double14 == (-0.4915427677698697d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6591065015250168d + "'", double15 == 0.6591065015250168d);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5220157123797441d, 0.05595719508517638d);
        double double5 = fDistributionImpl2.cumulativeProbability(0.3408876950806238d, 0.41406926397160465d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.004456918279453936d + "'", double5 == 0.004456918279453936d);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, (double) (byte) 10);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(0.02887716934657425d);
        double double7 = fDistributionImpl2.getDomainUpperBound(0.07212597439971892d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.07908924131400807d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4906940248809481d + "'", double3 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.25d + "'", double5 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.40950022079209614d + "'", double9 == 0.40950022079209614d);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9999999999873902d, 0.1801856291181903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.27687764751802335d);
        double double7 = fDistributionImpl2.cumulativeProbability(0.0010722599132668223d, 0.35149728096692545d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(7.444493761760151E-4d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4546995573427486d);
        java.lang.Class<?> wildcardClass12 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.19845142031994614d + "'", double7 == 0.19845142031994614d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, (double) 1L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.999037593690436d);
        java.lang.Class<?> wildcardClass5 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability(0.3168052840864677d);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.41406926397160465d + "'", double11 == 0.41406926397160465d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double10 = fDistributionImpl2.getInitialDomain(0.06401548478113292d);
        double double12 = fDistributionImpl2.getInitialDomain(0.6739693374503183d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = fDistributionImpl2.inverseCumulativeProbability((-0.49071513905979386d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.25d + "'", double12 == 1.25d);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) (short) 0);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.27687764751802335d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getDomainUpperBound(1.2241878759327988E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        java.lang.Class<?> wildcardClass18 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.10555964729310591d + "'", double15 == 0.10555964729310591d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound(0.6591065015250168d);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass10 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.2500001488198675d);
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
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainLowerBound(0.3197986111596346d);
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainLowerBound(0.5626720221012385d);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getInitialDomain(0.04818702750924919d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability(0.40971224866107453d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.008771073413552499d, 0.6583620521480608d);
        double double4 = fDistributionImpl2.getInitialDomain((double) '#');
        double double6 = fDistributionImpl2.getDomainLowerBound(0.5366657182124845d);
        double double8 = fDistributionImpl2.getInitialDomain(0.13759165633724676d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.49071513905979386d) + "'", double4 == (-0.49071513905979386d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.49071513905979386d) + "'", double8 == (-0.49071513905979386d));
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4898628835849175d);
        double double9 = fDistributionImpl2.cumulativeProbability(1.3991062373962743E-245d, 0.5433539298660959d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = fDistributionImpl2.inverseCumulativeProbability(0.47187845345795065d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.32438304989669015 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.32386298675112735d + "'", double9 == 0.32386298675112735d);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5949357068078883d, (double) (short) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double5 = fDistributionImpl2.cumulativeProbability(0.3895024214486992d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4566514703525203d + "'", double5 == 0.4566514703525203d);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.4906940248809481d, (double) (byte) 10);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.inverseCumulativeProbability((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.5949357068078883d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(10.03041485845025d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) '#');
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainLowerBound(0.3951424744541511d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.334173577483257E-5d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.cumulativeProbability(0.5949357068078883d);
        double double11 = fDistributionImpl2.getInitialDomain(0.4479640982107486d);
        double double13 = fDistributionImpl2.cumulativeProbability(1.3515003513676351d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.19788692492646354d + "'", double9 == 0.19788692492646354d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.39180808192515115d + "'", double13 == 0.39180808192515115d);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.19788692492646354d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        java.lang.Class<?> wildcardClass13 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.19788692492646354d + "'", double12 == 0.19788692492646354d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double6 = fDistributionImpl2.getDomainUpperBound(0.6591065015250168d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double10 = fDistributionImpl2.cumulativeProbability(0.9293804578921561d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.30217627350924703d + "'", double10 == 0.30217627350924703d);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100L, (-0.49071513905979386d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.3991062373962743E-245d, 0.29474933881663606d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = fDistributionImpl2.inverseCumulativeProbability(0.5433539503073836d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.17284810117715704 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.3895023980863656d, 0.23076288400994444d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.23076288400994444d + "'", double3 == 0.23076288400994444d);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 10L);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1L));
        java.lang.Class<?> wildcardClass7 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        java.lang.Class<?> wildcardClass25 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + Double.POSITIVE_INFINITY + "'", double19 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double6 = fDistributionImpl2.getInitialDomain(0.05350873685544799d);
        double double8 = fDistributionImpl2.cumulativeProbability(0.5658786927337371d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.09487388796007479d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.18685162596174398d + "'", double8 == 0.18685162596174398d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.7103083879489903d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.06401548478113292d);
        double double13 = fDistributionImpl2.cumulativeProbability((-0.2624723670828401d), 0.19788692492646354d);
        double double15 = fDistributionImpl2.getInitialDomain(0.3069371622276223d);
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.008610287160087353d + "'", double13 == 0.008610287160087353d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.031135097668851475d, (-0.09901319167563201d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7043071535892672d);
        double double9 = fDistributionImpl2.getInitialDomain(0.9999999504708134d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.cumulativeProbability((-1.0d), (double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistributionImpl2.cumulativeProbability((double) 100, 0.32764978063013356d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.31979861116167463d + "'", double11 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 100L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.017857674930194845d);
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d, (double) 1.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double14 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double16 = fDistributionImpl2.getInitialDomain(0.16593376295629791d);
        double double18 = fDistributionImpl2.getInitialDomain(0.11215527694889071d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.31979861116167463d + "'", double10 == 0.31979861116167463d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        java.lang.Class<?> wildcardClass14 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.25d + "'", double13 == 1.25d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getDomainUpperBound((double) 10.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d);
        double double17 = fDistributionImpl2.getInitialDomain(0.0d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.2109603464415848d);
        double double22 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.16510007084584888d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.08015071710935137d + "'", double15 == 0.08015071710935137d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.3197986111586397d + "'", double19 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.2109603464415848d + "'", double22 == 1.2109603464415848d);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5189833010988237d, 0.4898628835849175d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-1.6666666666666667d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double7 = fDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double8 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0d);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDomainLowerBound(0.5773773436195279d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.31979861116167463d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(4.074129922315706E-11d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0d);
        double double9 = fDistributionImpl2.getInitialDomain((double) 1L);
        double double11 = fDistributionImpl2.getDomainLowerBound(0.5326685129511843d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double15 = fDistributionImpl2.cumulativeProbability(1.0606060606060606d, Double.NaN);
        double double17 = fDistributionImpl2.cumulativeProbability((double) 10.0f);
        double double19 = fDistributionImpl2.getDomainLowerBound(0.5996052325402953d);
        double double21 = fDistributionImpl2.getDomainLowerBound(0.0010722599132668223d);
        double double22 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9967719789495215d + "'", double17 == 0.9967719789495215d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.35149728096692545d, 0.05468886506853487d);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) '#');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain((double) 100);
        double double15 = fDistributionImpl2.getInitialDomain((double) (-1));
        double double17 = fDistributionImpl2.cumulativeProbability(0.5949357068078883d);
        double double19 = fDistributionImpl2.getInitialDomain(0.0d);
        double double21 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.19788692492646354d + "'", double17 == 0.19788692492646354d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 0);
        double double6 = fDistributionImpl2.getDomainUpperBound(0.3197986111586397d);
        double double8 = fDistributionImpl2.cumulativeProbability(1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getInitialDomain(0.6758256576139563d);
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.24622186047072248d);
        double double10 = fDistributionImpl2.getDomainUpperBound(0.39151156165974016d);
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double14 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.17235021937116024d);
        double double18 = fDistributionImpl2.getDomainUpperBound(0.14869246204751185d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.8026648265055725d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.04503703868667216d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9999999999915219d, 2.097152841112099E-5d);
        double double4 = fDistributionImpl2.getDomainLowerBound(0.04860877630608049d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.03505821861061997d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4898628835849175d);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.02586733482168741d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.33409440091453685d, 0.6401770331730183d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6401770331730183d + "'", double3 == 0.6401770331730183d);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double10 = fDistributionImpl2.getDomainLowerBound(0.41406926397160465d);
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double15 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getDomainUpperBound(1.04952177738101d);
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double20 = fDistributionImpl2.getDomainUpperBound(0.0010665602861507125d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + Double.POSITIVE_INFINITY + "'", double18 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double6 = fDistributionImpl2.cumulativeProbability(0.9999999999873902d);
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3197986111586397d + "'", double6 == 0.3197986111586397d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double14 = fDistributionImpl2.cumulativeProbability(0.4664502910454298d);
        double double16 = fDistributionImpl2.getInitialDomain(0.9967719789495215d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = fDistributionImpl2.inverseCumulativeProbability((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4898628835849175d + "'", double14 == 0.4898628835849175d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.25d + "'", double16 == 1.25d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability((double) 0.0f, 0.5996052325402953d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5189833010988237d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5433539298660959d + "'", double15 == 0.5433539298660959d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5189833010988237d + "'", double18 == 0.5189833010988237d);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double13 = fDistributionImpl2.cumulativeProbability(1.2109603464415848d, (double) (short) 100);
        double double15 = fDistributionImpl2.getInitialDomain((-0.9999999999747803d));
        // The following exception was thrown during execution in test generation
        try {
            double double18 = fDistributionImpl2.cumulativeProbability(3.72605569395207d, 0.18685162596174398d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
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
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.08793604972328362d);
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.6037071022078223d);
        double double19 = fDistributionImpl2.getDomainLowerBound(0.010367711397661706d);
        double double21 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double22 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.3826603340484837E-4d + "'", double17 == 1.3826603340484837E-4d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.08793604972328362d + "'", double22 == 0.08793604972328362d);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.22828618836637168d, (-0.2004508130138858d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.008036077048780232d, 0.5949357068078883d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999999999998d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = fDistributionImpl2.inverseCumulativeProbability(0.29474933881663606d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.4234224082773299 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5949357068078883d + "'", double3 == 0.5949357068078883d);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double15 = fDistributionImpl2.cumulativeProbability((double) 0.0f, 0.5996052325402953d);
        double double17 = fDistributionImpl2.cumulativeProbability(1.3826603340484837E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5433539298660959d + "'", double15 == 0.5433539298660959d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.009150552718303446d + "'", double17 == 0.009150552718303446d);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(10.0d, 1.2109603464415848d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.cumulativeProbability(0.03805921542661744d, 1.8125673702109506E-6d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(0.17235021937116024d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = fDistributionImpl2.inverseCumulativeProbability((-0.05900530490454193d));
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
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double5 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5949357068078883d);
        double double8 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double10 = fDistributionImpl2.cumulativeProbability(0.025789138102653757d);
        java.lang.Class<?> wildcardClass11 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5949357068078883d + "'", double8 == 0.5949357068078883d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.21109370629708515d + "'", double10 == 0.21109370629708515d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.5189833010988237d, 0.4898628835849175d);
        double double4 = fDistributionImpl2.cumulativeProbability(0.170796029094279d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.33059992956874545d + "'", double4 == 0.33059992956874545d);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.00638827009754162d);
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
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 97.0d);
        double double4 = fDistributionImpl2.getDomainUpperBound(0.9999984104468244d);
        double double6 = fDistributionImpl2.getInitialDomain((-1.0d));
        double double7 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.7103085841908984d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0210526315789474d + "'", double6 == 1.0210526315789474d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0210526315789474d + "'", double9 == 1.0210526315789474d);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.31979861116167463d);
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 10.0f);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.5949357068038229d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getInitialDomain(0.24041303946096454d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.getDomainUpperBound(97.0d);
        double double6 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) 10);
        double double10 = fDistributionImpl2.getDomainUpperBound((double) (short) 0);
        double double12 = fDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double16 = fDistributionImpl2.inverseCumulativeProbability(0.4546995573427486d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.17815841044398562d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = fDistributionImpl2.cumulativeProbability(0.02586733482168741d, 0.010367711397661706d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.25d + "'", double8 == 1.25d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3919492048229929d + "'", double16 == 0.3919492048229929d);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) (-1));
        double double13 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5220157123797441d);
        double double18 = fDistributionImpl2.getInitialDomain(0.011912325204771257d);
        double double19 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double21 = fDistributionImpl2.getDomainUpperBound(0.16510007084584888d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.35319435852748904d) + "'", double18 == (-0.35319435852748904d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5220157123797441d + "'", double19 == 0.5220157123797441d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.34211877158633835d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getInitialDomain(0.1822843294541756d);
        double double11 = fDistributionImpl2.getInitialDomain(0.029360195877475227d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.37330737634742583d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.10493558659304991d + "'", double13 == 0.10493558659304991d);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999873902d);
        double double11 = fDistributionImpl2.getDomainLowerBound(0.3197986111586397d);
        double double13 = fDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.3951424744541511d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.491780299474472d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.680275844215834d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = fDistributionImpl2.inverseCumulativeProbability(0.43467479348140525d);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5598475038519922d + "'", double19 == 0.5598475038519922d);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double5 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double8 = fDistributionImpl2.getDomainLowerBound(0.23076288400994444d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = fDistributionImpl2.inverseCumulativeProbability(1.6636531716106877d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 1.0f, 0.7103085841908984d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = fDistributionImpl2.cumulativeProbability(1.0d, 8.925167759399662E-14d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.999037593690436d, 0.189836249017317d);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.189836249017317d + "'", double3 == 0.189836249017317d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.189836249017317d + "'", double4 == 0.189836249017317d);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.19788692492646354d, 0.11215527694889071d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(1.0204081632653061d);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain((double) (-1.0f));
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainUpperBound(0.3168052840864677d);
        double double11 = fDistributionImpl2.getInitialDomain(0.9999999999999998d);
        double double13 = fDistributionImpl2.cumulativeProbability(0.33364776310664174d);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.04818702750924919d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.9999999995770263d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.25d + "'", double11 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.42370716420032145d + "'", double13 == 0.42370716420032145d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-0.2004508130138858d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.680275844215834d + "'", double18 == 0.680275844215834d);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.33409440091453685d, 0.6739693374503183d);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        java.lang.Class<?> wildcardClass20 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.189836249017317d + "'", double16 == 0.189836249017317d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100.0f, 0.9999999999873902d);
        double double4 = fDistributionImpl2.getInitialDomain(10.0d);
        double double6 = fDistributionImpl2.getDomainLowerBound(0.516893766967757d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9999999999747803d) + "'", double4 == (-0.9999999999747803d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double6 = fDistributionImpl2.getInitialDomain(0.06401548478113292d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = fDistributionImpl2.inverseCumulativeProbability(0.5433539298660959d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0 upperBound=1.7976931348623157E308");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1);
        double double12 = fDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double14 = fDistributionImpl2.getInitialDomain((double) (byte) 10);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4534659472302877d);
        double double18 = fDistributionImpl2.getInitialDomain(0.4595566142158559d);
        double double20 = fDistributionImpl2.getInitialDomain(0.9999999995770263d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999915219d + "'", double12 == 0.9999999999915219d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0606060606060606d + "'", double14 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.293214330727583d) + "'", double18 == (-0.293214330727583d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.293214330727583d) + "'", double20 == (-0.293214330727583d));
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double11 = fDistributionImpl2.getDomainUpperBound((double) 10);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.476758784114401d);
        double double15 = fDistributionImpl2.getDomainUpperBound(0.7043071535892672d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        double double22 = fDistributionImpl2.cumulativeProbability(0.32764978063013356d);
        double double24 = fDistributionImpl2.cumulativeProbability(0.541935949229157d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6591065015250168d + "'", double15 == 0.6591065015250168d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.10715894720040464d + "'", double20 == 0.10715894720040464d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.33096804704038296d + "'", double22 == 0.33096804704038296d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.4039902804002893d + "'", double24 == 0.4039902804002893d);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) 1);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainUpperBound((-0.3504236660423056d));
        java.lang.Class<?> wildcardClass16 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        // The following exception was thrown during execution in test generation
        try {
            double double25 = fDistributionImpl2.cumulativeProbability(0.031135097668851475d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double6 = fDistributionImpl2.getInitialDomain((double) '4');
        double double8 = fDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        double double11 = fDistributionImpl2.cumulativeProbability(10.0d, 10.0d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.4546995573427486d);
        double double18 = fDistributionImpl2.getDomainUpperBound(1.2500001488198675d);
        double double19 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        double double22 = fDistributionImpl2.cumulativeProbability(0.12778854537996234d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.13759165633724676d + "'", double18 == 0.13759165633724676d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.03629268820197962d + "'", double22 == 0.03629268820197962d);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        // The following exception was thrown during execution in test generation
        try {
            double double21 = fDistributionImpl2.inverseCumulativeProbability(0.04503703868667216d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid endpoint parameters:  lowerBound=0.0 initial=-0.8680772406436601 upperBound=1.7976931348623157E308");
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
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3220459516792461d);
        double double11 = fDistributionImpl2.cumulativeProbability(0.19788692492646354d, (double) '4');
        double double13 = fDistributionImpl2.getDomainLowerBound(0.43906017126509644d);
        double double15 = fDistributionImpl2.getInitialDomain(0.5220157123797441d);
        double double17 = fDistributionImpl2.getInitialDomain(0.19506275762925057d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.6758256576139563d, 0.999037593690436d);
        java.lang.Class<?> wildcardClass3 = fDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) ' ');
        double double13 = fDistributionImpl2.getInitialDomain((double) 100);
        double double15 = fDistributionImpl2.getInitialDomain((double) (-1));
        double double17 = fDistributionImpl2.cumulativeProbability(0.5949357068078883d);
        double double19 = fDistributionImpl2.getInitialDomain(0.0d);
        double double21 = fDistributionImpl2.getInitialDomain(1.0192812158854847d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.19788692492646354d + "'", double17 == 0.19788692492646354d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound(0.3197986111596346d);
        double double12 = fDistributionImpl2.getDomainUpperBound(0.49838122445596006d);
        double double14 = fDistributionImpl2.getInitialDomain(0.9967719789495215d);
        double double16 = fDistributionImpl2.cumulativeProbability(0.41406926397160465d);
        double double17 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double18 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + Double.POSITIVE_INFINITY + "'", double18 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        fDistributionImpl2.setDenominatorDegreesOfFreedom(Double.POSITIVE_INFINITY);
        double double6 = fDistributionImpl2.getInitialDomain((double) 10L);
        double double8 = fDistributionImpl2.getInitialDomain(0.3197986111586397d);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        double double14 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.22828618836637168d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.49838122445596006d, 0.3168052840864677d);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom((-0.1048724177104202d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.getInitialDomain(0.0d);
        double double10 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = fDistributionImpl2.cumulativeProbability(0.5220157123797441d, 0.4898628835849175d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double9 = fDistributionImpl2.cumulativeProbability((double) 1L, (double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability((double) 'a');
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 'a');
        double double16 = fDistributionImpl2.cumulativeProbability(0.0d, 0.049950031800927046d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setDenominatorDegreesOfFreedom((-0.4234224082773299d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.17637974128336592d + "'", double16 == 0.17637974128336592d);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        double double11 = fDistributionImpl2.cumulativeProbability(0.3197986111586397d, 0.3919491786229663d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) 10);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double17 = fDistributionImpl2.getDomainLowerBound(0.3197986111586397d);
        double double18 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02887716934657425d + "'", double11 == 0.02887716934657425d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0606060606060606d + "'", double18 == 1.0606060606060606d);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) 1);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.4595566142158559d);
        double double17 = fDistributionImpl2.getDomainLowerBound(1.3826603340484837E-4d);
        java.lang.Class<?> wildcardClass18 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 10, (double) 1.0f);
        double double4 = fDistributionImpl2.getDomainUpperBound((double) 1.0f);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) ' ');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.3197986111586397d);
        double double10 = fDistributionImpl2.inverseCumulativeProbability(8.411646958960975E-7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double7 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double9 = fDistributionImpl2.getDomainLowerBound((double) (byte) 100);
        double double11 = fDistributionImpl2.getDomainLowerBound((double) '#');
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double14 = fDistributionImpl2.getDomainUpperBound(0.3040818357099405d);
        java.lang.Class<?> wildcardClass15 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.cumulativeProbability(Double.NaN);
        double double9 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double11 = fDistributionImpl2.inverseCumulativeProbability(0.5004087508678674d);
        double double13 = fDistributionImpl2.getDomainUpperBound(0.6289333745278087d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.14038325387155903d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4906940248809481d + "'", double11 == 0.4906940248809481d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 1);
        double double13 = fDistributionImpl2.cumulativeProbability(100.0d);
        double double15 = fDistributionImpl2.cumulativeProbability(10.0d);
        double double17 = fDistributionImpl2.cumulativeProbability((double) (-1L));
        double double19 = fDistributionImpl2.getInitialDomain(1.6636531716106877d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = fDistributionImpl2.cumulativeProbability(0.00638827009754162d, (-0.35319435852748904d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9999984104468244d + "'", double13 == 0.9999984104468244d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9898804402645663d + "'", double15 == 0.9898804402645663d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.25d + "'", double19 == 1.25d);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        double double22 = fDistributionImpl2.getDomainUpperBound(0.0d);
        double double23 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999873902d + "'", double11 == 0.9999999999873902d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5189833010988237d + "'", double15 == 0.5189833010988237d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999504708134d + "'", double19 == 0.9999999504708134d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7976931348623157E308d + "'", double22 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double10 = fDistributionImpl2.cumulativeProbability(0.0d);
        double double12 = fDistributionImpl2.getDomainUpperBound((double) ' ');
        double double14 = fDistributionImpl2.cumulativeProbability(0.4664502910454298d);
        double double17 = fDistributionImpl2.cumulativeProbability(0.0011053519540138276d, 0.755683952741227d);
        java.lang.Class<?> wildcardClass18 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4898628835849175d + "'", double14 == 0.4898628835849175d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5690677053309194d + "'", double17 == 0.5690677053309194d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) (short) 1, (double) (short) 100);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 'a');
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5220157123797441d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.049950031800927046d);
        double double10 = fDistributionImpl2.cumulativeProbability(7.444493761760151E-4d);
        double double12 = fDistributionImpl2.getInitialDomain(0.0d);
        double double14 = fDistributionImpl2.inverseCumulativeProbability(1.2214738003873964E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7723000623308832d + "'", double10 == 0.7723000623308832d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0204081632653061d + "'", double12 == 1.0204081632653061d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.cumulativeProbability((double) 0.0f);
        double double6 = fDistributionImpl2.getDomainLowerBound(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound(4.4355799878524796E-5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.19788692492646354d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainUpperBound(1.25d);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double16 = fDistributionImpl2.cumulativeProbability(0.7103083879489903d);
        java.lang.Class<?> wildcardClass17 = fDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5949357068078883d + "'", double16 == 0.5949357068078883d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9322888260560721d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setDenominatorDegreesOfFreedom((double) '#');
        double double8 = fDistributionImpl2.getInitialDomain((double) (short) -1);
        double double10 = fDistributionImpl2.getDomainLowerBound((double) 100L);
        double double12 = fDistributionImpl2.getInitialDomain((double) 0.0f);
        double double14 = fDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double16 = fDistributionImpl2.getDomainLowerBound(0.17235021937116024d);
        double double18 = fDistributionImpl2.getDomainUpperBound(0.14869246204751185d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.8026648265055725d);
        double double22 = fDistributionImpl2.getDomainUpperBound(0.01806785311078775d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0606060606060606d + "'", double8 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0606060606060606d + "'", double12 == 1.0606060606060606d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.7976931348623157E308d + "'", double18 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7976931348623157E308d + "'", double22 == 1.7976931348623157E308d);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainUpperBound(10.0d);
        double double8 = fDistributionImpl2.getDomainUpperBound(0.8609681162053344d);
        double double10 = fDistributionImpl2.getInitialDomain(Double.POSITIVE_INFINITY);
        double double13 = fDistributionImpl2.cumulativeProbability(1.2109603464415848d, (double) (short) 100);
        double double15 = fDistributionImpl2.getInitialDomain((-0.9999999999747803d));
        double double17 = fDistributionImpl2.getDomainUpperBound(0.49838122445596006d);
        double double19 = fDistributionImpl2.cumulativeProbability(0.043642094005512666d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.25d + "'", double10 == 1.25d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2969240624175721d + "'", double13 == 0.2969240624175721d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.25d + "'", double15 == 1.25d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.16128506917215066d + "'", double19 == 0.16128506917215066d);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double9 = fDistributionImpl2.cumulativeProbability((double) (-1), 1.7976931348623157E308d);
        double double10 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double11 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) (byte) 100);
        double double16 = fDistributionImpl2.cumulativeProbability(0.4906940248809481d, 1.7976931348623157E308d);
        double double18 = fDistributionImpl2.cumulativeProbability(1.25d);
        double double19 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6289333745278087d + "'", double18 == 0.6289333745278087d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(1.0d, (double) 10L);
        double double4 = fDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double6 = fDistributionImpl2.getInitialDomain(1.0d);
        double double8 = fDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 1.0f);
        double double12 = fDistributionImpl2.getDomainLowerBound((double) 1);
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double15 = fDistributionImpl2.getDomainUpperBound((-0.3504236660423056d));
        double double17 = fDistributionImpl2.inverseCumulativeProbability(0.04322441323500558d);
        double double19 = fDistributionImpl2.getDomainUpperBound(0.8933186128357743d);
        double double21 = fDistributionImpl2.getInitialDomain((-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.25d + "'", double6 == 1.25d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0030883693754368224d + "'", double17 == 0.0030883693754368224d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.25d + "'", double21 == 1.25d);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((-0.2624723670828401d), (-1.6666666666666667d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double4 = fDistributionImpl2.getInitialDomain((double) 100);
        double double5 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double7 = fDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double9 = fDistributionImpl2.inverseCumulativeProbability(0.0d);
        fDistributionImpl2.setNumeratorDegreesOfFreedom(0.5366657182124845d);
        double double12 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double13 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.5598475038519922d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5366657182124845d + "'", double12 == 0.5366657182124845d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl((double) 'a', (double) (byte) 1);
        double double3 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        double double4 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setNumeratorDegreesOfFreedom(1.0606060606060606d);
        double double8 = fDistributionImpl2.cumulativeProbability((double) (byte) 1);
        fDistributionImpl2.setNumeratorDegreesOfFreedom((double) 10);
        double double11 = fDistributionImpl2.getNumeratorDegreesOfFreedom();
        double double12 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        fDistributionImpl2.setDenominatorDegreesOfFreedom(0.9999999999915219d);
        double double15 = fDistributionImpl2.getDenominatorDegreesOfFreedom();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4923052829221457d + "'", double8 == 0.4923052829221457d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9999999999915219d + "'", double15 == 0.9999999999915219d);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.math.distribution.FDistributionImpl fDistributionImpl2 = new org.apache.commons.math.distribution.FDistributionImpl(0.9365489651388929d, 0.336242355358862d);
        // The following exception was thrown during execution in test generation
        try {
            fDistributionImpl2.setNumeratorDegreesOfFreedom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

