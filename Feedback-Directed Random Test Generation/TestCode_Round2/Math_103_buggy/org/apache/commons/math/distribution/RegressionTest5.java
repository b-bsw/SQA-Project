package org.apache.commons.math.distribution;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), 0.9999999999999823d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.cumulativeProbability(32.72280818173791d);
        double double6 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9999999999999823d + "'", double3 == 0.9999999999999823d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0000000000000449d + "'", double5 == 1.0000000000000449d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999999999999823d + "'", double7 == 0.9999999999999823d);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double11 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.inverseCumulativeProbability((-3.3306690738754696E-16d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0, 0.0027907034839972367d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        normalDistributionImpl0.setMean((double) 1L);
        double double9 = normalDistributionImpl0.getDomainLowerBound((double) (short) -1);
        normalDistributionImpl0.setStandardDeviation(8.987287113132458E-5d);
        double double13 = normalDistributionImpl0.getDomainUpperBound((-40.87958411457447d));
        double double15 = normalDistributionImpl0.getDomainLowerBound((-99.98786080588638d));
        normalDistributionImpl0.setStandardDeviation(0.0012156920342991095d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl0.cumulativeProbability(100.00323336481254d, 97.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.7976931348623157E308d) + "'", double15 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double9 = normalDistributionImpl2.getInitialDomain((double) 10.0f);
        double double11 = normalDistributionImpl2.cumulativeProbability((-99.73312743878357d));
        normalDistributionImpl2.setStandardDeviation(101.01213919411362d);
        double double14 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15930186906976396d + "'", double11 == 0.15930186906976396d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(410.06646246647756d, 9.391305229797384d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double12 = normalDistributionImpl2.cumulativeProbability(0.34134474606854304d, 0.5027585141294139d);
        double double14 = normalDistributionImpl2.cumulativeProbability(0.006292013927202356d);
        normalDistributionImpl2.setStandardDeviation(10.026126956040166d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.439419620615228E-4d + "'", double12 == 6.439419620615228E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5000251015038278d + "'", double14 == 0.5000251015038278d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (byte) 100);
        normalDistributionImpl2.setMean((double) '4');
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(8.429343765339881E-4d);
        double double13 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(100.84134474606854d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(0.004639639218063429d);
        normalDistributionImpl2.setMean((-9.831472392533161d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (byte) 100);
        normalDistributionImpl2.setMean((double) '4');
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.5341532272166142d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.15864037517600482d + "'", double13 == 0.15864037517600482d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1742829058275558d, 0.09950447039473481d);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.5033570607468583d, 0.6153338488431551d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.666288740519109E-4d + "'", double5 == 4.666288740519109E-4d);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-33.19110015555852d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8339767539364704d + "'", double11 == 0.8339767539364704d);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.16602324606353464d, 0.4115308789714541d);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.841344746068543d);
        double double16 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.inverseCumulativeProbability((-40.87958411457447d));
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(0.9772498680518209d);
        double double19 = normalDistributionImpl2.getDomainLowerBound((-1.503985414085041d));
        double double21 = normalDistributionImpl2.getDomainUpperBound(0.6855935107901387d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1190984698422417d, 6.439419620615228E-4d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.5041573996674839d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11974241180430323d + "'", double4 == 0.11974241180430323d);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(100.50398935631463d, 0.4144226483220369d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4144226483220369d + "'", double3 == 0.4144226483220369d);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double7 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.inverseCumulativeProbability((-26.12663573645063d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.5013304021987853d, 0.999987716976066d);
        normalDistributionImpl2.setMean((-39.81100517904762d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0012518388356499988d + "'", double15 == 0.0012518388356499988d);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getDomainLowerBound(0.5033270473131487d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability((double) (short) -1);
        normalDistributionImpl2.setMean((double) 10);
        normalDistributionImpl2.setMean(0.5020079759221441d);
        double double17 = normalDistributionImpl2.cumulativeProbability(0.0d, 0.9999999993515475d);
        normalDistributionImpl2.setStandardDeviation((double) 'a');
        double double21 = normalDistributionImpl2.inverseCumulativeProbability(0.6153338488435729d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4960106436853684d + "'", double10 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.00398940617809046d + "'", double17 == 0.00398940617809046d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 28.94710140017747d + "'", double21 == 28.94710140017747d);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double6 = normalDistributionImpl2.getInitialDomain(200.0d);
        double double7 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 197.0d + "'", double6 == 197.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getInitialDomain(0.691462461274013d);
        double double12 = normalDistributionImpl2.getDomainLowerBound((-128.26949715237384d));
        double double13 = normalDistributionImpl2.getStandardDeviation();
        double double14 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.6153338488435729d);
        double double15 = normalDistributionImpl2.getInitialDomain(0.5039854140850405d);
        double double18 = normalDistributionImpl2.cumulativeProbability((double) 0.0f, 0.16116265572688077d);
        double double20 = normalDistributionImpl2.getDomainLowerBound(314.1692288583126d);
        double double22 = normalDistributionImpl2.getInitialDomain(0.5020079759221441d);
        double double23 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.429456955875379E-4d + "'", double18 == 6.429456955875379E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        double double15 = normalDistributionImpl2.getInitialDomain(2.0509166282900448E-4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 62.0d + "'", double15 == 62.0d);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) (short) 100);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.01213919411360942d);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (byte) 0);
        double double7 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.getDomainUpperBound(0.42851072492061976d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-128.26949715237384d) + "'", double4 == (-128.26949715237384d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.16602324606352958d + "'", double6 == 0.16602324606352958d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4979893818807349d, 0.175877604587528d);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-0.8413596248239952d));
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double16 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.8413596248239952d) + "'", double16 == (-0.8413596248239952d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        double double22 = normalDistributionImpl2.cumulativeProbability(32.0d);
        double double24 = normalDistributionImpl2.getDomainUpperBound((-52.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.501361765869532d + "'", double20 == 0.501361765869532d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.6255158347233201d + "'", double22 == 0.6255158347233201d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        normalDistributionImpl2.setMean(0.16852760746683781d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(0.5374108872856648d);
        double double18 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.cumulativeProbability((-3.0d), 0.5033600462439357d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5026547384068555d + "'", double15 == 0.5026547384068555d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.16852760746683781d + "'", double17 == 0.16852760746683781d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.013974267179731381d + "'", double21 == 0.013974267179731381d);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.3668235531222151d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-34.027810452415785d) + "'", double5 == (-34.027810452415785d));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        double double18 = normalDistributionImpl2.getInitialDomain(0.0d);
        java.lang.Class<?> wildcardClass19 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.cumulativeProbability(97.0d);
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8339767539364704d + "'", double9 == 0.8339767539364704d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(35.0d, 0.4966435003267168d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.5417911261200851d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.5013304021987853d, 0.999987716976066d);
        double double17 = normalDistributionImpl2.getInitialDomain((-87.63548323309713d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0012518388356499988d + "'", double15 == 0.0012518388356499988d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-3.0d) + "'", double17 == (-3.0d));
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) -1, 0.5039854140850412d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getDomainUpperBound(13.213405872154592d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5039854140850412d + "'", double3 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 10.0f);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.7507529000010817d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5299225959740457d + "'", double5 == 0.5299225959740457d);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
        double double26 = normalDistributionImpl2.cumulativeProbability(0.5068289254012387d, 34.0d);
        normalDistributionImpl2.setMean(0.5378382600176361d);
        double double30 = normalDistributionImpl2.getInitialDomain(0.5006429455720895d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.9999999999999823d + "'", double26 == 0.9999999999999823d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.5378382600176361d + "'", double30 == 1.5378382600176361d);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-120.47465095323574d), 0.47163584213925297d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound(0.6153338488435729d);
        normalDistributionImpl0.setMean(8.987287113132458E-5d);
        double double6 = normalDistributionImpl0.getDomainUpperBound((-22.36087456351966d));
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.987287113132458E-5d + "'", double6 == 8.987287113132458E-5d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10);
        normalDistributionImpl2.setMean(0.11533384884315512d);
        normalDistributionImpl2.setStandardDeviation(8.429343765339881E-4d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double16 = normalDistributionImpl2.getDomainLowerBound((-0.5027585141294139d));
        normalDistributionImpl2.setMean(0.0015893633625518877d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.539827837277029d + "'", double8 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.NEGATIVE_INFINITY + "'", double14 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
        java.lang.Class<?> wildcardClass19 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5053565223803516d + "'", double18 == 0.5053565223803516d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5033270473131487d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.34134474606854304d);
        double double15 = normalDistributionImpl2.getDomainUpperBound(0.1586552539043654d);
        normalDistributionImpl2.setMean(0.0d);
        normalDistributionImpl2.setMean(0.6153338488431551d);
        double double21 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        java.lang.Class<?> wildcardClass22 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5020079759221441d + "'", double11 == 0.5020079759221441d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + Double.POSITIVE_INFINITY + "'", double21 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, (double) '4');
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double15 = normalDistributionImpl2.getInitialDomain(0.16108488682834415d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.cumulativeProbability(0.971454449333725d, 0.4490776072769937d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-100.0d) + "'", double15 == (-100.0d));
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003233364812544881d, 107.0d);
        normalDistributionImpl2.setStandardDeviation(101.0d);
        double double7 = normalDistributionImpl2.cumulativeProbability((-112.50817060471245d), 0.5001042314730403d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36931748722364566d + "'", double7 == 0.36931748722364566d);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0012541753965479852d, 0.3050257308975194d);
        normalDistributionImpl2.setMean(0.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound(0.010465251519014118d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double6 = normalDistributionImpl2.getInitialDomain(0.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(314.1692288583126d);
        normalDistributionImpl2.setStandardDeviation(100.49998149051751d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-100.0d) + "'", double6 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double14 = normalDistributionImpl2.cumulativeProbability((-1.1586403751760048d), 35.50332704731315d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getMean();
        double double18 = normalDistributionImpl2.getInitialDomain(0.15905137809047232d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.NEGATIVE_INFINITY + "'", double11 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.10360644854994305d + "'", double14 == 0.10360644854994305d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getDomainLowerBound(0.38212483247943946d);
        double double10 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 1);
        double double5 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double8 = normalDistributionImpl0.cumulativeProbability(0.16108488682834415d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.691462461274013d + "'", double4 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.36733683944034023d + "'", double8 == 0.36733683944034023d);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01213919411360942d, 0.4490776072831239d);
        normalDistributionImpl2.setMean((double) 100L);
        double double6 = normalDistributionImpl2.getDomainUpperBound((-799.5509223927169d));
        normalDistributionImpl2.setMean(65.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.cumulativeProbability((-1.6089029823648797d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.16116265572688077d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain(99.0d);
        double double9 = normalDistributionImpl2.getDomainUpperBound((-1.5543122344752192E-15d));
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(3.809557474743208E-5d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.9999999993515475d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.546219801024759d + "'", double4 == 0.546219801024759d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-11.0d) + "'", double13 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5792597094137458d + "'", double15 == 0.5792597094137458d);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01213919411360942d, 0.4490776072831239d);
        normalDistributionImpl2.setMean((double) 100L);
        normalDistributionImpl2.setStandardDeviation(0.19981031319245302d);
        double double8 = normalDistributionImpl2.cumulativeProbability(97.67965765688128d);
        normalDistributionImpl2.setMean(1.5378382600176361d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-5.773159728050814E-15d) + "'", double8 == (-5.773159728050814E-15d));
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8409366149786677d, 0.16108409568379545d);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
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
        double double25 = normalDistributionImpl2.getMean();
        double double27 = normalDistributionImpl2.getDomainUpperBound(314.1692288583126d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.NEGATIVE_INFINITY + "'", double15 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.5068289254012387d + "'", double21 == 0.5068289254012387d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.004639639218063429d + "'", double24 == 0.004639639218063429d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.7976931348623157E308d + "'", double27 == 1.7976931348623157E308d);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        double double11 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        normalDistributionImpl2.setMean(0.5020074000820464d);
        double double17 = normalDistributionImpl2.getInitialDomain(0.9991574196213242d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.50200740008205d + "'", double17 == 100.50200740008205d);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.00594420241553506d, 6.429456955875379E-4d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getDomainLowerBound(0.5020027136551392d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.00594420241553506d + "'", double3 == 0.00594420241553506d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.00594420241553506d + "'", double5 == 0.00594420241553506d);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5020106023922443d);
        normalDistributionImpl2.setStandardDeviation(309.37500000520356d);
        normalDistributionImpl2.setMean(9.0d);
        double double13 = normalDistributionImpl2.cumulativeProbability((-1.1675848380995955d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5062582824999134d + "'", double7 == 0.5062582824999134d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.4868911534553236d + "'", double13 == 0.4868911534553236d);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6153338488431551d, 0.16108488682834415d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(100.34134474606854d);
        normalDistributionImpl2.setStandardDeviation(0.5026547383961157d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5026547383961157d + "'", double7 == 0.5026547383961157d);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) -1, 0.5039854140850412d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double4 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getDomainLowerBound(0.5003566486671073d);
        normalDistributionImpl2.setStandardDeviation(0.38212483247943946d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5039854140850412d + "'", double3 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5039854140850412d + "'", double4 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, 409.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(1.7976931348623157E308d);
        double double6 = normalDistributionImpl2.getInitialDomain((-314.0626513812741d));
        normalDistributionImpl2.setStandardDeviation(101.0d);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.5000484283777002d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.getInitialDomain(0.5006251369479466d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4992439296527548d + "'", double10 == 0.4992439296527548d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0d + "'", double11 == 101.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.69146246127401d + "'", double13 == 101.69146246127401d);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double14 = normalDistributionImpl2.cumulativeProbability(0.9990117802233995d);
        normalDistributionImpl2.setMean(3.0324839434953876d);
        double double18 = normalDistributionImpl2.cumulativeProbability(8.326672684688674E-16d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.48790399333774825d + "'", double18 == 0.48790399333774825d);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) (short) 10);
        normalDistributionImpl2.setMean(10.160849516286758d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setStandardDeviation((double) '4');
        double double10 = normalDistributionImpl2.getDomainLowerBound(409.37500000520356d);
        double double12 = normalDistributionImpl2.getInitialDomain(0.006292013927202356d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-52.0d) + "'", double12 == (-52.0d));
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 10, 0.5000484283777002d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getDomainLowerBound((-271.93599539501935d));
        normalDistributionImpl2.setMean(0.00398940617809046d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5000484283777002d + "'", double3 == 0.5000484283777002d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.7976931348623157E308d) + "'", double5 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        double double8 = normalDistributionImpl2.cumulativeProbability(1.0000484283777002d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5039895495062456d + "'", double8 == 0.5039895495062456d);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-99.79443152768462d), 410.37500000520356d);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain(1.0d);
        double double17 = normalDistributionImpl2.getStandardDeviation();
        double double18 = normalDistributionImpl2.getMean();
        double double20 = normalDistributionImpl2.getDomainLowerBound(100.50318270376744d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        double double23 = normalDistributionImpl2.inverseCumulativeProbability(0.10360644854994305d);
        double double25 = normalDistributionImpl2.getInitialDomain(8.429343765339881E-4d);
        double double27 = normalDistributionImpl2.getDomainUpperBound((-132.0d));
        normalDistributionImpl2.setStandardDeviation(0.5003482664470201d);
        // The following exception was thrown during execution in test generation
        try {
            double double31 = normalDistributionImpl2.cumulativeProbability(6.439419598842644E-4d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-26.12663573645063d) + "'", double23 == (-26.12663573645063d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.376841142650683d, (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((-12.799211304789129d));
        normalDistributionImpl2.setMean(0.5033570607468583d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-31.623158857349317d) + "'", double4 == (-31.623158857349317d));
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(Double.POSITIVE_INFINITY);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(100.50398935631463d);
        double double17 = normalDistributionImpl2.getMean();
        double double19 = normalDistributionImpl2.getDomainUpperBound(0.5000185094824923d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-126.12663573645062d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.50398935631463d + "'", double17 == 100.50398935631463d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(35.50332704731315d, 0.5026547384068555d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.cumulativeProbability((-175.24788832960508d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound((double) 10);
        normalDistributionImpl2.setMean(59.120415885425516d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getInitialDomain(10.0d);
        double double8 = normalDistributionImpl0.getDomainLowerBound(0.4960106436853684d);
        double double9 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.5d + "'", double6 == 1.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-0.8413596248239952d));
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double16 = normalDistributionImpl2.cumulativeProbability(309.37500000520356d);
        double double18 = normalDistributionImpl2.getInitialDomain(0.04838995734662288d);
        double double20 = normalDistributionImpl2.getDomainLowerBound(0.33654344935634584d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9990394412085004d + "'", double16 == 0.9990394412085004d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.841359624824d) + "'", double18 == (-100.841359624824d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.7976931348623157E308d) + "'", double20 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getDomainUpperBound(0.996954640520628d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.47180752643832735d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5018822327219192d + "'", double15 == 0.5018822327219192d);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, (double) '4');
        double double12 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((double) '4');
        double double17 = normalDistributionImpl2.cumulativeProbability((-128.26949715237384d), 0.5000000000002491d);
        double double18 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.26755844383010013d + "'", double17 == 0.26755844383010013d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003989356314631598d, 100.00012139194168d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.0020476378332464074d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.50539567299893d, (-0.18951904809965026d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.49999225367341527d + "'", double4 == 0.49999225367341527d);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) '#');
        double double10 = normalDistributionImpl0.getDomainUpperBound((double) 0.0f);
        normalDistributionImpl0.setStandardDeviation(0.5013304021987853d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double8 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(9.499902516006655d, 0.10360644854994305d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-0.8413596248239952d), 0.003989356314631598d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) 100L);
        normalDistributionImpl2.setMean((-11.119995541385146d));
        double double8 = normalDistributionImpl2.getDomainUpperBound(100.50318270376744d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.059977535157524076d, 197.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability((-3.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.49380352624882917d + "'", double4 == 0.49380352624882917d);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 10L);
        double double7 = normalDistributionImpl0.cumulativeProbability((double) 10.0f);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.cumulativeProbability(0.38212483247943946d, 0.506713322768457d);
        normalDistributionImpl0.setStandardDeviation(0.4966435003267168d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.3877787807814457E-15d) + "'", double11 == (-1.3877787807814457E-15d));
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.5020106023922443d);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.00503989243838d + "'", double17 == 100.00503989243838d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, (double) ' ');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5020027136551392d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getInitialDomain(6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 101.16064255229166d + "'", double4 == 101.16064255229166d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 69.0d + "'", double7 == 69.0d);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5013626639053514d, (-106.16602324606353d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.16643735506845647d, 0.506713322768457d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((-0.8453416760874117d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.16643735506845647d + "'", double4 == 0.16643735506845647d);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getDomainUpperBound(8.3936365174897E-4d);
        double double7 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) -1, 0.5039854140850412d);
        double double4 = normalDistributionImpl2.getInitialDomain(6.106226635438361E-16d);
        normalDistributionImpl2.setStandardDeviation(96.93366833316512d);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.308537538725987d, 0.38076445225569666d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.503985414085041d) + "'", double4 == (-1.503985414085041d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.9723002540182897E-4d + "'", double9 == 2.9723002540182897E-4d);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.00594420241553506d, 0.10360644854994305d);
        double double3 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.33654344935634584d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.00594420241553506d + "'", double3 == 0.00594420241553506d);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getInitialDomain((-68.0d));
        normalDistributionImpl2.setMean(0.37665202364295614d);
        double double17 = normalDistributionImpl2.getInitialDomain(6.439419620615228E-4d);
        double double19 = normalDistributionImpl2.getDomainLowerBound((-277.33138319894914d));
        double double22 = normalDistributionImpl2.cumulativeProbability((-0.49484524848086087d), 101.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-99.62334797635704d) + "'", double17 == (-99.62334797635704d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3463250917547049d + "'", double22 == 0.3463250917547049d);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9991121205145963d, 101.01213919411362d);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.7688235963189542d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double16 = normalDistributionImpl2.cumulativeProbability(6.439419620630119E-4d);
        double double18 = normalDistributionImpl2.cumulativeProbability(0.2822385972445549d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.NEGATIVE_INFINITY + "'", double14 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0027907034839972367d + "'", double16 == 0.0027907034839972367d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0028604410261461877d + "'", double18 == 0.0028604410261461877d);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(0.5053644817366403d, 0.16108409568379545d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.8339767539364704d);
        normalDistributionImpl2.setMean((-99.73312743878357d));
        normalDistributionImpl2.setMean(0.5019946721877552d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(100.0d);
        normalDistributionImpl2.setMean(0.506713322768457d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.cumulativeProbability(99.03158468176713d, 0.3346390629379533d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.020241005302473858d, 100.00012139194168d);
        double double4 = normalDistributionImpl2.cumulativeProbability((-18.016701886873854d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.42843136238168184d + "'", double4 == 0.42843136238168184d);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6823959331695719d, 1.0000000000000004d);
        normalDistributionImpl0.setStandardDeviation(0.18406012534675953d);
        normalDistributionImpl0.setMean(0.38212483247943946d);
        double double15 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1190984698422417d + "'", double10 == 0.1190984698422417d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.38212483247943946d + "'", double15 == 0.38212483247943946d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        normalDistributionImpl2.setMean(13.213405872154592d);
        double double27 = normalDistributionImpl2.cumulativeProbability(0.16108488682834415d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5297069799427127d + "'", double17 == 0.5297069799427127d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999999993515475d + "'", double19 == 0.9999999993515475d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.01213919411360942d + "'", double21 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.44833414025485474d + "'", double27 == 0.44833414025485474d);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6153338488431551d, 0.16108488682834415d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(100.34134474606854d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.inverseCumulativeProbability((-33.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.16108488682834415d + "'", double5 == 0.16108488682834415d);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        double double29 = normalDistributionImpl2.getDomainLowerBound(0.9999787774020832d);
        double double30 = normalDistributionImpl2.getMean();
        double double31 = normalDistributionImpl2.getStandardDeviation();
        double double32 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass33 = normalDistributionImpl2.getClass();
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.9987872496534157d + "'", double29 == 0.9987872496534157d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.9987872496534157d + "'", double30 == 0.9987872496534157d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.9987872496534157d + "'", double32 == 0.9987872496534157d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        double double23 = normalDistributionImpl2.getDomainUpperBound(0.9999787774020832d);
        double double25 = normalDistributionImpl2.getDomainLowerBound(0.5000159154279771d);
        double double27 = normalDistributionImpl2.getDomainLowerBound(0.42851072492061976d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 9.047742753903742E-4d + "'", double21 == 9.047742753903742E-4d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.7976931348623157E308d) + "'", double27 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.inverseCumulativeProbability(1.000000000000003d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.50539567299893d, 0.5020429585576492d);
        normalDistributionImpl2.setMean(0.9989951412038602d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-6.106226635438361E-16d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        normalDistributionImpl2.setMean(107.0d);
        double double7 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.38924867502172716d);
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.1917219015966306d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 107.0d + "'", double7 == 107.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 10);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.002774428975804377d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-190.53983024611358d), (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        double double7 = normalDistributionImpl0.getInitialDomain(0.539827837277029d);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.01213919411360942d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.29750602479108235d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5000484283777002d + "'", double9 == 0.5000484283777002d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-53.1587030224924d) + "'", double12 == (-53.1587030224924d));
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.5378382600176361d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl2.inverseCumulativeProbability(97.77142633673954d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        double double21 = normalDistributionImpl2.getInitialDomain(0.27896897658540193d);
        normalDistributionImpl2.setStandardDeviation(0.1917219015966306d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.3668235531222151d + "'", double19 == 0.3668235531222151d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5033270473131487d);
        double double13 = normalDistributionImpl2.getDomainLowerBound((-33.0d));
        double double15 = normalDistributionImpl2.getInitialDomain(0.010090298830658262d);
        double double17 = normalDistributionImpl2.getInitialDomain(96.93366833316512d);
        normalDistributionImpl2.setStandardDeviation(0.5120960066622517d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5020079759221441d + "'", double11 == 0.5020079759221441d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-100.0d) + "'", double15 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation(9.047742753903742E-4d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.047742753903742E-4d + "'", double9 == 9.047742753903742E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.047742753903742E-4d + "'", double10 == 9.047742753903742E-4d);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        normalDistributionImpl0.setMean((double) (byte) 0);
        double double9 = normalDistributionImpl0.getInitialDomain(409.37500000520356d);
        normalDistributionImpl0.setMean(0.341344746068543d);
        normalDistributionImpl0.setMean((-26.12663573645063d));
        double double15 = normalDistributionImpl0.getDomainLowerBound((double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl0.cumulativeProbability(7.294832041665478E-4d, 1.1102230246251565E-16d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-26.12663573645063d) + "'", double15 == (-26.12663573645063d));
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double11 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean((double) 10.0f);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.841344746068543d);
        normalDistributionImpl2.setStandardDeviation(0.3668235531222151d);
        normalDistributionImpl2.setMean(1.0d);
        java.lang.Class<?> wildcardClass20 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.4960106436853684d);
        double double9 = normalDistributionImpl2.getInitialDomain(10.026126956040166d);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.5020052938315906d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.1660253379983706d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5026547383961157d + "'", double11 == 0.5026547383961157d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double11 = normalDistributionImpl2.getInitialDomain(313.0062582842937d);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.18406012534675953d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-68.0d) + "'", double11 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.999128202968101d + "'", double13 == 0.999128202968101d);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.34134474606854304d);
        double double14 = normalDistributionImpl2.getDomainUpperBound(309.37500000520356d);
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.6924329677782861d);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.013974267179731381d, 1.9512662554570253d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.501361765869532d + "'", double12 == 0.501361765869532d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.007728182885538226d + "'", double19 == 0.007728182885538226d);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double12 = normalDistributionImpl2.cumulativeProbability(0.34134474606854304d, 0.5027585141294139d);
        normalDistributionImpl2.setMean((-99.99758096448726d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.439419620615228E-4d + "'", double12 == 6.439419620615228E-4d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        normalDistributionImpl2.setMean((double) (short) 0);
        double double12 = normalDistributionImpl2.cumulativeProbability((-41.060142464627134d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.34068240944897576d + "'", double12 == 0.34068240944897576d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
        double double24 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.999987716976066d);
        double double27 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4490776072831239d, 0.9999999999999823d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.50539567299893d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.5020028532139044d);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.6153338488431551d, 0.999128202968101d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4490776072831239d + "'", double4 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4540980747251103d + "'", double6 == 0.4540980747251103d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14283531489447265d + "'", double9 == 0.14283531489447265d);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.inverseCumulativeProbability(9.499902516006655d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound(0.6153338488435729d);
        normalDistributionImpl0.setMean(8.987287113132458E-5d);
        normalDistributionImpl0.setMean((-69.90167018868739d));
        double double8 = normalDistributionImpl0.getInitialDomain(4.996003610813204E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-70.90167018868739d) + "'", double8 == (-70.90167018868739d));
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-0.8413596248239952d));
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double16 = normalDistributionImpl2.cumulativeProbability(309.37500000520356d);
        double double18 = normalDistributionImpl2.getInitialDomain(0.04838995734662288d);
        double double20 = normalDistributionImpl2.inverseCumulativeProbability(0.49999225367341527d);
        normalDistributionImpl2.setMean(0.5068289254012387d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9990394412085004d + "'", double16 == 0.9990394412085004d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.841359624824d) + "'", double18 == (-100.841359624824d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.8433013409485214d) + "'", double20 == (-0.8433013409485214d));
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5000000000002491d);
        normalDistributionImpl2.setMean((-312.50001232497266d));
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5019947030907418d + "'", double11 == 0.5019947030907418d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double8 = normalDistributionImpl2.getInitialDomain((double) 1L);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getDomainLowerBound(15.695941430105695d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5039854140850405d);
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.getInitialDomain(410.06646246647756d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9991574196213242d + "'", double7 == 0.9991574196213242d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-68.0d) + "'", double10 == (-68.0d));
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((-41.060142464627134d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.34068240944897576d + "'", double8 == 0.34068240944897576d);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(Double.NEGATIVE_INFINITY);
        normalDistributionImpl2.setStandardDeviation(29.324838582032726d);
        double double20 = normalDistributionImpl2.getMean();
        double double22 = normalDistributionImpl2.getDomainUpperBound(0.16602324606352958d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.NEGATIVE_INFINITY + "'", double15 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.10504850654241193d, 0.18406012534675953d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.4168183936186787d, 51.63317644687778d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        normalDistributionImpl2.setMean((double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = normalDistributionImpl2.cumulativeProbability(0.5019946721877552d, 0.3669245429555231d);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5039893563146316d + "'", double16 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5027585141294139d + "'", double20 == 0.5027585141294139d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
        double double23 = normalDistributionImpl2.getDomainLowerBound(3.0324839434953876d);
        double double25 = normalDistributionImpl2.getDomainLowerBound(0.4240925721925803d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.7228081817379124d + "'", double17 == 0.7228081817379124d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5020429585576492d + "'", double19 == 0.5020429585576492d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.19981031319245302d + "'", double23 == 0.19981031319245302d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.7976931348623157E308d) + "'", double25 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.6153338488435729d);
        double double15 = normalDistributionImpl2.getInitialDomain(0.5039854140850405d);
        double double18 = normalDistributionImpl2.cumulativeProbability((double) 0.0f, 0.16116265572688077d);
        double double20 = normalDistributionImpl2.getDomainLowerBound(314.1692288583126d);
        normalDistributionImpl2.setStandardDeviation(34.01213919411361d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.429456955875379E-4d + "'", double18 == 6.429456955875379E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double8 = normalDistributionImpl2.cumulativeProbability(10.026126956040166d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.8339767539364704d);
        double double13 = normalDistributionImpl2.cumulativeProbability(99.49601458591496d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.816634256911273d + "'", double8 == 0.816634256911273d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0000000000000018d + "'", double13 == 1.0000000000000018d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
            double double18 = normalDistributionImpl2.cumulativeProbability(0.42843136238168184d, (-0.3049637758786837d));
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
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        java.lang.Class<?> wildcardClass26 = normalDistributionImpl2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound(0.1586664807605242d);
        double double9 = normalDistributionImpl2.getDomainUpperBound((-312.50001232497266d));
        double double10 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getInitialDomain(32.0d);
        double double12 = normalDistributionImpl2.getDomainUpperBound(101.0d);
        normalDistributionImpl2.setMean(1.5d);
        normalDistributionImpl2.setStandardDeviation(0.4240925721925803d);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.0d, 0.5006153217161514d);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = normalDistributionImpl2.cumulativeProbability((-800.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 107.0d + "'", double10 == 107.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.009021039372468731d + "'", double19 == 0.009021039372468731d);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        normalDistributionImpl0.setMean((double) 1L);
        double double9 = normalDistributionImpl0.getDomainLowerBound((double) (short) -1);
        double double11 = normalDistributionImpl0.getInitialDomain((double) 1L);
        double double12 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0d + "'", double11 == 101.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 1);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5000484283777002d);
        double double9 = normalDistributionImpl0.getDomainUpperBound(0.003982051263416553d);
        double double10 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.getDomainUpperBound(0.502002607285855d);
        double double13 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.691462461274013d + "'", double4 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(194.0d, (double) (byte) 10);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-146.37048343391822d), 0.13671765618845966d);
        normalDistributionImpl2.setStandardDeviation(1.0000000000000449d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double7 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.inverseCumulativeProbability(0.5020106023922443d);
        double double11 = normalDistributionImpl2.getInitialDomain(0.16602324606352958d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5039854140741445d + "'", double9 == 0.5039854140741445d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-100.0d) + "'", double11 == (-100.0d));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.5062582824999134d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5063112315282714d + "'", double5 == 0.5063112315282714d);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
        double double27 = normalDistributionImpl2.getDomainLowerBound(0.0d);
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.7976931348623157E308d) + "'", double27 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.807040063692977d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double11 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double14 = normalDistributionImpl2.cumulativeProbability(0.3419762427587607d, 46.0d);
        double double17 = normalDistributionImpl2.cumulativeProbability(0.25801261928916336d, 68.57142857177841d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5033270473131487d + "'", double11 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.175877604587528d + "'", double14 == 0.175877604587528d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2525240314962103d + "'", double17 == 0.2525240314962103d);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 10L);
        double double7 = normalDistributionImpl0.cumulativeProbability((double) 10.0f);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.getDomainUpperBound(0.15987301523152742d);
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.16852760746683781d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.16108409568379545d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.039999845437872d + "'", double12 == 9.039999845437872d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5039854140850405d);
        double double9 = normalDistributionImpl2.cumulativeProbability((-321.8666021266556d));
        java.lang.Class<?> wildcardClass10 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9991574196213242d + "'", double7 == 0.9991574196213242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0551338408836273E-12d + "'", double9 == 2.0551338408836273E-12d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003931884211822556d, 0.9999999993515475d);
        normalDistributionImpl2.setMean(97.0d);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4401694681058532d, 29.324838582032726d);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, 409.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(1.7976931348623157E308d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) 100L);
        double double8 = normalDistributionImpl2.getDomainLowerBound(3.065369771326765E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        normalDistributionImpl2.setMean(11.0d);
        double double14 = normalDistributionImpl2.cumulativeProbability(6.106226635438361E-16d);
        normalDistributionImpl2.setStandardDeviation(0.9999999993515475d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.inverseCumulativeProbability((-99.79443152768462d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.37665202364295614d + "'", double14 == 0.37665202364295614d);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, 409.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(1.7976931348623157E308d);
        double double6 = normalDistributionImpl2.getInitialDomain((-314.0626513812741d));
        double double8 = normalDistributionImpl2.getInitialDomain(0.0d);
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.5016193542725117d);
        double double12 = normalDistributionImpl2.getDomainUpperBound((double) 0L);
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.5437953125423168d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.691462461274013d + "'", double10 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.691462461274013d + "'", double12 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.691462461274013d + "'", double14 == 0.691462461274013d);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 101.69146246127401d);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double8 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double12 = normalDistributionImpl2.cumulativeProbability(0.34134474606854304d, 0.5027585141294139d);
        double double14 = normalDistributionImpl2.cumulativeProbability((double) ' ');
        double double16 = normalDistributionImpl2.cumulativeProbability((-181.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.439419620615228E-4d + "'", double12 == 6.439419620615228E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6255158347233201d + "'", double14 == 0.6255158347233201d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.035147893584038636d + "'", double16 == 0.035147893584038636d);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.5039893563146316d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.cumulativeProbability(0.0d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.9990394412085004d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.4979893818807349d + "'", double15 == 0.4979893818807349d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 310.72034900269d + "'", double17 == 310.72034900269d);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
        normalDistributionImpl2.setMean(0.6924329677782861d);
        normalDistributionImpl2.setStandardDeviation(159.12041588542553d);
        double double33 = normalDistributionImpl2.inverseCumulativeProbability(0.5013880883243286d);
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.2460810716952508d + "'", double33 == 1.2460810716952508d);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.getInitialDomain(0.9999999993515475d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, 0.9990117802232268d);
        normalDistributionImpl2.setStandardDeviation(0.5000185094824923d);
        double double6 = normalDistributionImpl2.getInitialDomain(0.08729746340859079d);
        double double8 = normalDistributionImpl2.getInitialDomain((-1.7166342569447757d));
        double double9 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.49998149051751d + "'", double6 == 100.49998149051751d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.49998149051751d + "'", double8 == 100.49998149051751d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 101.0d + "'", double9 == 101.0d);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-99.02522234182658d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        java.lang.Class<?> wildcardClass21 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5039893563146316d + "'", double16 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5027585141294139d + "'", double20 == 0.5027585141294139d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6924329677782861d, (-99.73312743878357d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 'a');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.999987716976066d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain(8.89024926669868E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.7688235963189542d);
        double double14 = normalDistributionImpl2.getDomainUpperBound(0.503327047302336d);
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.971454449333725d);
        double double17 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double10 = normalDistributionImpl2.getMean();
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.5020052938315906d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(0.6921596669396051d);
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5026547383961157d + "'", double12 == 0.5026547383961157d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.19813127604581d + "'", double14 == 50.19813127604581d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.816634256911273d, 0.10360644854994305d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.500000019389445d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9202407054612161d + "'", double4 == 0.9202407054612161d);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d);
        normalDistributionImpl2.setMean((-312.05092239451676d));
        double double13 = normalDistributionImpl2.getDomainUpperBound(0.3050257308975194d);
        normalDistributionImpl2.setMean(0.1917219015966306d);
        double double16 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5001042314730403d + "'", double9 == 0.5001042314730403d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-312.05092239451676d) + "'", double13 == (-312.05092239451676d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1917219015966306d + "'", double16 == 0.1917219015966306d);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6855935107901387d, (-1.503985414085041d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003989242433971363d, 0.5068289254012387d);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        double double17 = normalDistributionImpl2.getInitialDomain(0.0013750926571968192d);
        double double19 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double21 = normalDistributionImpl2.getDomainLowerBound(10.026126956040166d);
        double double22 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-100.0d) + "'", double17 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.5039893563131264d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5039893563131264d + "'", double3 == 0.5039893563131264d);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-0.8413596248239952d), 0.003989356314631598d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.4992439296527548d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.8453489811386268d) + "'", double4 == (-0.8453489811386268d));
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        normalDistributionImpl2.setMean(Double.POSITIVE_INFINITY);
        normalDistributionImpl2.setMean(0.5297069799427127d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.cumulativeProbability(0.5000484283777002d, (-1.9984014443252818E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getInitialDomain(0.5039893563146316d);
        double double7 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        double double8 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.18406012534675953d);
        double double12 = normalDistributionImpl2.cumulativeProbability((-412.05092239451676d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.8751354819102062E-5d + "'", double12 == 1.8751354819102062E-5d);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getDomainUpperBound(8.3936365174897E-4d);
        normalDistributionImpl2.setMean(5.440092820663267E-15d);
        double double10 = normalDistributionImpl2.getDomainLowerBound((-175.24788832960508d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(9.047742753903742E-4d, (double) 10.0f);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5039854140850405d);
        double double9 = normalDistributionImpl2.cumulativeProbability((-321.8666021266556d));
        double double11 = normalDistributionImpl2.cumulativeProbability(0.01213919411360942d);
        double double14 = normalDistributionImpl2.cumulativeProbability(0.5020429585576492d, 192.43079734812764d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9991574196213242d + "'", double7 == 0.9991574196213242d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0551338408836273E-12d + "'", double9 == 2.0551338408836273E-12d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9991121205145963d + "'", double11 == 0.9991121205145963d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.427550193380595E-4d + "'", double14 == 8.427550193380595E-4d);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        double double22 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double23 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 59.120415885425516d + "'", double18 == 59.120415885425516d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + Double.NEGATIVE_INFINITY + "'", double22 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + Double.NEGATIVE_INFINITY + "'", double23 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        normalDistributionImpl2.setMean((-69.90167018868739d));
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(0.103606448964639d, 2.3713936654234935E-5d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-272.3126474186623d), 0.035147893584038636d);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        normalDistributionImpl0.setMean((double) 1L);
        double double9 = normalDistributionImpl0.getDomainLowerBound((double) (short) -1);
        double double11 = normalDistributionImpl0.getInitialDomain((double) 1L);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.0d, (double) 10.0f);
        double double15 = normalDistributionImpl0.getMean();
        double double17 = normalDistributionImpl0.getDomainUpperBound((-0.9702930200572873d));
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0d + "'", double11 == 101.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.039845748899803746d + "'", double14 == 0.039845748899803746d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        double double20 = normalDistributionImpl2.cumulativeProbability(0.5001042314730403d);
        double double23 = normalDistributionImpl2.cumulativeProbability(0.47180752643832735d, 0.7228081817379124d);
        double double25 = normalDistributionImpl2.getDomainLowerBound(2.3713936654234935E-5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5006333584453674d + "'", double20 == 0.5006333584453674d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0010013441949527913d + "'", double23 == 0.0010013441949527913d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.7976931348623157E308d) + "'", double25 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.01213919411362d, 0.5004870960802225d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability((-70.90167018868739d), 0.37804813188807573d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        normalDistributionImpl2.setMean((-6.661338147750939E-16d));
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getDomainUpperBound(101.70713751849273d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8339767539364704d + "'", double11 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5010366908668966d, (-272.3126474186623d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
            normalDistributionImpl2.setStandardDeviation((-1.4988010832439613E-15d));
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
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        normalDistributionImpl2.setMean(0.0d);
        double double17 = normalDistributionImpl2.cumulativeProbability(59.120415885425516d);
        double double18 = normalDistributionImpl2.getMean();
        double double19 = normalDistributionImpl2.getStandardDeviation();
        double double20 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.7228081817379124d + "'", double17 == 0.7228081817379124d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 10, 0.501361765869532d);
        normalDistributionImpl2.setMean((double) 100L);
        double double6 = normalDistributionImpl2.getDomainUpperBound(33.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double6 = normalDistributionImpl2.getInitialDomain((double) '4');
        double double7 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.getDomainUpperBound(0.5006153217161514d);
        normalDistributionImpl2.setStandardDeviation(9.047742753903742E-4d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(0.5013626639053514d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.5000081688930658d);
        double double17 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.8413596248239952d) + "'", double6 == (-0.8413596248239952d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.047742753903742E-4d + "'", double14 == 9.047742753903742E-4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5033270473131487d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.34134474606854304d);
        double double15 = normalDistributionImpl2.getDomainUpperBound(0.1586552539043654d);
        normalDistributionImpl2.setMean(0.0d);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.9991109747008919d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5020079759221441d + "'", double11 == 0.5020079759221441d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5039858097940029d + "'", double19 == 0.5039858097940029d);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double14 = normalDistributionImpl2.getDomainUpperBound(200.0d);
        normalDistributionImpl2.setStandardDeviation(8.89024926669868E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.inverseCumulativeProbability((-0.5026547384068555d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double6 = normalDistributionImpl2.getInitialDomain((double) '#');
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.5019961258952685d);
        double double10 = normalDistributionImpl2.getInitialDomain(0.4115308789714541d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 197.0d + "'", double6 == 197.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.50035664865659d + "'", double8 == 97.50035664865659d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.0d) + "'", double10 == (-3.0d));
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
        normalDistributionImpl2.setMean(0.16116262477047377d);
        normalDistributionImpl2.setStandardDeviation(0.691462461274013d);
        normalDistributionImpl2.setStandardDeviation(0.02650618427872098d);
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
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getInitialDomain(0.5039893563146316d);
        double double7 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        double double9 = normalDistributionImpl2.getInitialDomain((double) 0L);
        normalDistributionImpl2.setStandardDeviation(0.020241005302473858d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        normalDistributionImpl2.setMean(0.0d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double19 = normalDistributionImpl2.getDomainUpperBound(Double.NEGATIVE_INFINITY);
        double double21 = normalDistributionImpl2.getInitialDomain(99.0d);
        java.lang.Class<?> wildcardClass22 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.NEGATIVE_INFINITY + "'", double17 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability(0.0d);
        normalDistributionImpl0.setStandardDeviation(99.0d);
        double double10 = normalDistributionImpl0.getDomainUpperBound(0.4924205527050616d);
        double double12 = normalDistributionImpl0.getDomainLowerBound(0.5297069799427127d);
        double double14 = normalDistributionImpl0.getDomainUpperBound((-99.62334797635704d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
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
        double double26 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.5000185094824923d);
        java.lang.Class<?> wildcardClass29 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 99.0d + "'", double19 == 99.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.5d + "'", double23 == 0.5d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5d + "'", double25 == 0.5d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.5d + "'", double26 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5039893563146316d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.8390361687153073d);
        double double11 = normalDistributionImpl2.getInitialDomain(0.8404349207008496d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9000000000335028d) + "'", double4 == (-0.9000000000335028d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5729554663241068d + "'", double9 == 0.5729554663241068d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 9.0d + "'", double11 == 9.0d);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double8 = normalDistributionImpl2.cumulativeProbability(10.026126956040166d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.02860714277600379d);
        normalDistributionImpl2.setMean(0.6153338488435729d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.816634256911273d + "'", double8 == 0.816634256911273d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-18.016701886873854d) + "'", double11 == (-18.016701886873854d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getInitialDomain((-68.0d));
        normalDistributionImpl2.setStandardDeviation(0.01213919411360942d);
        normalDistributionImpl2.setMean(34.0d);
        double double19 = normalDistributionImpl2.getDomainLowerBound(0.5033570607468583d);
        double double20 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 34.0d + "'", double19 == 34.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 34.0d + "'", double20 == 34.0d);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        normalDistributionImpl0.setMean((double) 1L);
        double double9 = normalDistributionImpl0.getDomainLowerBound((double) (short) -1);
        normalDistributionImpl0.setStandardDeviation(8.987287113132458E-5d);
        double double13 = normalDistributionImpl0.getDomainUpperBound(0.059977535157524076d);
        double double15 = normalDistributionImpl0.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl2.setMean((double) (byte) 100);
        double double8 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 100);
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.4490776072769937d);
        double double12 = normalDistributionImpl2.getInitialDomain(1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 200.0d + "'", double12 == 200.0d);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8339767539364704d, (double) 10L);
        normalDistributionImpl2.setStandardDeviation(0.9834167765345851d);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        normalDistributionImpl2.setMean((double) (-1));
        normalDistributionImpl2.setStandardDeviation(0.7688235963189542d);
        double double16 = normalDistributionImpl2.getDomainLowerBound(10.026126956040166d);
        double double17 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.7688235963189542d + "'", double17 == 0.7688235963189542d);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.5039893563146316d);
        double double13 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.getInitialDomain(0.5013880883243286d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5039893563146316d + "'", double13 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.50398935631463d + "'", double15 == 100.50398935631463d);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.9990117802233995d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0020476378332464074d);
        normalDistributionImpl2.setMean(0.16852760746683781d);
        double double10 = normalDistributionImpl2.cumulativeProbability(310.72034900269d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5000081688930658d + "'", double6 == 0.5000081688930658d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9990502703892551d + "'", double10 == 0.9990502703892551d);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 1);
        double double15 = normalDistributionImpl2.cumulativeProbability((double) (short) -1, (double) 10.0f);
        double double17 = normalDistributionImpl2.cumulativeProbability(0.16602324606352958d);
        normalDistributionImpl2.setMean(0.15987301523152742d);
        double double21 = normalDistributionImpl2.getInitialDomain((-175.24788832960508d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.16852760746683781d + "'", double12 == 0.16852760746683781d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.02860714277600379d + "'", double15 == 0.02860714277600379d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.16643735506845647d + "'", double17 == 0.16643735506845647d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-99.84012698476847d) + "'", double21 == (-99.84012698476847d));
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
        double double27 = normalDistributionImpl2.getInitialDomain(0.9991109747008919d);
        normalDistributionImpl2.setStandardDeviation((double) 'a');
        double double31 = normalDistributionImpl2.getDomainUpperBound(0.020241005302473858d);
        normalDistributionImpl2.setStandardDeviation(0.5035904320528484d);
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 101.0d + "'", double27 == 101.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
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
        double double26 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.026126956040166d + "'", double25 == 10.026126956040166d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        double double10 = normalDistributionImpl2.getDomainLowerBound((-299.4363000875007d));
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.5374108872856648d);
        double double13 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.5000447779640537d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.getInitialDomain(0.4960106436853684d);
        normalDistributionImpl2.setStandardDeviation(0.29812036135129827d);
        double double16 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(8.173250249250419E-4d, 0.37804813188807573d);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-374.59034152034485d), 0.5041573996674839d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        normalDistributionImpl0.setMean((double) (byte) 0);
        double double9 = normalDistributionImpl0.getInitialDomain(409.37500000520356d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.cumulativeProbability((-1.5039893563037323d), 0.5003482664470201d);
        double double15 = normalDistributionImpl0.getInitialDomain(0.8413447460686635d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6252930094688305d + "'", double13 == 0.6252930094688305d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        double double8 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(313.0062582842937d);
        double double13 = normalDistributionImpl2.getInitialDomain(96.93366833316512d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 345.0062582842937d + "'", double13 == 345.0062582842937d);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability((double) 1);
        double double8 = normalDistributionImpl0.inverseCumulativeProbability(0.3900253100277213d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl0.cumulativeProbability(0.502002607285855d, 0.010090298830658262d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.22074688003828388d + "'", double8 == 0.22074688003828388d);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound(0.6153338488435729d);
        double double4 = normalDistributionImpl0.inverseCumulativeProbability(0.34134474606854304d);
        double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.5033570607468583d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.40879584134842484d) + "'", double4 == (-0.40879584134842484d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.008415180966387943d + "'", double6 == 0.008415180966387943d);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 1);
        double double6 = normalDistributionImpl0.getInitialDomain((-99.00088902533815d));
        double double8 = normalDistributionImpl0.getDomainLowerBound((-90.53983024611358d));
        double double9 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.691462461274013d + "'", double4 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 1.0f, (double) ' ');
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability(0.16108488682834415d);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.9999999996226588d);
        double double11 = normalDistributionImpl0.getInitialDomain((-314.0626513812741d));
        double double14 = normalDistributionImpl0.cumulativeProbability(0.103606448964639d, 0.5020028532139044d);
        normalDistributionImpl0.setStandardDeviation(0.5020074000820464d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl0.cumulativeProbability(0.0017559868084203734d, (-99.83147239253316d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-99.00088902533815d) + "'", double7 == (-99.00088902533815d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5039893563131264d + "'", double9 == 0.5039893563131264d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-100.0d) + "'", double11 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0015893633625518877d + "'", double14 == 0.0015893633625518877d);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 'a');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.999987716976066d);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1);
        normalDistributionImpl2.setStandardDeviation(97.77142633673954d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.16116265572688077d + "'", double6 == 0.16116265572688077d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.77142633673954d + "'", double9 == 97.77142633673954d);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01213919411360942d, 0.4490776072831239d);
        normalDistributionImpl2.setMean((double) 100L);
        double double6 = normalDistributionImpl2.getDomainUpperBound((-799.5509223927169d));
        double double7 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.inverseCumulativeProbability(0.49380352624882917d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.01553288085883039d) + "'", double6 == (-0.01553288085883039d));
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', 0.3668235531222151d);
        normalDistributionImpl2.setMean(0.539827837277029d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.3668235531222151d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (byte) 100);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.9991109747008919d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((-0.9702930200572873d), 0.006266727965621499d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.16108488682834415d + "'", double8 == 0.16108488682834415d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0023515989598708043d + "'", double12 == 0.0023515989598708043d);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (byte) 100);
        normalDistributionImpl2.setMean((double) '4');
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.5341532272166142d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.15864037517600482d + "'", double13 == 0.15864037517600482d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
        double double19 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.cumulativeProbability(8.89024926669868E-4d);
        normalDistributionImpl2.setMean(0.002774428975804377d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5053565223803516d + "'", double18 == 0.5053565223803516d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.5033600462439357d + "'", double21 == 0.5033600462439357d);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getDomainUpperBound(2.0551338408836273E-12d);
        normalDistributionImpl2.setMean((-98.8991506848471d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 1L);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.25986015636209525d);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.15987458806866972d, 0.3669245429555231d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.890252991080594E-4d + "'", double4 == 8.890252991080594E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.819315472734173E-5d + "'", double10 == 1.819315472734173E-5d);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation(9.047742753903742E-4d);
        normalDistributionImpl2.setStandardDeviation(0.5120960066622517d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.503327047302336d);
        double double14 = normalDistributionImpl2.getDomainUpperBound(132.50332704731315d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.5020079759221441d);
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        normalDistributionImpl2.setMean(10.0d);
        double double11 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.503327047302336d + "'", double6 == 0.503327047302336d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.getInitialDomain(0.5039893563146316d);
        normalDistributionImpl2.setStandardDeviation(0.5027585141294139d);
        double double10 = normalDistributionImpl2.getMean();
        double double12 = normalDistributionImpl2.getDomainUpperBound(129.0d);
        double double14 = normalDistributionImpl2.getDomainUpperBound(0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.5033270473131487d);
        double double11 = normalDistributionImpl2.cumulativeProbability(0.539827837277029d, (double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainUpperBound(10.0d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-99.73312743878357d) + "'", double8 == (-99.73312743878357d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.3936365174897E-4d + "'", double11 == 8.3936365174897E-4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        double double10 = normalDistributionImpl2.getDomainUpperBound((-100.0d));
        double double11 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(1.1102230246251565E-15d);
        normalDistributionImpl2.setStandardDeviation(32.72280818173791d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5013304021987853d, 0.5000185094824923d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.5020074000820464d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        double double18 = normalDistributionImpl2.getInitialDomain(0.0d);
        double double20 = normalDistributionImpl2.getDomainUpperBound(0.34794284620061744d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.18406012534675953d);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double11 = normalDistributionImpl2.cumulativeProbability(0.0012826018800755623d);
        normalDistributionImpl2.setMean(0.0012209691105105058d);
        double double14 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5000051168411888d + "'", double11 == 0.5000051168411888d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0012209691105105058d + "'", double14 == 0.0012209691105105058d);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.5033270473131487d);
        double double11 = normalDistributionImpl2.cumulativeProbability(0.539827837277029d, (double) (short) 100);
        double double14 = normalDistributionImpl2.cumulativeProbability((-40.87958411457447d), 0.03877026173060294d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.3322676295501878E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-99.73312743878357d) + "'", double8 == (-99.73312743878357d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 8.3936365174897E-4d + "'", double11 == 8.3936365174897E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.03145104260449372d + "'", double14 == 0.03145104260449372d);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) (short) 100);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.01213919411360942d);
        normalDistributionImpl2.setMean((double) 10.0f);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.cumulativeProbability(97.50035664865659d, 9.047742753903742E-4d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-128.26949715237384d) + "'", double4 == (-128.26949715237384d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double6 = normalDistributionImpl2.getInitialDomain((double) '4');
        double double7 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.getInitialDomain(0.16852760746683781d);
        normalDistributionImpl2.setMean(0.8390361687153073d);
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.3319448802391164d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.8413596248239952d) + "'", double6 == (-0.8413596248239952d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.1586403751760048d) + "'", double9 == (-1.1586403751760048d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.7700991386030089d + "'", double13 == 0.7700991386030089d);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5d);
        double double9 = normalDistributionImpl2.getInitialDomain(0.3199999997720503d);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.15972655368062133d);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.4980118725202293d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5019947030907408d + "'", double7 == 0.5019947030907408d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5019867717083849d + "'", double13 == 0.5019867717083849d);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) 10);
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.3668235531222151d);
        double double8 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.507670861292653d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5020253050112831d + "'", double6 == 0.5020253050112831d);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation(0.4490776072831239d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getMean();
        double double17 = normalDistributionImpl2.getDomainLowerBound((-68.0d));
        normalDistributionImpl2.setMean(0.9990394412085004d);
        double double21 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-0.012980769559086225d));
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.7976931348623157E308d) + "'", double21 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        normalDistributionImpl2.setStandardDeviation((double) (short) 1);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        double double14 = normalDistributionImpl2.getDomainUpperBound(0.816634256911273d);
        double double16 = normalDistributionImpl2.getDomainUpperBound(0.5068289254012387d);
        double double17 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double7 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.0d);
        normalDistributionImpl2.setMean(200.0d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(0.0013519361546490138d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 200.0d + "'", double13 == 200.0d);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (byte) 100);
        normalDistributionImpl2.setMean((double) '4');
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.5341532272166142d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl2.cumulativeProbability(0.5792597094137458d, 0.22074688003828388d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.5006153217161514d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.47163584213925297d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5019971578385047d + "'", double5 == 0.5019971578385047d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5018815478082819d + "'", double7 == 0.5018815478082819d);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5000018982459924d, 0.5792597094137458d);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double5 = normalDistributionImpl0.cumulativeProbability(0.5027585141294139d);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability(0.5020027136551392d);
        double double9 = normalDistributionImpl0.getDomainUpperBound(0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6924329677782861d + "'", double5 == 0.6924329677782861d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.005020117607718406d + "'", double7 == 0.005020117607718406d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 1.0f, (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass4 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 10L);
        double double7 = normalDistributionImpl0.cumulativeProbability((double) 10.0f);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double10 = normalDistributionImpl0.getDomainUpperBound(0.15987301523152742d);
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.16852760746683781d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.cumulativeProbability(409.37500000520356d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.039999845437872d + "'", double12 == 9.039999845437872d);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
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
        normalDistributionImpl2.setMean(0.0d);
        double double29 = normalDistributionImpl2.getInitialDomain(1.582067810090848E-14d);
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-10.0d) + "'", double29 == (-10.0d));
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        normalDistributionImpl2.setMean(59.120415885425516d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (short) 100);
        double double10 = normalDistributionImpl2.getInitialDomain(409.37500000520356d);
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(1.1102230246251565E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 59.120415885425516d + "'", double8 == 59.120415885425516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 159.12041588542553d + "'", double10 == 159.12041588542553d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-734.8795841145745d) + "'", double12 == (-734.8795841145745d));
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double8 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(6.439419620615228E-4d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.getDomainUpperBound(0.13306917105380833d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(0.34182774550744877d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.439419620615228E-4d + "'", double11 == 6.439419620615228E-4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.7976931348623157E308d) + "'", double15 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 0, 0.5310861547925172d);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double15 = normalDistributionImpl2.cumulativeProbability((double) (short) -1, 0.0d);
        double double17 = normalDistributionImpl2.getInitialDomain(32.0d);
        double double19 = normalDistributionImpl2.getDomainLowerBound(2.0551338408836273E-12d);
        double double21 = normalDistributionImpl2.getDomainLowerBound(0.3159462152956827d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.003989356314631598d + "'", double15 == 0.003989356314631598d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.7976931348623157E308d) + "'", double21 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.0d), 0.501361765869532d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.16602324606352958d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.3463250917547049d, 0.004639639218063429d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        double double8 = normalDistributionImpl2.getInitialDomain((double) (short) 10);
        double double11 = normalDistributionImpl2.cumulativeProbability(0.3406824094489751d, (double) 10L);
        normalDistributionImpl2.setStandardDeviation(0.376841142650683d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 129.0d + "'", double8 == 129.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.002015099120256769d + "'", double11 == 0.002015099120256769d);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double4 = normalDistributionImpl0.getMean();
        double double6 = normalDistributionImpl0.cumulativeProbability(0.0d);
        normalDistributionImpl0.setStandardDeviation(99.0d);
        double double9 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.0d + "'", double9 == 99.0d);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 'a');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.999987716976066d);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(4.996003610813204E-16d);
        double double10 = normalDistributionImpl2.getDomainUpperBound(90.26536848661516d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.15865525393145696d + "'", double8 == 0.15865525393145696d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-40.879584114574484d), 0.03877026173060294d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.47180752643832735d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-40.91835437630509d) + "'", double4 == (-40.91835437630509d));
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-207.76136007611433d), 0.22074688003828388d);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getInitialDomain(32.0d);
        double double12 = normalDistributionImpl2.getDomainUpperBound(101.0d);
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.09798590039625582d);
        double double17 = normalDistributionImpl2.cumulativeProbability(0.03145104260449372d, 0.5374108872856648d);
        normalDistributionImpl2.setMean(10.026126956040166d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 107.0d + "'", double10 == 107.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.4988010832439613E-15d) + "'", double17 == (-1.4988010832439613E-15d));
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-0.8413596248239952d));
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.5018822327219192d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', 0.3668235531222151d);
        normalDistributionImpl2.setStandardDeviation(0.5013880883243286d);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getInitialDomain(0.3952575441175131d);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.5020079759221441d);
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double10 = normalDistributionImpl2.getInitialDomain((-0.8413596248239952d));
        double double11 = normalDistributionImpl2.getMean();
        double double12 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.503327047302336d + "'", double6 == 0.503327047302336d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.15864037517600482d) + "'", double10 == (-0.15864037517600482d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setStandardDeviation((double) 100L);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getDomainLowerBound((-99.73312743878357d));
        double double13 = normalDistributionImpl2.cumulativeProbability(100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.841344746068543d + "'", double13 == 0.841344746068543d);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
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
        normalDistributionImpl2.setStandardDeviation(0.5378475358989362d);
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
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double12 = normalDistributionImpl2.getDomainUpperBound(100.0d);
        normalDistributionImpl2.setStandardDeviation(35.50332704731315d);
        normalDistributionImpl2.setStandardDeviation(0.4115308789714541d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-343.78090962544536d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 1);
        double double6 = normalDistributionImpl0.getInitialDomain((-99.00088902533815d));
        double double8 = normalDistributionImpl0.getDomainLowerBound((-90.53983024611358d));
        double double10 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.691462461274013d + "'", double4 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-277.33138319894914d), 0.5019813127606616d);
        double double4 = normalDistributionImpl2.getInitialDomain((-99.98786080588638d));
        double double6 = normalDistributionImpl2.getInitialDomain(0.5000025689567479d);
        double double8 = normalDistributionImpl2.getInitialDomain(107.0d);
        double double9 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-277.8333645117098d) + "'", double4 == (-277.8333645117098d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-276.82940188618846d) + "'", double6 == (-276.82940188618846d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-276.82940188618846d) + "'", double8 == (-276.82940188618846d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-277.33138319894914d) + "'", double9 == (-277.33138319894914d));
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.5020079759221441d);
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double10 = normalDistributionImpl2.getInitialDomain((-0.8413596248239952d));
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.getInitialDomain(194.0d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.5003566436642092d);
        double double17 = normalDistributionImpl2.getInitialDomain(69.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.503327047302336d + "'", double6 == 0.503327047302336d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.15864037517600482d) + "'", double10 == (-0.15864037517600482d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.15864037517600482d + "'", double13 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.418208683034269E-4d + "'", double15 == 1.418208683034269E-4d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.15864037517600482d + "'", double17 == 0.15864037517600482d);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 10, 0.5000484283777002d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.0012541753965479852d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.5016193542725117d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.002029788284654d + "'", double6 == 10.002029788284654d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5000484283777002d + "'", double7 == 0.5000484283777002d);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 1L);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getDomainLowerBound(1.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(35.50332704731315d, 0.5026547384068555d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.29812036135129827d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.23701346317349d + "'", double4 == 35.23701346317349d);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.cumulativeProbability((double) 1.0f);
        normalDistributionImpl2.setMean(0.0020476378332464074d);
        double double19 = normalDistributionImpl2.getMean();
        double double21 = normalDistributionImpl2.getDomainUpperBound(13.213405872154592d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5039893563146316d + "'", double16 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0020476378332464074d + "'", double19 == 0.0020476378332464074d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double5 = normalDistributionImpl0.cumulativeProbability(0.5027585141294139d);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability(0.5020027136551392d);
        double double9 = normalDistributionImpl0.getDomainLowerBound(0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6924329677782861d + "'", double5 == 0.6924329677782861d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.005020117607718406d + "'", double7 == 0.005020117607718406d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.inverseCumulativeProbability(108.21387758915624d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) '#');
        double double10 = normalDistributionImpl0.getDomainUpperBound((double) 0.0f);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setMean(100.34105118710103d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl0.inverseCumulativeProbability(10.00298121154028d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.5020079759221441d);
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        normalDistributionImpl2.setMean(10.0d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.3334829949240306d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.503327047302336d + "'", double6 == 0.503327047302336d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
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
        double double21 = normalDistributionImpl2.getDomainUpperBound(0.49999225367341527d);
        double double23 = normalDistributionImpl2.inverseCumulativeProbability(0.1742829058275558d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0020476378332464074d + "'", double19 == 0.0020476378332464074d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 6.2625224914583475d + "'", double23 == 6.2625224914583475d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        double double10 = normalDistributionImpl2.cumulativeProbability((double) 10);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.539827837277029d + "'", double10 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double6 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.5341532272166142d);
        normalDistributionImpl2.setMean((-1.1586403751760048d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.34134474606854304d);
        double double14 = normalDistributionImpl2.cumulativeProbability(0.15987301523152742d);
        double double16 = normalDistributionImpl2.cumulativeProbability(3.942670432222073E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.501361765869532d + "'", double12 == 0.501361765869532d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5006378007810146d + "'", double14 == 0.5006378007810146d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5000001572897933d + "'", double16 == 0.5000001572897933d);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
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
        normalDistributionImpl2.setMean(0.0013519361546490138d);
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
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability((double) (short) -1);
        normalDistributionImpl2.setMean(59.120415885425516d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.cumulativeProbability(1.5d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.5378475358989362d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4960106436853684d + "'", double10 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2822385972445549d + "'", double15 == 0.2822385972445549d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 68.6216621174087d + "'", double17 == 68.6216621174087d);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5341532272166142d);
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability(0.03726587780834678d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-100.0d) + "'", double5 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9991601276537112d + "'", double7 == 0.9991601276537112d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9991144879003537d + "'", double10 == 0.9991144879003537d);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) '#');
        normalDistributionImpl0.setStandardDeviation(0.5020028532139044d);
        double double12 = normalDistributionImpl0.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
        double double22 = normalDistributionImpl2.cumulativeProbability(0.0d, 0.20663873465193733d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-314.0626513812741d) + "'", double16 == (-314.0626513812741d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 8.243686935432981E-4d + "'", double22 == 8.243686935432981E-4d);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.getInitialDomain(0.5039893563146316d);
        double double9 = normalDistributionImpl2.getDomainUpperBound(0.5120960066622517d);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.5000159154279771d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0012766099775947935d + "'", double11 == 0.0012766099775947935d);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(68.6216621174087d, (-10.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (short) 1);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.getInitialDomain(0.0d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.13661375606882142d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5039893563146316d + "'", double11 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-100.0d) + "'", double15 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-109.56601864344911d) + "'", double17 == (-109.56601864344911d));
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain(1.0d);
        double double17 = normalDistributionImpl2.getMean();
        double double19 = normalDistributionImpl2.cumulativeProbability(0.16108409568379545d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.500642632286767d + "'", double19 == 0.500642632286767d);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        normalDistributionImpl2.setMean(Double.POSITIVE_INFINITY);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(0.691462461274013d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.6153338488435729d);
        double double15 = normalDistributionImpl2.getDomainUpperBound(0.501361765869532d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(0.691462461274013d);
        double double19 = normalDistributionImpl2.inverseCumulativeProbability(7.773567058553255E-4d);
        double double22 = normalDistributionImpl2.cumulativeProbability(0.3435291934680794d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-316.4272152326943d) + "'", double19 == (-316.4272152326943d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.33260627343376414d + "'", double22 == 0.33260627343376414d);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-299.4363000875007d), 99.0d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6823959331695719d, 1.0000000000000004d);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl0.setStandardDeviation((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1190984698422417d + "'", double10 == 0.1190984698422417d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        normalDistributionImpl2.setMean(11.0d);
        double double14 = normalDistributionImpl2.cumulativeProbability(6.106226635438361E-16d);
        normalDistributionImpl2.setStandardDeviation(0.4960106436853684d);
        double double18 = normalDistributionImpl2.getInitialDomain((-52.0d));
        normalDistributionImpl2.setStandardDeviation(1.609823385706477E-15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.37665202364295614d + "'", double14 == 0.37665202364295614d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.503989356314632d + "'", double18 == 10.503989356314632d);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-34.0009882207076d), 97.67965765688128d);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability(0.16108488682834415d);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.9999999996226588d);
        double double11 = normalDistributionImpl0.getInitialDomain((-314.0626513812741d));
        double double14 = normalDistributionImpl0.cumulativeProbability(0.103606448964639d, 0.5020028532139044d);
        normalDistributionImpl0.setStandardDeviation(0.5020074000820464d);
        double double17 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-99.00088902533815d) + "'", double7 == (-99.00088902533815d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5039893563131264d + "'", double9 == 0.5039893563131264d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-100.0d) + "'", double11 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0015893633625518877d + "'", double14 == 0.0015893633625518877d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5020074000820464d + "'", double17 == 0.5020074000820464d);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-98.8991506848471d), (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.4845043062131d), 0.5068289254012387d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.0108791319425795d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) 1);
        double double7 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.4845043062131d) + "'", double4 == (-100.4845043062131d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.4845043062131d) + "'", double7 == (-100.4845043062131d));
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0012518388356499988d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.16108488682834415d, 0.34794284620061744d);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
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
        // The following exception was thrown during execution in test generation
        try {
            double double23 = normalDistributionImpl2.inverseCumulativeProbability(28.94710140017747d);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-314.0626513812741d) + "'", double16 == (-314.0626513812741d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5341532272166142d);
        double double8 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability(0.5053644817366403d, 0.5001930479917899d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-100.0d) + "'", double5 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9991601276537112d + "'", double7 == 0.9991601276537112d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability((double) (short) -1);
        normalDistributionImpl2.setMean(59.120415885425516d);
        double double14 = normalDistributionImpl2.getInitialDomain(0.004639639218063429d);
        normalDistributionImpl2.setStandardDeviation(0.001986788236930437d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4960106436853684d + "'", double10 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-40.879584114574484d) + "'", double14 == (-40.879584114574484d));
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double11 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.9991109747008919d);
        double double15 = normalDistributionImpl2.getDomainUpperBound(0.507670861292653d);
        normalDistributionImpl2.setStandardDeviation(0.22074688003828388d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (byte) 100);
        normalDistributionImpl2.setMean((double) (short) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.3159462152956827d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        double double11 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        normalDistributionImpl2.setStandardDeviation(0.003989356314631598d);
        double double15 = normalDistributionImpl2.getDomainLowerBound((-11.119995541385146d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.7976931348623157E308d) + "'", double15 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.cumulativeProbability(0.6823959331695719d, 1.0000000000000004d);
        normalDistributionImpl0.setStandardDeviation(0.18406012534675953d);
        double double13 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1190984698422417d + "'", double10 == 0.1190984698422417d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.9991144879003537d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.03021135797796476d);
        double double12 = normalDistributionImpl2.getInitialDomain((-0.9702930200572873d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, (double) ' ');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5020027136551392d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getInitialDomain(0.501361765869532d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 101.16064255229166d + "'", double4 == 101.16064255229166d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 101.0d + "'", double6 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 133.0d + "'", double8 == 133.0d);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.7688235963189542d);
        normalDistributionImpl2.setMean(0.04838995734662288d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double7 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.0d);
        double double10 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(32.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getInitialDomain(0.9870192304409138d);
        double double8 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (short) 0);
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.999987716976066d);
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.341344746068543d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.7228081817379124d, 32.0d);
        double double4 = normalDistributionImpl2.getInitialDomain(10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability(259.9799562906546d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.72280818173791d + "'", double4 == 32.72280818173791d);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
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
        double double25 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 29.324838582032726d + "'", double17 == 29.324838582032726d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.13306917105380833d + "'", double22 == 0.13306917105380833d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.37665202364296135d, 1.4029949727323299E-5d);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 10, 0.5000484283777002d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.0012541753965479852d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.5016193542725117d);
        normalDistributionImpl2.setStandardDeviation(0.1590394216775845d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.002029788284654d + "'", double6 == 10.002029788284654d);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) -1, 1.7976931348623157E308d);
        normalDistributionImpl2.setStandardDeviation((double) 1.0f);
        double double6 = normalDistributionImpl2.getDomainUpperBound(0.8389129705076926d);
        double double8 = normalDistributionImpl2.getInitialDomain(32.62551583472332d);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.inverseCumulativeProbability(1.5d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
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
        normalDistributionImpl2.setMean(0.16116262477047377d);
        normalDistributionImpl2.setStandardDeviation(0.691462461274013d);
        double double33 = normalDistributionImpl2.getDomainUpperBound(0.5018822327219192d);
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.7976931348623157E308d + "'", double33 == 1.7976931348623157E308d);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.841500270091506d, (double) 100);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.5011893264062109d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.841500270091506d + "'", double4 == 0.841500270091506d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-99.16464865890175d) + "'", double6 == (-99.16464865890175d));
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4924205527050616d, 0.002031565577024441d);
        double double3 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.cumulativeProbability((-5.773159728050814E-15d), 0.1685275685721559d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4924205527050616d + "'", double3 == 0.4924205527050616d);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double8 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.8339767539364704d);
        double double10 = normalDistributionImpl2.getDomainLowerBound(99.0d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(6.439419620630119E-4d);
        double double13 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.getDomainUpperBound(0.8389129705076926d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double4 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.02860714277600379d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5003566436642092d + "'", double6 == 0.5003566436642092d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        double double10 = normalDistributionImpl2.getDomainLowerBound((-299.4363000875007d));
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.5374108872856648d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getDomainLowerBound(0.5026547384068555d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.9990394412085004d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 109.26923508160773d + "'", double17 == 109.26923508160773d);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setMean((double) (short) -1);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.9990117802233995d);
        double double13 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability((double) (short) -1);
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4960106436853684d + "'", double10 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 309.37500000520356d + "'", double12 == 309.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.NEGATIVE_INFINITY + "'", double15 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10);
        normalDistributionImpl2.setMean(0.11533384884315512d);
        double double12 = normalDistributionImpl2.cumulativeProbability((-181.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.539827837277029d + "'", double8 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03505855944556485d + "'", double12 == 0.03505855944556485d);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.841344746068543d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double18 = normalDistributionImpl2.getStandardDeviation();
        double double20 = normalDistributionImpl2.getInitialDomain(6.429456955875379E-4d);
        double double22 = normalDistributionImpl2.inverseCumulativeProbability(0.15987301523152742d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-100.0d) + "'", double20 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-99.49799202407699d) + "'", double22 == (-99.49799202407699d));
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getInitialDomain(0.501361765869532d);
        double double8 = normalDistributionImpl2.cumulativeProbability((-312.05092239451676d), 0.5039854140850405d);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.6153338488435729d);
        normalDistributionImpl2.setStandardDeviation(409.37500000520356d);
        double double13 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.getInitialDomain(0.03145104260449372d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5062828993298469d + "'", double8 == 0.5062828993298469d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.507670861292653d + "'", double10 == 0.507670861292653d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-409.37500000520356d) + "'", double15 == (-409.37500000520356d));
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.5013304021987853d, 0.999987716976066d);
        double double17 = normalDistributionImpl2.getDomainUpperBound(0.5003566436642092d);
        double double19 = normalDistributionImpl2.inverseCumulativeProbability(0.5019947133392674d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0012518388356499988d + "'", double15 == 0.0012518388356499988d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.50000256894629d + "'", double19 == 97.50000256894629d);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getDomainLowerBound(0.5019867717083849d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainLowerBound(129.0d);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.5062828993298469d);
        double double15 = normalDistributionImpl2.getInitialDomain(0.0012541753965479852d);
        double double17 = normalDistributionImpl2.getDomainLowerBound((-120.47465095323574d));
        double double19 = normalDistributionImpl2.cumulativeProbability(0.0012156920342991095d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 87.0d + "'", double15 == 87.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.4988010832439613E-15d + "'", double19 == 1.4988010832439613E-15d);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        normalDistributionImpl2.setMean(0.01213919411360942d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.00398940617809046d);
        double double17 = normalDistributionImpl2.cumulativeProbability(33.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-265.28436935047245d) + "'", double15 == (-265.28436935047245d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6292541560646674d + "'", double17 == 0.6292541560646674d);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.503327047302336d, 101.0d);
        double double4 = normalDistributionImpl2.getDomainLowerBound((-374.59034152034485d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        normalDistributionImpl0.setMean((double) (byte) 0);
        double double9 = normalDistributionImpl0.getInitialDomain(409.37500000520356d);
        double double11 = normalDistributionImpl0.getDomainUpperBound(0.4924205527050616d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(Double.NEGATIVE_INFINITY);
        double double18 = normalDistributionImpl2.getMean();
        double double20 = normalDistributionImpl2.cumulativeProbability(11.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = normalDistributionImpl2.cumulativeProbability(34.0d, 0.6984682124530338d);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5437953125423168d + "'", double20 == 0.5437953125423168d);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5003566486671073d, (-62.000000236937524d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        normalDistributionImpl2.setMean(0.16852760746683781d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(0.5374108872856648d);
        normalDistributionImpl2.setMean(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5026547384068555d + "'", double15 == 0.5026547384068555d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.16852760746683781d + "'", double17 == 0.16852760746683781d);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6153338488431551d, 0.16108488682834415d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(100.34134474606854d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.16108488682834415d + "'", double5 == 0.16108488682834415d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6153338488431551d + "'", double6 == 0.6153338488431551d);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        normalDistributionImpl2.setStandardDeviation(129.0d);
        normalDistributionImpl2.setMean(6.106226635438361E-16d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.841500270091506d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.106226635438361E-16d + "'", double12 == 6.106226635438361E-16d);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9870192304409138d, (double) 1);
        double double4 = normalDistributionImpl2.getInitialDomain(0.3900253100277213d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((-25.583985792965766d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.012980769559086225d) + "'", double4 == (-0.012980769559086225d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setStandardDeviation((double) 100L);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getDomainLowerBound((-99.73312743878357d));
        double double13 = normalDistributionImpl2.getDomainLowerBound((-12.799211304789129d));
        normalDistributionImpl2.setStandardDeviation(0.5033270473131487d);
        double double17 = normalDistributionImpl2.getInitialDomain((-31.72948707855936d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.5033270473131487d) + "'", double17 == (-0.5033270473131487d));
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003989356314631598d, 100.00012139194168d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.0020476378332464074d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((-321.8666021266556d));
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.5020052938315906d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.49999225367341527d + "'", double4 == 0.49999225367341527d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003989356314631598d + "'", double6 == 0.003989356314631598d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5066447048930953d + "'", double8 == 0.5066447048930953d);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.cumulativeProbability(59.120415885425516d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((-0.8413596248239952d));
        double double14 = normalDistributionImpl2.getDomainUpperBound((-228.26949715448018d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7228081817379124d + "'", double9 == 0.7228081817379124d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.4966435003267168d + "'", double12 == 0.4966435003267168d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        double double8 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double10 = normalDistributionImpl2.getInitialDomain((double) 0.0f);
        normalDistributionImpl2.setMean(0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 65.0d + "'", double10 == 65.0d);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double12 = normalDistributionImpl2.getInitialDomain((double) 10.0f);
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.9999787774020832d);
        double double16 = normalDistributionImpl2.getInitialDomain(107.0d);
        double double19 = normalDistributionImpl2.cumulativeProbability((-207.76136007611433d), 0.4442181813792718d);
        normalDistributionImpl2.setMean((-58.59070890395023d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 107.0d + "'", double12 == 107.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 107.0d + "'", double16 == 107.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-5.773159728050814E-15d) + "'", double19 == (-5.773159728050814E-15d));
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainLowerBound(129.0d);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.5062828993298469d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.7688235963189542d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.cumulativeProbability(52.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 104.34978126086106d + "'", double15 == 104.34978126086106d);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.4992439296527548d);
        double double17 = normalDistributionImpl2.getInitialDomain(194.0d);
        double double18 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 96.93366833316512d + "'", double15 == 96.93366833316512d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 132.0d + "'", double17 == 132.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003233364812544881d, 107.0d);
        normalDistributionImpl2.setStandardDeviation(101.0d);
        normalDistributionImpl2.setStandardDeviation(97.50035664865659d);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        normalDistributionImpl2.setMean((double) (byte) -1);
        normalDistributionImpl2.setMean((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl2.inverseCumulativeProbability((-99.98786080588638d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0012541753965479852d, 0.3050257308975194d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(9.498638234130468d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        double double11 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        normalDistributionImpl2.setStandardDeviation(0.5d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.5000000000002491d);
        double double17 = normalDistributionImpl2.getInitialDomain((-1.3877787807814457E-15d));
        double double19 = normalDistributionImpl2.inverseCumulativeProbability(0.16116262477047377d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-98.8991506848471d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8413447460686635d + "'", double15 == 0.8413447460686635d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.5d) + "'", double17 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.49484524848086087d) + "'", double19 == (-0.49484524848086087d));
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.9990117802232268d);
        normalDistributionImpl2.setMean(0.5062582824999134d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability((double) 100.0f, 10.00298121154028d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5039854140850405d + "'", double8 == 0.5039854140850405d);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        normalDistributionImpl2.setMean(0.16852760746683781d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getDomainUpperBound(198.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7976931348623157E308d + "'", double16 == 1.7976931348623157E308d);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.getInitialDomain(0.5039893563146316d);
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.getDomainUpperBound(1.711841352131704d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability(0.16108488682834415d);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.9999999996226588d);
        double double10 = normalDistributionImpl0.getStandardDeviation();
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.5020026607457553d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-99.00088902533815d) + "'", double7 == (-99.00088902533815d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5039893563131264d + "'", double9 == 0.5039893563131264d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5019947133285944d + "'", double12 == 0.5019947133285944d);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-299.4363000875007d), 0.0012591409398656772d);
        double double4 = normalDistributionImpl2.getDomainLowerBound((-0.18951904809965026d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
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
        double double22 = normalDistributionImpl2.getDomainLowerBound((double) (short) 0);
        double double24 = normalDistributionImpl2.inverseCumulativeProbability(0.37665202364295614d);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = normalDistributionImpl2.cumulativeProbability(0.691462461274013d, 0.5013704805027063d);
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.7976931348623157E308d) + "'", double22 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 68.57142857177841d + "'", double24 == 68.57142857177841d);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-18.016701886873854d), 0.13819004034332988d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.8604045658810415d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.004777486474361492d, 99.02999982830094d);
        double double4 = normalDistributionImpl2.getInitialDomain((-9.831472392533161d));
        normalDistributionImpl2.setMean(0.49999999998978356d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-99.02522234182658d) + "'", double4 == (-99.02522234182658d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 99.02999982830094d + "'", double7 == 99.02999982830094d);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl0.inverseCumulativeProbability(314.1692288583126d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1807295428348436d, 0.8390361687153073d);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getInitialDomain(0.501361765869532d);
        double double7 = normalDistributionImpl2.getDomainUpperBound((-22.36087456351966d));
        normalDistributionImpl2.setStandardDeviation(0.5000001572897933d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (short) 0);
        normalDistributionImpl2.setMean(0.8339767539364704d);
        double double9 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8339767539364704d + "'", double9 == 0.8339767539364704d);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setMean((double) (short) -1);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.9990117802233995d);
        double double14 = normalDistributionImpl2.getDomainLowerBound((-0.5027585141294139d));
        double double16 = normalDistributionImpl2.cumulativeProbability((-1.3322676295501878E-15d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.539827837277029d + "'", double16 == 0.539827837277029d);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double11 = normalDistributionImpl2.getDomainUpperBound((-800.0d));
        double double14 = normalDistributionImpl2.cumulativeProbability(0.0d, 0.4115308789714541d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.inverseCumulativeProbability(101.16064255229166d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-100.0d) + "'", double11 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.809557474743208E-5d + "'", double14 == 3.809557474743208E-5d);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (byte) 100);
        normalDistributionImpl2.setMean((double) '4');
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(8.429343765339881E-4d);
        normalDistributionImpl2.setMean(0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0012541753965479852d, 0.3050257308975194d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(2.7727858897819146E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, (double) ' ');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5020027136551392d);
        double double6 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 101.16064255229166d + "'", double4 == 101.16064255229166d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 101.0d + "'", double6 == 101.0d);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4557288934945513d, (-190.53983024611358d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.841344746068543d, (double) 100);
        double double4 = normalDistributionImpl2.getInitialDomain((-100.4845043062131d));
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(0.0d, (-112.50817060471245d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-99.15865525393146d) + "'", double4 == (-99.15865525393146d));
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 1);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5000484283777002d);
        double double8 = normalDistributionImpl0.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.cumulativeProbability((-90.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.691462461274013d + "'", double4 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
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
        normalDistributionImpl2.setMean(0.7228081817379124d);
        double double26 = normalDistributionImpl2.cumulativeProbability(0.003233364812544881d);
        double double28 = normalDistributionImpl2.cumulativeProbability(0.0d);
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.49712933658943204d + "'", double26 == 0.49712933658943204d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.4971164376655677d + "'", double28 == 0.4971164376655677d);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.341344746068543d, 0.3410511871010289d);
        double double4 = normalDistributionImpl2.cumulativeProbability(1.0000484283777002d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9732827299359185d + "'", double4 == 0.9732827299359185d);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 32.0d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.cumulativeProbability(0.37665202364295614d, 0.48790399333774825d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.001386845084666355d + "'", double6 == 0.001386845084666355d);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6449537968852086d, 0.5026547384068555d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.17531708743070973d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6449537968852086d + "'", double4 == 0.6449537968852086d);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        normalDistributionImpl2.setStandardDeviation(129.0d);
        normalDistributionImpl2.setStandardDeviation(0.9834167765345851d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.7507529000010817d);
        double double14 = normalDistributionImpl2.getInitialDomain(0.25801261928916336d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.9834167765345851d) + "'", double14 == (-0.9834167765345851d));
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
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
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double24 = normalDistributionImpl2.cumulativeProbability(5.551115123125783E-16d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.501361765869532d + "'", double20 == 0.501361765869532d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.5000000000000002d + "'", double24 == 0.5000000000000002d);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (short) 0);
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.999987716976066d);
        double double10 = normalDistributionImpl2.getDomainUpperBound((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.5437953125423168d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (short) 0);
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.999987716976066d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.4845043062131d), 0.5068289254012387d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.4845043062131d) + "'", double3 == (-100.4845043062131d));
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(Double.POSITIVE_INFINITY);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean((double) 1L);
        double double18 = normalDistributionImpl2.cumulativeProbability(0.16602324606352958d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.4667676684208163d + "'", double18 == 0.4667676684208163d);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        double double11 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.5002938527002967d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5019958753787421d + "'", double15 == 0.5019958753787421d);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        double double14 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.6921355838337144d);
        double double18 = normalDistributionImpl2.getDomainUpperBound(0.02650618427872098d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        normalDistributionImpl0.setMean((double) 1L);
        double double9 = normalDistributionImpl0.getDomainLowerBound((double) (short) -1);
        double double11 = normalDistributionImpl0.getInitialDomain((double) 1L);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.0d, (double) 10.0f);
        normalDistributionImpl0.setMean(0.15865678669756328d);
        double double18 = normalDistributionImpl0.getDomainUpperBound(9.047742753903742E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0d + "'", double11 == 101.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.039845748899803746d + "'", double14 == 0.039845748899803746d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.15865678669756328d + "'", double18 == 0.15865678669756328d);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getDomainLowerBound(0.5033270473131487d);
        double double11 = normalDistributionImpl2.getDomainLowerBound(10.026126956040166d);
        normalDistributionImpl2.setMean(8.89024926669868E-4d);
        normalDistributionImpl2.setMean((-99.99758096448726d));
        normalDistributionImpl2.setMean(0.4971164376655677d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability(0.34134474606854304d, (double) 'a');
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(8.3936365174897E-4d);
        double double16 = normalDistributionImpl2.inverseCumulativeProbability(6.334490483101973E-4d);
        double double18 = normalDistributionImpl2.getInitialDomain((-70.90167018868739d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6153338488435729d + "'", double12 == 0.6153338488435729d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-90.53983024611358d) + "'", double14 == (-90.53983024611358d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-93.14798330551893d) + "'", double16 == (-93.14798330551893d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-22.0d) + "'", double18 == (-22.0d));
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double9 = normalDistributionImpl2.getDomainLowerBound(100.19981031319246d);
        normalDistributionImpl2.setStandardDeviation(100.00411074825631d);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) '4');
        double double15 = normalDistributionImpl2.cumulativeProbability(8.69633484597232E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5000034691930447d + "'", double15 == 0.5000034691930447d);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        normalDistributionImpl0.setMean((double) 1L);
        double double9 = normalDistributionImpl0.getDomainLowerBound((double) (short) -1);
        double double11 = normalDistributionImpl0.getInitialDomain((double) 1L);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.0d, (double) 10.0f);
        double double15 = normalDistributionImpl0.getMean();
        double double17 = normalDistributionImpl0.cumulativeProbability(0.5041573996674839d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0d + "'", double11 == 101.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.039845748899803746d + "'", double14 == 0.039845748899803746d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.49802188232869804d + "'", double17 == 0.49802188232869804d);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, 409.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(1.7976931348623157E308d);
        double double6 = normalDistributionImpl2.getInitialDomain((-314.0626513812741d));
        double double8 = normalDistributionImpl2.getInitialDomain(0.0d);
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.5016193542725117d);
        double double12 = normalDistributionImpl2.getDomainUpperBound((double) 0L);
        normalDistributionImpl2.setMean(33.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.691462461274013d + "'", double10 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.691462461274013d + "'", double12 == 0.691462461274013d);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003989356314631598d, 100.00012139194168d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.5019866608109517d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5019867111794115d + "'", double4 == 0.5019867111794115d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double10 = normalDistributionImpl2.getMean();
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.5020052938315906d);
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5026547383961157d + "'", double12 == 0.5026547383961157d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.getDomainLowerBound((double) 1);
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.9870192304409138d);
        double double15 = normalDistributionImpl2.getInitialDomain(0.13514946487744206d);
        double double17 = normalDistributionImpl2.cumulativeProbability((-334.4117969580364d));
        double double18 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 222.67866038790694d + "'", double13 == 222.67866038790694d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-100.0d) + "'", double15 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.1272314516782593E-4d + "'", double17 == 4.1272314516782593E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getDomainLowerBound((double) (byte) 0);
        double double5 = normalDistributionImpl0.getInitialDomain(0.38212483247943946d);
        double double6 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.7976931348623157E308d) + "'", double3 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-99.00088902533815d), 0.16728208918541987d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-99.00088902533815d) + "'", double3 == (-99.00088902533815d));
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.5020079759221441d);
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double10 = normalDistributionImpl2.getInitialDomain((-0.8413596248239952d));
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.cumulativeProbability(6.439419620615228E-4d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.503327047302336d + "'", double6 == 0.503327047302336d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.15864037517600482d) + "'", double10 == (-0.15864037517600482d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5016193542725117d + "'", double13 == 0.5016193542725117d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.15864037517600482d + "'", double14 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.50539567299893d, 0.5020429585576492d);
        normalDistributionImpl2.setMean(0.9989951412038602d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((-412.05092239451676d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9989951412038602d + "'", double6 == 0.9989951412038602d);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
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
        double double20 = normalDistributionImpl2.cumulativeProbability(0.5001042314730403d);
        double double23 = normalDistributionImpl2.cumulativeProbability(0.47180752643832735d, 0.7228081817379124d);
        double double25 = normalDistributionImpl2.getInitialDomain(0.0d);
        normalDistributionImpl2.setStandardDeviation(0.0108791319425795d);
        normalDistributionImpl2.setMean((-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5006333584453674d + "'", double20 == 0.5006333584453674d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0010013441949527913d + "'", double23 == 0.0010013441949527913d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-99.65865525393146d) + "'", double25 == (-99.65865525393146d));
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (short) 0);
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.999987716976066d);
        double double10 = normalDistributionImpl2.getDomainUpperBound((double) 1L);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainUpperBound(0.0012591409398656772d);
        java.lang.Class<?> wildcardClass14 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.8339767539364704d);
        normalDistributionImpl2.setMean((-99.73312743878357d));
        double double11 = normalDistributionImpl2.getDomainUpperBound((-0.8413596248239952d));
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.5006333584453674d);
        double double14 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.73312743878357d) + "'", double11 == (-99.73312743878357d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-99.73180342032491d) + "'", double13 == (-99.73180342032491d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-99.73312743878357d) + "'", double14 == (-99.73312743878357d));
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5376487498992404d, 0.37665202364295614d);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, (double) ' ');
        normalDistributionImpl2.setStandardDeviation(0.01213919411360942d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double7 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 10L);
        double double7 = normalDistributionImpl0.cumulativeProbability((double) 10.0f);
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getDomainLowerBound((-11.119995541385146d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.getDomainUpperBound((double) 0L);
        normalDistributionImpl2.setStandardDeviation(0.376841142650683d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
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
        double double26 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass27 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 6.106226635438361E-16d + "'", double25 == 6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
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
        double double20 = normalDistributionImpl2.getInitialDomain((-7.771561172376096E-16d));
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
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.9990117802232268d);
        double double10 = normalDistributionImpl2.getDomainLowerBound(35.50332704731315d);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.16116262477047377d);
        double double14 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5039854140850405d + "'", double8 == 0.5039854140850405d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5006429455720895d + "'", double12 == 0.5006429455720895d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getInitialDomain(32.0d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double14 = normalDistributionImpl2.cumulativeProbability((-26.12663573645063d), 0.4993376909985171d);
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.10504850654241193d + "'", double14 == 0.10504850654241193d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5026547383961157d, 0.1610870595108309d);
        normalDistributionImpl2.setMean(194.0d);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5000447779640537d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
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
        double double20 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.47161763576680055d + "'", double20 == 0.47161763576680055d);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) -1, 0.5039854140850412d);
        double double4 = normalDistributionImpl2.getInitialDomain(6.106226635438361E-16d);
        double double6 = normalDistributionImpl2.getDomainLowerBound(0.5000185094824923d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.503985414085041d) + "'", double4 == (-1.503985414085041d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getInitialDomain(0.4540980747251103d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-277.33138319894914d), 0.5019813127606616d);
        double double4 = normalDistributionImpl2.getInitialDomain((-99.98786080588638d));
        double double6 = normalDistributionImpl2.getInitialDomain(0.5000025689567479d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability((-1.7166342569447757d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-277.8333645117098d) + "'", double4 == (-277.8333645117098d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-276.82940188618846d) + "'", double6 == (-276.82940188618846d));
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
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
        double double22 = normalDistributionImpl2.cumulativeProbability(0.3050257308975194d, 0.6823959331695719d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-100.0d) + "'", double19 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0015054700491559103d + "'", double22 == 0.0015054700491559103d);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getInitialDomain(0.691462461274013d);
        double double12 = normalDistributionImpl2.getDomainLowerBound((-128.26949715237384d));
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(0.1591531807176773d);
        double double16 = normalDistributionImpl2.cumulativeProbability(8.69633484597232E-4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-99.79443152768462d) + "'", double14 == (-99.79443152768462d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5000034693356545d + "'", double16 == 0.5000034693356545d);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        normalDistributionImpl2.setMean(11.0d);
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.9990117802233995d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getInitialDomain(0.445844242470579d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-24.0d) + "'", double17 == (-24.0d));
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5020106023922443d);
        normalDistributionImpl2.setMean(0.5000484283777002d);
        double double11 = normalDistributionImpl2.getInitialDomain((-126.12663573645062d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5062582824999134d + "'", double7 == 0.5062582824999134d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-31.4999515716223d) + "'", double11 == (-31.4999515716223d));
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.42851072492061976d, 0.47161763576680055d);
        normalDistributionImpl2.setStandardDeviation((double) 100.0f);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9991601276537112d, 0.5010366908668966d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5010366908668966d + "'", double3 == 0.5010366908668966d);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.002626897160349584d, 0.5437953125423168d);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10);
        normalDistributionImpl2.setMean(0.11533384884315512d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.539827837277029d + "'", double8 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
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
        double double24 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(101.0d);
        double double28 = normalDistributionImpl2.inverseCumulativeProbability(0.9987872496534157d);
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 404.24838583224306d + "'", double28 == 404.24838583224306d);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        normalDistributionImpl2.setMean((double) (byte) -1);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getMean();
        double double17 = normalDistributionImpl2.cumulativeProbability((-1.5926637806018613d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.4976356274400068d + "'", double17 == 0.4976356274400068d);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        double double17 = normalDistributionImpl2.getInitialDomain(0.0013750926571968192d);
        double double19 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double21 = normalDistributionImpl2.getDomainLowerBound(10.026126956040166d);
        double double24 = normalDistributionImpl2.cumulativeProbability(97.67965765688128d, 409.37500000520356d);
        double double26 = normalDistributionImpl2.cumulativeProbability((-0.40879584134842484d));
        double double28 = normalDistributionImpl2.cumulativeProbability(95.34932257379293d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-100.0d) + "'", double17 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.16431371302161724d + "'", double24 == 0.16431371302161724d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.49836914509065217d + "'", double26 == 0.49836914509065217d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.8298298865645481d + "'", double28 == 0.8298298865645481d);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getDomainLowerBound(0.38212483247943946d);
        double double11 = normalDistributionImpl2.getInitialDomain(0.0d);
        double double12 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.inverseCumulativeProbability((-39.81100517904762d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-100.0d) + "'", double11 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
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
        double double23 = normalDistributionImpl2.inverseCumulativeProbability(0.9714544490438862d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-314.0626513812741d) + "'", double16 == (-314.0626513812741d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.92873960284361d + "'", double23 == 20.92873960284361d);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 10, 0.501361765869532d);
        normalDistributionImpl2.setStandardDeviation(100.00323336481254d);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        normalDistributionImpl2.setMean(0.5033270473131487d);
        double double17 = normalDistributionImpl2.getInitialDomain(0.5019947030907408d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.50332704731315d + "'", double17 == 35.50332704731315d);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
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
        double double21 = normalDistributionImpl2.getInitialDomain(0.308537538725987d);
        double double22 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-100.0d) + "'", double21 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(6.439419620615228E-4d);
        double double14 = normalDistributionImpl2.cumulativeProbability(0.25986015636209525d);
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5010366908668966d + "'", double14 == 0.5010366908668966d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0, 0.003989356314631598d);
        normalDistributionImpl2.setStandardDeviation(0.9991109747008919d);
        double double6 = normalDistributionImpl2.getDomainUpperBound(3.0324839434953876d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-90.0d), 0.546219801024759d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-90.0d) + "'", double3 == (-90.0d));
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain(1.0d);
        normalDistributionImpl2.setMean((double) (short) -1);
        double double19 = normalDistributionImpl2.getMean();
        double double20 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 10, 1.0d);
        normalDistributionImpl2.setMean((double) (-1.0f));
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getDomainLowerBound(102.74285731024536d);
        normalDistributionImpl2.setStandardDeviation(259.9799562906546d);
        double double11 = normalDistributionImpl2.getDomainUpperBound(400.12500003330143d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        double double7 = normalDistributionImpl0.getInitialDomain(0.539827837277029d);
        double double9 = normalDistributionImpl0.getDomainLowerBound((double) ' ');
        double double11 = normalDistributionImpl0.getInitialDomain(0.7228081817379124d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.6028315177078836d);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) '4');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getDomainLowerBound((-2.0327734413351157d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 1);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5000484283777002d);
        double double9 = normalDistributionImpl0.getDomainLowerBound((-68.0d));
        double double11 = normalDistributionImpl0.getDomainLowerBound(0.0012518388356499988d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl0.inverseCumulativeProbability(189.8939857551005d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.691462461274013d + "'", double4 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5033270473131487d);
        double double13 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double15 = normalDistributionImpl2.cumulativeProbability((double) (byte) 0);
        double double17 = normalDistributionImpl2.getDomainLowerBound(1.0000898728711314d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5020079759221441d + "'", double11 == 0.5020079759221441d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01213919411360942d, 0.4490776072831239d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(100.00012139194168d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getInitialDomain(0.16431371302161724d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.01213919411360942d + "'", double4 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.4369384131695145d) + "'", double7 == (-0.4369384131695145d));
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
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
        double double20 = normalDistributionImpl2.getMean();
        double double22 = normalDistributionImpl2.getInitialDomain(194.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 101.0d + "'", double22 == 101.0d);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.getDomainUpperBound(100.00503989243838d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation(0.4490776072831239d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.42733157976821107d);
        double double20 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4490776072831239d + "'", double14 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4490776072831239d + "'", double16 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.5020052938315906d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(2.9897509126136645E-4d);
        normalDistributionImpl2.setMean(0.376841142650683d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.160849516286758d + "'", double13 == 10.160849516286758d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.7976931348623157E308d) + "'", double15 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.8339767539364704d);
        double double10 = normalDistributionImpl2.getInitialDomain((-128.26949715237384d));
        double double11 = normalDistributionImpl2.getMean();
        double double12 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainUpperBound((double) 10.0f);
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.003233364812544881d);
        double double14 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.getDomainUpperBound(0.1807295428348436d);
        normalDistributionImpl2.setMean(0.16728208918541987d);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-272.3126474186623d) + "'", double13 == (-272.3126474186623d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.inverseCumulativeProbability((double) 1);
        normalDistributionImpl2.setMean((double) (-1.0f));
        double double17 = normalDistributionImpl2.cumulativeProbability(99.0d);
        double double18 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.841344746068543d + "'", double17 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NEGATIVE_INFINITY, 13.213405872154592d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.cumulativeProbability(0.13514946487744206d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double11 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.8390361687153073d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003989356314631598d, 100.00012139194168d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.0d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.010090298830658262d, 0.5378382600176361d);
        normalDistributionImpl2.setMean(0.15972655368062133d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.13514946487744206d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.00012139194168d + "'", double3 == 100.00012139194168d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.002105396850882957d + "'", double8 == 0.002105396850882957d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
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
        double double24 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double26 = normalDistributionImpl2.getInitialDomain(0.8516411033163142d);
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 200.0d + "'", double26 == 200.0d);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
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
        // The following exception was thrown during execution in test generation
        try {
            double double22 = normalDistributionImpl2.cumulativeProbability(29.324838580542213d, 28.94710140017747d);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.7688235963189542d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(6.106226635438361E-16d);
        normalDistributionImpl2.setMean(0.02860714277600379d);
        double double18 = normalDistributionImpl2.cumulativeProbability(0.5019947030907408d);
        normalDistributionImpl2.setStandardDeviation(0.4442181813792718d);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = normalDistributionImpl2.inverseCumulativeProbability((-154.96651377710546d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-181.0d) + "'", double14 == (-181.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.50539567299893d + "'", double18 == 0.50539567299893d);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        normalDistributionImpl2.setMean(0.01213919411360942d);
        double double14 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double18 = normalDistributionImpl2.getDomainLowerBound((-1.1102230246251565E-15d));
        double double21 = normalDistributionImpl2.cumulativeProbability(0.49999225367341527d, 1.5d);
        double double22 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.01213919411360942d + "'", double14 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.003989242433971363d + "'", double21 == 0.003989242433971363d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.01213919411360942d + "'", double22 == 0.01213919411360942d);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NEGATIVE_INFINITY, 200.0d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.5019947030907418d);
        normalDistributionImpl2.setStandardDeviation(0.6153338488435729d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl2.cumulativeProbability((-11.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(410.37500000520356d, 0.07365795537454656d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.cumulativeProbability(6.2625224914583475d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainLowerBound(129.0d);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainUpperBound((-1.7976931348623157E308d));
        double double14 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.9991109747008919d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = normalDistributionImpl2.inverseCumulativeProbability(97.50000256894629d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 10L);
        double double7 = normalDistributionImpl0.cumulativeProbability((double) 10.0f);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.cumulativeProbability(0.6984682124530338d);
        double double12 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.609823385706477E-15d + "'", double11 == 1.609823385706477E-15d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        normalDistributionImpl2.setMean(100.0d);
        double double13 = normalDistributionImpl2.cumulativeProbability((double) 0, (double) 100L);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getMean();
        double double18 = normalDistributionImpl2.cumulativeProbability(6.439419620630119E-4d, 7.773567058553255E-4d);
        normalDistributionImpl2.setStandardDeviation(0.02860714277600379d);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = normalDistributionImpl2.cumulativeProbability((-207.76136007611433d), (-0.01553288085883039d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.341344746068543d + "'", double13 == 0.341344746068543d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.2282691636575933E-7d + "'", double18 == 3.2282691636575933E-7d);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.4992439296527548d);
        double double17 = normalDistributionImpl2.getInitialDomain(194.0d);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 96.93366833316512d + "'", double15 == 96.93366833316512d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 132.0d + "'", double17 == 132.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 100L, 0.999987716976066d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.0d, 0.103606448964639d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.0013750926571968192d);
        double double18 = normalDistributionImpl2.cumulativeProbability((-69.90167018868739d), 0.5341532272166142d);
        normalDistributionImpl2.setMean(0.25986015636209525d);
        double double21 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-299.4363000875007d) + "'", double15 == (-299.4363000875007d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.25986015636209525d + "'", double18 == 0.25986015636209525d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        double double10 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.inverseCumulativeProbability(0.4012936743170763d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        normalDistributionImpl2.setMean(11.0d);
        double double14 = normalDistributionImpl2.cumulativeProbability(6.106226635438361E-16d);
        normalDistributionImpl2.setStandardDeviation(0.4960106436853684d);
        double double17 = normalDistributionImpl2.getStandardDeviation();
        double double19 = normalDistributionImpl2.getDomainUpperBound((-374.59034152034485d));
        double double21 = normalDistributionImpl2.getDomainLowerBound(46.0d);
        normalDistributionImpl2.setMean(0.5310861547925172d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.37665202364295614d + "'", double14 == 0.37665202364295614d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.4960106436853684d + "'", double17 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 11.0d + "'", double19 == 11.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 11.0d + "'", double21 == 11.0d);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getInitialDomain(0.5039893563146316d);
        double double7 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setMean(6.439419620615228E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) '#');
        double double10 = normalDistributionImpl0.getDomainUpperBound((double) 0.0f);
        double double11 = normalDistributionImpl0.getStandardDeviation();
        double double13 = normalDistributionImpl0.getDomainUpperBound((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.cumulativeProbability(0.9991109747008919d, 0.501361765869532d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation(0.4490776072831239d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getMean();
        double double19 = normalDistributionImpl2.getInitialDomain(0.5000025689567479d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4490776072831239d + "'", double14 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4490776072831239d + "'", double16 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.4490776072831239d + "'", double19 == 0.4490776072831239d);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.38924867502172716d, 1.721828146727944E-7d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.38924867502172716d + "'", double3 == 0.38924867502172716d);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(0.50215359102449d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getDomainUpperBound(8.3936365174897E-4d);
        normalDistributionImpl2.setMean(5.440092820663267E-15d);
        normalDistributionImpl2.setStandardDeviation(0.7228081817379124d);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainUpperBound((-374.59034152034485d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.440092820663267E-15d + "'", double11 == 5.440092820663267E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.440092820663267E-15d + "'", double13 == 5.440092820663267E-15d);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 1.0f, (double) ' ');
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getInitialDomain(0.09950447039473481d);
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.5016193542725117d);
        double double8 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-31.0d) + "'", double5 == (-31.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double6 = normalDistributionImpl2.getInitialDomain((double) '4');
        double double7 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.getDomainUpperBound(0.5006153217161514d);
        double double11 = normalDistributionImpl2.getInitialDomain(0.5033600462439357d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.8413596248239952d) + "'", double6 == (-0.8413596248239952d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.8413596248239952d) + "'", double11 == (-0.8413596248239952d));
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(1.7976931348623157E308d);
        double double8 = normalDistributionImpl0.getInitialDomain(99.49601458591496d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(7.294832041665478E-4d, 0.7228081817379124d);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl2.setMean((double) (byte) 100);
        double double8 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 100);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double12 = normalDistributionImpl2.getDomainUpperBound((-33.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 409.37500000520356d + "'", double10 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(159.12041588542553d, Double.NEGATIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainLowerBound(129.0d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.45968873858058723d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(4.782716600848502E-4d, 34.0d);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        normalDistributionImpl2.setMean(59.120415885425516d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (short) 100);
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.9999999999999823d);
        normalDistributionImpl2.setMean(0.09950447039473481d);
        double double13 = normalDistributionImpl2.getMean();
        double double14 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 59.120415885425516d + "'", double8 == 59.120415885425516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 59.120415885425516d + "'", double10 == 59.120415885425516d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.09950447039473481d + "'", double13 == 0.09950447039473481d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        normalDistributionImpl2.setMean((double) (byte) -1);
        double double15 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        normalDistributionImpl2.setStandardDeviation(0.4992439296527548d);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) 100L);
        normalDistributionImpl2.setStandardDeviation(1.5d);
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.5001042314730403d);
        double double10 = normalDistributionImpl2.getDomainLowerBound(97.77142633673954d);
        normalDistributionImpl2.setMean(0.5297069799427127d);
        double double14 = normalDistributionImpl2.getInitialDomain(0.0012591409398656772d);
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        java.lang.Class<?> wildcardClass17 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.9702930200572873d) + "'", double14 == (-0.9702930200572873d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(13.213405872154592d, 309.37500000520356d);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability((double) (short) -1);
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double14 = normalDistributionImpl2.getInitialDomain((double) 100.0f);
        double double16 = normalDistributionImpl2.getDomainUpperBound(0.039845748899803746d);
        double double18 = normalDistributionImpl2.getDomainLowerBound(0.001349898031630159d);
        double double20 = normalDistributionImpl2.getDomainUpperBound((-5.773159728050814E-15d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4960106436853684d + "'", double10 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 309.37500000520356d + "'", double12 == 309.37500000520356d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, (double) ' ');
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 1L);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.25986015636209525d);
        double double9 = normalDistributionImpl2.getDomainUpperBound(0.7688235963189542d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.890252991080594E-4d + "'", double4 == 8.890252991080594E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl2.setMean((double) (byte) 100);
        double double8 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 100);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double11 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 409.37500000520356d + "'", double10 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) '#');
        double double10 = normalDistributionImpl0.getDomainUpperBound((double) 0.0f);
        normalDistributionImpl0.setMean(0.44833414025485474d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }
}

