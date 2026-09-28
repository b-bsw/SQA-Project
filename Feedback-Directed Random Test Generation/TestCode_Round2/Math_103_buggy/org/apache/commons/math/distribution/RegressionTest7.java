package org.apache.commons.math.distribution;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        normalDistributionImpl2.setMean((double) (byte) -1);
        double double14 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean((-99.84135962481986d));
        double double17 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-99.84135962481986d) + "'", double17 == (-99.84135962481986d));
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.5033270473131487d);
        double double10 = normalDistributionImpl2.getDomainLowerBound(10.026126956040166d);
        double double12 = normalDistributionImpl2.getInitialDomain(100.00012139194168d);
        double double14 = normalDistributionImpl2.getDomainUpperBound(0.10504850654241193d);
        normalDistributionImpl2.setMean(4.996003610813204E-16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-99.73312743878357d) + "'", double8 == (-99.73312743878357d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-68.0d) + "'", double12 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-100.0d) + "'", double14 == (-100.0d));
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5d);
        double double9 = normalDistributionImpl2.getInitialDomain(0.3199999997720503d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5019947030907408d + "'", double7 == 0.5019947030907408d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '4');
        normalDistributionImpl2.setMean(10.026126956040166d);
        double double17 = normalDistributionImpl2.cumulativeProbability(0.9953360887357412d, 107.0d);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.5011893264062109d);
        double double21 = normalDistributionImpl2.getDomainLowerBound(10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5378382600176361d + "'", double17 == 0.5378382600176361d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.42733157976821107d + "'", double19 == 0.42733157976821107d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.026126956040166d + "'", double21 == 10.026126956040166d);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        double double26 = normalDistributionImpl2.getInitialDomain(0.841344746068543d);
        double double28 = normalDistributionImpl2.getDomainLowerBound(5.551115123125783E-16d);
        double double30 = normalDistributionImpl2.getDomainLowerBound(0.08919152173113587d);
        double double32 = normalDistributionImpl2.getInitialDomain(0.0d);
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.7976931348623157E308d) + "'", double28 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.7976931348623157E308d) + "'", double30 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-100.0d) + "'", double32 == (-100.0d));
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.5039854140850405d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.999128202968101d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.30751878646722d + "'", double6 == 32.30751878646722d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) '#');
        normalDistributionImpl0.setStandardDeviation(0.5020028532139044d);
        normalDistributionImpl0.setStandardDeviation(0.500642632286767d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        double double25 = normalDistributionImpl2.getDomainUpperBound(1.2032093049234251d);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = normalDistributionImpl2.cumulativeProbability((-316.4272152326943d), 0.5730516380690452d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 99.0d + "'", double19 == 99.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.5d + "'", double23 == 1.5d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.7976931348623157E308d + "'", double25 == 1.7976931348623157E308d);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.5020052938315906d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(0.5024866978629178d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.160849516286758d + "'", double13 == 10.160849516286758d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1.0f));
        normalDistributionImpl2.setMean((-12.799211304789129d));
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.08729746340859079d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-12.799211304789129d) + "'", double10 == (-12.799211304789129d));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setStandardDeviation(0.5018815478082819d);
        double double8 = normalDistributionImpl0.getInitialDomain(0.5341532272166142d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5018815478082819d + "'", double8 == 0.5018815478082819d);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getInitialDomain(32.0d);
        double double12 = normalDistributionImpl2.getDomainUpperBound(101.0d);
        double double14 = normalDistributionImpl2.getDomainUpperBound(0.5378382600176361d);
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.11533384884315512d);
        double double17 = normalDistributionImpl2.getMean();
        double double19 = normalDistributionImpl2.getDomainLowerBound(0.2525240314962103d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 107.0d + "'", double10 == 107.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        double double7 = normalDistributionImpl0.getDomainLowerBound((double) 0L);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        double double11 = normalDistributionImpl0.getMean();
        double double13 = normalDistributionImpl0.getDomainLowerBound(0.5019961258952685d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        normalDistributionImpl2.setStandardDeviation(129.0d);
        normalDistributionImpl2.setMean(6.106226635438361E-16d);
        double double12 = normalDistributionImpl2.getDomainUpperBound((-0.0019222989632810212d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.106226635438361E-16d + "'", double12 == 6.106226635438361E-16d);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setMean((double) (short) -1);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.9990117802233995d);
        double double13 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.cumulativeProbability(0.5004521251615823d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5596355277128806d + "'", double15 == 0.5596355277128806d);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.503989356314632d, 8.3936365174897E-4d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getDomainLowerBound((-99.49601064368537d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.3936365174897E-4d + "'", double3 == 8.3936365174897E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.7976931348623157E308d) + "'", double5 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        double double20 = normalDistributionImpl2.getMean();
        double double22 = normalDistributionImpl2.getDomainUpperBound(2.0539125955565396E-15d);
        normalDistributionImpl2.setMean(0.501361765869532d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 99.0d + "'", double19 == 99.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl2.setMean((double) (byte) 100);
        double double8 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 100);
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.4490776072769937d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability((-1.1102230246251565E-15d), (-272.3126474186623d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.03145104260449372d);
        normalDistributionImpl2.setMean((-0.012980769559086225d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-17.598829940813502d) + "'", double10 == (-17.598829940813502d));
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.841500270091506d, (double) 100);
        normalDistributionImpl2.setMean(0.5017915544255316d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        double double20 = normalDistributionImpl2.getDomainLowerBound(0.4993376909985171d);
        double double22 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 100);
        double double23 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.7976931348623157E308d) + "'", double20 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7976931348623157E308d + "'", double22 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double13 = normalDistributionImpl2.getInitialDomain(0.5001042314730403d);
        double double15 = normalDistributionImpl2.getInitialDomain(102.74285731024536d);
        double double17 = normalDistributionImpl2.cumulativeProbability(0.5039858097940029d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8339767539364704d + "'", double11 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5020106039708746d + "'", double17 == 0.5020106039708746d);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-314.0626513812741d), 0.42733157976821107d);
        double double4 = normalDistributionImpl2.getInitialDomain(87.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-313.6353198015059d) + "'", double4 == (-313.6353198015059d));
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getInitialDomain(32.0d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.cumulativeProbability(0.29812036135129827d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.5017915544255316d);
        double double17 = normalDistributionImpl2.cumulativeProbability(1.0364480113667245d);
        double double19 = normalDistributionImpl2.cumulativeProbability((-109.56601864344911d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5011893264062109d + "'", double13 == 0.5011893264062109d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.4490776072769937d + "'", double15 == 0.4490776072769937d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5041347553039998d + "'", double17 == 0.5041347553039998d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.1366137560595826d + "'", double19 == 0.1366137560595826d);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 10.0f);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.9714544490438862d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 19.02612691151833d + "'", double5 == 19.02612691151833d);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double14 = normalDistributionImpl2.cumulativeProbability(0.9990117802233995d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(8.89024926669868E-4d);
        double double19 = normalDistributionImpl2.getDomainLowerBound(0.15998055559522822d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = normalDistributionImpl2.cumulativeProbability(100.44907760728313d, 0.4240925721925803d);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-312.50001232497266d) + "'", double17 == (-312.50001232497266d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.5006153217161514d);
        normalDistributionImpl2.setMean(34.0d);
        double double9 = normalDistributionImpl2.getInitialDomain(190.26126956039283d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.cumulativeProbability((-1.7166342569447757d), (-87.63548323309713d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5019971578385047d + "'", double5 == 0.5019971578385047d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 134.0d + "'", double9 == 134.0d);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 'a');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.999987716976066d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound(11.0d);
        normalDistributionImpl2.setStandardDeviation(0.7228081817379124d);
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.010465251519014118d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        double double27 = normalDistributionImpl2.getDomainLowerBound(1.938493374054051E-5d);
        normalDistributionImpl2.setMean(0.4992439296527548d);
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.7976931348623157E308d) + "'", double27 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        double double17 = normalDistributionImpl2.getInitialDomain(0.0013750926571968192d);
        double double19 = normalDistributionImpl2.getInitialDomain(101.0d);
        double double20 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.001986580244151992d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-100.0d) + "'", double17 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 10, 1.0d);
        normalDistributionImpl2.setMean((double) (-1.0f));
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getDomainLowerBound(102.74285731024536d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.inverseCumulativeProbability((-316.3803641163205d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-181.0d), (-40.879584114574484d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        normalDistributionImpl0.setMean((double) (byte) 0);
        double double9 = normalDistributionImpl0.getInitialDomain(409.37500000520356d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.cumulativeProbability(0.3406824094489751d, (-0.40879584134842484d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5041573996674839d, (-35.25269497562158d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        double double7 = normalDistributionImpl0.getDomainLowerBound((double) 0L);
        double double9 = normalDistributionImpl0.inverseCumulativeProbability((double) 1.0f);
        double double11 = normalDistributionImpl0.getDomainLowerBound(0.4012936743170763d);
        double double13 = normalDistributionImpl0.getDomainUpperBound(2.0551338408836273E-12d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double10 = normalDistributionImpl2.getMean();
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.5020052938315906d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(0.6921596669396051d);
        double double16 = normalDistributionImpl2.cumulativeProbability(0.3900253100277213d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5026547383961157d + "'", double12 == 0.5026547383961157d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.19813127604581d + "'", double14 == 50.19813127604581d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5015559719210656d + "'", double16 == 0.5015559719210656d);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double14 = normalDistributionImpl2.cumulativeProbability(0.9990117802233995d);
        double double16 = normalDistributionImpl2.inverseCumulativeProbability(8.429343765339881E-4d);
        double double17 = normalDistributionImpl2.getStandardDeviation();
        double double19 = normalDistributionImpl2.getDomainLowerBound(0.9999787774020832d);
        normalDistributionImpl2.setStandardDeviation(11.0d);
        double double23 = normalDistributionImpl2.getInitialDomain(99.0d);
        double double25 = normalDistributionImpl2.getDomainUpperBound(0.15930186906976396d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-314.0626513812741d) + "'", double16 == (-314.0626513812741d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 11.0d + "'", double23 == 11.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5000025689567392d, 0.9997209697185048d);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5039854140850405d);
        double double8 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9991574196213242d + "'", double7 == 0.9991574196213242d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8339767539364704d, 0.5019947133392674d);
        normalDistributionImpl2.setStandardDeviation(0.4993376909985171d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain(0.002415011832167635d);
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8339767539364704d + "'", double5 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3346390629379533d + "'", double7 == 0.3346390629379533d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
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
        double double22 = normalDistributionImpl2.getInitialDomain(0.003982051263416553d);
        double double24 = normalDistributionImpl2.getDomainLowerBound(184.0d);
        double double26 = normalDistributionImpl2.cumulativeProbability((-154.96651377710546d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5039893563146316d + "'", double11 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.003982051263416553d + "'", double18 == 0.003982051263416553d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.841344746068543d + "'", double20 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-100.0d) + "'", double22 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.06061095491370372d + "'", double26 == 0.06061095491370372d);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '4');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.cumulativeProbability(100.00012139194168d);
        double double18 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.000000000000002d + "'", double17 == 1.000000000000002d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound(0.5006378332680903d);
        normalDistributionImpl0.setStandardDeviation(0.8409366149786677d);
        normalDistributionImpl0.setMean(0.5032578631163334d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(Double.POSITIVE_INFINITY);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(100.50398935631463d);
        double double18 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double19 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.inverseCumulativeProbability(0.16069962588974762d);
        double double23 = normalDistributionImpl2.cumulativeProbability(50.19813127604581d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + Double.POSITIVE_INFINITY + "'", double18 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 90.58812379073773d + "'", double21 == 90.58812379073773d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.444917399091473E-7d + "'", double23 == 2.444917399091473E-7d);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 10, 1.0d);
        normalDistributionImpl2.setMean((double) (-1.0f));
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getInitialDomain(0.9772498680518209d);
        double double9 = normalDistributionImpl2.getInitialDomain((-0.4369384131695145d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-2.0d) + "'", double9 == (-2.0d));
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.942890293094024E-15d, (-0.9834167765345851d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.140071090088769d, (double) 10);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 10, 1.0d);
        normalDistributionImpl2.setMean((double) (-1.0f));
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getInitialDomain(0.9772498680518209d);
        double double9 = normalDistributionImpl2.cumulativeProbability(6.429456955875379E-4d);
        double double10 = normalDistributionImpl2.getMean();
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.37804813188807573d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.inverseCumulativeProbability((-409.37500000520356d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.841500270091506d + "'", double9 == 0.841500270091506d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5019867111794115d, 4.996003610813204E-16d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.30952073317575746d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.501986711179411d + "'", double4 == 0.501986711179411d);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double12 = normalDistributionImpl2.getDomainUpperBound(100.0d);
        normalDistributionImpl2.setStandardDeviation(35.50332704731315d);
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.4012936743170763d);
        double double18 = normalDistributionImpl2.getDomainLowerBound(35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainLowerBound(129.0d);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainUpperBound((-1.7976931348623157E308d));
        double double14 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-10.0d));
        double double18 = normalDistributionImpl2.cumulativeProbability(1.0d);
        double double20 = normalDistributionImpl2.cumulativeProbability(0.5033570607468583d);
        double double22 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.8643339390536173d + "'", double18 == 0.8643339390536173d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.8532181028539636d + "'", double20 == 0.8532181028539636d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + Double.NEGATIVE_INFINITY + "'", double22 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.17531708743070973d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double7 = normalDistributionImpl2.getDomainLowerBound(68.6216621174087d);
        normalDistributionImpl2.setMean(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-0.5033270473131487d), 0.5026547384068555d);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainLowerBound(129.0d);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.38212483247943946d);
        double double14 = normalDistributionImpl2.cumulativeProbability(0.5068101625618202d);
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.1102230246251565E-15d + "'", double12 == 1.1102230246251565E-15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.1102230246251565E-16d) + "'", double14 == (-1.1102230246251565E-16d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
        double double31 = normalDistributionImpl2.getInitialDomain(0.5003566436642092d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.026126956040166d + "'", double25 == 10.026126956040166d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 10, 1.0d);
        normalDistributionImpl2.setMean((double) (-1.0f));
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getInitialDomain(0.9772498680518209d);
        double double9 = normalDistributionImpl2.cumulativeProbability(6.429456955875379E-4d);
        double double10 = normalDistributionImpl2.getMean();
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.37804813188807573d);
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.5020027136551392d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.841500270091506d + "'", double9 == 0.841500270091506d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double14 = normalDistributionImpl2.getDomainUpperBound(200.0d);
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.37665202364295614d);
        normalDistributionImpl2.setMean(0.13819004034332988d);
        double double21 = normalDistributionImpl2.cumulativeProbability(0.003989242433971363d, 0.5068289254012387d);
        java.lang.Class<?> wildcardClass22 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0020060366063917034d + "'", double21 == 0.0020060366063917034d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 1);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5000484283777002d);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.16116265572688077d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.691462461274013d + "'", double4 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.24900980083792063d + "'", double9 == 0.24900980083792063d);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double12 = normalDistributionImpl2.getDomainUpperBound(100.0d);
        normalDistributionImpl2.setStandardDeviation(35.50332704731315d);
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.4012936743170763d);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.5041347553039998d, 35.00064394196206d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.03709517150021774d + "'", double19 == 0.03709517150021774d);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.103606448964639d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.5188388553062419d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 100, (-312.05092239451676d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double14 = normalDistributionImpl2.cumulativeProbability(0.9990117802233995d);
        normalDistributionImpl2.setMean(3.0324839434953876d);
        double double17 = normalDistributionImpl2.getMean();
        double double18 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.9834167765345851d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.0324839434953876d + "'", double17 == 3.0324839434953876d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(6.439419620615228E-4d, 59.120415885425516d);
        double double4 = normalDistributionImpl2.getInitialDomain((double) (byte) 1);
        double double5 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass6 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 59.121059827387576d + "'", double4 == 59.121059827387576d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.439419620615228E-4d + "'", double5 == 6.439419620615228E-4d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        double double30 = normalDistributionImpl2.cumulativeProbability((-128.26949715237384d), 0.01213919411360942d);
        double double32 = normalDistributionImpl2.getDomainUpperBound(400.12500003330143d);
        normalDistributionImpl2.setStandardDeviation(0.5033600462439357d);
        double double36 = normalDistributionImpl2.getDomainUpperBound((-126.12663573645062d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.026126956040166d + "'", double25 == 10.026126956040166d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.376841142650683d + "'", double30 == 0.376841142650683d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.7976931348623157E308d + "'", double32 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double9 = normalDistributionImpl2.cumulativeProbability(2.929876410651122E-6d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5000000116885157d + "'", double9 == 0.5000000116885157d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-800.0d), 0.15953563556464695d);
        normalDistributionImpl2.setStandardDeviation(1.0000484283777002d);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability(0.5019813127606616d);
        double double9 = normalDistributionImpl0.getDomainLowerBound(0.4635132680301096d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.004966471651344884d + "'", double7 == 0.004966471651344884d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        double double10 = normalDistributionImpl2.getDomainLowerBound((-299.4363000875007d));
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.5374108872856648d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getDomainLowerBound(0.5026547384068555d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(99.55092239271687d);
        double double18 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((-0.9000000000335028d));
        normalDistributionImpl2.setMean(0.4490776072831239d);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(5.551115123125783E-16d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.0020476378332464074d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.8390361687153073d);
        double double17 = normalDistributionImpl2.getDomainUpperBound((-0.15864037517600482d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-799.5509223927169d) + "'", double10 == (-799.5509223927169d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.8390361687153073d + "'", double17 == 0.8390361687153073d);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-24.744405306715652d), 0.6921596669396051d);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double16 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        double double8 = normalDistributionImpl2.getInitialDomain((double) (short) 10);
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.03145104260449372d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 129.0d + "'", double8 == 129.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.003233364812544881d);
        double double9 = normalDistributionImpl2.getInitialDomain(0.5000159154279771d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 197.0d + "'", double9 == 197.0d);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, 409.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(1.7976931348623157E308d);
        double double6 = normalDistributionImpl2.getInitialDomain((-314.0626513812741d));
        double double8 = normalDistributionImpl2.getInitialDomain(0.0d);
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.5016193542725117d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.691462461274013d + "'", double10 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-11.0d), 100.84134474606854d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
        double double30 = normalDistributionImpl2.cumulativeProbability((-128.26949715237384d), 0.01213919411360942d);
        double double31 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.026126956040166d + "'", double25 == 10.026126956040166d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.376841142650683d + "'", double30 == 0.376841142650683d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
        double double21 = normalDistributionImpl2.cumulativeProbability(0.039845748899803746d, 0.16116265572688077d);
        java.lang.Class<?> wildcardClass22 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 99.0d + "'", double16 == 99.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.839550979138796E-4d + "'", double21 == 4.839550979138796E-4d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.9990117802232268d);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double8 = normalDistributionImpl2.getInitialDomain(0.8404349207008496d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9991109747008919d + "'", double6 == 0.9991109747008919d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-68.0d) + "'", double8 == (-68.0d));
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        normalDistributionImpl2.setMean((double) (-1));
        normalDistributionImpl2.setStandardDeviation(0.7688235963189542d);
        double double16 = normalDistributionImpl2.getDomainUpperBound((-1.1102230246251565E-15d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound(0.6153338488435729d);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability(0.34134474606854304d);
        double double6 = normalDistributionImpl0.getInitialDomain(0.10504850654241193d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.40879584134842484d) + "'", double4 == (-0.40879584134842484d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.cumulativeProbability(59.120415885425516d);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (short) 1);
        double double12 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getMean();
        double double14 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7228081817379124d + "'", double9 == 0.7228081817379124d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5039893563146316d + "'", double11 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.03726587780834678d, 0.5019961258952685d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(221.7510120206919d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5013304021987853d, 97.67965765688128d);
        normalDistributionImpl2.setMean((-175.24788832960508d));
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
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
        double double19 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getDomainUpperBound(0.0012591409398656772d);
        double double23 = normalDistributionImpl2.getInitialDomain(92.96400591347039d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 200.0d + "'", double23 == 200.0d);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5378475358989362d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        normalDistributionImpl2.setStandardDeviation((double) (short) 1);
        double double14 = normalDistributionImpl2.cumulativeProbability((-11.119995541385146d), 0.5019813127606616d);
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6921596669396051d + "'", double14 == 0.6921596669396051d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        normalDistributionImpl2.setMean(11.0d);
        double double14 = normalDistributionImpl2.cumulativeProbability(0.503327047302336d);
        double double15 = normalDistributionImpl2.getMean();
        double double17 = normalDistributionImpl2.getDomainUpperBound((-0.8413596248239952d));
        double double19 = normalDistributionImpl2.inverseCumulativeProbability((double) 1);
        double double22 = normalDistributionImpl2.cumulativeProbability(0.03877026173060294d, 0.9990394412085004d);
        double double24 = normalDistributionImpl2.getDomainLowerBound((-175.24788832960508d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.38212483247943946d + "'", double14 == 0.38212483247943946d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 11.0d + "'", double17 == 11.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + Double.POSITIVE_INFINITY + "'", double19 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.010465251519014118d + "'", double22 == 0.010465251519014118d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.7976931348623157E308d) + "'", double24 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
        double double20 = normalDistributionImpl2.getMean();
        double double22 = normalDistributionImpl2.getDomainUpperBound(2.0539125955565396E-15d);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = normalDistributionImpl2.inverseCumulativeProbability((-115.65031790903706d));
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.000000000000002d, 0.4557288934945513d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.5018822327219192d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.000000000000002d + "'", double4 == 1.000000000000002d);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.376841142650683d, (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((-12.799211304789129d));
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (short) 10);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0012541753965479852d);
        double double11 = normalDistributionImpl2.cumulativeProbability((-3.252694975621581d), 1.0000000000000004d);
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.6292541560646674d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-31.623158857349317d) + "'", double4 == (-31.623158857349317d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.618187408016449d + "'", double6 == 0.618187408016449d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.49531768496801987d + "'", double8 == 0.49531768496801987d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.05292079544993106d + "'", double11 == 0.05292079544993106d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.932956568996941d + "'", double13 == 10.932956568996941d);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double14 = normalDistributionImpl2.cumulativeProbability((-1.1586403751760048d), 35.50332704731315d);
        normalDistributionImpl2.setStandardDeviation(0.16852760746683781d);
        double double18 = normalDistributionImpl2.cumulativeProbability((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl2.cumulativeProbability(9.02999982830094d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.10360644854994305d + "'", double14 == 0.10360644854994305d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5d + "'", double18 == 0.5d);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability(0.3900253100277213d);
        normalDistributionImpl0.setMean(0.5006153217161514d);
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.006266727965621499d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.22074688003828388d + "'", double8 == 0.22074688003828388d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.9961423909907472d) + "'", double12 == (-1.9961423909907472d));
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.9990117802232268d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.003989242433971363d);
        normalDistributionImpl2.setMean(99.49601458591496d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.cumulativeProbability(0.0012209691105105058d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5039854140850405d + "'", double8 == 0.5039854140850405d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4993376909985171d, 0.08919152173113587d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5053644817366403d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5005370644783423d + "'", double4 == 0.5005370644783423d);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-99.49799202407699d), 0.1598682499439264d);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain(1.0d);
        normalDistributionImpl2.setMean((double) (short) -1);
        double double21 = normalDistributionImpl2.cumulativeProbability(0.0d, 0.5062828993298469d);
        normalDistributionImpl2.setStandardDeviation(6.439419620630119E-4d);
        double double25 = normalDistributionImpl2.getDomainLowerBound(0.5019916868441024d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0020196158042963264d + "'", double21 == 0.0020196158042963264d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        normalDistributionImpl2.setMean(99.02999982830094d);
        normalDistributionImpl2.setMean(0.3699782314207525d);
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        // The following exception was thrown during execution in test generation
        try {
            double double33 = normalDistributionImpl2.cumulativeProbability(10.160849516286758d);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.026126956040166d + "'", double25 == 10.026126956040166d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 6.106226635438361E-16d + "'", double30 == 6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 6.106226635438361E-16d + "'", double31 == 6.106226635438361E-16d);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double8 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double11 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.NEGATIVE_INFINITY + "'", double13 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        double double8 = normalDistributionImpl2.getInitialDomain((double) (short) 10);
        double double10 = normalDistributionImpl2.getInitialDomain(0.49999999999999994d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 129.0d + "'", double8 == 129.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 65.0d + "'", double10 == 65.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01213919411360942d, 0.4490776072831239d);
        normalDistributionImpl2.setMean((double) 100L);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) ' ');
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.7228081817379124d);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.4960106436853684d);
        double double12 = normalDistributionImpl2.getInitialDomain((-1.6089029823648797d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 99.99550930142254d + "'", double10 == 99.99550930142254d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 99.55092239271687d + "'", double12 == 99.55092239271687d);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getInitialDomain(0.5039893563146316d);
        double double7 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        double double9 = normalDistributionImpl2.getDomainUpperBound((-6.661338147750939E-16d));
        normalDistributionImpl2.setMean(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double4 = normalDistributionImpl0.getDomainLowerBound(101.0d);
        double double6 = normalDistributionImpl0.getDomainUpperBound(0.5133205302861421d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation(9.047742753903742E-4d);
        normalDistributionImpl2.setStandardDeviation(0.5120960066622517d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.503327047302336d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.inverseCumulativeProbability(87.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
        double double30 = normalDistributionImpl2.cumulativeProbability(0.15988115854417262d, 0.5020052938315906d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-10.0d));
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 6.106226635438361E-16d + "'", double25 == 6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.1102230246251565E-16d + "'", double30 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
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
        java.lang.Class<?> wildcardClass30 = normalDistributionImpl2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability(0.3900253100277213d);
        normalDistributionImpl0.setMean(0.5006153217161514d);
        double double12 = normalDistributionImpl0.getDomainUpperBound((-31.623158857349317d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.22074688003828388d + "'", double8 == 0.22074688003828388d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5006153217161514d + "'", double12 == 0.5006153217161514d);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        normalDistributionImpl0.setMean((double) (byte) 0);
        double double9 = normalDistributionImpl0.getInitialDomain(409.37500000520356d);
        normalDistributionImpl0.setMean(0.341344746068543d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.0012518388356499988d, 0.9999999993515475d);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.5006378007810146d);
        double double18 = normalDistributionImpl0.cumulativeProbability(0.017218078898202482d);
        java.lang.Class<?> wildcardClass19 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.37804813188807573d + "'", double14 == 0.37804813188807573d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5632810037843777d + "'", double16 == 0.5632810037843777d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.37292106917326595d + "'", double18 == 0.37292106917326595d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation(9.047742753903742E-4d);
        normalDistributionImpl2.setStandardDeviation(0.5120960066622517d);
        normalDistributionImpl2.setMean(32.0d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.34134474606854304d);
        double double14 = normalDistributionImpl2.cumulativeProbability(32.0d);
        double double16 = normalDistributionImpl2.getDomainUpperBound((-2.1649348980190553E-15d));
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.inverseCumulativeProbability(9.498638234130468d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-40.87958411457447d) + "'", double12 == (-40.87958411457447d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6255158347233201d + "'", double14 == 0.6255158347233201d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getInitialDomain((-68.0d));
        normalDistributionImpl2.setStandardDeviation(0.01213919411360942d);
        double double17 = normalDistributionImpl2.cumulativeProbability(9.047742753903742E-4d);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.07365795537454656d);
        double double21 = normalDistributionImpl2.getInitialDomain((double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.50199470309074d);
        double double25 = normalDistributionImpl2.cumulativeProbability(9.498638234130468d);
        normalDistributionImpl2.setMean(96.93366833316512d);
        double double29 = normalDistributionImpl2.getDomainUpperBound(32.0d);
        java.lang.Class<?> wildcardClass30 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5297069799427127d + "'", double17 == 0.5297069799427127d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999993515475d + "'", double19 == 0.9999999993515475d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.01213919411360942d + "'", double21 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5376487498992404d + "'", double25 == 0.5376487498992404d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.7976931348623157E308d + "'", double29 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5020027136551392d, 0.3435291934680794d);
        normalDistributionImpl2.setStandardDeviation(1.5378382600176361d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.01509037837449223d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.3668235531222151d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.8315846849045707d) + "'", double6 == (-2.8315846849045707d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.021289970940045026d) + "'", double8 == (-0.021289970940045026d));
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.4992439296527548d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-6.106226635438361E-16d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 96.93366833316512d + "'", double15 == 96.93366833316512d);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getMean();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.3406824094489751d);
        normalDistributionImpl0.setMean(96.93366833316512d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.08939857521611085d + "'", double10 == 0.08939857521611085d);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability((double) (short) -1);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.15864037517600482d);
        double double14 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4960106436853684d + "'", double10 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, (double) ' ');
        normalDistributionImpl2.setStandardDeviation(0.01213919411360942d);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getDomainUpperBound(9.047742753903742E-4d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.01213919411360942d + "'", double6 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 101.0d + "'", double8 == 101.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.445844242470579d, 0.5000000000000002d);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(101.0d);
        double double17 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double18 = normalDistributionImpl2.getMean();
        double double20 = normalDistributionImpl2.cumulativeProbability((-58.59070890395023d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2789689765905517d + "'", double20 == 0.2789689765905517d);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-34.0009882207076d), 2.0539125955565396E-15d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.cumulativeProbability(0.48839768861847016d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double4 = normalDistributionImpl2.getInitialDomain((double) (-1));
        normalDistributionImpl2.setMean(1.7976931348623157E308d);
        double double7 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.4490776072831239d);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double13 = normalDistributionImpl2.getDomainLowerBound((-99.15865525393146d));
        double double15 = normalDistributionImpl2.getInitialDomain((double) 100L);
        normalDistributionImpl2.setMean(0.47161763576680055d);
        double double19 = normalDistributionImpl2.getDomainUpperBound(1.000000000000002d);
        double double21 = normalDistributionImpl2.getDomainLowerBound((-90.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.7976931348623157E308d) + "'", double21 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
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
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double22 = normalDistributionImpl2.getDomainLowerBound((-1.7976931348623157E308d));
        double double23 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 99.0d + "'", double19 == 99.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.7976931348623157E308d) + "'", double22 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.5039854140850405d);
        double double14 = normalDistributionImpl2.getDomainLowerBound(2.444917399091473E-7d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        normalDistributionImpl0.setMean((double) (byte) 0);
        double double9 = normalDistributionImpl0.getDomainUpperBound(0.0013750926571968192d);
        double double11 = normalDistributionImpl0.getInitialDomain(0.5020028532139044d);
        double double13 = normalDistributionImpl0.getDomainUpperBound(8.89024926669868E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.0d), 0.501361765869532d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.4168183936186787d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.501361765869532d) + "'", double4 == (-1.501361765869532d));
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        double double7 = normalDistributionImpl0.getDomainLowerBound((double) 0L);
        double double9 = normalDistributionImpl0.getInitialDomain((-277.8333645117098d));
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (short) 0);
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.999987716976066d);
        double double10 = normalDistributionImpl2.getDomainUpperBound((double) 1L);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.5000000000002491d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5019947030907418d + "'", double12 == 0.5019947030907418d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(Double.POSITIVE_INFINITY);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double16 = normalDistributionImpl2.getDomainUpperBound((-200.0d));
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        double double19 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + Double.POSITIVE_INFINITY + "'", double19 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        normalDistributionImpl2.setMean(0.01213919411360942d);
        double double14 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double18 = normalDistributionImpl2.getInitialDomain(0.29750602479108235d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.01213919411360942d + "'", double14 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-99.98786080588638d) + "'", double18 == (-99.98786080588638d));
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setMean((-99.62334797635704d));
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.03145104260449372d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(0.0d, (-41.060142464627134d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-285.61164523091827d) + "'", double10 == (-285.61164523091827d));
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8339767539364704d, (double) 10L);
        normalDistributionImpl2.setStandardDeviation(0.5062828993298469d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound(29.324838580542213d);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.0017559868084203734d);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.4992439296527548d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8339767539364704d + "'", double5 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05011020197040017d + "'", double9 == 0.05011020197040017d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8339767539364704d + "'", double11 == 0.8339767539364704d);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, 409.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(1.7976931348623157E308d);
        double double6 = normalDistributionImpl2.getInitialDomain((-314.0626513812741d));
        normalDistributionImpl2.setStandardDeviation(101.0d);
        normalDistributionImpl2.setStandardDeviation(0.618187408016449d);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.9999999996226588d);
        double double14 = normalDistributionImpl2.getInitialDomain(0.3346390629379533d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.073275053257564d + "'", double14 == 0.073275053257564d);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        normalDistributionImpl2.setMean(0.5033270473131487d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.cumulativeProbability(0.01213919411360942d, (-271.93599539501935d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 'a');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.999987716976066d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.4144226483220369d, 46.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.13983164242540086d + "'", double8 == 0.13983164242540086d);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double4 = normalDistributionImpl2.getInitialDomain((double) (-1));
        normalDistributionImpl2.setMean(1.7976931348623157E308d);
        double double7 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.4115308789714541d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4115308789714541d + "'", double10 == 0.4115308789714541d);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, (double) '4');
        double double13 = normalDistributionImpl2.cumulativeProbability(0.5039854140850412d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double19 = normalDistributionImpl2.cumulativeProbability((-100.841359624824d), 0.039396101914527804d);
        double double21 = normalDistributionImpl2.cumulativeProbability(0.0351656194586214d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5020106023922443d + "'", double13 == 0.5020106023922443d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.3435291934680794d + "'", double19 == 0.3435291934680794d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.500140290521294d + "'", double21 == 0.500140290521294d);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl0.cumulativeProbability((-129.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.7976931348623157E308d) + "'", double5 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, (double) '4');
        double double12 = normalDistributionImpl2.getStandardDeviation();
        double double14 = normalDistributionImpl2.getDomainUpperBound((-734.8795841145745d));
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.0d);
        normalDistributionImpl2.setStandardDeviation((double) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
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
        double double21 = normalDistributionImpl2.getMean();
        double double23 = normalDistributionImpl2.cumulativeProbability(0.006292013927202356d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5039893563146316d + "'", double16 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5027585141294139d + "'", double20 == 0.5027585141294139d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.5000251015038278d + "'", double23 == 0.5000251015038278d);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double8 = normalDistributionImpl2.getInitialDomain((double) 1L);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.5003566486671073d);
        normalDistributionImpl2.setMean((-99.99758096448726d));
        double double13 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5019961258952685d + "'", double10 == 0.5019961258952685d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-99.99758096448726d) + "'", double13 == (-99.99758096448726d));
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        normalDistributionImpl2.setMean(100.0d);
        double double12 = normalDistributionImpl2.getDomainUpperBound((-31.623158857349317d));
        double double14 = normalDistributionImpl2.cumulativeProbability((-128.26949715237384d));
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.cumulativeProbability((double) (byte) 0);
        double double19 = normalDistributionImpl2.getInitialDomain((double) 'a');
        normalDistributionImpl2.setMean((double) 10);
        double double22 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.011224171101298197d + "'", double14 == 0.011224171101298197d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.15865525393145702d + "'", double17 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 200.0d + "'", double19 == 200.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        normalDistributionImpl2.setMean(99.02999982830094d);
        normalDistributionImpl2.setMean(0.0d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getDomainLowerBound((-1.7976931348623157E308d));
        double double9 = normalDistributionImpl2.getInitialDomain(3.2151335337019544d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double12 = normalDistributionImpl2.cumulativeProbability(0.34134474606854304d, 0.5027585141294139d);
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.4993376909985171d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl2.cumulativeProbability(0.13661375606882142d, (-0.9702930200572873d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.439419620615228E-4d + "'", double12 == 6.439419620615228E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) 10);
        double double6 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.15864037517600482d);
        normalDistributionImpl2.setMean(96.93366833316512d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-81.0814666972907d));
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation(0.4490776072831239d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getMean();
        double double17 = normalDistributionImpl2.getDomainLowerBound((-68.0d));
        normalDistributionImpl2.setStandardDeviation(2.0509166282900448E-4d);
        normalDistributionImpl2.setStandardDeviation(0.8409366149786677d);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = normalDistributionImpl2.inverseCumulativeProbability((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4490776072831239d + "'", double14 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(200.0d, 0.5019867717083849d);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01213919411360942d, 0.4490776072831239d);
        normalDistributionImpl2.setMean((double) 100L);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) ' ');
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.7228081817379124d);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.4960106436853684d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 99.99550930142254d + "'", double10 == 99.99550930142254d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainLowerBound(129.0d);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainUpperBound((-1.7976931348623157E308d));
        double double14 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-10.0d));
        double double18 = normalDistributionImpl2.cumulativeProbability(1.0d);
        double double20 = normalDistributionImpl2.cumulativeProbability(0.5033570607468583d);
        double double21 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.8643339390536173d + "'", double18 == 0.8643339390536173d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.8532181028539636d + "'", double20 == 0.8532181028539636d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(96.93366833316512d, 0.16643735506845647d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.9999787774020832d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 96.93366833316512d + "'", double4 == 96.93366833316512d);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double14 = normalDistributionImpl2.getDomainUpperBound(200.0d);
        normalDistributionImpl2.setStandardDeviation(8.69633484597232E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound(0.16602324606352958d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getDomainLowerBound(100.50318270376744d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5019947030907408d, 99.55092239271687d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.5006251369479466d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5019947030907408d + "'", double4 == 0.5019947030907408d);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getInitialDomain(0.501361765869532d);
        double double8 = normalDistributionImpl2.cumulativeProbability((-312.05092239451676d), 0.5039854140850405d);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.6153338488435729d);
        normalDistributionImpl2.setStandardDeviation(409.37500000520356d);
        double double13 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.cumulativeProbability(1.0000898728711314d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5062828993298469d + "'", double8 == 0.5062828993298469d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.507670861292653d + "'", double10 == 0.507670861292653d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5009746021071844d + "'", double15 == 0.5009746021071844d);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        double double8 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double10 = normalDistributionImpl2.getInitialDomain((double) 0.0f);
        double double11 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 65.0d + "'", double10 == 65.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.7688235963189542d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double16 = normalDistributionImpl2.cumulativeProbability(6.439419620630119E-4d);
        double double18 = normalDistributionImpl2.getDomainLowerBound(101.70713751849273d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.NEGATIVE_INFINITY + "'", double14 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0027907034839972367d + "'", double16 == 0.0027907034839972367d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), 0.9999999999999823d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.cumulativeProbability(32.72280818173791d);
        double double6 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getInitialDomain(0.9991109747008919d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9999999999999823d + "'", double3 == 0.9999999999999823d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0000000000000449d + "'", double5 == 1.0000000000000449d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.765254609153999E-14d) + "'", double8 == (-1.765254609153999E-14d));
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.9990117802233995d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0020476378332464074d);
        double double7 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5000081688930658d + "'", double6 == 0.5000081688930658d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, 409.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(1.7976931348623157E308d);
        double double6 = normalDistributionImpl2.getInitialDomain((-314.0626513812741d));
        double double8 = normalDistributionImpl2.getDomainLowerBound(2.0551338408836273E-12d);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.5000000000002491d);
        double double13 = normalDistributionImpl2.cumulativeProbability(2.9723002540182897E-4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.691462461274013d + "'", double9 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.691462461274013d + "'", double11 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
    }
}

